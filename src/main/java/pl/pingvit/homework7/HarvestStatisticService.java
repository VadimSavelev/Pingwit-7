package pl.pingvit.homework7;

import java.math.BigDecimal;
import java.util.Arrays;


public class HarvestStatisticService {
    public static HarvestStatistic[] calculateHarvestStatistics(Harvest[] harvests) {

        Arrays.sort(harvests, (h1, h2) -> h1.getPlant().compareTo(h2.getPlant()));

        int uniquePlants = 1;
        for (int i = 1; i < harvests.length; i++) {
            if (!harvests[i].getPlant().equals(harvests[i - 1].getPlant())) {
                uniquePlants++;
            }
        }

        HarvestStatistic[] statistics = new HarvestStatistic[uniquePlants];
        int index = 0;
        BigDecimal totalWeight = BigDecimal.ZERO;

        for (int i = 0; i < harvests.length; i++) {
            if (i == 0 || !harvests[i].getPlant().equals(harvests[i - 1].getPlant())) {
                if (i > 0) {
                    statistics[index] = new HarvestStatistic(harvests[i - 1].getPlant(), totalWeight);
                    index++;
                    totalWeight = BigDecimal.ZERO;
                }
            }
            totalWeight = totalWeight.add(harvests[i].getWeight());
        }

        if (harvests.length > 0) {
            statistics[index] = new HarvestStatistic(harvests[harvests.length - 1].getPlant(), totalWeight);
        }

        return statistics;
    }
}


