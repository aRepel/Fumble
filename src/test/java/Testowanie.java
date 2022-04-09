import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Testowanie {
    void przedTestem(){
        tmp=new Pzedzial(2,10);
        System
    }
   /* @Test
    void testMinWiekszaodMax(){
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class()->{
            new Pzedzial(23,18);
        });
        Assertions.assertEquals("Minimalna jest wieksza od maksymalnej", exception.);
    }*/
    @Test
    @DisplayName("Test jakiś tam")
    @Disabled
    void czyLiczbaBrzegowaJestwPrzedziale(){
        Pzedzial tmp = new Pzedzial(2,10);
        Assertions.assertTrue(tmp.sprawdzenieLiczby(2));
    }

}

