import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Posneg
{
public static void main(String[] ada){
BufferedReader dataIn=new BufferedReader(new 
InputStreamReader(System.in));
String Angka = "";
String Ket;
System.out.println( "Program Mengetahui Positif Negatif" );
System.out.print( "Masukkan Angka : " );
try{
Angka=dataIn.readLine();
}catch( IOException e ){
System.out.println( "Error!" );
String StatA;
}
int int1= Integer.parseInt(Angka);
String StatA;
if(((int1>=0)&(int1<=0)&(int1==0))){StatA="Positif";}
else{StatA="Negatif";}
if(int1>0){Ket="Positif";}
else{Ket="Negatif";} 
System.out.println( "Hasil "+Angka + Ket);
}}


