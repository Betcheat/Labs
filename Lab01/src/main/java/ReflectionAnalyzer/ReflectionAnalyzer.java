package ReflectionAnalyzer;

import static fillers.Fillers.*;
import fillers.Fillers;
import org.reflections.Reflections;
import sorters.Sorter;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


/**
 *  Class where Reflection methods for Filler and Sorters are created.
 * @author Polonskiy
 * @version 1.2
 */
 public class ReflectionAnalyzer {
  private static List<Sorter> sorters = new ArrayList<>();
  private static Reflections reflections = new Reflections("sorters");
    /**
     * Method where we get {@link fillers.Fillers} methods using Reflection with annotation
     */
    public static int[] refFill() {

        Fillers fillers = new Fillers();
        Method[] methods = fillers.getClass().getMethods();
        int [] array = new int[0];
        for (Method method : methods) {
            SpecAnot specAnot = method.getAnnotation(SpecAnot.class);
            if (specAnot != null) {
                try {
                   array =(int[]) method.invoke(specAnot);
                    System.out.println(Arrays.toString(array));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
        return array;
    }

    /**
     * Method where we get  Sorters method using Reflection to find all subClasses of {@link sorters.Sorter}
     */
    public static List<Sorter> refSort() {
        Set<Class<? extends Sorter>> subClasses = reflections.getSubTypesOf(Sorter.class);
        for (Class<? extends Sorter> abstractClass : subClasses) {
            if (!Modifier.isAbstract(abstractClass.getModifiers())) {

                try {
                    Sorter sorter = abstractClass.newInstance();
                    sorters.add(sorter);

                } catch (IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                  }

            }
        }
        System.out.println(sorters);
        return sorters;
    }

    public void Analyzer(){
        int quantityofSorters = sorters.size();

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < quantityofSorters; j++) {
                long startTime = System.nanoTime();

                long endTime = System.nanoTime();
                System.out.println(endTime - startTime);
            }
        }
    }
 }


