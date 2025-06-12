import java.util.ArrayList;

public class Requisition
{
    private String id;
    private ClientCompany clientCompany;
    private ArrayList<SupplierCompany> suppliers;
    private String department;
    private User requestedBy;
    private String title;
    private String description;
    private ArrayList<OrderItem> orderItems;
    private int totalAmount;
    private RequisitionStatus status;
    private long dateCreated;
    private long dueDate;

    public Requisition(String id, ClientCompany clientCompany, ArrayList<SupplierCompany> suppliers,
                       String department, User requestedBy, String title, String description,
                       int totalAmount, RequisitionStatus status, long dateCreated, long dueDate)
    {
        this.id = id;
        this.clientCompany = clientCompany;
        this.suppliers = suppliers;
        this.department = department;
        this.requestedBy = requestedBy;
        this.title = title;
        this.description = description;
        this.totalAmount = totalAmount;
        this.status = status;
        this.dateCreated = dateCreated;
        this.dueDate = dueDate;
        this.orderItems = new ArrayList<OrderItem>();
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public ClientCompany getClientCompany()
    {
        return clientCompany;
    }

    public void setClientCompany(ClientCompany clientCompany)
    {
        this.clientCompany = clientCompany;
    }

    public ArrayList<SupplierCompany> getSuppliers()
    {
        return suppliers;
    }

    public void setSuppliers(ArrayList<SupplierCompany> suppliers)
    {
        this.suppliers = suppliers;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public User getRequestedBy()
    {
        return requestedBy;
    }

    public void setRequestedBy(User requestedBy)
    {
        this.requestedBy = requestedBy;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public ArrayList<OrderItem> getRequisitionItems()
    {
        return orderItems;
    }

    public void addRequisitionItem(OrderItem orderItem)
    {
        this.orderItems.add(orderItem);
    }

    public int getTotalAmount()
    {
        int total = 0;

        for (OrderItem item : orderItems)
        {
            total++;
        }

        return total;
    }

    public RequisitionStatus getStatus()
    {
        return status;
    }

    public void setStatus(RequisitionStatus status)
    {
        this.status = status;
    }

    public long getDateCreated()
    {
        return dateCreated;
    }

    public long getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(long dueDate)
    {
        this.dueDate = dueDate;
    }
}
