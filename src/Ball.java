public class Ball {
    private String type;
    private Integer radius;

    public Ball(String type1, Integer radius1){

        this.type = type1;
        this.radius = radius1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public String toString(){
        return "This is a ball for " + type + " with radius " + radius.toString();
    }
}
