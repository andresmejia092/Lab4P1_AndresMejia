// Andres Mejia
package lab4p1_andresmejia;

import java.util.Scanner;

public class Lab4P1_AndresMejia {
    static Scanner read=new Scanner(System.in);

   
    public static void main(String[] args) {
        int opcion;
        
        do{
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ingrese el numero del ejercicio: ");
            opcion=read.nextInt();
            
            switch(opcion){
                case 1:{
                    String c1,c2;
                    int contador1,contador2;
                    contador1=0;
                    contador2=0;
                    System.out.println("Ingrese la primera cadena: ");
                    c1=read.next();
                    System.out.println("Ingrese la segunda cadena: ");
                    c2=read.next();
                    if(c1.length()!=c2.length()){
                        System.out.println("Los numeros deben de tener el mismo numero de bits.");
                        
                    }
                    for(int i=0; i<c1.length(); i++){
                        char letra=c1.charAt(i);
                        if((int)letra<48 || (int)letra>49){
                        contador1++;
                        }
                    }
                    if(contador1>0){
                        System.out.println("La primera cadena tiene caracteres distintos de 0 y 1");
                    }
                    for(int j=0; j<c2.length();j++){
                        char letra2=c2.charAt(j);
                        if((int)letra2<48 || (int)letra2>49){
                            contador2++;
                        }
                    }
                    if((contador1==0 && contador2==0)&&(c1.length()==c2.length())){
                        sumabin(c1,c2);
                    }
                    
                    if(contador2>0){
                        System.out.println("La segunda cadena tiene caracteres distintos de 0 y 1");
                    }
                    
                    break;
                }
                case 2:{
                    String p1,p2;
                    System.out.println("Ingrese la primera cadena: ");
                    read.nextLine();
                    p1=read.nextLine();
                    p1=p1.toLowerCase();
                    
                    
                    System.out.println("Ingrese la segunda cadena: ");
                    p2=read.nextLine().toLowerCase();
                  
                    
                    if(p2.length()>p1.length()){
                        System.out.println("El tamaño de segunda cadena no puede ser mayor que la primera. ");
                        
                    }
                    else{
                        
                        contains(p1,p2);
                    }
                    
                    
                    break;
                }
                
                case 3:{
                    String palabra;
                    System.out.println("Ingrese la cadena a evaluar: ");
                    read.nextLine();
                    palabra=read.nextLine();
                    palabra=palabra.toLowerCase();
                    alpha(palabra);
                    
                    
                    
                    
                    break;
                }
            }
            
        } while(opcion !=4);
    } //Fin del main
    
    public static void sumabin(String c1, String c2){
        char comodin='0';
        String acum="";
        for (int k=c1.length()-1; k>=0;k--){
            char letra1=c1.charAt(k);
            char letra2=c2.charAt(k);
            
            if(comodin=='1'){
                if(letra1=='0' && letra2=='1'){
                    acum="0"+acum;
                    comodin='1';
                }
                if(letra1=='1' && letra2=='0'){
                    acum="0"+acum;
                    comodin='1';
                }
                if(letra1=='0'&&letra2=='0'){
                    acum="1"+acum;
                    comodin='0';
                }
                if(letra1=='1'&&letra2=='1'){
                    acum="1"+acum;
                    comodin='1';
                }
            }
            
            if(comodin=='0'){
                if(letra1=='0'&&letra2=='0'){
                    acum="0"+acum;
                    comodin='0';
                }
                if(letra1=='1'&&letra2=='0'){
                    acum="1"+acum;
                    comodin='0';
                }
                if(letra1=='0'&&letra2=='1'){
                    acum="1"+acum;
                    comodin='0';
                }
                if(letra1=='1'&&letra2=='1'){
                    acum="0"+acum;
                    comodin='1';
                }
            }
        }
        if(comodin=='1'){
            acum="1"+acum;
        }
        System.out.println(acum);
    } //Fin del sumabin
    
    public static void contains(String p1, String p2){
        String corto;
        int contador=0;
        for(int x=0; x<p1.length()-p2.length()+1;x++){
            corto=p1.substring(x,p2.length()+x);
            if(corto.equals(p2)){
                System.out.println("La cadena "+p1+" contiene a la cadena "+p2);
                contador++;
            }
        }
        if(contador==0){
            System.out.println("La cadena "+p1+" no contiene a la cadena "+p2);
        }      
    } //Fin del contains 
    
    public static void alpha(String palabra){
        int contador;
        contador=0;
        for (int i=0;i<palabra.length();i++){
            char letra=palabra.charAt(i);
            if((int)letra<97 || (int)letra>122){
                contador++;
            }
        }
        if (contador>0){
            System.out.println("La cadena contiene caracteres que no son letras. ");
            
        }
        else{
            System.out.println("La cadena solo contiene letras");
        }
    }
    
}
