package pl.pingvit.homework21;
import java.util.*;
public class SiteApplication {
    public static void main(String[] args) {
        List<SiteVisit> siteVisitList = new ArrayList<>();
        SiteVisit siteVisit1 = new SiteVisit("vadim", "java.com");
        SiteVisit siteVisit2 = new SiteVisit("vadim", "java.com");
        SiteVisit siteVisit3 = new SiteVisit("vadim", "python.com");
        SiteVisit siteVisit4 = new SiteVisit("anna", "Hashcode.com");
        SiteVisit siteVisit5 = new SiteVisit("tonya", "collection.com");

        siteVisitList.add(siteVisit1);
        siteVisitList.add(siteVisit2);
        siteVisitList.add(siteVisit3);
        siteVisitList.add(siteVisit4);
        siteVisitList.add(siteVisit5);

        Set<String> uniqueUserNames = extractUniqueUserName(siteVisitList);
        System.out.println(uniqueUserNames);

        Set<String> uniqueSite = extractUniqueSite(siteVisitList);
        System.out.println(uniqueSite);

        Map<String, Integer> visitCountBySite =calculatingSiteVisits(siteVisitList);
        System.out.println(visitCountBySite);

        Map<String, Integer> visitsByUser =calculatingUserVisits(siteVisitList);
        System.out.println(visitsByUser);
    }
    public static Set<String> extractUniqueUserName(List<SiteVisit> siteVisits){
        SortedSet<String> userNames = new TreeSet<>();
        for (SiteVisit siteVisit: siteVisits){
            userNames.add(siteVisit.getUserName());
        }
        return userNames;
    }
    public static Set<String> extractUniqueSite(List<SiteVisit> siteVisits){
        SortedSet<String> siteName = new TreeSet<>();
        for (SiteVisit siteVisit: siteVisits){
            siteName.add(siteVisit.getNameOfTheSiteVisited());
        }
        return siteName;
    }
public static Map<String, Integer> calculatingSiteVisits(List<SiteVisit> siteVisits){
    SortedMap<String, Integer> visitBySite =new TreeMap<>();
    for (SiteVisit siteVisit : siteVisits) {
        String site = siteVisit.getNameOfTheSiteVisited();
        if (visitBySite.containsKey(site)){
            Integer count = visitBySite.get(site);
            visitBySite.put(site,count+1);
        }else {
            visitBySite.put(site,1);
        }
    }
return visitBySite;
}
    public static Map<String, Integer>calculatingUserVisits (List<SiteVisit> userNames) {
        SortedMap<String, Integer> visitsByUsers = new TreeMap<>();
        for ( SiteVisit siteVisit :userNames) {
            String name = siteVisit.getUserName();
            if (visitsByUsers.containsKey(name)) {
                Integer count = visitsByUsers.get(name);
                visitsByUsers.put(name, count + 1);
            } else {
                visitsByUsers.put(name, 1);
            }
        }
        return visitsByUsers;
    }
}
