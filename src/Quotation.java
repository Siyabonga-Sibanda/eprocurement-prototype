import java.util.ArrayList;

public class Quotation
{
    private int id;
    private SupplierCompany supplierCompany;
    private ClientCompany clientCompany;
    private PurchaseOrder purchaseOrder;
    private final ArrayList<QuoteItem> ITEMS;
    private double totalCost;
    private String pathToQuotation;

    public Quotation(int id, SupplierCompany supplierCompany, ClientCompany clientCompany,
                     PurchaseOrder purchaseOrder, double totalCost, String pathToQuotation)
    {
        this.setId(id);
        this.setSupplierCompany(supplierCompany);
        this.setClientCompany(clientCompany);
        this.setPurchaseOrder(purchaseOrder);
        this.ITEMS = new ArrayList<QuoteItem>();
        this.setTotalCost(totalCost);
        this.setPathToQuotation(pathToQuotation);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }

    public String getPathToQuotation()
    {
        return pathToQuotation;
    }

    public void setPathToQuotation(String pathToQuotation)
    {
        this.pathToQuotation = pathToQuotation;
    }
}
