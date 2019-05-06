/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoev3;

//import java.io.FilenameFilter;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Hugo
 */
public class sonido {
    private Clip clip;
	
	// poner canciones
	public static sonido sound1 = new sonido("/juegoev3/assets/ray.wav");
	public static sonido sound2 = new sonido("/juegoev3/assets/rom.wav");
	
	public sonido (String fileName) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(juegoventana.class.getResource(fileName));
			clip = AudioSystem.getClip();
			clip.open(ais);
		} catch (Exception e) {
		}
	}

	public void play() {
		try {
			if (clip != null) {
				new Thread() {
                                        @Override
					public void run() {
						synchronized (clip) {
						clip.stop();
						clip.setFramePosition(0);
						clip.start();
					}
				}
			}.start();
			}
		} catch (Exception e) {
		}
	}
	
	public void stop(){
		if(clip == null) return;
		clip.stop();
	}
	
	public void loop() {
		try {
			if (clip != null) {
				new Thread() {
                                        @Override
					public void run() {
						synchronized (clip) {
						clip.stop();
						clip.setFramePosition(0);
						clip.loop(Clip.LOOP_CONTINUOUSLY);
					}
				}
			}.start();
			}
		} catch (Exception e) {
		}
	}
	
	public boolean isActive(){
		return clip.isActive();
	}
}
