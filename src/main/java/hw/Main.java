package hw;

import java.sql.SQLFeatureNotSupportedException;
import java.util.*;
import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

import javax.imageio.event.IIOReadProgressListener;
import org.jgrapht.alg.color.GreedyColoring;

public class Main {
    public static void main(final String[] args) {
        final String ES = CountryCodes.ES;
        final String FR = CountryCodes.FR;
        final String CH = CountryCodes.CH;
        final String IT = CountryCodes.IT;
        final String DE = CountryCodes.DE;
        final String BE = CountryCodes.BE;

        final Graph<String, DefaultEdge> theMap = new SimpleGraph<>(DefaultEdge.class);
        theMap.addVertex(ES);
        theMap.addVertex(FR);
        theMap.addVertex(CH);
        theMap.addVertex(IT);
        theMap.addVertex(DE);
        theMap.addVertex(BE);
        theMap.addEdge(FR, ES);
        theMap.addEdge(FR, CH);
        theMap.addEdge(FR, IT);
        theMap.addEdge(FR, DE);
        theMap.addEdge(FR, BE);
        theMap.addEdge(DE, BE);
        theMap.addEdge(DE, CH);
        theMap.addEdge(CH, IT);

        System.out.println(theMap.toString());

        System.out.println("\nBreadthfirst iteration starting from France:");

        final Iterator<String> bFirst = new BreadthFirstIterator<>(theMap, FR);
        while (bFirst.hasNext()) {
            final String country = bFirst.next();
            System.out.println(country);
        }
        System.out.println("\nBreadthfirst iteration starting from Switzerland:");
        final Iterator<String> bFirst2 = new BreadthFirstIterator<>(theMap, CH);
        while (bFirst2.hasNext()) {
            final String country = bFirst2.next();
            System.out.println(country);
        }
        System.out.println("\nClosestFirstIterator<> iteration starting from France:");


        final Iterator<String> cFirst = new ClosestFirstIterator<>(theMap, FR);
        while (cFirst.hasNext()) {
            final String country = cFirst.next();
            System.out.println(country);
        }
        System.out.println("\nClosestFirstIterator<> iteration starting from Switzerland:");



        final Iterator<String> cFirst2 = new ClosestFirstIterator<>(theMap, CH);
        while (cFirst2.hasNext()) {
            final String country = cFirst2.next();
            System.out.println(country);
        }
        System.out.println("\nDepthFirstIterator<> iteration starting from France:");
//        depthFirstIteratorTest(theMap, FR);
        final Iterator<String> dFirst = new DepthFirstIterator<>(theMap, FR);
        while (dFirst.hasNext()) {
            final String country = dFirst.next();
            System.out.println(country);
        }
        System.out.println("\nDepthFirstIterator<> iteration starting from Switzerland:");

        final Iterator<String> dFirst2 = new DepthFirstIterator<>(theMap, CH);
        while (dFirst2.hasNext()) {
            final String country = dFirst2.next();
            System.out.println(country);
        }

        System.out.println("\nRandomWalkIterator iteration starting from France:");

        final Iterator<String> rWalk = new RandomWalkIterator<>(theMap, FR, true, 6);
        while (rWalk.hasNext()) {
            final String country = rWalk.next();
            System.out.println(country);
        }

        System.out.println("\nRandomWalkIterator iteration starting from Switzerland:");
        final Iterator<String> rWalk2 = new RandomWalkIterator<>(theMap, CH, true, 6);
        while (rWalk2.hasNext()) {
            final String country = rWalk2.next();
            System.out.println(country);
        }


        GreedyColoring mapColor = new GreedyColoring(theMap);
        System.out.println(mapColor.getColoring());
    }

//    public static void depthFirstIteratorTest(Graph<String, DefaultEdge> theMap, String countryCode){ //Practice**
//        final Iterator<String> dFirst = new DepthFirstIterator<>(theMap, countryCode);
//        while (dFirst.hasNext()) {
//            final String country = dFirst.next();
//            System.out.println(country);
//        }

}























