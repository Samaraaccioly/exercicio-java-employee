package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Quantos funcionários você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");

            System.out.println("Id: ");
            sc.nextLine();
            String id = sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Salário: ");
            Double salario = sc.nextDouble();

            Employee funcionario = new Employee(id, nome, salario);

            list.add(funcionario);
        }

        System.out.println("Você quer registrar um aumento no salário de algum funcionário? (s/n)");
        sc.nextLine();
        char r = sc.next().charAt(0);
        if (r == 's') {
            Employee funcionario = null;
            sc.nextLine();
            while (funcionario == null) {
                System.out.println("Digite o ID do funcionário: ");
                String idSalario = sc.nextLine();
                funcionario = list.stream().filter(x -> x.getId().equals(idSalario)).findFirst().orElse(null);
                if (funcionario == null) {
                    System.out.println("Esse ID não existe. Tente novamente!");
                }
            }

            System.out.print("Digite a taxa de aumento: ");
            double porcentagem = sc.nextDouble();
            funcionario.aumentarSalario(porcentagem);

        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }


        }




