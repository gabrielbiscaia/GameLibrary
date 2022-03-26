public class Game {
    private String name;
    private String genre;
    private boolean multiplayer;
    private int vision;
    private boolean overEighteen;
    private String releaseYear;
    private String developer;
    private Float price;
    
    public Float getPrice() {
        return price;
    }
    public boolean isOverEighteen() {
        return overEighteen;
    }
    public void setOverEighteen(boolean overEighteen) {
        this.overEighteen = overEighteen;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public boolean isMultiplayer() {
        return multiplayer;
    }
    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }
    public int getVision() {
        return vision;
    }
    public void setVision(int vision) {
        this.vision = vision;
    }
    public String getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getDeveloper() {
        return developer;
    }
    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
}
