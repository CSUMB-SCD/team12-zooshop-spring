package spring;

public class Items {

    private String itemid;
    private int itemNumber;
    private String name;
    private double price;
    private String description;
    private int instock;
    private String image;

    public Items() {}

    public Items(String itemid, String name, double price, String description, int instock, String image) {
        this.itemid = itemid;
        this.name = name;
        this.price = price;
        this.description = description;
        this.instock = instock;
        this.image = image;
    }
    
    public void save(Items item) {
        this.itemid = item.itemid;
        this.name = item.name;
        this.price = item.price;
        this.description = item.description;
        this.instock = item.instock;
        this.image = item.image;
    }

    public String getId() { return itemid; }
    public void setId(String itemid) { this.itemid = itemid; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getInstock() { return instock; }
    public void setInstock(int instock) { this.instock = instock; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}