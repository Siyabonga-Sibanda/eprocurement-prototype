public class Contract
{
    private int id;
    private SupplierCompany supplierCompany;
    private ClientCompany clientCompany;
    private PurchaseOrder purchaseOrder;
    private boolean isSent;
    private String pathToContract;

    public Contract(int id, SupplierCompany supplierCompany, ClientCompany clientCompany,
                    PurchaseOrder purchaseOrder, String pathToContract)
    {
        this.setId(id);
        this.setSupplierCompany(supplierCompany);
        this.setClientCompany(clientCompany);
        this.setPurchaseOrder(purchaseOrder);
        this.setSent(false);
        this.setPathToContract(pathToContract);
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

    public boolean isSent()
    {
        return isSent;
    }

    public void setSent(boolean sent)
    {
        isSent = sent;
    }

    public String getPathToContract()
    {
        return pathToContract;
    }

    public void setPathToContract(String pathToContract)
    {
        this.pathToContract = pathToContract;
    }
}
