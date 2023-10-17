class Calculator{
    private static int numCalculatorsCreated = 0;
    private int numOperationsCompleted = 0;
    private final int ID_NUMBER;

    public Calculator(){
        // Increase number of calculators created and assign ID number to calculator object
        numCalculatorsCreated ++;
        ID_NUMBER = Calculator.numCalculatorsCreated;
    }

    public static void main(String[] args){
        // Create calculators
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        Calculator[] calculator_list = {calculator1, calculator2};
        
        // Iterate over each calculator, printing each information unique to each calculator
        for (Calculator calc: calculator_list){
            calc.printCalculatorInformation();
        }
        System.out.println("Number of calculators created: " + Calculator.numCalculatorsCreated);
        float testValue = 1;
        testValue = calculator1.performAddition(testValue, 9);
        testValue = calculator1.performMultiplication(testValue, 2);
        testValue = calculator1.performSubtraction(testValue, 5);
        calculator1.performDivision(testValue, 0);
        System.out.println("Test value: " + testValue);
        calculator1.printCalculatorInformation();

    }

    public void printCalculatorInformation(){
        System.out.println("Calculator's ID number: " + this.ID_NUMBER);
        System.out.println("Number of operations completed : " + this.numOperationsCompleted);
        System.out.println();
    }

    public float performAddition(float v1, float v2){
        this.numOperationsCompleted ++;
        return v1 + v2;
    }

    public float performSubtraction(float v1, float v2){
        this.numOperationsCompleted ++;
        return v1 - v2;
    }

    public float performMultiplication(float v1, float v2){
        this.numOperationsCompleted ++;
        return v1 * v2;
    }

    public float performDivision(float v1, float v2){
        this.numOperationsCompleted ++;
        // Avoid division by 0
        if (v2 != 0){
            return v1 / v2;
        }
        else{
            System.out.println("Returning -1, cannot perform division by 0!");
            return -1;
        }
    }
}