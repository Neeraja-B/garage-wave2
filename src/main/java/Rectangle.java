 public class rectangle{  
    public static void main(String args[])  
    {  
    int width=5;  
    int height=10;  
    int area=width*height;  
        System.out.println("Area of rectangle="+area);  
     }  
}  


public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }
}
