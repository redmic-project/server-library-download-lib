package es.redmic.downloadlib.events.download;

import org.apache.avro.Schema;

import es.redmic.downloadlib.events.DownloadEventTypes;
import es.redmic.downloadlib.events.common.URLEvent;

public class DownloadedEvent extends URLEvent {

	// @formatter:off
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{"
		+ "\"type\":\"record\",\"name\":\"DownloadedEvent\","
				+ "\"namespace\":\"es.redmic.downloadlib.events.download\",\"fields\":["
			+ getURLEventSchema() + ","
			+ getEventBaseSchema() + "]}");
	// @formatter:on

	private static final String type = DownloadEventTypes.DOWNLOADED;

	public DownloadedEvent() {
		super(type);
	}

	@Override
	public Schema getSchema() {
		return SCHEMA$;
	}
}
