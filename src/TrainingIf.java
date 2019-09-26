import java.util.Scanner;
public class TrainingIf {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.print("введіть число з плаваючою комою = ");
        float muk = s.nextFloat();
        if(muk > 0) {
            System.out.println("введене число більше 10");
        }
        if(muk > 10){
            System.out.println("введене число більше 0 та 10");
        }
        if(muk < 5){
            System.out.println("введене число менше 5");
        }
        if(muk == -2){
            System.out.println("введене число дорівнює -2");
        }
        if(muk != 0){
            System.out.println("введене число не дорівнює 0");
        }
        if(muk <= 8){
            System.out.println("введене число менше 8 включно");
        }
        if(muk == 12 | muk == 14){
        System.out.println("введене число або 12 або 14");
        }
        if(muk < -7 & muk > 7){
            System.out.println("введене число знаходиться не в діапазоні від -7 до 7");
        }
        if(muk >= 0 & muk < 1){
            System.out.println("введене число знаходиться в діапазоні від 0 включно до 1 невключно");
        }
        if(muk < 5 & muk > -5){
            System.out.println("введене число знаходиться в діапазоні від -5 до 5");
        }
        if(muk >= 1 & muk < 10 | muk == 0 & muk != 8){
            System.out.println("мені лінь писати");
        }
        if(muk > 6.28 & muk < 6.3){
            System.out.println("ну ти старався");
        }
        if(muk == 3.1415*2){
            System.out.println("ай ти ж мій молодець ! Свм порахував ?");
        }
    }
}
