/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package boatSink;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameControllerTest {
    @Test 
    public void testPlayerName() {
    	boolean result1 = GameController.isCorrectPlayerName("");
        assertFalse(result1);   
        
    	boolean result2 = GameController.isCorrectPlayerName("hola");
        assertTrue(result2);   
    }
    
    @Test
    public void testShipOrientation() {
    	boolean result1 = GameController.isCorrectShipOrientation("");
    	assertFalse(result1);
    	
    	boolean result2 = GameController.isCorrectShipOrientation("test");
    	assertFalse(result2);
    	
    	boolean result4 = GameController.isCorrectShipOrientation("-1");
    	assertFalse(result4);
    	
    	boolean result3 = GameController.isCorrectShipOrientation("2");
    	assertFalse(result3);
    	
    	boolean result5 = GameController.isCorrectShipOrientation(Constants.SHIP_HORIZONTAL);
    	assertTrue(result5);
    	
    	boolean result6 = GameController.isCorrectShipOrientation(Constants.SHIP_VERTICAL);
    	assertTrue(result6);
    	
    	boolean result7 = GameController.isCorrectShipOrientation("H");
    	assertFalse(result7);
    	
    	boolean result8 = GameController.isCorrectShipOrientation("V");
    	assertFalse(result8);
    	
    	boolean result9 = GameController.isCorrectShipOrientation("test");
    	assertFalse(result9);
    }
    
    @Test
    public void testShipCoordinate() {
    	boolean res1 = GameController.isCorrectCoordinate("-1");
    	assertFalse(res1);
    	
    	boolean res2 = GameController.isCorrectCoordinate("0");
    	assertTrue(res2);
    	
    	boolean res3 = GameController.isCorrectCoordinate("1");
    	assertTrue(res3);
    	
    	boolean res4 = GameController.isCorrectCoordinate(Integer.toString(Constants.N_BOARD_ROWS_CELLS-1));
    	assertTrue(res4);
  
    	boolean res5 = GameController.isCorrectCoordinate(Integer.toString(Constants.N_BOARD_ROWS_CELLS));
    	assertFalse(res5);
    	
    	boolean res7 = GameController.isCorrectCoordinate("test");
    	assertFalse(res7);
    }
    
    @Test 
    public void testEndOfGame() {
    	GameController g;
    	boolean res1 = GameController.endOfGame();
    }
}
