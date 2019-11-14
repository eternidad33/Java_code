public class CatchException{
    public static void main(String[] args){
        try{
            System.out.println("I am try block.");
            Class<?> tempClass=Class.forName("");
            System.out.println("Bys try block.");
        }catch(ClassNotFoundException e){
            System.out.println("I am catch block.");
            e.printStackTrace();
            System.out.println("Bye catch block.");
        }finally{
            System.out.println("I am finally block.");
        }
    }
}