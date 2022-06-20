import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main_GUI{
	
	JButton play;
	public static void gui() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Audio audio=new Audio();
		var a=audio.getAudio();
		
		JFrame screen=screen();
		screen.setResizable(false);
		
		JLabel label=Label("Pranav's Audio Player",0x00FF00,"MV Boli",25);
		screen.add(label);
		
		JButton play=Button(200,100,100,50,"Play");
		screen.add(play);
		play.addActionListener(e -> audio.play(a));
		
		JButton stop=Button(200,150,100,50,"Stop");
		screen.add(stop);
		stop.addActionListener(e -> audio.stop(a));
		
		JButton reset=Button(200,200,100,50,"Reset");
		screen.add(reset);
		reset.addActionListener(e -> audio.reset(a));
		
		JButton quit=Button(200,250,100,50,"Quit");
		screen.add(quit);
		quit.addActionListener(e -> audio.quit(a));
	}
	

	
	

	
	

	public static JFrame screen() {
		JFrame screen = new JFrame();
		
		screen.setTitle("Pranav's Audio Player");
		
		screen.setSize(500,500);
		
		screen.setVisible(true);
		
		screen.getContentPane().setBackground(new Color(0,0,0));
		
		
		return screen;
	}
	
	public static JLabel Label(String text,int color, String font,Integer size) {
		
		JLabel label = new JLabel();
		
		label.setText(text);
		
		label.setForeground(new Color(color));
		
		label.setFont(new Font(font,Font.PLAIN,size));
		
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		Border border=BorderFactory.createLineBorder(Color.green);
		label.setBorder(border);
		
		return label;
		
	}
	
	public static JButton Button(Integer x,Integer y, Integer width,Integer height,String text) {
		
		JButton button=new JButton();
		
		button.setBounds(x,y,width,height);
		
		button.setText(text);
		
		button.setFocusable(false);
		
		button.setFont(new Font("MV Boli",Font.BOLD,25));
		
		button.setForeground(Color.black);
		
		button.setBackground(Color.green);
		
		return button;
		
	}
}





