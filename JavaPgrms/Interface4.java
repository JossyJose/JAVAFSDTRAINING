package ust.examples;
abstract interface MusicPlayer{
	public static final int defaultVolume=30;
	public abstract void play();
	public abstract void stop();
}

class Songs implements MusicPlayer{
	
	public void play() {
		
			System.out.println("music player plays songs");
		}
		public void stop() {
			System.out.println("music player is playing melody");
		}
		
	

	
}
public class Interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Songs s = new Songs();
s.play();
s.stop();
	}
}

