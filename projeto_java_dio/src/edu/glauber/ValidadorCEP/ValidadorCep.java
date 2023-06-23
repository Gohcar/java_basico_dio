package edu.glauber.ValidadorCEP;
import java.util.Scanner;

public class ValidadorCep {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        try {
            String cep = validarCep(sc.next());
            System.out.println(cep);
        } catch (CepInvalidoException e) {
            System.out.println("Cep Inválido");

        }
        
    }
    static String validarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
        return cep;

    }
    
}
