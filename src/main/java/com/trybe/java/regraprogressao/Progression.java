package com.trybe.java.regraprogressao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Progression.
 */
public class Progression {
  int qtdActivities;
  ArrayList<Integer> weight = new ArrayList<>();
  ArrayList<Integer> grades = new ArrayList<>();
  ArrayList<String> activities = new ArrayList<>();

  /**
   * Register activities.
   */
  public void registerActivities() {
    Scanner scanner = new Scanner(System.in);
    int count = 1;

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    qtdActivities = Integer.parseInt(scanner.nextLine());

    do {
      System.out.println("Digite o nome da atividade " + count + ":");
      activities.add(scanner.nextLine());

      System.out.println("Digite o peso da atividade " + count + ":");
      weight.add(Integer.parseInt(scanner.nextLine()));

      System.out.println("Digite a nota obtida para " + activities.get(count - 1) + ":");
      grades.add(Integer.parseInt(scanner.nextLine()));

      qtdActivities -= 1;
      count += 1;
    } while (qtdActivities > 0);

    int soma = weight.stream().reduce(0, Integer::sum);

    if (soma != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      result();
    }

    scanner.close();
  }

  /**
   * Result.
   */
  public void result() {
    ArrayList<Integer> weightPlusGrades = new ArrayList<>();

    for (int index = 0; index < weight.size(); index += 1) {
      weightPlusGrades.add(weight.get(index) * grades.get(index));
    }

    int sumGrade = weightPlusGrades.stream().reduce(0, Integer::sum);
    double finalGrade = (double) sumGrade / 100;

    if (finalGrade >= 85.0) {
      System.out.println("Parabéns! Você alcançou " + finalGrade + "%!"
          + " E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação alcançada "
          + "neste período, " + finalGrade + "%, você não atingiu a pontuação mínima necessária "
          + "para sua aprovação.");
    }

  }
}
