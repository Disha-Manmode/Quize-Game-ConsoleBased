import java.util.*;
public class QuestionService {
    Question[] questions= new Question[10];
    String[] selection = new String[10];

    public QuestionService() {
        questions[0] = new Question(1, "Which keyword is used to create an object in Java?", "class", "new", "this", "static", "new");
        questions[1] = new Question(2, "What is the size of an int in Java?", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "4 bytes");
        questions[2] = new Question(3, "Which method is the entry point of a Java program?", "start()", "init()", "main()", "run()", "main()");
        questions[3] = new Question(4, "Which of the following is not a primitive data type?","int","String","char","boolean", "String");
        questions[4] = new Question(5, "Which loop executes at least once?", "for", "while", "do-while", "foreach", "do-while");
        questions[5] = new Question(6, "Which keyword is used for inheritance in Java?", "implements", "extends", "inherits", "super", "extends");
        questions[6] = new Question(7, "Which collection stores unique elements only?", "ArrayList", "LinkedList", "HashSet", "Vector", "HashSet");
        questions[7] = new Question(8, "Which operator is used to compare two values?", "=", "==", ":=", "===", "==");
        questions[8] = new Question(9, "Which package contains the Scanner class?", "java.io", "java.lang", "java.util", "java.sql", "java.util");
        questions[9] = new Question(10, "Which exception occurs when dividing an integer by zero?", "IOException", "ArithmeticException", "NullPointerException", "NumberFormatException", "ArithmeticException");
    }

    public void playQuiz() {
        int i = 0;
        System.out.println("**Welcome to Quize Game**"+ "/n");
        System.out.println("Hello GitHub Actions");
        for (Question  q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }

        for (String s : selection) {
            System.out.println(s);
        }

    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
