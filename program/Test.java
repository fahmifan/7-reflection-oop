import hitungListrik.PLN;
import hitungListrik.Device;
import hitungListrik.User;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		User user = new User("fahmi","Bdg",2);
		System.out.print("Masukkan Pulsa Listrik : ");
		int pulsa = in.nextInt();
		user.setPulsa(pulsa);
		user.inputDevice();
		user.info();
		user.cetakDevice();
		System.out.println("Estimasi Hari Pulsa akan habis : " + user.estimasiHari());

		// System.out.println(user.devArr[0].namaDevice);
	}
}



// import hitungListrik.PLN;
// import hitungListrik.Device;
// import hitungListrik.User;
// import java.util.Scanner;
// class Test
// 	{
// 		public static void main(String[] args) 
// 			{	
// 				Scanner in = new Scanner(System.in);
// 				User user = new User();
// 				System.out.print("Masukkan Nama : ");
// 				String nama = in.nextLine();
// 				user.setNama(nama);
// 				System.out.print("Masukkan Alamat : ");
// 				String alamat = in.nextLine();
// 				user.setAlamat(alamat);
// 				System.out.print("Masukkan Jumlah Pulsa : ");
// 				int pulsa = in.nextInt();
// 				user.setTdl(pulsa);
// 				System.out.print("Masukkan Jumlah Device : ");
// 				int jmlDevice = in.nextInt();
// 				user.inputDevice(jmlDevice);
// 				for(int i=0; i<jmlDevice; i++)
// 						{
// 							System.out.println("Nama Device : " + user.getNamaDev(i));
// 						}
// 			}
// 	}