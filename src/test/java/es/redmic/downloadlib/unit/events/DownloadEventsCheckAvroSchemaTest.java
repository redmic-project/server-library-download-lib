package es.redmic.downloadlib.unit.events;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
import es.redmic.downloadlib.unit.utils.DownloadDataUtil;
import es.redmic.testutils.utils.AvroBaseTest;

public class DownloadEventsCheckAvroSchemaTest extends AvroBaseTest {

	@Test
	public void CheckDownloadEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		CheckDownloadEvent event = DownloadDataUtil.getCheckDownloadEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de CheckDownloadEvent",
				CheckDownloadEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void CheckDownloadFailedEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		CheckDownloadFailedEvent event = DownloadDataUtil.getCheckDownloadFailedEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de CheckDownloadFailedEvent",
				CheckDownloadFailedEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void DownloadCancelledEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		DownloadCancelledEvent event = DownloadDataUtil.getDownloadCancelledEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de DownloadCancelledEvent",
				DownloadCancelledEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void DownloadCheckedEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		DownloadCheckedEvent event = DownloadDataUtil.getDownloadCheckedEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de DownloadCheckedEvent",
				DownloadCheckedEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void DownloadConfirmedEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		DownloadConfirmedEvent event = DownloadDataUtil.getDownloadConfirmedEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de DownloadConfirmedEvent",
				DownloadConfirmedEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void DownloadedEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		DownloadedEvent event = DownloadDataUtil.getDownloadedEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de DownloadedEvent",
				DownloadedEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void DownloadEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		DownloadEvent event = DownloadDataUtil.getDownloadEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de DownloadEvent",
				DownloadEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void DownloadFailedEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		DownloadFailedEvent event = DownloadDataUtil.getDownloadFailedEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de DownloadFailedEvent",
				DownloadFailedEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void DownloadPreparedEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		DownloadPreparedEvent event = DownloadDataUtil.getDownloadPreparedEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de DownloadPreparedEvent",
				DownloadPreparedEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void PrepareDownloadEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		PrepareDownloadEvent event = DownloadDataUtil.getPrepareDownloadEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de PrepareDownloadEvent",
				PrepareDownloadEvent.class.isInstance(result));

		assertEquals(result, event);
	}

	@Test
	public void PrepareDownloadFailedEventSerializeAndDeserialize_IsSuccessful_IfSchemaAndDataAreCorrect() {

		PrepareDownloadFailedEvent event = DownloadDataUtil.getPrepareDownloadFailedEvent();

		Object result = serializerAndDeserializer(event);

		assertTrue("El objeto obtenido debe ser una instancia de PrepareDownloadFailedEvent",
				PrepareDownloadFailedEvent.class.isInstance(result));

		assertEquals(result, event);
	}
}
