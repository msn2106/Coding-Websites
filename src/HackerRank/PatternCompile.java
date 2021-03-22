package HackerRank;

import java.util.Scanner;
import java.util.regex.*;

public class PatternCompile
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases-- >0){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception e){
                System.out.println("Invalid");
            }
        }
    }
}

/*
Key function from Pattern class in util.regex package
 1.) compile method

public static Pattern compile(String regex)

    Compiles the given regular expression into a pattern.

    Parameters:
        regex - The expression to be compiled
    Throws:
        PatternSyntaxException - If the expression's syntax is invalid
----------------------------------------------------------------------------------
2.)  compile method 2

public static Pattern compile(String regex,
                              int flags)

    Compiles the given regular expression into a pattern with the given flags.

    Parameters:
        regex - The expression to be compiled
        flags - Match flags, a bit mask that may include CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL and COMMENTS
    Throws:
        IllegalArgumentException - If bit values other than those corresponding to the defined match flags are set in flags
        PatternSyntaxException - If the expression's syntax is invalid
----------------------------------------------------------------------------------
3.)  pattern method

public String pattern()

    Returns the regular expression from which this pattern was compiled.

    Returns:
        The source of this pattern
-----------------------------------------------------------------------------------

4.) matcher method

public Matcher matcher(CharSequence input)

    Creates a matcher that will match the given input against this pattern.

    Parameters:
        input - The character sequence to be matched
    Returns:
        A new matcher for this pattern
-------------------------------------------------------------------------------
5.)  flags

public int flags()

    Returns this pattern's match flags.

    Returns:
        The match flags specified when this pattern was compiled
------------------------------------------------------------------------------
6.)  matches

public static boolean matches(String regex,
                              CharSequence input)

    Compiles the given regular expression and attempts to match the given input against it.

    An invocation of this convenience method of the form

         Pattern.matches(regex, input);

    behaves in exactly the same way as the expression

         Pattern.compile(regex).matcher(input).matches()

    If a pattern is to be used multiple times, compiling it once and reusing it will be more efficient than invoking this method each time.

    Parameters:
        regex - The expression to be compiled
        input - The character sequence to be matched
    Throws:
        PatternSyntaxException - If the expression's syntax is invalid

 */



