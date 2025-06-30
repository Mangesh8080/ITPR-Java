public class oddeven {
    public int Oddeven(){
        int num=3;
        if(num%2==0){
            System.out.println("num is even");

        }
        else{
            System.out.println("num is odd");
        }
        return num;
    }
    
    public static void main(String[] args) {
        oddeven n=new oddeven();
        n.Oddeven(); 
    }
}
