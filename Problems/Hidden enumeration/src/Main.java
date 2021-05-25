public class Main {

    public static void main(String[] args) {
        int howMany = 0;
        for (Secret option : Secret.values()) {
            if (option.toString().startsWith("STAR")) {
                howMany++;
            }
        }
        System.out.println(howMany);
    }
}

/* sample enum for inspiration
   enum Secret {
    STAR, CRASH, START, // ...
}
*/
