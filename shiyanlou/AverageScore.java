public class AverageScore{
    public static void main(String[] args){
        int[] scores={61,57,95,85,75,65,44,66,90,32};
        int sum1=0;
        for(int score:scores){
            sum1+=score;
        }
        double ave=sum1/scores.length;
        System.out.println(ave);
    }
}