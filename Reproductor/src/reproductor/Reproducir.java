package reproductor;

public class Reproducir implements MP3Player{
    boolean isplay = false;
    int song = 0;
    @Override
    public void play() {
        isplay = true;
        song = 1;
    }

    @Override
    public void pause() {
        isplay = false;
        song = 1;
    }

    @Override
    public void stop() {
        isplay = false;
        song = 0;
    }

    @Override
    public boolean isPlaying() {
      return isplay;
    }
    
}
