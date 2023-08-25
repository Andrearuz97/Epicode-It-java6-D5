package andrearuzittu.EpicodeItjava6D5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import andrearuzittu.EpicodeItjava6D5.entities.ControlCenter;
import andrearuzittu.EpicodeItjava6D5.entities.FireProbe;

@Component
public class SmokeSimulationRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		FireProbe f1 = new FireProbe(1L, "41.9028", "12.4964", 14);
		FireProbe f2 = new FireProbe(2L, "34.0522", "-118.2437", 4);
		FireProbe f3 = new FireProbe(3L, "40.7128", "-74.0060", 9);
		FireProbe f4 = new FireProbe(4L, "51.5074", "-0.1278", 1);

		ControlCenter cc = new ControlCenter();
		cc.register(f1);
		cc.register(f2);
		cc.register(f3);
		cc.register(f4);



		cc.notifyObservers();
	}
}
