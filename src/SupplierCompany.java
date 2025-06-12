import java.util.ArrayList;

public class SupplierCompany extends Company
{
    private ArrayList<ClientCompany> clientCompanies;
    private long prazCertificateNumber;
    private String companyLogoPath;
    private String companyColour;
    private String registrationCertificatePath;
    private String taxClearanceCertificatePath;
    private String prazCertificatePath;
    private long taxClearanceExpiryDate;
    private long prazCertificateExpiryDate;
    private ArrayList<Rating> ratings;
    private int ratingsCount;
    private int averageRating;
    
    public SupplierCompany(String name, String email, long phoneNumber, String website,
                           long registrationNumber, long taxNumber, String address, String city,
                           String country, long dateJoined)
    {
        super(name, email, phoneNumber, website, registrationNumber, taxNumber, address, city,
                country, dateJoined);
        clientCompanies = new ArrayList<ClientCompany>();
        ratings = new ArrayList<Rating>();
    }
    
    public ArrayList<ClientCompany> getClientCompanies()
    {
        return clientCompanies;
    }
    
    public void addClientCompany(ClientCompany clientCompany)
    {
        this.clientCompanies.add(clientCompany);
    }
    
    public long getPrazCertificateNumber()
    {
        return prazCertificateNumber;
    }

    public void setPrazCertificateNumber(long prazCertificateNumber)
    {
        this.prazCertificateNumber = prazCertificateNumber;
    }

    public String getCompanyLogoPath()
    {
        return companyLogoPath;
    }

    public void setCompanyLogoPath(String companyLogoPath)
    {
        this.companyLogoPath = companyLogoPath;
    }

    public String getCompanyColour()
    {
        return companyColour;
    }

    public void setCompanyColour(String companyColour)
    {
        this.companyColour = companyColour;
    }

    public String getRegistrationCertificatePath()
    {
        return registrationCertificatePath;
    }

    public void setRegistrationCertificatePath(String registrationCertificatePath)
    {
        this.registrationCertificatePath = registrationCertificatePath;
    }

    public String getTaxClearanceCertificatePath()
    {
        return taxClearanceCertificatePath;
    }

    public void setTaxClearanceCertificatePath(String taxClearanceCertificatePath)
    {
        this.taxClearanceCertificatePath = taxClearanceCertificatePath;
    }

    public String getPrazCertificatePath()
    {
        return prazCertificatePath;
    }

    public void setPrazCertificatePath(String prazCertificatePath)
    {
        this.prazCertificatePath = prazCertificatePath;
    }

    public long getTaxClearanceExpiryDate()
    {
        return taxClearanceExpiryDate;
    }

    public void setTaxClearanceExpiryDate(long taxClearanceExpiryDate)
    {
        this.taxClearanceExpiryDate = taxClearanceExpiryDate;
    }

    public long getPrazCertificateExpiryDate()
    {
        return prazCertificateExpiryDate;
    }

    public void setPrazCertificateExpiryDate(long prazCertificateExpiryDate)
    {
        this.prazCertificateExpiryDate = prazCertificateExpiryDate;
    }

    public ArrayList<Rating> getRatings()
    {
        return ratings;
    }

    public void addRating(Rating newRating)
    {
        this.ratings.add(newRating);
    }

    public int getRatingsCount()
    {
        return ratingsCount;
    }

    public void setRatingsCount(int ratingsCount)
    {
        this.ratingsCount = ratingsCount;
    }

    public int getAverageRating()
    {
        return averageRating;
    }

    public void setAverageRating(int averageRating)
    {
        this.averageRating = averageRating;
    }
}
