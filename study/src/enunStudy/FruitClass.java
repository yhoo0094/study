package enunStudy;

public class FruitClass {
    public static final FruitClass APPLE  = new FruitClass("APPLE", "RED");
    public static final FruitClass PEACH  = new FruitClass("PEACH", "PINK");
    public static final FruitClass BANANA = new FruitClass("BANANA", "YELLOW");
    
    String type;
    String color;
    
    //생성자의 접근 제어자가 private
    private FruitClass(String type){
    	this.type = type;
    }
    
    private FruitClass(String type, String color){
    	this.type = type;
    	this.color = color;
    }
    
}

	