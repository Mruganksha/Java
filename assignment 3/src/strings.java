public class strings {
   public static void main(String[] args){
       String str;
       str = new String("Hello World! ");
       str = str.concat("I am Mruganksha");
       System.out.println(str);

       System.out.println(str.length());

       char c = str.charAt(6);
       System.out.println(c);

       String substr = str.substring(8);
       System.out.println("Substring: " + substr);

       System.out.print("Found 'm' first position ");
       System.out.println(str.indexOf('m'));

       String str2 = str.toUpperCase();
       System.out.println(str2);

       System.out.println(str.toLowerCase());

       System.out.println("Equals 'HELLO WORLD': " + str.equals("HELLO WORLD"));

       System.out.println("Trimmed String: '" + str.trim() + "'");

       System.out.println("Replace 'e' with 'a': " + str.replace('e', 'a'));

       System.out.println("Replace all ! with $: " + str.replaceAll("!", "\\$"));

       System.out.println("Contains WORLD: " + str.contains("WORLD"));

       char[] charArray = str.toCharArray();
       System.out.print("Character Array: ");
       for (char i : charArray) {
           System.out.print(i + " ");
       }
       System.out.println();


       String[] words = str.split(" ");
       System.out.println("Split Words:");
       for (String word : words) {
           System.out.println(word);
       }


       System.out.println("Starts with 'HELLO': " + str.startsWith("HELLO"));


       System.out.println("Is string empty: " + str.isEmpty());

       System.out.println("Hash code" + str.hashCode());

       // Using getChars
       char[] buffer = new char[5];
       str.getChars(0, 5, buffer, 0);
       System.out.print("First 5 characters using getChars: ");
       for (char j : buffer) {
           System.out.print(j);
       }
       System.out.println();

       // Using getBytes
       byte[] byteArray = str.getBytes();
       System.out.print("Byte array representation: ");
       for (byte b : byteArray) {
           System.out.print(b + " ");
       }
       System.out.println();
   }
}
