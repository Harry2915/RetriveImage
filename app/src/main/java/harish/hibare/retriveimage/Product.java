package harish.hibare.retriveimage;

public class Product {
    private int id;
    private String title;
    private String shortdesc;
    private String rating;
    private String price;
    private String image;

    public Product(int id, String name, String price, String rating, String description, String image) {
        this.id = id;
        this.title = name;
        this.shortdesc = description;
        this.rating = rating;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

}
