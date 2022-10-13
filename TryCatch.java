public class TryCatch {
    public static void main(String[] args) {
        {
            int a = 10, b = 0, c;
            try {
                c = a / b;
                System.out.print(c);
            } catch (Exception e) {
                System.out.print("IT was a Math error");
                System.out.print("IT was working");
                

            }

        }
    }
}
