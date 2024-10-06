public class App{
    public static void main(String[] args){
        //mystery3();
        //NestedNums();
        practice1();
        System.out.println();
        practice2();
        System.out.println();
        practice3();
        System.out.println();
        challenge1();
    }

    public static void practice1(){
        for(int i = 1; i <= 5; i++){
            for(int x = 1; x <= i; x++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void practice2(){
        for(int i = 1; i <= 5; i++){
            for(int x = 1; x <= 5-i; x++){
                System.out.print(".");
            }
            for(int y = 1; y <= i; y++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void practice3(){
        for(int i = 1; i <= 5; i++){
            for(int x = 1; x <= 5-i; x++){
                System.out.print(".");
            }
            System.out.print(i);
            for(int y = 1; y <= i-1; y++){
                System.out.print(".");
            }
            System.out.println();
        }    
    }

    public static void challenge1(){
        for(int i = 1; i <= 9; i++){
            for(int x = 1; x <= 9-i; x++){
                System.out.print(" ");
            }
            for(int y = 1; y <= Math.abs(i*2); y++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int j = 8; j >= 1; j--){
            for(int a = 1; a <= 9-j; a++){
                System.out.print(" ");
            }
            for(int b = 1; b <= Math.abs(j*2); b++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    /*public static void mystery3(){
        int foo = 3;
        for(int number = 0; foo > number; number += 2){
            foo++;
            System.out.println(foo + " " + number);
        }
    }

    public static void NestedNums(){
        for(int i = 1; i <= 5; i++){
            for(int x = 1; x <= 4; x++){
                System.out.print(i);
            }
            System.out.println();
        }
    }*/

}
