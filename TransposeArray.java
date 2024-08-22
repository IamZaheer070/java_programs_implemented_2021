public class TransposeArray{  
public static void main(String args[]){  

int arr[][]={{1,3,4},{2,4,3},{3,4,5}};  

System.out.println("Printing Matrix without transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(arr[i][j]+" ");    
}    
}
System.out.print(" After transposinf"+trans(arr));   
}      
    
public static int trans(int[][] arr) {
    
        for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
       arr[j][i];  
     
} 
  
}    
      
    }

  
 
}