public class ScoreJudge{
    public static void main(String[] args){
        int score=78;
        if(score>=60){
            if(score>=80){
                if(score>=90){
                    System.out.println("优秀");
                }
                System.out.println("良好");
            }
            System.out.println("及格");
        }
        else{
            System.out.println("重考");
        }
    }
}