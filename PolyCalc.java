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
try{myPolys[totPoly] = Polynomial.input();
    System.out.print(myPolys[totPoly].getName() + "(x) = ");
    myPolys[totPoly].getPolyString(myPolys[totPoly].getDegree());
    totPoly += 1;
    System.out.println("");}
catch(Exception e){System.out.println(e.getMessage());}
}

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

myPolys[0].multiplication(myPolys[0]);

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
    System.out.print("Evaluate which Polynomial at which integer?");
    String polyAndIntStr = keyboard.nextLine();
String[] polyAndInt = polyAndIntStr.split(" ");
int evalNum = Integer.parseInt(polyAndInt[1]);
Polynomial evalPoly = null;
for(int i = 0; i < totPoly; i++){
    if(myPolys[i].getName().equals(polyAndInt[0])){
    evalPoly = myPolys[i];}}

evalPoly.Evaluate(evalNum, evalPoly.getDegree());
System.out.println(" ");
}

else if(choice.equals("Q")){
    System.out.print("Goodbye");
}

else{System.out.println("Invalid Input");}}
}









public static void main(String[] args) {

PolyCalc driver = new PolyCalc();
driver.page();
 
    }


    }
   

