import java.util.Scanner;

public class Polynomial {
    private String polyName;
    private int degree;
    private int[] coefficients;
    
    public Polynomial(String polyName, int degree, int[] coefficients){
    this.polyName = polyName;
    this.degree = degree;
    if( coefficients.length == degree + 1){
        this.coefficients = coefficients;
    }
    else{
        System.out.print("Invalid Input");
    }
    }
    
    
public static Polynomial input() throws Exception{
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter Polynomial(name, degree, coefficients)");
String total = keyboard.nextLine(); 
String[] totals = total.split(" ");
String polyName = totals[0];
int degree = Integer.parseInt(totals[1]);
int[] coefficients = new int[totals.length -2];
int j = 0;
for(int i = 2; i < totals.length; i++){
coefficients[j] = Integer.parseInt(totals[i]);
j++;}
if(coefficients.length != degree + 1){
    throw new Exception("Invalid Input");
}

return new Polynomial(polyName, degree, coefficients);
}

    
    
    public void getPolyString(int degree){
        System.out.print("(");
for(int i = 0; i < coefficients.length; i++){
if(coefficients[i]!=0) {
System.out.print(coefficients[i]);
if(degree > 1){
    System.out.print("x^" + degree);
}
else if(degree == 1){
    System.out.print("x");
}
else if(degree == 0){
    System.out.print("");
}
degree-= 1;
if(degree != -1){
    System.out.print(" + ");}}
else{degree -= 1;}
}
System.out.print(")");
    }



public int[] getCoefficients(){
return coefficients;}

public int getDegree(){
    return degree;
}

public String getName(){
    return polyName;
}




private void addingString(Polynomial otherPoly){

getPolyString(degree);
System.out.print(" + ");
otherPoly.getPolyString(degree);
System.out.print(" = ");
}


private int[] addFunction(Polynomial otherPoly){

int[] otherCoefficients = otherPoly.getCoefficients();

int[] newCoefficients = new int[coefficients.length];

for(int i = 0; i < coefficients.length; i++){
   newCoefficients[i] = coefficients[i] + otherCoefficients[i];
}
return newCoefficients;
}

private void resultsString(int[] newCoefficients){

    for(int i = 0; i < newCoefficients.length; i++){
        if(newCoefficients[i]!=0) {
        System.out.print(newCoefficients[i]);
        if(degree > 1){
            System.out.print("x^" + degree);
        }
        else if(degree == 1){
            System.out.print("x");
        }
        else if(degree == 0){
            System.out.print("");
        }
        degree-= 1;
        if(degree != -1){
            System.out.print(" + ");}}
        else{degree -= 1;}
        }
}


public void add(Polynomial otherPoly){

addingString(otherPoly);
int[] newCos = addFunction(otherPoly);
resultsString(newCos);

}




private void diffString(){
    System.out.print("d/dx");
    getPolyString(degree);
    System.out.print(" = ");
}


private void diffunct(int degree){
    int[] coefficientsans = coefficients.clone();
    for(int i = 0; i < coefficientsans.length; i++){
coefficientsans[i] = coefficientsans[i]*degree;
degree -= 1;


if(coefficientsans[i] != 0){
if(degree >= 2){
    System.out.print(coefficientsans[i] + "x^" + degree);
}
else if(degree == 1){
    System.out.print(coefficientsans[i] + "x");
}
else if(degree == 0){
System.out.print(coefficientsans[i]);
    }


if(coefficientsans[i + 1]*degree != 0){
if(degree > 0){
System.out.print(" + ");}}}
}


}



public void differentiate(){

diffString();

diffunct(degree);



}



 public void multiplication(Polynomial Poly2) {
    int[] Poly1 = getCoefficients();
    int newDegree = getDegree() + Poly2.getDegree();
        int[] resultPoly = new int[getDegree() + Poly2.getDegree() + 1];
        
        for (int n = getDegree(); n > 2; n--) {
            for (int i = Poly2.getCoefficients().length; i > 2; i--) {
                resultPoly[n + i - 3] += Poly1[n] * Poly2.getCoefficients()[i];
            }
        }

        System.out.print(resultPoly.length);
        for(int i = 0; i < resultPoly.length; i++){
            int degree1 = resultPoly.length;
            System.out.print(resultPoly[i] + "x^" + (degree1 - i));
        }
    }
private void Evaluatefunc(int evalNum, int degree){
    
    int answer = 0;
    for(int coef : coefficients){
answer += coef*(Math.pow(evalNum, degree));
degree -= 1;
    }

System.out.print(answer);}

public void Evaluate(int evalNum, int degree){
    getPolyString(degree);
    System.out.print(" = ");
    Evaluatefunc(evalNum, degree);
}


}



