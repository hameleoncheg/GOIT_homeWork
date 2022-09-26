package lesson7;

class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder result = new StringBuilder();

        for(int number: numbers) {
            result.append(number);
        }
        String a = String.valueOf(result);
        return a;
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}
