package edu.glauber.primeirasemana;
public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Glauber";
        String segundoNome = "Rocha";


        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
