package edu.vt.cs5044;

/**
 * Message file for the adventure game project.
 *
 * @version 2020-04-06
 */
@SuppressWarnings("javadoc")
public class Message {

    // EXAMINE
    
    public static final String objectNotInScope(String obj) {
        return "You can't see any " + obj + ".";
    }
    
    public static final String examineDefault(String obj) {
        return "You see nothing special about the " + obj + ".";
    }

    public static final String examineDark() {
        return "It's too dark around here to examine anything.";
    }
    
    public static final String examineClosedContainer(String obj) {
        return "The " + obj + " is closed.";
    }
    
    public static final String examineEmptyContainer(String obj) {
        return "The " + obj + " is empty.";
    }

    // OPEN
    
    public static final String openDark() {
        return "It is too dark to open anything here.";
    }
    
    public static final String openCant(String obj) {
        return "The " + obj + " is not something you can open.";
    }

    public static final String openAlready(String obj) {
        return "The " + obj + " is already open.";
    }

    public static final String openSuccess(String obj) {
        return "You open the " + obj + ".";
    }

    // INVENTORY

    public static final String inventoryEmpty() {
        return "You are not carrying anything.";
    }

    // TAKE
    
    public static final String takeCant(String obj) {
        return "You can't take the " + obj + ".";
    }

    public static final String takeAlready(String obj) {
        return "You aleady have the " + obj + ".";
    }

    public static final String takeSuccess(String obj) {
        return "You take the " + obj + ".";
    }


    // LOCKED OUT SCENARIO
    
    public static final String roomDriveway() {
        return "in your driveway";
    }
    
    public static final String roomHouse() {
        return "inside your house";
    }
    
    public static final String roomGarage() {
        return "in your garage";
    }
    
    public static final String roomFrontYard() {
        return "in the front yard";
    }

    public static final String examineLanternBroken() {
        return "There is no light-bulb in the lantern.";
    }

    public static final String examineLanternFixed() {
        return "The lantern is now providing light.";
    }
}

