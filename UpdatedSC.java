
public class UpdatedSC {
    public static void main(String[] args) {

        // Arrow (->) syntax Replaces case: and break, preventing fall-through.

        /*String day = "Sunday";

        switch(day) {
            case "Saturday" , "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("9am");
            default -> System.out.println("7am");
        }*/


        //Switch as expression. The switch can return a value directly.

        String day = "Monday";

        String result = "";

        /*result = switch(day) {
            case "Saturday" , "Sunday" -> "6am";
            case "Monday" -> "9am";
            default -> "7am";
        };

        System.err.println("Result:" + result);*/  

        // Multiple case labels A single case can handle multiple values separated by commas.

        /*result = switch(day) {
            case "Saturday", "Sunday" -> {
                yield "6am";
            }
            case "Monday" -> {
                yield "9am";
            }
            default -> {
                yield "7am";
            }
        };
        System.err.println("Result:" + result);*/

        // yield keyword Used to return a value from a block in a switch expression.

        result = switch(day) {
            case "Saturday", "Sunday" : yield "6am";
            case "Monday" : yield "9am";     
            default :yield "7am";
        };
        System.err.println("Result:" + result);
    }
}







