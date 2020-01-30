import java.util.Scanner;

public class MyGame {
    public static void main(String arg[]){
        String q1 = " what is the color of Orange\n"
                +"a) blue\nb)yellow\nc)purple";
        String q2 =" what is the color of apple\n"
                +"a) green\nb)white\nc)red";


        Question[] questions={
                new Question(q1,"b"),
                new Question(q2,"c")
        };
         takeTest(questions);

    }
    public static void takeTest(Question [] questions){

        int score = 0;
        Scanner balde =new Scanner(System.in);
        for(int i = 0 ; i < questions.length;i++){
             System.out.println(questions[i].prompt);
             String answer = balde.nextLine();
             if(answer.equals(questions[i].answer)){
                score++;

            }

        }
        System.out.println(" you got "+score+"/"+questions.length);
    }
}
