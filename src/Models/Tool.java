package Models;

public class Tool
{
    private int id;
    private String name;
    private int quantity;
    private double price;
    private int supplierId;

    public Tool(int id, String name, int quantity, double price, Supplier supplier)
    {
        this(id, name, quantity, price, supplier.getId());
    }

    public Tool(int id, String name, int quantity, double price, int supplierId)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.supplierId = supplierId;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void decrementQuantity()
    {
        if (quantity <= 0)
        {
            throw new Error("Cannot decrement tool quantity below zero.");
        }

        quantity--;
    }

    public boolean isEmpty()
    {
        return quantity <= 0;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getSupplierId()
    {
        return supplierId;
    }

    public void setSupplierId(int supplierId)
    {
        this.supplierId = supplierId;
    }
}
