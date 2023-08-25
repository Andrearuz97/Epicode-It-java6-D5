package andrearuzittu.EpicodeItjava6D5.interfaces;


public interface Subject {
	public void register(Observer o);

	public void unregister(Observer o);

	public void notifyObservers();
}
