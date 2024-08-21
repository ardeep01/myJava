package myJava;

public class patterns {
    public static void main(String args[]){

        System.out.println("Printing some special patterns(using nested loops)");
        System.out.println("1 -> SOLID RECTANGLE");
        int x=4;
        int y=5;
        for(y=1;y<=4;y++){
            for(x=1;x<=5;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2 -> HOLLOW RECTANGLE");
        int i=4;
        int j=5;
        for(i=1;i<=4;i++){
            for(j=1;j<=5;j++){
                if(i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println();
        }
        System.out.println("3 -> HALF PYRAMID");
        int n=4;
        for(n=1;n<=4;n++){
            for(int m=1;m<=n;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}


