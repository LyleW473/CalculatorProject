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
    }

    public void printCalculatorInformation(){
        System.out.println("Calculator's ID number: " + this.ID_NUMBER);
        System.out.println("Number of operations completed : " + this.numOperationsCompleted);
        System.out.println();
    }

}