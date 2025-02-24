package modell;

//

import org.example.modell.Gyujtemeny;
import org.example.modell.Konyv;
import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.UUID;


//


 public class GyujtemenyTest {
    Gyujtemeny gy = new Gyujtemeny();
    @Test
    public void szerializalhatoTest(){
        assertTrue(Serializable.class.isAssignableFrom(Gyujtemeny.class),"üzenet");
    }

    @Test
    public void listaNemModosithato(){
        gy.getKonyvLista().add(new Konyv(UUID.randomUUID(),3200,"leiras5","cim5","szerzo5",2005));
        assertEquals(gy.getKonyvLista().size(),6);
    }
    @Test
    public void szerializalhatoHaschCoderaTest(){
        Gyujtemeny gy2 = new Gyujtemeny();
        assertTrue(gy.hashCode(), gy2.hashCode());
    }
    @Test
    public void feroHelyTest(){
        Gyujtemeny gy2 = new Gyujtemeny();
        gy2.venni(new Konyv(UUID.randomUUID(),3200,"leiras5","cim5","szerzo5",2005);
        assertTrue(gy2.getKonyvLista().size(), 5);
    }

}
