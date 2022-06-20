import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Audio {
	
	public Clip getAudio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		File f= new File("C:\\Users\\Pranav\\eclipse-workspace\\GUI_AUDIO_PLAYER\\src\\AudioFiles\\song.mp3");
		
		AudioInputStream audioStream= AudioSystem.getAudioInputStream(f);
		
		Clip clip= AudioSystem.getClip();
		
		clip.open(audioStream);
		
		return clip;
	}
	
	public void play(Clip clip) {
		
		clip.start();
	}
	
	public void stop(Clip clip) {
		
		clip.stop();
	}
	
	public void reset(Clip clip) {
		
		clip.setMicrosecondPosition(0);
	}
	
	public void quit(Clip clip) {
		
		clip.close();
	}
}
