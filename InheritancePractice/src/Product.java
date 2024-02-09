//Represents a sellable product

/**
 * This class represents a product sold at retail price
 */
public class Product extends PlaceableItem { // Product is-a PlaceableItem
    private String productName;
    private double price;

    public Product(int aisle, String section, int row,
                   String productName, double price) {
        super(aisle, section, row);
        this.productName = productName;
        this.price = price;
        }

        public String getproductName(){
        return productName;
    }

        public double getPrice(){
        return price;
        }

        @Override
    public String toString(){
        return super.toString() + productName + price;
        }
}
