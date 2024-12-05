package problem8;

public class FindEven {
    public int findEvenWithForArrayLoop(int[] find) {
        int result = 0;
        for(int number : find){
            if(number % 2 == 0) {
                result++;
            }
        }
        return result;
    }
    public int findEvenWithFor(int[] find) {
        int result = 0;
        for(int arrayInt = 0; arrayInt < find.length; arrayInt++){
            if(find[arrayInt] % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public int findEvenWithWhile(int[] find) {
        int arrayInt = 0;
        int result = 0;
        while(arrayInt < find.length) {

            if(find[arrayInt] % 2 == 0) {
                result++;
            }

            arrayInt++;
        }
        return result;
    }
}
