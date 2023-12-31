package andrearuzittu.EpicodeItjava6D5.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FireProbeTest {

	@Test
	public void testInitialSmokeLevelIsZero() {
		FireProbe probe = new FireProbe(1L, "41.9028", "12.4964", 0);
		assertEquals(0, probe.getSmokeLevel(), "Initial smoke level should be 0");
	}

	@Test
	public void testSetSmokeLevel() {
		FireProbe probe = new FireProbe(1L, "41.9028", "12.4964", 0);
		probe.setSmokeLevel(5);
		assertEquals(5, probe.getSmokeLevel(), "Smoke level should be set to 5");
	}

	@Test
	public void testGenerateNotificationUrl() {
		FireProbe probe = new FireProbe(1L, "41.9028", "12.4964", 0);
		probe.setSmokeLevel(3);
		String expectedUrl = "http://host/alarm?idsonda=1&lat=41.9028&lon=12.4964&smokelevel=3";
		assertEquals(expectedUrl, probe.generateNotificationUrl(), "Generated URL is incorrect");
	}

	@Test
	public void testSmokeLevelControlAboveThreshold() {
		FireProbe probe = new FireProbe(1L, "41.9028", "12.4964", 0);
		probe.setSmokeLevel(6);

	}

	@Test
	public void testSmokeLevelControlBelowThreshold() {
		FireProbe probe = new FireProbe(1L, "41.9028", "12.4964", 0);
		probe.setSmokeLevel(3);

	}
}
