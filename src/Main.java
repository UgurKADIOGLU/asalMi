public class Main {

    public static void main(String[] args) {
	    int sayi=22;
        boolean asalMi=true;
        for(int i=2;i<23;i++){
            if(sayi%i==0){
                asalMi=false;
            }
        }
        if(asalMi==true){
            System.out.println(sayi+" asaldır...");
        }else {
            System.out.println(sayi+" asal değildir...");
        }
    }
}
