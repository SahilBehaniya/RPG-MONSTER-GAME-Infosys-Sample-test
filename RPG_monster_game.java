import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RPG_monster_game {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int e=sc.nextInt();
   int poweri[]=new int[n];
   int bonusi[]=new int[n];

    for(int i=0;i<n;i++){
        poweri[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++){
     bonusi[i]=sc.nextInt();

    }
   int data[][] =new int[n][n];
    for(int i=0;i<n;i++){
      data[i][0]=poweri[i];
      data[i][1]=bonusi[i];
    }
 Arrays.sort(data,Comparator.comparingInt(a->a[0]));

 

int count=0;
 for(int i=0;i<n;i++){
   if(data[i][0]<= e){
      e=e+bonusi[i];
      count++;
   }else{
      break;
   }
 }
System.out.println(count);

   }
}
