class NumberThread extends Thread {
    private int number1;
    private int number2;
    

    public NumberThread(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;


    }

    public void run() {
        try {
            for (int i = 1; i <= 2; i++) {
                int numberToCheck = (i == 1) ? number1 : number2 ;
                boolean isPrime = true;

                if (numberToCheck > 1) {
                    for (int j = 2; j <= Math.sqrt(numberToCheck); j++) {
                        if (numberToCheck % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                } else {
                    isPrime = false;
                }

                if (isPrime) {
                    System.out.println("O número " + numberToCheck + " é primo.");
                } else {
                    System.out.println("O número " + numberToCheck + " não é primo.");
                }

                Thread.sleep(920);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
