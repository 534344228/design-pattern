package adapterPattern.adapter;

import adapterPattern.AdvancePlayer.AdvancedMediaPlayer;
import adapterPattern.AdvancePlayer.impl.Mp4Player;
import adapterPattern.AdvancePlayer.impl.VlcPlayer;
import adapterPattern.MediaPlayer.MediaPlayer;

/**
 * 适配器继承或依赖已有的对象，实现想要的目标接口。
 * 
 * @author S5343
 * @date 2018年4月11日下午5:37:46
 */
public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}

}
