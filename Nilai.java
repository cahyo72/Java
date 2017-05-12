import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Nilai
{
public static void main(String[] ada){
BufferedReader dataIn=new BufferedReader(new 
InputStreamReader(System.in));
String Nama = "";
String Nilai = "";
String Ket;
System.out.println( "Program Menentukan Nilai Mahasiswa" );
System.out.print( "Masukkan Nama : " );
try{
Nama=dataIn.readLine();
System.out.print( "\nMasukkan Nilai : " );
Nilai=dataIn.readLine();
}catch( IOException e ){
System.out.println( "Error!" );
String StatA;
}
int int1= Integer.parseInt(Nilai);
String StatA;
if((int1>=0)&(int1<=100)){StatA="Valid";}
else{StatA="Tidak Valid";}
if(int1>=60){Ket="\tLulus";}
else{Ket="\tTidak Lulus";}  
System.out.println( "Nama & Keterangan "+Nama + Ket);
System.out.println( "Keterangan Status "+StatA); 
}}
