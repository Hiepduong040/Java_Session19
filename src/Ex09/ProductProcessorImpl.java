package Ex09;

import java.util.List;

public class ProductProcessorImpl implements ProductProcessor {
    @Override
    public int caculateTotalValue(List<Product> product) {
        int totalValue = 0;
        for(Product p : product){
            totalValue += p.getPrice();
        }
        return totalValue;
    }
}
