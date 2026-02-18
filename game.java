public class game {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 1000) + 1;
        int num2 = (int)(Math.random() * 1000) + 1;
        int larger = 0, smaller = 0;

        if(num1 > num2) {
            larger = num1;
            smaller = num2;
        }
        else if(num2 > num1) {
            larger = num2;
            smaller = num1;
        }
        else {
            //both numbers are equal so it doesnt make a difference
            larger = num1;
            smaller = num1;
        }
        System.out.println("Content-type: text/html\n");
        
        System.out.println("<!DOCTYPE HTML>");
        System.out.println("<html lang=\"en\">");
        System.out.println("<head><title>Number Game</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Welcome to our Number Game!</h1>");
        System.out.println("<p>You have to select the larger number to win the game.</p>");
        //insert logic to display the two numbers and ask the user to select one of them and then take them to correct page
        System.out.println("</html>");
    }
}
