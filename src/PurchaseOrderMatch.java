public class PurchaseOrderMatch
{
    public static boolean isMatching(Invoice invoice, PurchaseOrder purchaseOrder)
    {
        return invoice.getItems().equals(purchaseOrder.getItems()); 
    }
}
