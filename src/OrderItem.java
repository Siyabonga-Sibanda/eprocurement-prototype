public class OrderItem
{
    private String productID;
    private String productName;
    private String description;
    private int quantity;

    public OrderItem(String productID, String productName, String description, int quantity)
    {
        this.setProductID(productID);
        this.setProductName(productName);
        this.setDescription(description);
        this.setQuantity(quantity);
    }

    public String getProductID()
    {
        return productID;
    }

    public void setProductID(String productID)
    {
        this.productID = productID;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
