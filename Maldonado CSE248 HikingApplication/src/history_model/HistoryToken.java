package history_model;

import user_model.User;

public class HistoryToken { //one token per trail on history
	private String trailName;
	private long dateAndTime;
	private double distance;
	private double duration;
	private String photosTaken;
	
	public HistoryToken(String trailName) {
		this.trailName = trailName;
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

	public String getPhotosTaken() {
		return photosTaken;
	}

	public void setPhotosTaken(String photosTaken) {
		this.photosTaken = photosTaken;
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
