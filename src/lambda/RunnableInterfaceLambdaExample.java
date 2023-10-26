package lambda;

public class RunnableInterfaceLambdaExample {



    public static void main(String[] args) {

        //without lambda function
        Runnable runnableWithoutLambda = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable Without Lambda");
            }
        };

        new Thread(runnableWithoutLambda).start();


        //with lambda function
        Runnable runnable = () -> System.out.println("Inside Runnable Lambda 1");
        new Thread(runnable).start();

        new Thread(() -> System.out.println("Inside Runnable 2")).start();

    }
}
