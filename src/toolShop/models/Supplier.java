/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.models;

import java.io.Serializable;

/**
 * A tool supplier.
 */
public class Supplier implements Serializable
{
    /**
     * The id.
     */
    private int id;

    /**
     * The company name.
     */
    private String companyName;

    /**
     * The address.
     */
    private String address;

    /**
     * The sales contact.
     */
    private String salesContact;

    /**
     * Creates a supplier.
     *
     * @param id           The id.
     * @param companyName  The company name.
     * @param address      The address.
     * @param salesContact The sales contact.
     */
    public Supplier(int id, String companyName, String address, String salesContact)
    {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
        this.salesContact = salesContact;
    }

    /**
     * Gets the id.
     *
     * @return The id.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id The id.
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Gets the company name.
     *
     * @return The company name.
     */
    public String getCompanyName()
    {
        return companyName;
    }

    /**
     * Sets the company name.
     *
     * @param companyName The company name.
     */
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    /**
     * Gets the address.
     *
     * @return The address.
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param address The address.
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Gets the sales contact.
     *
     * @return The sales contact.
     */
    public String getSalesContact()
    {
        return salesContact;
    }

    /**
     * Sets the sales contact.
     *
     * @param salesContact The sales contact.
     */
    public void setSalesContact(String salesContact)
    {
        this.salesContact = salesContact;
    }
}
