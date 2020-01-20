import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Data {

    Map<NewsPapers, HashMap<Weekday, Double>> TOI_hash_map = new HashMap<NewsPapers, HashMap<Weekday, Double>>();
    Map<NewsPapers, HashMap<Weekday, Double>> Hindu_hash_map = new HashMap<NewsPapers, HashMap<Weekday, Double>>();
    Map<NewsPapers, HashMap<Weekday, Double>> ET_hash_map = new HashMap<NewsPapers, HashMap<Weekday, Double>>();
    Map<NewsPapers, HashMap<Weekday, Double>> BM_hash_map = new HashMap<NewsPapers, HashMap<Weekday, Double>>();
    Map<NewsPapers, HashMap<Weekday, Double>> HT_hash_map = new HashMap<NewsPapers, HashMap<Weekday, Double>>();

    Map<NewsPapers,Map<NewsPapers, HashMap<Weekday, Double>>> allPapers ;


    // Mapping string values to int keys
    public void setValues() {
        TOI_hash_map.put(NewsPapers.TOI, new HashMap<Weekday, Double>() {
            {
                put(Weekday.Monday, 3.0);
                put(Weekday.Tuesday, 3.0);
                put(Weekday.Wednesday, 3.0);
                put(Weekday.Thursday, 3.0);
                put(Weekday.Friday, 3.0);
                put(Weekday.Saturday, 5.0);
                put(Weekday.Sunday, 6.0);
            }});

        Hindu_hash_map.put(NewsPapers.HINDU, new HashMap<Weekday, Double>() {
            {
                put(Weekday.Monday, 2.5);
                put(Weekday.Tuesday, 2.5);
                put(Weekday.Wednesday, 2.5);
                put(Weekday.Thursday, 2.5);
                put(Weekday.Friday, 2.5);
                put(Weekday.Saturday, 4.0);
                put(Weekday.Sunday, 4.0);
            }});

        ET_hash_map.put(NewsPapers.ET, new HashMap<Weekday, Double>() {
            {
                put(Weekday.Monday, 2.0);
                put(Weekday.Tuesday, 2.0);
                put(Weekday.Wednesday, 2.0);
                put(Weekday.Thursday, 2.0);
                put(Weekday.Friday, 2.0);
                put(Weekday.Saturday, 2.0);
                put(Weekday.Sunday, 10.0);
            }});

        BM_hash_map.put(NewsPapers.BM, new HashMap<Weekday, Double>() {
            {
                put(Weekday.Monday, 1.5);
                put(Weekday.Tuesday, 1.5);
                put(Weekday.Wednesday, 1.5);
                put(Weekday.Thursday, 1.5);
                put(Weekday.Friday, 1.5);
                put(Weekday.Saturday, 1.5);
                put(Weekday.Sunday, 1.5);
            }});

        HT_hash_map.put(NewsPapers.HT, new HashMap<Weekday, Double>() {
            {
                put(Weekday.Monday, 2.0);
                put(Weekday.Tuesday, 2.0);
                put(Weekday.Wednesday, 2.0);
                put(Weekday.Thursday, 2.0);
                put(Weekday.Friday, 2.0);
                put(Weekday.Saturday, 4.0);
                put(Weekday.Sunday, 4.0);
            }});

         allPapers = new HashMap<NewsPapers,Map<NewsPapers, HashMap<Weekday, Double>>>(){
            {
                put(NewsPapers.TOI,TOI_hash_map);
                put(NewsPapers.HINDU,Hindu_hash_map);
                put(NewsPapers.ET,ET_hash_map);
                put(NewsPapers.BM,BM_hash_map);
                put(NewsPapers.HT,HT_hash_map);
            }
        };

    }
}
