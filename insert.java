public class insert {
    public static void main(String[] args){
        String a ="Hello";
        String b ="hello";
        String uppera = a.toUpperCase();
        String lowera = a.toLowerCase();
        System.out.println(uppera);
        System.out.println(lowera);
        System.out.println(a.length());
        System.out.println(a.charAt(1));
        if(a.equals(b)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("both are not equal");
        }



    }
    
}
