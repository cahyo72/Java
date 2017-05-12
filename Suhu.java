import java.io.*;
public class Suhu
	{
		public static void main(String[]eko) throws IOException
			{
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				String angka;
				double c, suhu;
				char pilih;
				String kata;
				
				
				System.out.print("Masukkan Suhu Celcius : ");
				angka = input.readLine();
				c = Double.parseDouble(angka);
				System.out.print("Pilih K/R/F : ");
				angka = input.readLine();
				pilih = angka.charAt(0);
				
				switch (pilih){
				case 'K':
				case 'k':
				suhu = c+273;
				kata = "Kelvin";
				break;
				case 'R':
				case 'r':
				suhu = c*4/5;
				kata = "Reamur";
				break;
				case 'F':
				case 'f':
				suhu = (c*9/5) + 32;
				kata = "Fahrenheit";
				default :
				suhu = c;
				kata = "Celcius";
				}
				System.out.println("Suhu Yang Dikonversikan Adalah : " + suhu);
				System.out.println("Kata Pengkonversian Adalah : " + kata);
				}}