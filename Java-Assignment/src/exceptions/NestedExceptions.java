package exceptions;

public class NestedExceptions {

	public static void main(String[] args) {

        try {
            int a[] = new int[5];
            checkException();
            a[5] = 9;
        } catch (ArithmeticException ae) {
            System.out.println("Numbers can not be divided by zero..");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds..");
        } catch (Exception e) {
            System.out.println("am before Arithemetic Exception");
        } finally {
            System.out.println("outer block..");
        }
    }

        public static void checkException () {
            try {
                int a[] = new int[5];
                a[3] = 30 / 0;
            } catch (ArithmeticException ae) {
                System.out.println("Numbers can not be divided by zero");
            } finally {
                System.out.println("nested exception");
            }
        }
}
