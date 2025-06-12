import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class SupplierFunctions
{
    public static void registerClient(SupplierCompany supplierCompany, ClientCompany clientCompany)
    {
        for (ClientCompany client : Data.clientCompanies)
        {
            for (ClientCompany innerClient : supplierCompany.getClientCompanies())
            {
                if (client.equals(innerClient))
                {
                    break;
                }
            }
            
            if (client.equals(clientCompany))
            {
                supplierCompany.addClientCompany(clientCompany);
            }
        }
    }
    
    public static void printOrders(SupplierCompany supplierCompany)
    {
        for (PurchaseOrder order : supplierCompany.getOrders())
        {
            System.out.println("Order from: " + order.getClientCompany() + "\nThey ordered: " +
                    order);
        }
    }
    
    public static void generateQuotation(SupplierCompany supplierCompany, ClientCompany clientCompany,
                                         PurchaseOrder purchaseOrder, String pathToQuotation)
    {
        try
        {
            File quotationDocument = new File(pathToQuotation);
            PrintWriter out = new PrintWriter(quotationDocument);
            Quotation quotation = new Quotation(supplierCompany, clientCompany, purchaseOrder);
            Data.quotations.add(quotation);
            
            out.println("Order from " + clientCompany.getName() + " to " + supplierCompany.getName());
            out.println();
            out.println("Order");
            out.println();
            out.println(quotation.getItems());
            out.println("Total cost: " + quotation.getTotalCost());
            out.close();
        } 
        catch (FileNotFoundException exception)
        {
            System.out.println("Unable to print Quote.");
        }
    }
    
    public static void generateContract(SupplierCompany supplierCompany, ClientCompany clientCompany,
                                        PurchaseOrder purchaseOrder, String pathToContract)
    {
        try
        {
            File contractDocument = new File(pathToContract);
            PrintWriter out = new PrintWriter(contractDocument);
            Contract contract = new Contract(supplierCompany, clientCompany, purchaseOrder);
            Data.contracts.add(contract);
            
            out.println("Contract between " + supplierCompany.getName() + " and " +
                        clientCompany.getName());
            out.println("Contract");
            out.close();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("Unable to print contract");
        }
    }
    
    public static void updateTrackingStatus()
    {
        // TODO Something
    }
}
