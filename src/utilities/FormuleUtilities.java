package utilities;

import model.OperateurEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class FormuleUtilities {


    /**
     *
     * @param myString
     * @return
     * @throws Throwable
     */
    public  static   double calculateFormula(String   myString) throws Throwable {

        String[] result =   myString.split("(?=[-+*/^()])|(?<=[^-+*/^][-+*/^])|(?<=[()])");
        System.out.println(Arrays.toString(result));
        ArrayList<String>  postFixArray=  translateToPostFix(result);
        double   finalResult=   evaluatePostFixFormula(postFixArray);
        System.out.println("Resultat final :"+finalResult);
        return finalResult;
    }

    public static ArrayList<String> translateToPostFix(String[] result)
    {
        ArrayList<String> postFixResult = new ArrayList<>();
        Stack<String> pile = new Stack<String>();

        for (int i = 0; i < result.length; i++) {
          String    token = result[i];
          if (  isDouble(token))
          {
              postFixResult.add(token);

          }
          else if (token.equals("("))
          {
              pile.push(token);
          }

          else if (token.equals(")"))
          {
              while (! pile.peek() .equals("("))
              {
                  String symbole = pile.pop();
                  postFixResult.add(symbole);
              }
              pile.pop();
          }

          else
          {
              while (!pile.isEmpty() && !(pile.peek()=="(") && getPrioritySymbol(token.charAt(0))<= getPrioritySymbol(pile.peek().charAt(0)))
              postFixResult.add( pile.pop());
              pile.push(token);
          }
        }
        while (!pile.isEmpty())
            postFixResult.add( pile.pop());
        System.out.println( "Post fix" );
        for(int i=0; i < postFixResult.size(); i++){
            System.out.print( " "+postFixResult.get(i)+" " );
        }
        return postFixResult;
    }

    public static boolean isDouble(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public  static int getPrioritySymbol (char  symbol)
    {
        for ( OperateurEnum  op: OperateurEnum.values())
        {
            if (  op.getSymbole()==symbol)
            {
               return op.getPriority(symbol);
            }
        }

        return Integer.MIN_VALUE;
    }

    public  static Double   evaluatePostFixFormula (ArrayList<String> postFix) throws Throwable {
        Stack<Double> pile=new Stack<>();

        for(int i=0; i < postFix.size(); i++){

            String  token=postFix.get(i);
            if(isDouble(token))
            {
                pile.push(Double.parseDouble(token));
            }
           else
            {
                double operande1 = pile.pop();
                double operande2 = pile.pop();

                switch(token.charAt(0))
                {
                    case '+':
                        pile.push(operande2+operande1);
                        break;

                    case '-':
                        pile.push(operande2- operande1);
                        break;

                    case '/':
                        try {
                            pile.push(operande2/operande1);
                        }
                        catch (ArithmeticException exception){
                            throw new Throwable("Error Division par zero!", exception);
                        }
                        break;
                    case '*':
                        pile.push(operande2*operande1);
                        break;
                    case '^':
                        pile.push(Math.pow(operande2,operande1));
                        break;

                }
            }
        }

        return pile.pop();
    }

}






