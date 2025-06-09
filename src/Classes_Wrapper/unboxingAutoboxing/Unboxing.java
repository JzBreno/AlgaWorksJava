package Classes_Wrapper.unboxingAutoboxing;


import java.lang.reflect.Type;

public class Unboxing {

//    | Tipo                         | É classe? | Autoboxing necessário?      | Comentário                        |
//            | ---------------------------- | --------- | --------------------------- | --------------------------------- |
//            | `int`                        | ❌ Não     | ✅ Sim (`int` → `Integer`)   | Precisa de autoboxing             |
//            | `double`                     | ❌ Não     | ✅ Sim (`double` → `Double`) | Precisa de autoboxing             |
//            | `String`                     | ✅ Sim     | ❌ Não                       | Já é uma classe, então vai direto |
//            | `Integer`                    | ✅ Sim     | ❌ Não                       | Já é classe wrapper               |
//            | `String[]` (array de String) | ✅ Sim     | ❌ Não                       | Arrays também são objetos         |

    public static void main(String[] args) {
        int valorInteiro = 10;
        //autoboxing de valores inteiro para sua Wrapper Integer
        Integer valorInteger = Integer.valueOf(valorInteiro);
        //unboxing de valores Wrapper Integer para tipos primitivo Int
        int valorInt = valorInteger.intValue();
        Object objeto = valorInt;
        System.out.println("Valor da varivel Integer do autoboxing"+valorInteger.getClass());
        System.out.println("Valor da varivel Integer do unboxing"+objeto.getClass());
    }

}
