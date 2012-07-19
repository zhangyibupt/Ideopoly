package com.ideopoly.src;

import junit.framework.TestCase;
import org.junit.*;


/** Class to provide helper methods for use in my testing classes. */
public class TestHelper extends TestCase {
    // TODO: Make a TestHelperTester class to test these methods? Overkill?
    /** Have each Player draw a card. */
    // TODO: Rather than using two separate methods, try to find a way to allow the first
    //       argument to be of type Chance or CommunityChest.
    public static void doActionsAllPlayers(Chance card, IdeopolyGUI gui, Player p1, Player p2, Player p3, Player p4) {
	// TODO: Do I need the two arguments? They're the same for each time I call them here.
	card.doActions(p1, gui, p2, p3, p4);
	card.doActions(p2, gui, p1, p3, p4);
	card.doActions(p3, gui, p1, p2, p4);
	card.doActions(p4, gui, p1, p2, p3);
    }

    public static void doActionsAllPlayers(CommunityChest card, IdeopolyGUI gui, Player p1, Player p2, Player p3, Player p4) {
	// TODO: Is there a way to allow the first argument to have a variable type, so I don't have to
	//       make two separate methods for it?
	// TODO: Do I need the two arguments? They're the same for each time I call them here.
	card.doActions(p1, gui, p2, p3, p4);
	card.doActions(p2, gui, p1, p3, p4);
	card.doActions(p3, gui, p1, p2, p4);
	card.doActions(p4, gui, p1, p2, p3);
    }

    /** Check that the total cash value v is the same for every Player.*/
    public static void assertCash(int v, Player p1, Player p2, Player p3, Player p4) {
	assertEquals(p1.getCash("total"), v);
	assertEquals(p2.getCash("total"), v);
	assertEquals(p3.getCash("total"), v);
	assertEquals(p4.getCash("total"), v);
    }

    /** Make sure the unique total cash values v1/2/3/4 for each 
     *  individual Player are correct. */
    public static void assertCash(int v1, int v2, int v3, int v4, Player p1, Player p2, Player p3, Player p4) {
    	assertEquals(p1.getCash("total"), v1);
    	assertEquals(p2.getCash("total"), v2);
    	assertEquals(p3.getCash("total"), v3);
    	assertEquals(p4.getCash("total"), v4);
    }


    /** Move all players to the same BoardCell on the gui. */
    public static void changeCellAllPlayers(int cell, IdeopolyGUI gui, Player p1, Player p2, Player p3, Player p4) {
	p1.changeCell(cell, gui);
	p2.changeCell(cell, gui);
	p3.changeCell(cell, gui);
	p4.changeCell(cell, gui);
    }

    /** Ensure that all four players are standing on the same cell. */
    public static void assertSameCell(int cell, IdeopolyGUI gui, Player p1, Player p2, Player p3, Player p4) {
	assertEquals(p1.getCell(), gui.boardProperties[cell]);
	assertEquals(p2.getCell(), gui.boardProperties[cell]);
	assertEquals(p3.getCell(), gui.boardProperties[cell]);
	assertEquals(p4.getCell(), gui.boardProperties[cell]);
    }

    /** Make sure players p1, p2, p3, and p4 have the same jail status s. */
    public static void assertSameJailStatus(int s, Player p1, Player p2, Player p3, Player p4) {
	assertEquals(p1.getJailStatus(), s);
	assertEquals(p2.getJailStatus(), s);
	assertEquals(p3.getJailStatus(), s);
	assertEquals(p4.getJailStatus(), s);
    }
}