import java.io.*;
public class datastack
{
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static int max=3;
	public static void main(String[] eko)throws IOException
	{
		String data = "";
		int top=0;
		String[]nama = new String[max+1];
		char pilih;
	
		menu(nama,top);
	}//akhir dari program utama
	
		public static boolean Cekpenuh(int top)
		{
			boolean penuh;
			if(top==max)
		{
			penuh=true;
		}
		
		else
		
		{
			penuh=false;
		}
	
		return penuh;
	
		}
	public static int input(String [] data, int top)throws IOException{
		
		if(Cekpenuh(top))
		{
			System.out.println("\nmaaf data penuh");
		}
			else
			{
			top++;
			System.out.print("\nMasukkan nama : ");
			data[top]=input.readLine();
			}
				return top;
				}
		//buat method ambil secara stack

			public static int ambildatastack(String[]nama, int top)
			{
				if(cekkosong(top))
				{
					System.out.println("Maaf Data Kosong!");
				}
			else
			{
		nama[0]=nama[top];
		System.out.println("Data nama yang diambil :"+nama[top]);
		top--;
	}
	return top;
	}
//cetakdata
public static void cetakdata (String[]nama, int top){
if(cekkosong(top)){
	System.out.println("Maaf Data Kosong!");
	}
else{
	for(int i=1; i<=top; i++){
	System.out.println("Data nama ke-"+i+" :"+nama[i]);
	}
	}
	}
public static boolean cekkosong(int top) {
	boolean kosong;
	if(top==0){
		kosong=true;
		}
	else{
		kosong=false;
		}
	return kosong;
}
	public static void menu(String[]nama, int top)throws IOException{
	int pilih;
	do{
	System.out.println("================================================================================");
	System.out.println("                                      MENU");
	System.out.println("================================================================================");
	System.out.println("1. Input data");
	System.out.println("2. Ambil data stack");
	System.out.println("3. Cetak data");
	System.out.println("4. Keluar");
	System.out.print("================================================================================");
	System.out.print("\n\nMasukkan pilihan anda : ");
	pilih = Integer.parseInt(input.readLine());
	
	switch(pilih){
		case 1:
			top=input(nama,top);
			break;
		
		case 2:
			top=ambildatastack(nama,top);
			break;
			
			
		case 3:
			cetakdata(nama,top);
			break;
		
		case 4:
			break;
		
		default:
			System.out.println("Maaf menu yang anda pilih tidak tersedia");
		}
		}
	while(pilih!=4);
	}
}