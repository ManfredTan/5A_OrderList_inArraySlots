/*
Features needed:
- constructor
- add
- size
- toString
- private findIndex
*/

public class OrderedList_inArraySlots {

    private List_inArraySlots orderList;

    // constructor
    public OrderedList_inArraySlots() {
        orderList = new List_inArraySlots();
    }

    //add
    public void add( int value) {
        int index = findIndex(value);
        orderList.add(index,value);
    }

    //size
    public int size() {
        return orderList.size();
    }

    //toString
    public String toString() {
        return "" + orderList;
    }

    private int findIndex( int value) {
        int correctIndex = 0;
        if (orderList.size() == 0) return 0;
        else {
            for (int index = orderList.size() - 1; index != 0; index--){
                if (value < orderList.get(index) ) {
                    correctIndex = index;
                    index = 0;
                }
            }
        }
        return correctIndex;
    }

}
