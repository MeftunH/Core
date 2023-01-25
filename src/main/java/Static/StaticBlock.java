package Static;

public class StaticBlock {
    // Case 1: Static variable
    static int i;
    // Case 2: Non-static variable
    int j;

    // Case 3: Static blocks
    static
    {
        i = 10;
        System.out.println("static block called ");
    }

    // Constructor calling
    StaticBlock() { System.out.println("Constructor called"); }
}
