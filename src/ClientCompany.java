import java.util.ArrayList;
import java.util.Stack;

public class ClientCompany extends Company
{
    private final ArrayList<SupplierCompany> supplierCompanies;
    
    public ClientCompany(String name, String email, long phoneNumber, String website,
                  long registrationNumber, long taxNumber, String address, String city,
                  String country, long dateJoined, String departmentID)
    {
        super(name, email, phoneNumber, website, registrationNumber, taxNumber, address, city,
                country, dateJoined);
        
        supplierCompanies = new ArrayList<>();
    } 
    
    public ArrayList<SupplierCompany> getSupplierCompanies()
    {
        return supplierCompanies;
    }
    
    public void addSupplierCompany(SupplierCompany supplierCompany)
    {
        this.supplierCompanies.add(supplierCompany);
    }
    
    public void rateSupplier(SupplierCompany supplierCompany, int score, String comment)
    {
        Rating rating = new Rating(score, comment);
        supplierCompany.addRating(rating);
    }
}
