package pl.pingvit.homework7;

import java.math.BigDecimal;
import java.util.Arrays;

import static pl.pingvit.homework7.HarvestStatisticService.calculateHarvestStatistics;

public class HarvestMain {
    public static void main(String[] args) {
        Harvest[] harvests = {
                new Harvest(1L, "Поле 1", "Пшеница", new BigDecimal("100.5")),
                new Harvest(2L, "Поле 2", "Пшеница", new BigDecimal("150.2")),
                new Harvest(3L, "Поле 1", "Картофель", new BigDecimal("75.3")),
                new Harvest(4L, "Поле 3", "Картофель", new BigDecimal("120.8"))
        };
        System.out.println(Arrays.toString(harvests));


        HarvestStatistic[] statistics = calculateHarvestStatistics(harvests);

        for (HarvestStatistic statistic : statistics) {
            System.out.println("Растение: " + statistic.getPlant() + ", Общий вес урожая: " + statistic.getTotalWeight());
        }//не могу понять почему выдает результат только для пшеницы и дважды,нужна наводка
    }
}

