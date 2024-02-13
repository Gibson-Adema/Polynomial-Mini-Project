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





}
