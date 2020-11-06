package history_module;


public class HistoryToken { //one token per trail on history
	private String trailName;
	private long dateAndTime;
	private double distance;
	private double duration;
	
	
	public HistoryToken(String trailName, long dateAndTime, double distance, double duration) {
		super();
		this.trailName = trailName;
		this.dateAndTime = dateAndTime;
		this.distance = distance;
		this.duration = duration;
	}

	public String getTrailName() {
		return trailName;
	}

	public void setTrailName(String trailName) {
		this.trailName = trailName;
	}

	public long getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(long dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	
	public int compareTo(HistoryToken u) {
		if (trailName.compareTo(u.trailName) == 0) {
			return 0;
		} else if (trailName.compareTo(u.trailName)>0) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
	
	

}
