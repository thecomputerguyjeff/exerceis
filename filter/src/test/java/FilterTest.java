/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FilterTest {

    @Test (expected = IllegalArgumentException.class)

    public void SlowFoxesThrowsExceptionWhenPassedNull() {
        Filter.slowFoxes(null);

    }
    @Test
    public void SlowFoxesReturnEmptyListWhenPassedEmptyList() {

        List<String> actual = Filter.slowFoxes(new ArrayList<String>());

        assertEquals(Collections.emptyList(),actual);

    }

    @Test
    public void NoSwiftFoxReturnsSameListWhenAllParametersAreNotASwiftFox
            () {

        List<String> original = new ArrayList<>();
        original.add("Red Fox");

        List <String> actual = Filter.slowFoxes(original);
        assertEquals(original, actual);

    }
    @Test
    public void NoSwiftFoxReturnsAListWithNoSwiftFoxWhenSwiftFoxIncluded() {

        List<String> original = new ArrayList<>();
        original.add("Red Fox");
        original.add("Swift Fox");

        List <String> actual = Filter.slowFoxes(original);

        assertEquals(Arrays.asList("Red Fox"), actual);

    }

    ///////////////////////////////////////

    @Test (expected = IllegalArgumentException.class)
    public void AdultsThrowsExceptionWhenPassedNull() {
        Filter.adults(null);

    }

    @Test
    public void PersonShouldContainFirstNameLastNameAge() {

        Filter newFilter = new Filter();









    }








}
