public class Question3 {
    public static void main(String[] args){
        try{
            Class.forName("Noclass");
        }catch(ClassNotFoundException cl) {
            System.out.println("Class is not there.");
            System.out.println(cl);
        }
            try{
                classwithnodefinition cl = new classwithnodefinition();
            }
        catch(NoClassDefFoundError definition){
            System.out.println(definition);
        }
    }
}

class classwithnodefinition{
}


//Output:
//        Class is not there.
//        java.lang.ClassNotFoundException: Noclass

