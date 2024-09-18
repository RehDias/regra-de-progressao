package com.trybe.java.regraprogressao;

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

    scanner.close();
  }
}
