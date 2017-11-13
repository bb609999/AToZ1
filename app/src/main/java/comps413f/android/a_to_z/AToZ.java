package comps413f.android.a_to_z;

import java.util.ArrayList;
import java.util.Collections;

public class AToZ {
    final static int SIZE = 26;
    final static String EMPTY = "";
    private final String lastChar = Character.toString((char) (SIZE + 65));
    private final ArrayList<String> dataList = new ArrayList<String>();   // Game data
    private String curSelection = "A";
    
    // Constructor
    public AToZ() {
        resetDataList();
    }
    
    // Initialized and arranged game data from 'A' to 'Z'  
    private void initializedDataList() {
        // Add code here        
        // Task 1: Initialized the game data
        // i. Remove all element from dataList with clear() method
        // ii. Add 'A' to 'Z' to dataList with "add" method
        // iii. Assign the current character needed to be selected to 'A'
        dataList.clear();
        
        for (int i = 0; i < SIZE; i++) {
            dataList.add(Character.toString((char) (i + 65)));
        }
        
        curSelection = "A";
    }
    
    // Shuffle game data
    private void shuffleDataList() {
        // Add code here        
        // Task 2: Shuffle the dataList
        Collections.shuffle(dataList);
    }

    // Reset game data
    public void resetDataList() {
        // Add code here        
        // Task 3: Reset the game list
        // i. Game data initialization
        // ii. Randomize the game data
        initializedDataList();
        shuffleDataList();
    }
    
    // Returns true if 'A' to 'Z' are selected in order
    // Otherwise, return false 
    public boolean validOrder(String itemSelected) {
        if (curSelection.equals(itemSelected)) {
            dataList.set(dataList.indexOf(itemSelected), EMPTY);
            curSelection = Character.toString((char)(curSelection.charAt(0) + 1));
            return true;
        }
        return false;
    }
    
    // Return true if game end
    // Otherwise, return false
    public boolean isGameComplete() {
        if (curSelection.equals(lastChar))
            return true;
        return false;
    }

    // Getter method
    public ArrayList<String> getDataList() {
        return dataList;
    }
}
