public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer demoBuffer = new StringBuffer("WHAT IS YOUR NAME?");

        demoBuffer.append(" I am Mruganksha");
        System.out.println("After append: " + demoBuffer);

        demoBuffer.insert(12, " Full");
        System.out.println("After insert: " + demoBuffer);

        demoBuffer.replace(25, 28, " KUDAKE");
        System.out.println("After replace: " + demoBuffer);

        demoBuffer.delete(24, 25);
        System.out.println("After delete: " + demoBuffer);

        System.out.println("Length: " + demoBuffer.length());

        System.out.println("Capacity: " + demoBuffer.capacity());

        demoBuffer.setCharAt(0, 'T');
        System.out.println("After setCharAt: " + demoBuffer);

        // Reverses the characters in the buffer
        demoBuffer.reverse();
        System.out.println("After reverse: " + demoBuffer);
    }
}
