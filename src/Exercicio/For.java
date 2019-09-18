/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;

import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15
 */
public class For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x, soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o item " + i);
            x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println("Total: " + soma);
    }
}
