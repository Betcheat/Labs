import ReflectionAnalyzer.ReflectionAnalyzer;
//import  ReflectionAnalyzer.ReflectionAnalyzer.refFill;
//import  ReflectionAnalyzer.ReflectionAnalyzer.refSort;

/**
 *  Main is a class where Analyze methods are summoned <br>
 * @author Polonskiy
 * @version 1.2
 */

public class Main {
    //ToDo: rebuild fillers чтоб не зависели друг от друга
    //ToDo: избавиться от private static int arrGR[] = new int[6]; в филлерах
    //Todo: каждий массив генериться отдельн????

    /**
     * Main Method used for summoning Analyze methods <br>
     * @param args command line values
     */
    public static void main(String[] args) {

        ReflectionAnalyzer reflectionAnalyzer = new ReflectionAnalyzer();
        reflectionAnalyzer.Analyzer();
    }
}
