
public class Samsung implements Television {
	public boolean powerStatus;
	private int currentChannel;
	
	@Override
	
	public void on() {
		if (powerStatus) {
			System.out.println("TV is already on!");
		} else {
			powerStatus = true;
			System.out.println("TV turned on");
		}
	}

	@Override
	public void off() {
		if (powerStatus) {
			System.out.println("TV is already off!");
		} else {
			powerStatus = false;
			System.out.println("TV turned off");
		}
	}

	@Override
	public int getCurrentChannel() {
		return currentChannel;
	}

	@Override
	public void setCurrentChannel(int currentChannel) throws TvNotOnException {

			if (powerStatus) {
				if (currentChannel > 0) {
					this.currentChannel = currentChannel;
					System.out.println("TV switched to channel: " + getCurrentChannel());
				} else {
					System.out.println("If the TV could talk he would say nothing as you gave a negative number");
				}
			} else {
				throw new TvNotOnException();
			}		
	}
	
}
