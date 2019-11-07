package es.redmic.downloadlib.events.download;

import org.apache.avro.Schema;

import es.redmic.downloadlib.events.DownloadEventTypes;
import es.redmic.downloadlib.events.common.URLEvent;

public class DownloadConfirmedEvent extends URLEvent {

	// @formatter:off
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{"
		+ "\"type\":\"record\",\"name\":\"DownloadConfirmedEvent\","
				+ "\"namespace\":\"es.redmic.downloadlib.events.download\",\"fields\":["
			+ getURLEventSchema() + ","
			+ getEventBaseSchema() + "]}");
	// @formatter:on

	private static final String type = DownloadEventTypes.DOWNLOAD_CONFIRMED;

	public DownloadConfirmedEvent() {
		super(type);
	}

	@Override
	public Schema getSchema() {
		return SCHEMA$;
	}
}
