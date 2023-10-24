import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class emptyStringChecker implements StringChecker{
    public boolean checkString(String s){
        if(s == ""){
            return false;
        } else{
            return true;
        }
    }
}

public class ListTests{
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<String>();
        input1.add("0");
        input1.add("1");
        StringChecker input2 = new emptyStringChecker();
        List<String> result = new ArrayList<String>();
        result.add("0");
        result.add("1");
        assertEquals(result, input1, input2);
    }

    // @Test
    // public void testMerge(){
    //     List<String> input1 = new ArrayList<String>();
    //     input1.add("0");
    //     input1.add("1");
    //     List<String> input2 = new ArrayList<String>();
    //     input2.add("2");
    //     input2.add("3");
    //     List<String> result = new ArrayList<String>();
    //     result.add("0");
    //     result.add("1");
    //     result.add("2");
    //     result.add("3");
    //     assertEquals(result, input1, input2);
    // }

}