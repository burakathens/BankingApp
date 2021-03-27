import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {


        musteriyarat().Menu();


    }


    public static BankaHesabi musteriyarat(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Adınızı giriniz:  ");
        String name=scan.next();
        int no=4590230;
        BankaHesabi bankaHesap=new BankaHesabi();
        bankaHesap.musteriAdi=name;
        bankaHesap.musteriNo=no;
        no+=2;
        return bankaHesap;
    }
}
    class BankaHesabi {
        int bakiye;
        int sonIslem;
        String musteriAdi;
        int musteriNo;

        BankaHesabi(){
        }
        BankaHesabi(String musteriAdi,int musteriNo){
            this.musteriAdi=musteriAdi;
            this.musteriNo=musteriNo;
        }


        void paraYatir(int miktar){

            if(miktar!=0){
                bakiye+=miktar;
                sonIslem=miktar;
            }
        }
        void paraCek(int miktar){
            if (miktar!=0){
                bakiye-=miktar;
                sonIslem=-miktar;
            }
        }
        void getsonIslem(){
            if (sonIslem>0){
                System.out.println("Yatırılan: $"+sonIslem);
            }
            if(sonIslem<0){
                System.out.println("Çekilen: $"+Math.abs(sonIslem));
            }
            else if(sonIslem==0) {
                System.out.println("daha önce yapılan bir işlem yoktur...");
            }
        }

        void Menu(){
            char giris='\0';

            Scanner tara=new Scanner(System.in);
            System.out.println("Sayın "+musteriAdi+", Athens Bank'a Hoşgeldiniz");
            System.out.println("Müşteri numaranız: "+musteriNo);




            do {
                System.out.println("=========================================");
                System.out.println("A. Bakiye Sorgulama");
                System.out.println("B. Para Yatırma");
                System.out.println("C. Para Çekme");
                System.out.println("D. Son Hesap Hareketi");
                System.out.println("E. Çıkış");
                System.out.println("=========================================");
                System.out.println("Hangi işlemi yapmak istersiniz?  ");
                System.out.println("=========================================");
                giris=tara.next().toUpperCase().charAt(0);
                System.out.println("\n");
                //System.out.println("=========================================");
                switch (giris){

                    case 'A':

                        System.out.println("******************************************");
                        System.out.println("Bakiyeniz : "+bakiye);
                        System.out.println("******************************************");
                        System.out.println("\n");
                        break;

                    case 'B':
                        System.out.println("=========================================");
                        System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                        System.out.println("=========================================");
                        int miktar= tara.nextInt();
                        paraYatir(miktar);
                        System.out.println("\n");
                        break;

                    case 'C':
                        System.out.println("=========================================");
                        System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                        System.out.println("=========================================");
                        int miktar2=tara.nextInt();
                        paraCek(miktar2);
                        System.out.println("\n");
                        break;

                    case 'D':
                       //System.out.println("******************************************");
                        getsonIslem();
                        System.out.println("=========================================");
                        System.out.println("\n");
                        break;

                    case 'E':
                        System.out.println("=========================================");
                        break;
                    default:
                        System.out.println("Geçersiz seçim... tekrar giriş yapınız: \n");



                }


            }
            while (giris!='E');{
                System.out.println("Teşekkür ederiz yine bekleriz :) ");
                System.out.println("=========================================");

            }
        }

    }

