package es.redmic.downloadlib.events.download;

import org.apache.avro.Schema;

import es.redmic.downloadlib.events.DownloadEventTypes;
import es.redmic.downloadlib.events.common.QueryEvent;

public class PrepareDownloadEvent extends QueryEvent {

	// @formatter:off
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{"
		+ "\"type\":\"record\",\"name\":\"PrepareDownloadEvent\","
				+ "\"namespace\":\"es.redmic.downloadlib.events.download\",\"fields\":["
			+ getQueryEventSchema() + ","
			+ getEventBaseSchema() + "]}");
	// @formatter:on

	private static final String type = DownloadEventTypes.PREPARE_DOWNLOAD;

	public PrepareDownloadEvent() {
		super(type);
	}

	@Override
	public Schema getSchema() {
		return SCHEMA$;
	}
}
