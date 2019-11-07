package es.redmic.downloadlib.unit.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import es.redmic.downloadlib.events.DownloadEventTypes;
import es.redmic.downloadlib.events.download.CheckDownloadEvent;
import es.redmic.downloadlib.events.download.CheckDownloadFailedEvent;
import es.redmic.downloadlib.events.download.DownloadCancelledEvent;
import es.redmic.downloadlib.events.download.DownloadCheckedEvent;
import es.redmic.downloadlib.events.download.DownloadConfirmedEvent;
import es.redmic.downloadlib.events.download.DownloadEvent;
import es.redmic.downloadlib.events.download.DownloadFailedEvent;
import es.redmic.downloadlib.events.download.DownloadPreparedEvent;
import es.redmic.downloadlib.events.download.DownloadedEvent;
import es.redmic.downloadlib.events.download.PrepareDownloadEvent;
import es.redmic.downloadlib.events.download.PrepareDownloadFailedEvent;
import es.redmic.exception.common.ExceptionType;
import es.redmic.models.es.common.query.dto.DataQueryDTO;

public abstract class DownloadDataUtil {

	// @formatter:off
	public final static String PREFIX = "download-",
			CODE = UUID.randomUUID().toString(),
			USER = "1",
			URL = "https://redmic.es/download/1",
			PATH = "/data/tmp/downloads/1234.json";
	// @formatter:on

	public static CheckDownloadEvent getCheckDownloadEvent() {
		return getCheckDownloadEvent(CODE);
	}

	public static CheckDownloadEvent getCheckDownloadEvent(String code) {

		CheckDownloadEvent event = new CheckDownloadEvent();
		event.setAggregateId(PREFIX + code);
		event.setType(DownloadEventTypes.CHECK_DOWNLOAD);
		event.setVersion(1);
		event.setUserId(USER);
		event.setSessionId("sessionIdA");
		event.setQuery(new DataQueryDTO());

		return event;
	}

	public static CheckDownloadFailedEvent getCheckDownloadFailedEvent() {
		return getCheckDownloadFailedEvent(CODE);
	}

	public static CheckDownloadFailedEvent getCheckDownloadFailedEvent(String code) {

		CheckDownloadFailedEvent event = new CheckDownloadFailedEvent().buildFrom(getCheckDownloadEvent(CODE));

		event.setExceptionType(ExceptionType.ITEM_NOT_FOUND.name());
		Map<String, String> arguments = new HashMap<>();
		arguments.put("A", "B");
		event.setArguments(arguments);
		return event;
	}

	public static DownloadCancelledEvent getDownloadCancelledEvent() {
		return getDownloadCancelledEvent(CODE);
	}

	public static DownloadCancelledEvent getDownloadCancelledEvent(String code) {

		DownloadCancelledEvent event = new DownloadCancelledEvent().buildFrom(getCheckDownloadEvent(CODE));

		event.setExceptionType(ExceptionType.ITEM_NOT_FOUND.name());
		Map<String, String> arguments = new HashMap<>();
		arguments.put("A", "B");
		event.setArguments(arguments);
		return event;
	}

	public static DownloadCheckedEvent getDownloadCheckedEvent() {
		return getDownloadCheckedEvent(CODE);
	}

	public static DownloadCheckedEvent getDownloadCheckedEvent(String code) {
		return new DownloadCheckedEvent().buildFrom(getCheckDownloadEvent(CODE));
	}

	public static DownloadConfirmedEvent getDownloadConfirmedEvent() {
		return getDownloadConfirmedEvent(CODE);
	}

	public static DownloadConfirmedEvent getDownloadConfirmedEvent(String code) {

		DownloadConfirmedEvent event = new DownloadConfirmedEvent().buildFrom(getCheckDownloadEvent(CODE));
		event.setUrl(URL);
		return event;
	}

	public static DownloadedEvent getDownloadedEvent() {
		return getDownloadedEvent(CODE);
	}

	public static DownloadedEvent getDownloadedEvent(String code) {

		DownloadedEvent event = new DownloadedEvent().buildFrom(getCheckDownloadEvent(CODE));
		event.setUrl(URL);
		return event;
	}

	public static DownloadEvent getDownloadEvent() {
		return getDownloadEvent(CODE);
	}

	public static DownloadEvent getDownloadEvent(String code) {

		DownloadEvent event = new DownloadEvent().buildFrom(getCheckDownloadEvent(CODE));
		event.setPath(PATH);
		return event;
	}

	public static DownloadFailedEvent getDownloadFailedEvent() {
		return getDownloadFailedEvent(CODE);
	}

	public static DownloadFailedEvent getDownloadFailedEvent(String code) {

		DownloadFailedEvent event = new DownloadFailedEvent().buildFrom(getCheckDownloadEvent(CODE));
		event.setExceptionType(ExceptionType.ITEM_NOT_FOUND.name());
		Map<String, String> arguments = new HashMap<>();
		arguments.put("A", "B");
		event.setArguments(arguments);
		return event;
	}

	public static DownloadPreparedEvent getDownloadPreparedEvent() {
		return getDownloadPreparedEvent(CODE);
	}

	public static DownloadPreparedEvent getDownloadPreparedEvent(String code) {

		DownloadPreparedEvent event = new DownloadPreparedEvent().buildFrom(getCheckDownloadEvent(CODE));
		event.setPath(PATH);
		return event;
	}

	public static PrepareDownloadEvent getPrepareDownloadEvent() {
		return getPrepareDownloadEvent(CODE);
	}

	public static PrepareDownloadEvent getPrepareDownloadEvent(String code) {

		PrepareDownloadEvent event = new PrepareDownloadEvent().buildFrom(getCheckDownloadEvent(CODE));
		event.setQuery(new DataQueryDTO());
		return event;
	}

	public static PrepareDownloadFailedEvent getPrepareDownloadFailedEvent() {
		return getPrepareDownloadFailedEvent(CODE);
	}

	public static PrepareDownloadFailedEvent getPrepareDownloadFailedEvent(String code) {

		PrepareDownloadFailedEvent event = new PrepareDownloadFailedEvent().buildFrom(getCheckDownloadEvent(CODE));
		event.setExceptionType(ExceptionType.ITEM_NOT_FOUND.name());
		Map<String, String> arguments = new HashMap<>();
		arguments.put("A", "B");
		event.setArguments(arguments);
		return event;
	}
}
