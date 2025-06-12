import java.util.ArrayList;

public class Invoice
{
    private int id;
    private SupplierCompany supplierCompany;
    private ClientCompany clientCompany;
    private PurchaseOrder purchaseOrder;
    private final ArrayList<InvoiceItem> ITEMS;
    private double totalCost;
    private long dateIssued;

    public Invoice(int id, SupplierCompany supplierCompany, ClientCompany clientCompany,
                   PurchaseOrder purchaseOrder, double totalCost, long dateIssued)
    {
        this.setId(id);
        this.setSupplierCompany(supplierCompany);
        this.setClientCompany(clientCompany);
        this.setPurchaseOrder(purchaseOrder);
        this.ITEMS = new ArrayList<InvoiceItem>();
        this.setTotalCost(totalCost);
        this.setDateIssued(dateIssued);
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

    public ArrayList<InvoiceItem> getItems()
    {
        return ITEMS;
    }
    
    public void addInvoiceItem(InvoiceItem invoiceItem)
    {
        this.ITEMS.add(invoiceItem);
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }

    public long getDateIssued()
    {
        return dateIssued;
    }

    public void setDateIssued(long dateIssued)
    {
        this.dateIssued = dateIssued;
    }
}
