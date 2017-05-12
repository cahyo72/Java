public class M3114061
{
public static void main (String[] frh){
int tinggi=12;
int alas=18;
double setengah_alas=9;
double pangkatan_alas= Math.pow (setengah_alas, 2);
double pangkatan_tinggi=Math.pow (tinggi, 2);
double hasiltambah= pangkatan_alas+pangkatan_tinggi;
double sisimiring=Math.sqrt(hasiltambah);
int luas=(alas*tinggi)/2;
double keliling=alas+(2*sisimiring);
System.out.println("Alas Segitiga ="+alas);
System.out.println("Tinggi Segitiga ="+tinggi);
System.out.println("Sisi Miring Segitiga ="+sisimiring);
System.out.println("Luas Segitiga ="+luas);
System.out.println("Keliling Segitiga ="+keliling);
}
}
