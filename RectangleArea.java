//Define the class Reactangle
class Rectangle {

    //Instance variables(attributs) of the class
    private int length;
    private int breadth;

    //Constructor to inialize the attributes
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //Method for Displayin length and breadths
    void Display(){
        System.out.println("Length of Rectangle is:"+ length);
        System.out.println("Breadth of the Rectangle is:"+ breadth);
    }
    //Method to calculate Area of Reactangle 
    public int CalArea(){
        return length*breadth;
    }
}
public class RectangleArea{
    public static void main(String args[]){

        //Creating a Recatnagle object 
        Rectangle obj=new Rectangle(6,3);

        //Calling CalArea method of the class Reactnagle
        int Area=obj.CalArea();

        //Displaying length and breadths
        obj.Display();

        //Displaying Area of Rectangle
        System.out.println("Area of Rectangle is:"+Area);
    }
}
