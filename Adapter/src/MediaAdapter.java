
public class MediaAdapter implements MediaPlayer {

    private VlcMediaPlayer vlcMediaPlayer;

    public MediaAdapter() {
            vlcMediaPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
    		if(audioType.equalsIgnoreCase("vlc")) {
            vlcMediaPlayer.playVlc(fileName);
    		}else {
                System.out.println("Invalid media. " + audioType + " format not supported");
            }
    }
}
