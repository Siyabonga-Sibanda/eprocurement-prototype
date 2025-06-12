import java.util.ArrayList;

public class PurchaseOrder
{
    private String id;
    private SupplierCompany supplierCompany;
    private ClientCompany clientCompany;
    private final ArrayList<OrderItem> items;
    private PurchaseOrderStatus status;
    private Contract contract;

    public PurchaseOrder(String id, SupplierCompany supplierCompany, ClientCompany clientCompany,
                         ArrayList<OrderItem> items, PurchaseOrderStatus status,
                         Contract contract)
    {
        this.setId(id);
        this.setSupplierCompany(supplierCompany);
        this.setClientCompany(clientCompany);
        this.setStatus(status);
        this.setContract(contract);
        this.items = items;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
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

    public ArrayList<OrderItem> getItems()
    {
        return items;
    }

    public PurchaseOrderStatus getStatus()
    {
        return status;
    }

    public void setStatus(PurchaseOrderStatus status)
    {
        this.status = status;
    }

    public Contract getContract()
    {
        return contract;
    }

    public void setContract(Contract contract)
    {
        this.contract = contract;
    }
}
