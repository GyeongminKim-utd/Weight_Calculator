public class WeeklyWeight {
    //function to store the weight information to the array
    public void addingInfo(int[] Arr, int weight, int day){
        Arr[day] = weight;
    }

    //function to calculate the weight from user selected days
    public int calculateWeight(int[] Arr, int start, int end){
        if ((start > 7 && start <= 0) || (end > 7 && end <= 0)){
            System.out.println("It is not a valid day.");
            return 0;
        }else{
            int weight = 0;
            weight = Arr[end-1] - Arr[start-1];
            return weight;
        }
    }

    //function to print out the weights of week
    public void print(int[] Arr){
        for (int i = 0; i < 7; i++){
            System.out.println( "day " + (i+1) + ": " + Arr[i]);
        }
    } 
}
