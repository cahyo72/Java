	import java.io.*;
	public class Stack{
	public static void main(String[] eko){
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	char pilih;
	System.out.println("\n1.Input Data\n2.Ambil Data Stack\n3.Cetak Data\n4.Keluar");
	System.out.print("Masukkan Pilihan Anda : ");
	pilih = (input.readLine()).charAt(0);
	System.out.println();;
	switch(pilih)
				{
				case '1':
					System.out.println("\nInput Data");
					
					
					
					
					System.out.println();
				break;
				
				case '2';
					System.out.println("\nAmbil Data Stack");
					
					
					
					
					System.out.println();
				break;
				
				case '3';
					System.out.println("\nCetak Data Stack");
					
					
					
					System.out.println();
				break;
				
				case '4':
					System.out.println("Terima Kasih Telah Berlangganan Dengan Program Kami.");
				break;
				default:
					System.out.println("Maaf, Pilihan Anda Salah, Silahkan Ulangi Kembali");
					}
						}
					while (pilih != '4');
						}
	













	public static boolean cekpenuh(int top){
	boolean penuh;
	if(top==max){penuh=true;}else{penuh=false;}
	return penuh;
	}
	//buat method pengecekan kosong
	public static boolean cekkosong(int top){
	boolean kosong;
	if(top==max){kosong=true;}else{kosong=false;}
	return kosong;
	}
	//buat method penginputan data
	public static int inputdata(String[]nama,int top){
	if(cekpenuh(top))
		{System.out.println("Maaf Data Penuh!");}
	else{
		nama[0]=nama[top];
		System.out.println("Data Nama Yang Diinput : "+nama[top]);}
		top--;
		}
	return top;
	}
	//buat method pengambilan data
	public static int ambildata(String[]nama,int top){
	if(cekkosong(top))
		{System.out.println("Maaf Data Kosong!");}
	else{
		nama[0]=nama[top];
		System.out.println("Data Nama Yang Diambil : "+nama[top]);}
		top--;
		}
	return top;
	}
	//cetak data
	public static void cetakdata(String[]nama,int top){
	if(cekkosong(top))
		{System.out.println("Maaf Data Kosong!");}
	else{
		for(int i=1; i<=top; i++)
		{System.out.println("Data Nama Ke-"+i+" : " + nama[i]);}
		}
			}