import java.util.Random;

public class game {
    public static void main(String[] args) {
        Random random = new Random();
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
            larger = num1;
            smaller = num1;
        }

        System.out.println("Content-type: text/html\n");
        System.out.println("<!DOCTYPE HTML>");
        System.out.println("<html lang=\"en\">");
        System.out.println("<head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + "<meta name=\"author\" content=\"u24898008 && u24631494\"><title>Number Game</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Welcome to our Number Game!</h1>");
        System.out.println("<p>Select the larger number to win the game</p>");
        if(random.nextBoolean()){
            System.out.println("<a href=\"right.htm\" class=\"button\">" + larger + "<button>");
            System.out.println("<a href=\"wrong.htm\" class=\"button\">" + smaller + "<button>");
        }
        else{
            System.out.println("<a href=\"wrong.htm\" class=\"button\">" + smaller + "<button>");
            System.out.println("<a href=\"wrong.htm\" class=\"button\">" + smaller + "<button>");

        }
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
