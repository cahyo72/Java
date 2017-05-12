import java.io.*;
public class Max
	{
		public static void main(String[]eko) throws IOException
			{
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				String angka;
				int a, b, c, max;
				
				
				System.out.print("Masukkan Angka Pertama : ");
				angka = input.readLine();
				a = Integer.parseInt(angka);
				System.out.print("Masukkan Angka Kedua : ");
				angka = input.readLine();
				b = Integer.parseInt(angka);
				System.out.print("Masukkan Angka Ketiga : ");
				angka = input.readLine();
				c = Integer.parseInt(angka);
				
			
				if ((a > b) & (a > c))
				{ System.out.println("Max A");}
				else {
				if (b > c)
				{System.out.println("Max B");}
				else 
				{System.out.println("Max C");
					}
						}
							}
								}