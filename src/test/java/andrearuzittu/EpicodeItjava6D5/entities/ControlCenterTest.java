package andrearuzittu.EpicodeItjava6D5.entities;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ControlCenterTest {

	@Test
	public void testRegisterObserver() {
		ControlCenter cc = new ControlCenter();
		FireProbe probe = new FireProbe(1L, "41.9028", "12.4964", 0);
		cc.register(probe);
		assertTrue(cc.getProbesList().contains(probe), "Failed to register observer");
	}

	@Test
	public void testUnregisterObserver() {
		ControlCenter cc = new ControlCenter();
		FireProbe probe = new FireProbe(1L, "41.9028", "12.4964", 0);
		cc.register(probe);
		cc.unregister(probe);
		assertFalse(cc.getProbesList().contains(probe), "Failed to unregister observer");
	}

	@Test
    public void testNotifyObserversAboveThreshold() {
        ControlCenter cc = new ControlCenter();
        FireProbe probe1 = new FireProbe(1L, "41.9028", "12.4964", 0);
        FireProbe probe2 = new FireProbe(2L, "34.0522", "-118.2437", 0);
        cc.register(probe1);
        cc.register(probe2);

        probe1.setSmokeLevel(6);
        cc.notifyObservers();
	}

	@Test
	public void testNotifyObserversBelowThreshold() {
		ControlCenter cc = new ControlCenter();
		FireProbe probe1 = new FireProbe(1L, "41.9028", "12.4964", 0);
		FireProbe probe2 = new FireProbe(2L, "34.0522", "-118.2437", 0);
		cc.register(probe1);
		cc.register(probe2);

		probe1.setSmokeLevel(3);
		cc.notifyObservers();

	}
}
