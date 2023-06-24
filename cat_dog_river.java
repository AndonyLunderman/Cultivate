import java.util.List;
import java.util.ArrayList;
 
public class AgricultureService {
 
    private List<AgricultureConsul> consuls;
 
    public AgricultureService() {
        this.consuls = new ArrayList<>();
    }
 
    public void addConsul(AgricultureConsul consul) {
        this.consuls.add(consul);
    }
 
    public List<AgricultureConsul> getConsuls() {
        return consuls;
    }
 
    public void agricultureEducationService(String topic) {
        for (AgricultureConsul consul : consuls) {
            consul.educateOnTopic(topic);
        }
    }
 
    public void agricultureAdviceService(String problem) {
        for (AgricultureConsul consul : consuls) {
            consul.giveAdviceOnProblem(problem);
        }
    }
 
    public void giveAgricultureTimeSchedule(List<String> tasks) {
        for (AgricultureConsul consul : consuls) {
            consul.createAgricultureTimeSchedule(tasks);
        }
    }
 
    public void listAgricultureTechniques() {
        for (AgricultureConsul consul : consuls) {
            consul.listAgricultureTechniques();
        }
    }
 
    public void listAgricultureEquipment() {
        for (AgricultureConsul consul : consuls) {
            consul.listAgricultureEquipment();
        }
    }
 
    public void listAgricultureTip() {
        for (AgricultureConsul consul : consuls) {
            consul.listAgricultureTip();
        }
    }
 
    public void explainClimateChangeEffects() {
        for (AgricultureConsul consul : consuls) {
            consul.explainClimateChangeEffects();
        }
    }
 
    public void listBenefitsOfSustainableAgriculture() {
        for (AgricultureConsul consul : consuls) {
            consul.listBenefitsOfSustainableAgriculture();
        }
    }
 
    public void explainFarmManagement() {
        for (AgricultureConsul consul : consuls) {
            consul.explainFarmManagement();
        }
    }
 
    public void sampleSoilAnalysis() {
        for (AgricultureConsul consul : consuls) {
            consul.sampleSoilAnalysis();
        }
    }
 
    public void explainIrrigationTypes() {
        for (AgricultureConsul consul : consuls) {
            consul.explainIrrigationTypes();
        }
    }
 
    public void discussCropSelection() {
        for (AgricultureConsul consul : consuls) {
            consul.discussCropSelection();
        }
    }
 
    public void discussFertiliserTypes() {
        for (AgricultureConsul consul : consuls) {
            consul.discussFertiliserTypes();
        }
    }
 
    public void listFoodSafetyStandards() {
        for (AgricultureConsul consul : consuls) {
            consul.listFoodSafetyStandards();
        }
    }
 
    public void explainPesticideSafety() {
        for (AgricultureConsul consul : consuls) {
            consul.explainPesticideSafety();
        }
    }
 
    public void listOrganicFarmingTips() {
        for (AgricultureConsul consul : consuls) {
            consul.listOrganicFarmingTips();
        }
    }
 
    public void explainAgriculturalLaw() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAgriculturalLaw();
        }
    }
 
    public void explainBenefitsOfOrganicFarming() {
        for (AgricultureConsul consul : consuls) {
            consul.explainBenefitsOfOrganicFarming();
        }
    }
 
    public void discussAnimalCare() {
        for (AgricultureConsul consul : consuls) {
            consul.discussAnimalCare();
        }
    }
 
    public void explainAnimalNutrition() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAnimalNutrition();
        }
    }
 
    public void explainAnimalHusbandry() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAnimalHusbandry();
        }
    }
 
    public void explainAnimalHealth() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAnimalHealth();
        }
    }
 
    public void discussIntegratedPestManagement() {
        for (AgricultureConsul consul : consuls) {
            consul.discussIntegratedPestManagement();
        }
    }
 
    public void listConservationPractices() {
        for (AgricultureConsul consul : consuls) {
            consul.listConservationPractices();
        }
    }
 
    public void explainAgriculturalMarketing() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAgriculturalMarketing();
        }
    }
 
    public void explainNaturalResourceManagement() {
        for (AgricultureConsul consul : consuls) {
            consul.explainNaturalResourceManagement();
        }
    }
 
    public void discussGMOs() {
        for (AgricultureConsul consul : consuls) {
            consul.discussGMOs();
        }
    }
    
    public void explainAgribusinessManagement() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAgribusinessManagement();
        }
    }
 
    public void explainFarmAccounting() {
        for (AgricultureConsul consul : consuls) {
            consul.explainFarmAccounting();
        }
    }
    
    public void explainModernAgriculturalTechnology() {
        for (AgricultureConsul consul : consuls) {
            consul.explainModernAgriculturalTechnology();
        }
    }
    
    public void discussAquaculture() {
        for (AgricultureConsul consul : consuls) {
            consul.discussAquaculture();
        }
    }
    
    public void discussWastewaterTreatment() {
        for (AgricultureConsul consul : consuls) {
            consul.discussWastewaterTreatment();
        }
    }
    
    public void explainAgroforestry() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAgroforestry();
        }
    }
    
    public void explainOrganicCertification() {
        for (AgricultureConsul consul : consuls) {
            consul.explainOrganicCertification();
        }
    }
    
    public void explainCropRotation() {
        for (AgricultureConsul consul : consuls) {
           consul.explainCropRotation();
        }
    }
    
    public void explainPrecisionAgriculture() {
        for (AgricultureConsul consul : consuls) {
            consul.explainPrecisionAgriculture();
        }
    }
    
    public void explainSustainableAgriculture() {
        for (AgricultureConsul consul : consuls) {
            consul.explainSustainableAgriculture();
        }
    }
    
    public void explainAgriculturalBiotechnology() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAgriculturalBiotechnology();
        }
    }
    
    public void explainSoilHealth() {
        for (AgricultureConsul consul : consuls) {
            consul.explainSoilHealth();
        }
    }
    
    public void explainWatershedManagement() {
        for (AgricultureConsul consul : consuls) {
            consul.explainWatershedManagement();
        }
    }
    
    public void discussSoilScience() {
        for (AgricultureConsul consul : consuls) {
            consul.discussSoilScience();
        }
    }
    
    public void explainAgriculturalEconomics() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAgriculturalEconomics();
        }
    }
    
    public void explainAgriculturalInsurance() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAgriculturalInsurance();
        }
    }
    
    public void explainAgriculturalStatistics() {
        for (AgricultureConsul consul : consuls) {
            consul.explainAgriculturalStatistics();
        }
    }
    
    public void explainGrasslandManagement() {
        for (AgricultureConsul consul : consuls) {
            consul.explainGrasslandManagement();
        }
    }
 
}