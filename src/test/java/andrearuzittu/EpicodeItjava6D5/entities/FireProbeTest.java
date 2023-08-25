package andrearuzittu.EpicodeItjava6D5.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FireProbeTest {

	@Test
	public void testInitialSmokeLevelIsZero() {
		FireProbe probe = new FireProbe(1L, "41.9028", "12.4964", 0);
		assertEquals(0, probe.getSmokeLevel());
	}

}