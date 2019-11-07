package es.redmic.downloadlib.events.download;

import org.apache.avro.Schema;

import es.redmic.brokerlib.avro.common.EventError;
import es.redmic.downloadlib.events.DownloadEventTypes;

public class DownloadFailedEvent extends EventError {

	// @formatter:off
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{"
		+ "\"type\":\"record\",\"name\":\"DownloadFailedEvent\","
				+ "\"namespace\":\"es.redmic.downloadlib.events.download\",\"fields\":["
			+ getFailEventSchema() + ","
			+ getEventBaseSchema() + "]}");
	// @formatter:on

	private static final String type = DownloadEventTypes.DOWNLOAD_FAILED;

	public DownloadFailedEvent() {
		super(type);
	}

	@Override
	public Schema getSchema() {
		return SCHEMA$;
	}
}
