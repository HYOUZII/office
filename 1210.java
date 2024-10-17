// import java.util.Scanner;

// class Main {
//     public enum MENU {
//         CheeseBurger,
//         VegetableBurger,
//         Milk,
//         Eggroll,
//         Salad
//     }
    
//     public static void main(String[]args){
//         int sum=0;
//         int[] pick = new int[2];
//         Scanner input = new Scanner(System.in);

//         pick[0] = input.nextInt(); 
//         pick[1] = input.nextInt(); 
//         input.close();
        
//         for(int i=0 ; i<2 ; i++){
//             switch (pick[i]) {
//             case 1:
//                 sum += 400;
//                 break;
//             case 2:
//                 sum += 340;
//                 break;
//             case 3:
//                 sum += 170;
//                 break;
//             case 4:
//                 sum += 100;
//                 break;
//             case 5:
//                 sum += 70;
//                 break;
//             default:
//                 System.out.println("error.");
//                 break;
//             }
//         }

//         if(sum>500) System.out.println(sum + " angry");
//         else System.out.println(sum + " no angry");
//     }
// }
