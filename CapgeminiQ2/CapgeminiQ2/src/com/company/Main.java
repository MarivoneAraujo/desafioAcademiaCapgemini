package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        System.out.print("Insira a senha: ");
        senha = scanner.next();

        if (senha.length() > 6) {
            if(senha.length() >=6){
                System.out.println("A senha possui o mínimo de 6 caracteres.");
            }

            boolean temDigito = false;
            String[] digitos = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            String[] input = senha.split("");
            for (String value : input) {
                for (String digito : digitos) {
                    if (value.equals(digito)) {
                        temDigito = true;
                    }
                }
            }
            if(temDigito){
                System.out.println("Contém no mínimo 1 dígito.");
            }else{
                System.out.println("A senha deve conter no mínimo 1 dígito.");
            }

            boolean temMinuscula = false;
            String[] letras = senha.split("");
            for (String s : letras) {
                if (s.toLowerCase().equals(s)) {
                    temMinuscula = true;
                }
            }
            if(temMinuscula){
                System.out.println("Contém no mínimo 1 letra minúscula.");
            }else{
                System.out.println("É preciso incluir pelo menos uma letra minúscula.");
            }

            boolean temMaiuscula = false;
            String[] letra = senha.split("");
            for (String s : letra) {
                if (s.toUpperCase().equals(s)) {
                    temMaiuscula = true;
                }
            }
            if(temMaiuscula){
                System.out.println("Contém no mínimo 1 letra maiúscula.");
            }else{
                System.out.println("É preciso incluir pelo menos uma letra maiúscula.");
            }

            boolean temEspecial = false;
            String[] especial = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};
            String[] inputCaracteres = senha.split("");
            for (String inputCaractere : inputCaracteres) {
                for (String s : especial) {
                    if (inputCaractere.equals(s)) {
                        temEspecial = true;
                    }
                }
            }
            if(temEspecial){
                System.out.println("Contém no mínimo 1 caractere especial.");
            }else{
                System.out.println("A senha deve conter no mínimo 1 caractere especial.");
            }
        } else if (senha.length() < 6) {
            System.out.println(6 - senha.length());
        }
    }
}
