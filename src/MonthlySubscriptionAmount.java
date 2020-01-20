import java.util.*;

public class MonthlySubscriptionAmount {

    public static Data data;
    static double finalCost = 0.0;

    public static void main(String[] args) {

        data = new Data();
        data.setValues();
        Scanner input = new Scanner(System.in);
        String userPaperList = input.nextLine();

        String[] paperList = userPaperList.split(",");

        if (!paperList[0].contentEquals("")) {
            List<String> chosenPaperList = new ArrayList<String>(paperList.length);
            Collections.addAll(chosenPaperList, paperList);

            for (int i = 0; i < chosenPaperList.size(); i++) {

                NewsPapers paperChosen = NewsPapers.valueOf(chosenPaperList.get(i).toUpperCase().trim());
                GetPapersCostForAMonth(paperChosen);
            }
            System.out.println(userPaperList);
        }
        System.out.println("Final cost: " + finalCost);

    }

    public static Double calculatePapersPerDayCost(NewsPapers newspaper, Weekday dayOfTheWeek) {

        List<NewsPapers> allNewsPaper = Arrays.asList(NewsPapers.values());
        List<Weekday> allDays = Arrays.asList(Weekday.values());
        Double costOfPaperForThatDay = 0.0;
        for (int i = 0; i < allNewsPaper.size(); i++) {
            if (newspaper == allNewsPaper.get(i)) {

                Map papers_hashMap = data.allPapers.get(newspaper);
                HashMap weekdayPrices = (HashMap) papers_hashMap.get(newspaper);
                costOfPaperForThatDay = (Double) weekdayPrices.get(dayOfTheWeek);

                break;
            }
        }
        return costOfPaperForThatDay;
    }

    public static void GetPapersCostForAMonth(NewsPapers newsPaper) {
        Calendar now = Calendar.getInstance();

        int noOfDAysInTheMonth = now.getActualMaximum(Calendar.DAY_OF_MONTH);
        now.set(Calendar.DAY_OF_MONTH, 1);
        int firstday = now.get(Calendar.DAY_OF_WEEK);
        int startday = 1;

        while (startday <= noOfDAysInTheMonth) {

            Weekday day = Weekday.values()[firstday - 1];
            finalCost = finalCost + calculatePapersPerDayCost(newsPaper, day);
            firstday++;
            startday++;
            if (firstday == 8) {
                firstday = 1;
            }
        }
    }
}
