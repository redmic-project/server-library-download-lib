package es.redmic.downloadlib.events.common;

import java.nio.ByteBuffer;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import es.redmic.brokerlib.avro.common.Event;
import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.InternalException;
import es.redmic.models.es.common.query.dto.DataQueryDTO;

public abstract class QueryEvent extends Event {

	@JsonIgnore
	private ObjectMapper objectMapper = new ObjectMapper();

	private ByteBuffer query;

	public QueryEvent(String type) {
		super(type);
		objectMapper.setFilterProvider(new SimpleFilterProvider().setFailOnUnknownId(false).addFilter("DataQueryDTO",
				SimpleBeanPropertyFilter.serializeAll()));
	}

	public ByteBuffer getQuery() {
		return query;
	}

	public void setQuery(ByteBuffer query) {
		this.query = query;
	}

	@JsonIgnore
	public void setQuery(DataQueryDTO dataQuery) {
		try {
			this.query = ByteBuffer.wrap(objectMapper.writeValueAsBytes(dataQuery));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new InternalException(ExceptionType.INTERNAL_EXCEPTION);
		}
	}

	@Override
	public Object get(int field$) {
		switch (field$) {
		case 0:
			return getQuery();
		case 1:
			return getAggregateId();
		case 2:
			return getVersion();
		case 3:
			return getType();
		case 4:
			return getDate().getMillis();
		case 5:
			return getSessionId();
		case 6:
			return getUserId();
		case 7:
			return getId();
		default:
			throw new org.apache.avro.AvroRuntimeException("Bad index");
		}
	}

	@Override
	public void put(int field$, Object value$) {
		switch (field$) {
		case 0:
			query = (ByteBuffer) value$;
			break;
		case 1:
			setAggregateId(value$.toString());
			break;
		case 2:
			setVersion((java.lang.Integer) value$);
			break;
		case 3:
			setType(value$.toString());
			break;
		case 4:
			setDate(new DateTime(value$, DateTimeZone.UTC));
			break;
		case 5:
			setSessionId(value$.toString());
			break;
		case 6:
			setUserId(value$.toString());
			break;
		case 7:
			setId(value$.toString());
			break;
		default:
			throw new org.apache.avro.AvroRuntimeException("Bad index");
		}
	}

	@JsonIgnore
	protected static String getQueryEventSchema() {
		return "{\"name\":\"query\",\"type\":\"bytes\"}";
	}
}
