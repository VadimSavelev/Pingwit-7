package pl.pingvit.homework22;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
public class HarvestStatisticService {
    public Map<String, HarvestStatistic> calculateStatistics(Harvest[] harvests) {
        Map<String, HarvestStatistic> statisticMap = new HashMap<>();
        for (Harvest harvest : harvests) {
            if (statisticMap.containsKey(harvest.getPlant())){
                BigDecimal weight = harvest.getWeight();
                BigDecimal square = harvest.getSquare();
                statisticMap.put(harvest.getPlant(),new HarvestStatistic(harvest.getWeight().add(weight),harvest.getSquare().add(square)));
            }else {
                statisticMap.put(harvest.getPlant(),
                new HarvestStatistic(harvest.getWeight(),harvest.getSquare()));
            }
        }
        return statisticMap;
    }
}
