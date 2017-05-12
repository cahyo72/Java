import java.io.*;
public class pbkd3
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int[]angka = new int[100];
		int i, n, max;
		double rata;
		
		System.out.print("Masukkan n : ");
		n = Integer.parseInt(input.readLine());
		
		
		data(angka, n);
		max = carimax(angka, n);
		rata = carirata(angka, n);
		System.out.println("Nilai max adalah " + max);
		System.out.println("Nilai rata adalah " + rata);
	}
	
	public static void data(int[]angka, int n) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= n; i++)
		{
			System.out.print("Masukkan angka : ");
			angka[i] = Integer.parseInt(input.readLine());
		}
	}
	
	public static int carimax(int[]angka, int n)
	{
		int i=1;
		int max=angka[i];
		for (i = 1; i <= n; i ++)
		{
			if (angka[i] > max)
			
				max = angka[i];
		}
		
		return (max);
	}
	
	public static double carirata(int[]angka, int n)
	{
		int i = 1, total = 0;
		double rata;
		for (i = 1; i<= n; i++)
		{
			total = total + angka[i];
		}
		
		rata = total/n;
		return (rata);
	}
}