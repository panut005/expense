import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class UnitTestAccount {
    Account test=new Account();

    @Test
    void addDataTest() {
        test.addData("pasttime","+",500);
        test.addData("buy Hotdog","-",100);
        assertEquals(400, test.getBalance());
    }
}
