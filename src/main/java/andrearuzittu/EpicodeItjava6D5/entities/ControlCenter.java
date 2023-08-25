package andrearuzittu.EpicodeItjava6D5.entities;

import java.util.ArrayList;
import java.util.List;

import andrearuzittu.EpicodeItjava6D5.interfaces.Observer;
import andrearuzittu.EpicodeItjava6D5.interfaces.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ControlCenter implements Subject {

	private Long id;

	private List<FireProbe> probesList = new ArrayList<>();

	@Override
	public void register(Observer o) {
		probesList.add((FireProbe) o);
	}

	@Override
	public void unregister(Observer o) {
		probesList.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (FireProbe p : probesList) {
			p.smokeLevelControl();
		}
	}
}
