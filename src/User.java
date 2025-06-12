public class User
{
    private String name;
    private String email;
    private UserRoles role;
    private String department;
    private ClientCompany company;
    
    public User(String name, String email, UserRoles role, String department, ClientCompany company)
    {
        this.setName(name);
        this.setEmail(email);
        this.setRole(role);
        this.setDepartment(department);
        this.setCompany(company);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public UserRoles getRole()
    {
        return role;
    }

    public void setRole(UserRoles role)
    {
        this.role = role;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public ClientCompany getCompany()
    {
        return company;
    }

    public void setCompany(ClientCompany company)
    {
        this.company = company;
    }
}
