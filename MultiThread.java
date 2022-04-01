class MultiThread implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            while(true) {
                char c = (char) ((int) (Math.random() * 26) + 65) ;
                System.out.println(c);

            }
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}