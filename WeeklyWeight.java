public class WeeklyWeight {
    public void addingInfo(int[] Arr, int weight, int day){
        Arr[day] = weight;
    }

    public int calculateWeight(int[] Arr, int start, int end){
        if ((start > 7 && start <= 0) || (end > 7 && end <= 0)){
            System.out.println("It is not a valid day.");
            return 0;
        }else{
            int weight = 0;
            weight = Arr[start-1] - Arr[end-1];
            return weight;
        }
    }
    public void print(int[] Arr){
        for (int i = 0; i < 7; i++){
            System.out.print(Arr[i]+ " ");
        }
    } 
}
