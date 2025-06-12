public class InvoiceItem extends OrderItem
{
    private double unitPrice;


    public InvoiceItem(String productID, String productName, String description, int quantity,
                       double unitPrice)
    {
        super(productID, productName, description, quantity);
        this.setUnitPrice(unitPrice);
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
