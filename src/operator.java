public class operator {
    public static void main(String[] args) {
        // all operators
        int a = 10, b = 3;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators
        System.out.println("\nUnary Operators:");
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x)); // pre-increment
        System.out.println("x++ = " + (x++)); // post-increment
        System.out.println("--x = " + (--x)); // pre-decrement
        System.out.println("x-- = " + (x--)); // post-decrement

        // 3. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int y = 10;
        y += 5;
        System.out.println("y += 5 -> " + y);
        y -= 3;
        System.out.println("y -= 3 -> " + y);
        y *= 2;
        System.out.println("y *= 2 -> " + y);
        y /= 4;
        System.out.println("y /= 4 -> " + y);
        y %= 3;
        System.out.println("y %= 3 -> " + y);

        // 4. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 5. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean p = true, q = false;
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p     : " + (!p));

        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b  : " + (a & b));
        System.out.println("a | b  : " + (a | b));
        System.out.println("a ^ b  : " + (a ^ b));
        System.out.println("~a     : " + (~a));
        System.out.println("a << 1 : " + (a << 1));
        System.out.println("a >> 1 : " + (a >> 1));

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max = " + max);

        // 8. instanceof Operator
        System.out.println("\nInstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));

        // 9. Type Casting
        System.out.println("\nType Casting:");
        double d = 10.75;
        int i = (int) d;
        System.out.println("Double value: " + d);
        System.out.println("After casting to int: " + i);
    }
}
