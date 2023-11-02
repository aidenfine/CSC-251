public class Player {
    private String name;
    private int height; // inches

    // setName
    public void setName(String newName){
        name = newName;
    }
    public void setHeight(int newHeight ){
        height = newHeight;
    }

    public String getName(){
        return name;
    }
    public int getHeight(){
        return height;
    }

}
