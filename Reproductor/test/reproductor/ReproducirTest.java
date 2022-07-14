/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ferna
 */
public class ReproducirTest {
    Reproducir cancion;
    public ReproducirTest() {
    }
    
    @Before
    public void setUp() {
        cancion = new Reproducir();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testPlay() {
        System.out.println("play");
        assertFalse(cancion.isPlaying());
        cancion.play();
        assertTrue(cancion.isPlaying());
        cancion.pause();
        assertEquals(cancion.song,1,0.1);
    }

    @Test
    public void testPause() {
        System.out.println("pause");
        cancion.pause();
    }

    @Test
    public void testStop() {
        System.out.println("stop");
        cancion.stop();
    }

    @Test
    public void testIsPlaying() {
        System.out.println("isPlaying");
        boolean expResult = false;
        boolean result = cancion.isPlaying();
        assertEquals(expResult, result);
    }
    
}
