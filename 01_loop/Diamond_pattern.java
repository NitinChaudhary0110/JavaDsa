public class Diamond_pattern {

    public static void print(int n){

           //1st Half Diamond Pattern

        for(int i=1;i<=n;i++){
            //Space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1;j<=(2*i-1);j++){
               System.out.print("*");
            }System.out.println();
        }

           //2st Half Diamond Pattern
           
           //Reverse
        for(int i=n-1;i>=1;i--){
            //Space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1;j<=(2*i-1);j++){
               System.out.print("*");
            }System.out.println();
        }

}

    public static void main(String args[]){
        int n=4;
        print(n);
    }
    
}

    

