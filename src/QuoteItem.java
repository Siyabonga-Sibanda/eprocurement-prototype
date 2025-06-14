public class QuoteItem extends OrderItem
{
    private double unitPrice;
     
    public QuoteItem(String productID, String productName, String description, int quantity,
                     double unitPrice)
    {
        super(productID, productName, description, quantity);
        this.setUnitPrice(unitPrice);
    }

    public double getTotalCost()
    {
        return getUnitPrice() * this.getQuantity();
    }

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
}
