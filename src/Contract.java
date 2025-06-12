public class Contract
{
    private int id;
    private SupplierCompany supplierCompany;
    private ClientCompany clientCompany;
    private PurchaseOrder purchaseOrder;
    private boolean isSent;

    private static int globalIdCount = 201;
    
    public Contract(SupplierCompany supplierCompany, ClientCompany clientCompany,
                    PurchaseOrder purchaseOrder)
    {
        this.id = globalIdCount;
        globalIdCount++;
        this.setSupplierCompany(supplierCompany);
        this.setClientCompany(clientCompany);
        this.setPurchaseOrder(purchaseOrder);
        this.setSent(false);
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

    public boolean isSent()
    {
        return isSent;
    }

    public void setSent(boolean sent)
    {
        isSent = sent;
    }
}
