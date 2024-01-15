package pl.pingvit.homework22;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
public class Application {
    public static void main(String[] args) throws IOException {
    ObjectMapper objectMapper =new ObjectMapper();
    Harvest[] harvests = objectMapper.readValue(new File("src/main/java/pl/pingvit/homework22/harvest.json"),Harvest[].class);
    System.out.println(Arrays.toString(harvests));

    HarvestStatisticService harvestStatisticService =new HarvestStatisticService();
        Map<String,HarvestStatistic> statistic=harvestStatisticService.calculateStatistics(harvests);
        System.out.println(statistic);
    }
}
//Potato=HarvestStatistic{plant='null', totalWeight=2009.0, totalSquare=20}.выводит вот такой ответ,почему plant равен null?