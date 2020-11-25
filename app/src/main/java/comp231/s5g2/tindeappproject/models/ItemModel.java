package comp231.s5g2.tindeappproject.models;

public class ItemModel {
    private String image;
    private String name, location;

    public ItemModel(){

    }
    public ItemModel(String image, String name, String location){
        this.image = image;
        this.name = name;
        this.location = location;

    }
    public String getImage() {return image;}

    public String getName(){return name;}

    public String getLocation(){return location;}

}