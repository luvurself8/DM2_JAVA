package polymorphism;

public class FourKTv extends Tv {
	private int resolution;

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "FourKTv [resolution=" + resolution + "]";
	}
	
}
