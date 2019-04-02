package Models;

import java.io.Serializable;

public class Supplier implements Serializable
{
    private int id;
    private String companyName;
    private String address;
    private String salesContact;

    public Supplier(int id, String companyName, String address, String salesContact)
    {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
        this.salesContact = salesContact;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getSalesContact()
    {
        return salesContact;
    }

    public void setSalesContact(String salesContact)
    {
        this.salesContact = salesContact;
    }
}
