/**
 Test list features.
 */
public class UserOfOrderedList {
    public static void main( String[] args ) {
        OrderedList_inArraySlots list = new OrderedList_inArraySlots();

        System.out.println( "number of elements: " + list.size() );

        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());


        for (int value = 6; value > 0; value--) {
            list.add(value);
        } System.out.println("Populated list:" + System.lineSeparator() + list + System.lineSeparator());

        list.add(2);
        list.add(5);
        list.add(7);
        list.add(0);
        System.out.println("Expected list: " + System.lineSeparator() + "[0,1,2,2,3,4,5,5,6,7,]" + System.lineSeparator()
                        + "Returned list: " + System.lineSeparator() + list);

    }
}
