public class Question4 {
    public static void main(String[] args){
        try{
            throw new CustomExceptionWithoutStackTrace("This has no Stack Trace");

        }catch(CustomExceptionWithoutStackTrace e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

class CustomExceptionWithoutStackTrace extends Exception{
    public synchronized Throwable fillnStackTrace(){
        return null;
    }
    public CustomExceptionWithoutStackTrace(String message){
        super(message);
    }
}

//Output:
//        CustomExceptionWithoutStackTrace: This has no Stack Trace
//        CustomExceptionWithoutStackTrace: This has no Stack Trace
//        at Question4.main(Question4.java:4)