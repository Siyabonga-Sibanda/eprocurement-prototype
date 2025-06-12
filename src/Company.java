public abstract class Company
{
    protected String name;
    protected int uid;
    protected String email;
    protected long phoneNumber;
    protected String website;
    protected long registrationNumber;
    protected long taxNumber;
    protected String address;
    protected String city;
    protected String country;
    protected long dateJoined;
    
    private static int globalID = 1;
    
    public Company(String name, String email, long phoneNumber, String website, 
                   long registrationNumber, long taxNumber, String address, String city,
                   String country, long dateJoined)
    {
        this.setName(name);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setWebsite(website);
        this.setRegistrationNumber(registrationNumber);
        this.setTaxNumber(taxNumber);
        this.setAddress(address);
        this.setCity(city);
        this.setCountry(country);
        this.dateJoined = dateJoined;
        
        setUid(globalID);
        globalID++;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getUid()
    {
        return uid;
    }

    public void setUid(int uid)
    {
        this.uid = uid;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public long getRegistrationNumber()
    {
        return registrationNumber;
    }

    public void setRegistrationNumber(long registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }

    public long getTaxNumber()
    {
        return taxNumber;
    }

    public void setTaxNumber(long taxNumber)
    {
        this.taxNumber = taxNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}
