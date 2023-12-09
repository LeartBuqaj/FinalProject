import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Ushqimi> artikujt;

    public Cart(){
        this.artikujt = new ArrayList<>();
    }

    public void shtoNeShporte(Ushqimi item) {
        artikujt.add(item);
        System.out.println("Produkti u shtua ne shporte " + item.getEmriUshqimit());
    }
}
