/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;

public class MapTest {


    @Test(expected = IllegalArgumentException.class)
    public void evenOrOddThrowsExceptionWhenNULL() {
        Map.evenOrOdd(null);

    }

    @Test
    public void evenOrOddReturnsEmptyListWhenInputListIsEmpty() {

        assertEquals(Collections.emptyList(), Map.evenOrOdd(Collections.emptyList()));

    }

    @Test
    public void evenOrOddReturnsListWithSingleItemOdd() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);


        assertEquals(Arrays.asList("Odd"), Map.evenOrOdd(numbers));


    }

    @Test
    public void evenOrOddReturnsListWithSingleItemEven() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);


        assertEquals(Arrays.asList("Even"), Map.evenOrOdd(numbers));

    }

    @Test
    public void evenOrOddReturnsListWithMultipleItemsThatAreEvenOrOdd() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2891);

        assertEquals(Arrays.asList("Even", "Odd", "Even", "Odd"), Map.evenOrOdd(numbers));

    }
    //////////////////////////////////////////////
    @Test (expected = IllegalArgumentException.class)
    public void PluckThrowsExceptionWhenListIsNull() {

        Map.pluck(null, "Hello");

    }

    @Test (expected = IllegalArgumentException.class)
    public void PluckReturnsEmptyWhenGivenAnEmptyListWithAnyProperty() {

       Map.pluck(Collections.emptyList(), "Hello");

    }

    @Test (expected = IllegalArgumentException.class)
    public void PluckThrowsIllegalArguementIfPropertyIsNull() {

        Map.pluck(Collections.emptyList(), null);

    }
    @Test (expected = IllegalArgumentException.class)
    public void PluckThrowExceptionIfPropertyIsEmptyWithLegaList() {

        Map.pluck(Collections.emptyList(), "");

    }
//
//    @Test (expected = IllegalArgumentException.class)
//    public void PluckThrowsExcpetionIfPropertyDoesNotExistInItem() {
//
//        List<HashMap<String,String>> list= new ArrayList<>();
//        HashMap<String, String> item1 = new HashMap<>();
//
//        item1.put("Prop", "val");
//        list.add(item1);
//
//        Map.pluck(list, "porp");
//
//
//    }

    @Test
    public void PluckReturnAnArrayListBasedOnThePropertiesCalledForOneItem() {

        List<HashMap<String,String>> list= new ArrayList<>();
        HashMap<String, String> item1 = new HashMap<>();

        item1.put("Property1", "val1");
        item1.put("Property2", "val2");
        item1.put("Property3", "val3");
        list.add(item1);

        assertEquals(Arrays.asList("val1"),Map.pluck(list, "Property1"));


    }

    @Test
    public void PluckRetursnanArryListOfAllItemsWithSelectedProperty() {

        List<HashMap<String,String>> list= new ArrayList<>();
        HashMap<String, String> item1 = new HashMap<>();
        HashMap<String, String> item2 = new HashMap<>();

        item1.put("Property1", "val1");
        item1.put("Property2", "val2");
        item1.put("Property3", "val3");
        item2.put("Property1", "1val1");
        item2.put("Property2", "2val2");
        item2.put("Property3", "3val3");
        list.add(item1);
        list.add(item2);

        assertEquals(Arrays.asList("val2", "2val2"), Map.pluck(list, "Property2"));

    }

}

