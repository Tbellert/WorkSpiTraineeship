
public interface Television {

	void on();
	void off();
	int getCurrentChannel();
	void setCurrentChannel(int currentChannel) throws TvNotOnException;
}
