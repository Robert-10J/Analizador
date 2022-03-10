package analizadorlexico;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class MethodsLexicalAnalyzer {
    
//Funcion para convertir a ascii cualquier caracter
    public static int toAscii(String code) {
        return (int) code.charAt(0);
    }

    //Funcion para saber si es un identificador o no
    public static boolean isIdentifier(String code) {
        return (toAscii(code) >= 65 && toAscii(code) <= 90);//MP
    }

    //Funcion para saber si es un operador o no
    public static boolean isOperator(String code) {
        return (toAscii(code) == 44 || toAscii(code) == 46)
                ? false : (toAscii(code) >= 42 && toAscii(code) <= 47) || toAscii(code) == 61;
    }

    //Funcion que convierte nuestra expresion en una lista por cada caracter
    public static ArrayList<String> toList(String expression) {
        ArrayList<String> listCharacters = new ArrayList<>();
        for (char character : expression.toCharArray()) {
            if (isIdentifier(String.valueOf(character).toUpperCase()) || isOperator(String.valueOf(character).toUpperCase())) {
                listCharacters.add(String.valueOf(character).toUpperCase());
            }
        }
        return listCharacters;
    }

    //Funcion para evaluar cada uno los caracteres y determinar si es identificador u operador
    public static void evaluate(String expression) {

        toList(expression).forEach((String character) -> {

            if (isIdentifier(character)) {
                System.out.println("El caracter " + character + " es un identificador");
            } else if (isOperator(character)) {

                switch (toAscii(character)) {
                    case 42:
                        System.out.println("El caracter " + character + " es un operador de multiplicacion");
                        break;
                    case 43:
                        System.out.println("El caracter " + character + " es un operador de suma");
                        break;
                    case 45:
                        System.out.println("El caracter " + character + " es un operador de resta");
                        break;
                    case 47:
                        System.out.println("El caracter " + character + " es un operador de division");
                        break;
                    case 61:
                        System.out.println("El caracter " + character + " es un operador de asignacion");
                        break;
                }
            }
        });
    }
    //Este metodo eliminara todos los caracteres que conlleven una incongruencia en la expresion
    public static String removeIncongruity(String expression) {
        ArrayList<String> expressionList = toList(expression);

        for (int i = 0; i < expressionList.size() - 1; i++) {

            if (isIdentifier(expressionList.get(i))) {
                if (isIdentifier(expressionList.get(i)) == isIdentifier(expressionList.get(i + 1))) {
                    expressionList.remove(i + 1);
                    i--;
                }
            } else if (isOperator(expressionList.get(i))) {
                if (isOperator(expressionList.get(i)) == isOperator(expressionList.get(i + 1))) {
                    expressionList.remove(i + 1);
                    i--;
                }
            }
        }
        
        //Condicion cuando el usuario no agrega informacion a la expresion
        //o cuando agrega informacion que no es un operador ni un identificador
        if(expressionList.isEmpty()){
            return String.join(" ", expressionList);
        }
        
        if (isOperator(expressionList.get(0)) && expressionList.size() == 1) {

        } else {
            //Si el ultimo caracter es un operador lo elimina
            if (isOperator(expressionList.get(expressionList.size() - 1))) {
                expressionList.remove(expressionList.size() - 1);
            }

            //Si el primer caracter es un operador, lo elimina
            if (isOperator(expressionList.get(0))) {
                expressionList.remove(0);

            }

            if (expressionList.size() > 1) {
                if (!"=".equals(expressionList.get(1))) {
                    expressionList.set(1, "=");
                }
            }
        }

        return String.join(" ", expressionList);
    }
    
    public static ArrayList<String> getOperatorList(String expression) {
        ArrayList<String> listCharacters = toList(expression);
        listCharacters.removeIf((character) -> !isOperator(character));
        listCharacters = (ArrayList<String>) listCharacters.stream().distinct().collect(Collectors.toList());
        return listCharacters;
    }
        
    public static ArrayList<String> getIdentifierList(String expression) {
        ArrayList<String> listCharacters = toList(expression);
        listCharacters.removeIf((character) -> !isIdentifier(character));
        listCharacters = (ArrayList<String>) listCharacters.stream().distinct().collect(Collectors.toList());
        return listCharacters;
    }
}
