package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                money += income - expenses;
                
            }

        }

        return count;
    }
}
