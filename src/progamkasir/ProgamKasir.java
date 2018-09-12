package progamkasir;
import java.util.Scanner;
public class ProgamKasir {

    public static void main(String[] args) {
        Scanner masuk=new Scanner (System.in); {
String namaBarang,kodeBarang;
int jumlahBeli;
double harga,total1=0,diskon=0,total2;
       
System.out.println(" WELCOME ");
System.out.println(" Nama Barang : " );
namaBarang = masuk.nextLine();
System.out.println(" Kode Barang : ");
kodeBarang = masuk.nextLine();
System.out.println(" Harga barang : ");
harga = masuk.nextDouble();
System.out.println(" Jumlah barang : ");
jumlahBeli = masuk.nextInt();

total1=harga*jumlahBeli;

if(total1> 100000){
    diskon= 0.1*total1;
}
if(total1> 200000){
diskon=0.2*total1;
}
if(total1>500000){
diskon=0.5*total1;
}
  total2=total1-diskon;
  
  System.out.println("Total harga yang harus dibayar : " + total2);
  System.out.println(" THANK YOU ");      
    }
    }
}
