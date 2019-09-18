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
public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite o número: ");
        x = sc.nextInt();
        for (int i = 1; i <= x; i++) {

            if (i % 2 != 0) {
                System.out.println("Números impares " + i);
            }
        }
    }
}
