package es.redmic.downloadlib.events.download;

import org.apache.avro.Schema;

import es.redmic.downloadlib.events.DownloadEventTypes;
import es.redmic.downloadlib.events.common.PathEvent;

public class DownloadPreparedEvent extends PathEvent {

	// @formatter:off
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{"
		+ "\"type\":\"record\",\"name\":\"DownloadPreparedEvent\","
				+ "\"namespace\":\"es.redmic.downloadlib.events.download\",\"fields\":["
			+ getPathEventSchema() + ","
			+ getEventBaseSchema() + "]}");
	// @formatter:on

	private static final String type = DownloadEventTypes.DOWNLOAD_PREPARED;

	public DownloadPreparedEvent() {
		super(type);
	}

	@Override
	public Schema getSchema() {
		return SCHEMA$;
	}
}
