import java.util.Stack;

public class Main_Stack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        //String myFavGame = stack.pop();
        //System.out.println(myFavGame);


        //System.out.println(stack.empty());
        //System.out.println(stack.peek());
        
        // System.out.println(stack.search("trollOb"));

        // System.out.println(stack);

        // out of memory test
        for(int i = 0; i < 1000000000; i++) {

            stack.push("trollOb");
        }

    }
}