// Superclass
class Dimensions {
    int length;
    int breadth;

    Dimensions(){
        length=6;
        breadth=3;
    }

    void Display(){
        System.out.println("length:"+length);
        System.out.println("braedth:"+breadth);
    }

    void UseOfDimensions(){
        System.out.println("We will use these dimensions for a Rectangle");    }
}
// Subclass
class Result extends Dimensions {
    @Override
    void Display(){
        System.out.println("length:"+length);
        System.out.println("braedth:"+breadth);
    }
    void CalcArea(){
        System.out.println("Area of the Rectangle is:"+ (length*breadth));
    }
}
public class inheritTypeCast {
    // Upcasting
    public static void main(String[] args) {
        
        Dimensions myDimensions = new Result(); // Upcasting
        myDimensions.Display(); // Calls the overridden method in Result
        myDimensions.UseOfDimensions(); // Calls the method in Dimensions

        if (myDimensions instanceof Result) { // Checking to ensure it's safe
            Result myResult = (Result) myDimensions; // Downcasting
            myResult.Display(); // Calls the overridden method in Result
            myResult.CalcArea(); // Calls the Result Specified Method
        }
    }
}

