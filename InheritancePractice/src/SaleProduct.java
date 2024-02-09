/**
 * This class represents a product that can be sold at a reduced sales price
 */
public class SaleProduct extends Product {
    private boolean currentlyOnSale;
    private double discountPercentage;

    public SaleProduct(int aisle, String section, int row,
                       String productName, double price,
                       boolean currentlyOnSale, double discountPercentage) {
        super( aisle, section, row, productName, price);
        this.currentlyOnSale = currentlyOnSale;
        this.discountPercentage = discountPercentage;
    }

    public boolean getcurrentlyOnSale(){
        return currentlyOnSale;
    }

    public double getdiscountPercentage(){
        return discountPercentage;
    }

    @Override
    public String toString(){
        String saleInfo = currentlyOnSale ? ", Discount: " + (discountPercentage * 100) + "%" : ", Not on sale";
        return super.toString() + saleInfo;
    }
}

