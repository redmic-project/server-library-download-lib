package es.redmic.downloadlib.events;

public abstract class DownloadEventTypes {

	public static String
	// @formatter:off
		//Download
		CHECK_DOWNLOAD = "CHECK_DOWNLOAD",
		DOWNLOAD_CHECKED = "DOWNLOAD_CHECKED",
		CHECK_DOWLOAD_FAILED = "CHECK_DOWLOAD_FAILED",
		DOWLOAD_CANCELLED = "DOWLOAD_CANCELLED",
		PREPARE_DOWNLOAD = "PREPARE_DOWNLOAD",
		DOWNLOAD_PREPARED = "DOWNLOAD_PREPARED",
		PREPARE_DOWNLOAD_FAILED = "PREPARE_DOWNLOAD_FAILED",
		DOWNLOAD = "DOWNLOAD",
		DOWNLOAD_FAILED = "DOWNLOAD_FAILED",
		DOWNLOAD_CONFIRMED = "DOWNLOAD_CONFIRMED",
		DOWNLOADED = "DOWNLOADED";
		
	//@formatter:on

	public static boolean isLocked(String eventType) {

		return !(eventType.equals(DOWNLOADED.toString()) || eventType.equals(DOWLOAD_CANCELLED.toString()));
	}

	public static boolean isSnapshot(String eventType) {

		return eventType.equals(DOWNLOADED.toString());
	}
}
