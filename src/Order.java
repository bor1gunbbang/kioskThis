import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> products = new ArrayList<>();
    public double getTotal(){
        double total = 0;
        for (Product product : products){
            total += product.getPrice();

        }
        return total;

    }
    public void showOrder(){
        for(Product product: products){
            System.out.println(product.getName()+ " | " + product.getPrice() + " | " + product.getExplain() );
        }
        System.out.println("[Total]" + getTotal());
    }
    public  void clearOrder(){ products.clear();}
}
