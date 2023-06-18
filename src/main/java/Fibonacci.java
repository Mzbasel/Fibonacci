public class Fibonacci {
    public int generate(int index) {
        if(index == 0 || index == 1) return index;

        int currentFibonacci = 0;
        int nextFibonacci = 1;

        for (int i = 2; i <= index; i++){
            int temporaryHolderOfNextFibonacci = nextFibonacci;
            nextFibonacci += currentFibonacci;
            currentFibonacci = temporaryHolderOfNextFibonacci;
        }

        return nextFibonacci;
    }
}
