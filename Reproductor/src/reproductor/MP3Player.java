package reproductor;

public interface MP3Player {
    // En las java interface solo se prototipean los metodos
    public void play();    
    public void pause();
    public void stop();
    public boolean isPlaying();
}
