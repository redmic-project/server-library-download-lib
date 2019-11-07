package es.redmic.downloadlib.events.download;

import org.apache.avro.Schema;

import es.redmic.downloadlib.events.DownloadEventTypes;
import es.redmic.downloadlib.events.common.QueryEvent;

public class CheckDownloadEvent extends QueryEvent {

	// @formatter:off
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{"
		+ "\"type\":\"record\",\"name\":\"CheckDownloadEvent\","
				+ "\"namespace\":\"es.redmic.downloadlib.events.download\",\"fields\":["
			+ getQueryEventSchema() + ","
			+ getEventBaseSchema() + "]}");
	// @formatter:on

	private static final String type = DownloadEventTypes.CHECK_DOWNLOAD;

	public CheckDownloadEvent() {
		super(type);
	}

	@Override
	public Schema getSchema() {
		return SCHEMA$;
	}
}
