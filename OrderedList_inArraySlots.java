/*
Features needed:
- constructor
- add
- size
- toString
- private findIndex
*/

public class OrderedList_inArraySlots {

    private List_inArraySlots orderedList;

    // constructor
    public OrderedList_inArraySlots() {
        orderedList = new List_inArraySlots();
    }

    //add
    public void add( int value) {
        int index = findIndex(value);
        orderedList.add(index,value);
    }

    //size
    public int size() {
        return orderedList.size();
    }

    //toString
    public String toString() {
        return "" + orderedList;
    }

    private int findIndex( int value) {
        if (orderedList.size() == 0) return 0;
        else {
            for (int index = 0; index < orderedList.size(); index++){
                if (value < orderedList.get(index) )
                    return index;
            }
        }
        return orderedList.size();
    }

}
