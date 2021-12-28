package BE;


import javafx.scene.image.Image;

public class Book {
    static Integer ID = 0;
    String name;
    String author;
    Category category;
    String description;
    Integer year;
    Image image;

    public Book(String name, String author, Category category, Integer year, Image image){
        this.author = author;
        this.category = category;
        this.image = image;
        this.description = description;
        this.year = year;
        this.name = name;
        this.ID = ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = new Image(getClass().getResourceAsStream(image));
    }

    public void setID(Integer id) {
        this.ID = ID++;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public String toString () {
        return String.format("%s%s", getName(), getAuthor());
    }
}

