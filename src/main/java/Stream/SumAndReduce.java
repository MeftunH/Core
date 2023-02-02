package Stream;

import java.util.List;

public class SumAndReduce {
    public static void main(String[] args) {

    }

    public static int calculate(List<Integer> numbers)
    {
        int total = 0;
        for (int number : numbers)
        {
            total+=number;
        }
        return total;
    }
}
