public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder demoBuilder = new StringBuilder();
        demoBuilder.append("HOW ARE YOU?");
        System.out.println("After append: " + demoBuilder);

        demoBuilder.insert(12, " REALLY");
        System.out.println("After insert: " + demoBuilder);

        demoBuilder.replace(12, 18, " DEFINITELY");
        System.out.println("After replace: " + demoBuilder);

        demoBuilder.delete(12, 24);
        System.out.println("After delete: " + demoBuilder);

        System.out.println("Length: " + demoBuilder.length());

        System.out.println("Capacity: " + demoBuilder.capacity());

        char ch = demoBuilder.charAt(2);
        System.out.println("Character at index 2: " + ch);

        demoBuilder.setCharAt(6, 'T');
        System.out.println("After setCharAt: " + demoBuilder);

        String sub = demoBuilder.substring(0, 5);
        System.out.println("Substring 0 to 5): " + sub);

        System.out.println("Capacity " + demoBuilder.capacity());

        demoBuilder.deleteCharAt(0);
        System.out.println("After deleteCharAt(3): " + demoBuilder);

        String result = demoBuilder.toString();
        System.out.println("Converted to String: " + result);

        demoBuilder.reverse();
        System.out.println("After reverse: " + demoBuilder);
    }
}
