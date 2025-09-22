
public class func {
    public static void main(String[] args) {
        String str = " Hello Java ";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring (1,5): " + str.substring(1,5));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));
    
}
}  