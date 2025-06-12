public class InvoiceApproval
{
    private Invoice invoice;
    private PurchaseOrder purchaseOrder;
    private User approver;
    private final boolean isApproved;
    private String comment;

    public InvoiceApproval(Invoice invoice, PurchaseOrder purchaseOrder, User approver, boolean isApproved, String comment)
    {
        this.setInvoice(invoice);
        this.setPurchaseOrder(purchaseOrder);
        this.setApprover(approver);
        this.isApproved = PurchaseOrderMatch.isMatching(invoice, purchaseOrder);
        this.setComment(comment);
    }

    public Invoice getInvoice()
    {
        return invoice;
    }

    public void setInvoice(Invoice invoice)
    {
        this.invoice = invoice;
    }

    public PurchaseOrder getPurchaseOrder()
    {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder)
    {
        this.purchaseOrder = purchaseOrder;
    }

    public User getApprover()
    {
        return approver;
    }

    public void setApprover(User approver)
    {
        this.approver = approver;
    }

    public boolean isApproved()
    {
        return isApproved;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }
}
