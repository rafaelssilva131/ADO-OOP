/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.senac.aula08;

import java.util.Scanner;

/**
 *
 * @author rafin
 */
public class Aula08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha =0;
        Animal novoAnimal = new Animal();
        Loja oL = new Loja(5);
        
        while(escolha < 6){
            System.out.println("----------------");
            System.out.println("1-Inserir");
            System.out.println("2-Alterar");
            System.out.println("3-Excluir");
            System.out.println("4-mostrar");
            System.out.println("5-buscar");
            System.out.println("6-Sair");
            System.out.println("----------------");
            escolha = sc.nextInt();
            if(escolha == 1){
                System.out.println("Posição");
                int pos = sc.nextInt();
                System.out.println("Especie: ");
                String es = sc.next();
                System.out.println("Nome: ");
                String name = sc.next();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                novoAnimal = new Animal(es,name,idade);
                oL.inserirAnimal(pos,novoAnimal);
            }else if(escolha == 2){
                System.out.println("Posição");
                int pos = sc.nextInt();
                oL.alterarAnimal(pos, novoAnimal);
            }else if(escolha == 3){
                System.out.println("Posição");
                int pos = sc.nextInt();
                oL.excluirAnimal(pos);
            }else if(escolha == 4){
                oL.mostarLoja();
            }else if(escolha == 5){
                System.out.println("Digite o nome: ");
                oL.buscarAnimal(sc.next());
            }else if(escolha == 6){
                System.out.println("Obrigado, até a proxima!");
                System.exit(0);
            }else
                System.out.println("Opção invalida");
                escolha = 0;
        }
    }

}
