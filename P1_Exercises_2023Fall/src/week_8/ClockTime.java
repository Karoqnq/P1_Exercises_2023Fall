package week_8;

public class ClockTime {

	private int hours;
	private int minutes;

	public ClockTime() {
		this.hours = 0;
		this.minutes = 0;
	}

	void add(int hours, int minutes) {

		if (hours >= 0 && minutes >= 0) {
			this.hours = (this.hours + hours + (this.minutes + minutes) / 60) % 24;
			this.minutes = (this.minutes + minutes) % 60;
		}

	}

	public String toString() {

		String hoursFormat = "";
		String minutesFormat = "";

		if (hours < 10) {
			hoursFormat = "0" + hours;
		} else {
			hoursFormat = String.valueOf(hours);
		}

		if (minutes < 10) {
			minutesFormat = "0" + minutes;
		} else {
			minutesFormat = String.valueOf(minutes);
		}

		return hoursFormat + ":" + minutesFormat;
	}
}
