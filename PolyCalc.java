import java.util.Scanner;

public class PolyCalc {

private final int MAXPOLY = 50;
private Polynomial[] myPolys = new Polynomial[MAXPOLY];
public static int totPoly = 0;

public void page(){
    Scanner keyboard = new Scanner(System.in);


    
    String choice = "";
while(!choice.equals("Q")){
System.out.print("What would you like to do? (C)reate, (A)dd, (Multiply), (Differentiate), (E)valuate, (Q)uit:");
choice = keyboard.nextLine();


if(choice.equals("C")){
myPolys[totPoly] = Polynomial.input();
System.out.print(myPolys[totPoly].getName() + "(x) = ");
myPolys[totPoly].getPolyString(myPolys[totPoly].getDegree());
totPoly += 1;
System.out.println("");}

else if(choice.equals("A")){
System.out.print("What two polynomials do you want to add?");
String twoPolys = keyboard.nextLine();
String[] twoPolysName = twoPolys.split(" ");
Polynomial Poly1 = null;
Polynomial Poly2 = null;

for(int j = 0; j < twoPolysName.length; j++){
 
if(j == 0){
    for(int i = 0; i < totPoly; i++){
if(myPolys[i].getName().equals(twoPolysName[j])){
Poly1 = myPolys[i];}
}
    }
if(j == 1){
    for(int i = 0; i < totPoly; i++){
        if(myPolys[i].getName().equals(twoPolysName[j])){
        Poly2 = myPolys[i];}
}}}

Poly1.add(Poly2);
System.out.println(" ");
}

else if(choice.equals("M")){

}

else if(choice.equals("D")){
    System.out.print("Differentiate which Polynomial?");
    String diffChoice = keyboard.nextLine();
    Polynomial diffPoly = null;

    for(int i = 0; i < totPoly; i++){
        if(myPolys[i].getName().equals(diffChoice)){
        diffPoly = myPolys[i];}}

        diffPoly.differentiate();
    
System.out.println(" ");
}

else if(choice.equals("E")){

}

else{}}
}









public static void main(String[] args) {

PolyCalc driver = new PolyCalc();
int[] coef = {2,3};
Polynomial p12 = new Polynomial("p", 1, coef);
p12.multiplication(coef, coef);
 
    }


    }
   

