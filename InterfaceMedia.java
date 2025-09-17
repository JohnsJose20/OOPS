package package1;

interface Media{
	void play();
	void stop();
default void pause() {
	System.out.println("Media Paused");
}
static void about() {
	System.out.println("This is a Media interface");
} }
interface AdvancedMedia extends Media{
	void nextTrack();
}
class MusicPlayer implements AdvancedMedia {
	public void play() {
		System.out.println("Music Started to playing...");
	}
	public void stop() {
		System.out.println("Music Stopped Playing...");
	}
	public void pause() {
		System.out.println("Music Paused...");
	}
	public void nextTrack() {
		System.out.println("Next Music Loading...");
	}
}
public class InterfaceMedia {
	public static void main(String[]args){
		MusicPlayer m1 = new MusicPlayer();
		m1.play();
		m1.stop();
		m1.pause();
		m1.nextTrack();
		Media.about();
	}
}
