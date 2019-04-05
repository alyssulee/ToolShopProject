package toolShop.models;

import java.io.Serializable;

/**
 * A tool.
 */
public class Tool implements Serializable
{
    /**
     * The id.
     */
    private int id;

    /**
     * The name.
     */
    private String name;

    /**
     * The quantity in stock.
     */
    private int quantity;

    /**
     * The price per unit.
     */
    private double price;

    /**
     * The suppler's id.
     */
    private int supplierId;

    /**
     * Creates a tool.
     *
     * @param id       The id.
     * @param name     The name.
     * @param quantity The quantity in stock.
     * @param price    The price per unit.
     * @param supplier The supplier id.
     */
    public Tool(int id, String name, int quantity, double price, Supplier supplier)
    {
        this(id, name, quantity, price, supplier.getId());
    }

    /**
     * Creates a tool.
     *
     * @param id         The id.
     * @param name       The name.
     * @param quantity   The quantity in stock.
     * @param price      The price per unit.
     * @param supplierId The supplier's id.
     */
    public Tool(int id, String name, int quantity, double price, int supplierId)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.supplierId = supplierId;
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
     * Gets the name.
     *
     * @return The name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name The name.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the quantity in stock.
     *
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the quantity in stock.
     *
     * @param quantity The quantity in stock.
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    /**
     * Indicates weather the item is out of stock.
     *
     * @return Weather the item is out of stock.
     */
    public boolean isEmpty()
    {
        return quantity <= 0;
    }

    /**
     * Gets the price per unit.
     *
     * @return The price per unit.
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Sets the price per unit.
     *
     * @param price The price per unit.
     */
    public void setPrice(double price)
    {
        this.price = price;
    }

    /**
     * Gets the supplier id.
     *
     * @return The supplier id.
     */
    public int getSupplierId()
    {
        return supplierId;
    }

    /**
     * Sets the supplier id.
     *
     * @param supplierId The supplier id.
     */
    public void setSupplierId(int supplierId)
    {
        this.supplierId = supplierId;
    }

    /**
     * Pretty-prints the tool to a string.
     *
     * @return The properly formatted tool string.
     */
    public String toString()
    {
        // Todo: Move this out of here to wherever the print order is created
        return "Tool ID: " + id + ", Tool Name: " + name + ", Item Quantity: " + quantity + "\n";
    }
}
