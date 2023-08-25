package andrearuzittu.EpicodeItjava6D5.entities;

import andrearuzittu.EpicodeItjava6D5.interfaces.Observer;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FireProbe implements Observer {

	private Long id;
	private String latitudine;
	private String longitudine;
	private Integer smokeLevel = 0;
	private ControlCenter controlCenter;

	public FireProbe(Long id, String latitudine, String longitudine, Integer smokeLevel) {

		this.id = id;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.smokeLevel = smokeLevel;
	}

	@Override
	public void smokeLevelControl() {

		if (this.smokeLevel >= 5) {
			String notificationUrl = generateNotificationUrl();
			System.out.println("Attention! the probe n." + id + " has registered a level of smoke " + smokeLevel
					+ ", latitudine: " + latitudine + " longitudine: " + longitudine);
			System.out.println("\"The control center sent the notification URL: " + notificationUrl);
		}

	}

	public String generateNotificationUrl() {
		return "http://host/alarm?idsonda=" + id + "&lat=" + latitudine + "&lon=" + longitudine + "&smokelevel="
				+ smokeLevel;
	}
}
