package trail_model;

public class Trail implements Comparable<Trail> {
	private String name;
	private String headAddress;
	private double length;
	private double gain;
	private Level level;
	private Type type;
	//priVate CheckPoint checkpoint; 		(STOP or INTERSECTION)
	

	public Trail(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadAddress() {
		return headAddress;
	}

	public void setHeadAddress(String headAddress) {
		this.headAddress = headAddress;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getGain() {
		return gain;
	}

	public void setGain(double gain) {
		this.gain = gain;
	}

	public 	Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int compareTo(Trail o) {
		if (name.compareTo(o.name) == 0) {
			return 0;
		} else if (name.compareTo(o.name)>0) {
			return 1;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
