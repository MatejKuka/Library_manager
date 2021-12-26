package BE;

public enum Category {
    Business("Business"),
    Politickévedy("Politické vedy"),
    Cooking("Cooking"),
    Spoločenskévedy ("Spoločenské vedy"),
    Biografia("Biografia"),
    Ezoterika("Ezoterika"),
    Cestopis("Cestopis"),
    Ekonómia("Ekonómia"),
    Horor("Horor"),
    Scifi("Sci-fi"),
    Právo("Právo"),
    Poézia("Poézia"),
    História("História");


    private String name;

    Category(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
