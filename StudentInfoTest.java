
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentInfoTest {

    @Test
    public void testSetName() {
        String name = "Jane Doe";
        StudentInfo instance = new StudentInfo();
        String result = instance.setName("Jane Doe");
        assertEquals(name, result);
    }
    
    @Test
    public void testSetRnum() {
        String rnum = "R01234567";
        StudentInfo instance = new StudentInfo();
        String result = instance.setRNum(1234567);
        assertEquals(rnum, result);
    }

    @Test
    public void testSetMajor() {
        String major = "CSET";
        StudentInfo instance = new StudentInfo();
        String result = instance.setMajor("CSET");
        assertEquals(major, result);
    }

    @Test
    public void testSetGPA() {
        StudentInfo instance = new StudentInfo();
        instance.setGPA(2.3);
    }
    
    @Test
    public void testSetPaycheck() {
        StudentInfo instance = new StudentInfo();
        instance.setPaycheck(532.65);
    }
}
