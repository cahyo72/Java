import java.io.*;
	public class Fungsir
	{
	public static void main(String[] eko) throws IOException
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String data = "";
		char pilih,ob;
		int x,y,a,b,n,r,bespin,besbung,lampin;

			
				System.out.println("\n======\nProgram\n======");
				do
				{
		System.out.println("\nMenu\n======\n1.Menghitung X Pangkat Y\n2.Mencari Jumlah Suku Deret Aritmatika\n3.Mencari Jumlah Suku Deret Geometri\n4.Menentukan Total Pinjaman Majemuk	\n5.Exit");
		System.out.print("\nPilihlah Nomor Yang Telah Disediakan : ");
		pilih = (input.readLine()).charAt(0);
		System.out.println();
			
				switch(pilih)
				{
				case '1':
					System.out.println("\nProgram Menghitung X Pangkat Y\n======");
					for (int x=1; x>=0; x++);
					double x;
					double y;
				
					String bilangan = "";
					String pangkat = "";
					
					System.out.print("Masukkan Bilangan X : ");
					x = Integer.parseInt(input.readLine());
					System.out.print("Masukkan Bilangan Y : ");
					y = Integer.parseInt(input.readLine());
					System.out.println();
					
					System.out.print("Apakah Anda Ingin Mengulang Lagi? : [Y/T]");
					ob = (input.readLine()).charAt(0);
					break;
						
				case '2':
					System.out.println("\nProgram Mencari Deret Aritmatika\n======");
					System.out.print("Masukkan Bilangan Pertama : ");
					a = Integer.parseInt(input.readLine());
					System.out.print("Masukkan Bilangan Kedua : ");
					b = Integer.parseInt(input.readLine());
					System.out.print("Masukkan Bilangan Ketiga : ");
					n = Integer.parseInt(input.readLine());
					System.out.println();
					
					
					
					
					
					System.out.print("Apakah Anda Ingin Mengulang Lagi? : [Y/T]");
					ob = (input.readLine()).charAt(0);
					
							
							
						break;
								
				case '3':
					System.out.println("\nProgram Mencari Deret Geometri\n======");				
					System.out.print("Masukkan Bilangan Pertama : ");
					a = Integer.parseInt(input.readLine());
					System.out.print("Masukkan Bilangan Kedua : ");
					r = Integer.parseInt(input.readLine());
					System.out.print("Masukkan Bilangan Ketiga : ");
					n = Integer.parseInt(input.readLine());
					System.out.println();	
									
										
										
										
										
					System.out.print("Apakah Anda Ingin Mengulang Lagi? : [Y/T]");
					ob = (input.readLine()).charAt(0);
										
						break;
								
				case '4':
					System.out.println("\nProgram Menghitung Total Penghasilan Majemuk\n======");				
					System.out.print("Masukkan Besar Pinjaman : ");
					bespin = Integer.parseInt(input.readLine());
					System.out.print("Masukkan Besar Bunga : ");
					besbung = Integer.parseInt(input.readLine());
					System.out.print("Masukkan Lama Pinjaman : ");
					lampin = Integer.parseInt(input.readLine());
					System.out.println();	
								
								
								
							
							
					System.out.print("Apakah Anda Ingin Mengulang Lagi? : [Y/T]");
					ob = (input.readLine()).charAt(0);	
								
								
								
						break;
								
				case '5':
									System.out.println("Terima Kasih Telah Berlangganan Dengan Program Kami.");
						break;
				default:
									System.out.println("Maaf, Pilihan Anda Salah, Silahkan Ulangi Kembali");
									}
										}
								while (pilih != '4');
							}
							public static int Pangkat(int x1, int y1)
							{
								int Pangkat
								
								
								
								
								
								}
									}
							public static int Arit(int a1, int b1, int n1)
							{
								int Arit;
								if(a1=1) {Besar}
								
								
								}	
									}
							public static int Geo(int a2, int r1, int n2)
							{
								int Geo

									
									
									
									
									}
										}
							public static int Totpeng(int )
							{
								int Totpeng
								
								
								
											}
												}
												
										
												
											