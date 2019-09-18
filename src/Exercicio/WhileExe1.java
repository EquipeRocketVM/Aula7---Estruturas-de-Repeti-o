/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;

/**
 *
 * @author vitoria.csilva15
 */
public class WhileExe1 {

    public static void main(String[] args) {

        int i = 0;
        while (i <= 100) {
            i++;
            if (i % 2 == 0) {
                System.out.println("Números Pares " + i);

            }
        }

    }
}
