package pl.pingvit.homework22;
import java.math.BigDecimal;
public class HarvestStatistic {
    private String plant;
    private BigDecimal totalWeight;
    private BigDecimal totalSquare;
    public HarvestStatistic(BigDecimal totalWeight, BigDecimal totalSquare) {
        this.totalWeight = totalWeight;
        this.totalSquare = totalSquare;
    }
    public String getPlant() {
        return plant;
    }
    public void setPlant(String plant) {
        this.plant = plant;
    }
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }
    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }
    public BigDecimal getTotalSquare() {
        return totalSquare;
    }
    public void setTotalSquare(BigDecimal totalSquare) {
        this.totalSquare = totalSquare;
    }
    @Override
    public String toString() {
        return "HarvestStatistic{" +
                "plant='" + plant + '\'' +
                ", totalWeight=" + totalWeight +
                ", totalSquare=" + totalSquare +
                '}';
    }
}
