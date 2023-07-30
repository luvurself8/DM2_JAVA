package polymorphism;

public class Tv {
	private int channel;
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void channelUp() {
		this.channel += 1;
	}
	@Override
	public String toString() {
		return "Tv [channel=" + channel + "]";
	}
	
	
}
