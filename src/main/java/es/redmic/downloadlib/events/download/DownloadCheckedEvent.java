package es.redmic.downloadlib.events.download;

import org.apache.avro.Schema;

import es.redmic.brokerlib.avro.common.SimpleEvent;
import es.redmic.downloadlib.events.DownloadEventTypes;

public class DownloadCheckedEvent extends SimpleEvent {

	// @formatter:off
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{"
		+ "\"type\":\"record\",\"name\":\"DownloadCheckedEvent\","
				+ "\"namespace\":\"es.redmic.downloadlib.events.download\",\"fields\":["
			+ getEventBaseSchema() + "]}");
	// @formatter:on

	private static final String type = DownloadEventTypes.DOWNLOAD_CHECKED;

	public DownloadCheckedEvent() {
		super(type);
	}

	@Override
	public Schema getSchema() {
		return SCHEMA$;
	}
}
