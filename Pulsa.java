//nomor 2
import java.util.Scanner;
public class Pulsa {
public static void main(String[] eko) {
double uang, rm50, rm20, rm10, rm5, rm2, rm1, sn5, sn1, sisa;
double RM50 = 50*3500;
double RM20 = 20*3500;
double RM10 = 10*3500;
double RM5 = 5*3500;
double RM2 = 2*3500;
double RM1 = 1*3500;
double Sen5 = 5*350;
double Sen1 = 1*350;
Scanner dataIn = new Scanner(System.in);
System.out.print("Masukan nilai tukar uang : Rp ");
uang=dataIn.nextInt();
rm50=uang/RM50;
rm20=(uang%RM50)/RM20;
rm10=((uang%RM50)%RM20)/RM10;
rm5=(((uang%RM50)%RM20)%RM10)/RM5;
rm2=((((uang%RM50)%RM20)%RM10)%RM5)/RM2;
rm1=(((((uang%RM50)%RM20)%RM10)%RM5)%RM2)/RM1;
sn5=((((((uang%RM50)%RM20)%RM10)%RM5)%RM2)%RM1)/Sen5;
sn1=(((((((uang%RM50)%RM20)%RM10)%RM5)%RM2)%RM1)%Sen5)/Sen1;
sisa=(((((((uang%RM50)%RM20)%RM10)%RM5)%RM2)%RM1)%Sen5)%Sen1;

System.out.println("RM 50 sebanyak "+rm50+" buah");
System.out.println("RM 50 sebanyak "+rm50+" buah");
System.out.println("RM 20 sebanyak "+rm20+" buah");
System.out.println("RM 10 sebanyak "+rm10+" buah");
System.out.println("RM 5 sebanyak "+rm5+" buah");
System.out.println("RM 2 sebanyak "+rm2+" buah");
System.out.println("RM 1 sebanyak "+rm1+" buah");
System.out.println("5 sen sebanyak "+sn5+" buah");
System.out.println("1 sen sebanyak "+sn1+" buah");
System.out.println("sisanya adalah Rp "+ sisa);
}
}