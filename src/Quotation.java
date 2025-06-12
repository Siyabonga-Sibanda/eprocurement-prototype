import java.util.ArrayList;

public class Quotation
{
    private final int id;
    private SupplierCompany supplierCompany;
    private ClientCompany clientCompany;
    private PurchaseOrder purchaseOrder;
    private final ArrayList<QuoteItem> ITEMS;
    private double totalCost;
    
    private static int globalIdCount = 100;

    public Quotation(SupplierCompany supplierCompany, ClientCompany clientCompany,
                     PurchaseOrder purchaseOrder)
    {
        this.id = globalIdCount;
        globalIdCount++;
        this.setSupplierCompany(supplierCompany);
        this.setClientCompany(clientCompany);
        this.setPurchaseOrder(purchaseOrder);
        this.ITEMS = new ArrayList<QuoteItem>();
        this.setTotalCost();
    }

    public SupplierCompany getSupplierCompany()
    {
        return supplierCompany;
    }

    public void setSupplierCompany(SupplierCompany supplierCompany)
    {
        this.supplierCompany = supplierCompany;
    }

    public ClientCompany getClientCompany()
    {
        return clientCompany;
    }

    public void setClientCompany(ClientCompany clientCompany)
    {
        this.clientCompany = clientCompany;
    }

    public PurchaseOrder getPurchaseOrder()
    {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder)
    {
        this.purchaseOrder = purchaseOrder;
    }

    public ArrayList<QuoteItem> getItems()
    {
        return ITEMS;
    }

    public void addItem(QuoteItem quoteItem)
    {
        this.ITEMS.add(quoteItem);
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost()
    {
        for (QuoteItem item : ITEMS)
        {
            this.totalCost += item.getTotalCost();
        }
    }
}
