import org.example.Collection;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import static org.junit.Assert.*;

public class CollectionTest {

    Collection collection = new Collection();

    @Test
    public void isMapEmpty_ShouldReturnTrueIfMapIsEmpty(){
        assertTrue(collection.isMapEmpty(new HashMap<>()));
    }


    @Test
    public void isMapContainKey_ShouldReturnTrueIfKeyIsPresent (){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"u");
        map.put(3,"d");
        map.put(4,"hh");
        map.put(17,"abc");
        assertTrue(collection.isMapContainKey(map, 17));
    }

    @Test
    public void isMapContainKey_ShouldReturnFalseIfKeyIsNotPresent (){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"u");
        map.put(3,"d");
        map.put(4,"hh");
        map.put(17,"abc");
        assertFalse(collection.isMapContainKey(map, 18));
    }

    @Test
    public void getMapValue_ShouldPassIfKeyIsPresentAndValueMatches(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"u");
        map.put(3,"d");
        map.put(4,"hh");
        map.put(17,"abc");
        assertEquals(collection.getMapValue(map, 17), "abc");
    }

    @Test
    public void getMapValue_ShouldPassIfKeyIsNotPresentAndValuesMatches(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"u");
        map.put(3,"d");
        map.put(4,"hh");
        map.put(17,"abc");
        assertEquals(collection.getMapValue(map, 18), "18 not present");
    }

    @Test
    public void characterAtIndex_ShouldPassIfCharAndValueMatches(){
        assertEquals(collection.characterAtIndex("dun & bradstreet", 4).toString(), "&");
    }

    @Test
    public void concatTwoString_ShouldPassIfConcatStringAndValueMatches(){
        assertEquals(collection.concatTwoString("d","nb"), "dnb");
    }

    @ParameterizedTest
    @ValueSource(ints = {-4,-3,-2,-1, 0, 1,2,3,4})
    public void compareTwoStringTest(int number){
        assertEquals(collection.compareTwoString("abc","egh"), number);
    }

    @Test
    public void repeatStringForNegativeNumber(){
        assertThrows(IllegalArgumentException.class, () -> collection.repeatString("dnb",-3));
    }

    @Test
    public void repeatStringForPositiveNumber(){
        assertEquals(collection.repeatString("dnb",3),"dnbdnbdnb");
    }

}
