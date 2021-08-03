package edu.vt.cs5044;

import edu.vt.cs5044.adventure.Game;
import edu.vt.cs5044.adventure.Player;
import edu.vt.cs5044.adventure.Room;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("javadoc")
public class MyGameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new MyGame();
        game.initialize();
    }

    @Test
    public void testInitialRoom() {
        assertEquals("in room one", getRoomName());
    }

    @Test
    public void testGoEast() {

        String message = game.processInput("go east");

        assertEquals("You move east.", message);
        assertEquals("in room two", getRoomName());
        assertEquals("", getRoomAdditional());
    }

    @Test
    public void testGoEastGoEast() {

        String message = processInputList("go east", "go east");

        assertEquals("You move east.", message);
        assertEquals("in room three", getRoomName());
        assertEquals("", getRoomAdditional());
    }

    @Test
    public void testGoEastGoEastGoEast() {

        String message = processInputList("go east", "go east", "go north");

        assertEquals("There is no exit in that direction.", message);
        assertEquals("in room three", getRoomName());
        assertEquals("", getRoomAdditional());
    }

    // USEFUL HELPER METHODS:
    
    /**
     * Process a list of input lines through the game object.
     * 
     * This method will assert fail() if any command is unrecognized by the parser.
     * 
     * @param commands one or more command lines to be executed as commands.
     * @return the result message of the last command.
     */
    private String processInputList(String... commands) {
        String result = null;
        for (String command : commands) {
            result = game.processInput(command);
            if (result == null) {
                fail("Command not processed: '" + command + "'");
            }
        }
        return result;
    }

    /**
     * Return the player.
     * 
     * @return the player.
     */
    private Player getPlayer() {
        return game.getPlayer();
    }


    /**
     * Return the current room.
     * 
     * @return the current room.
     */
    private Room getRoom() {
        return getPlayer().getCurrentRoom();
    }

    /**
     * Return the name of the current room.
     * 
     * @return the name of the current room. 
     */
    private String getRoomName() {
        return getRoom().getName();
    }

    /**
     * Return the additional description of the current room.
     * 
     * @return the additional description of the current room. 
     */
    private String getRoomAdditional() {
        return getRoom().getAdditionalDescription();
    }
}
