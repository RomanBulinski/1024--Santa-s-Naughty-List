import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SantasList {

    public static List<String> findChildren(List<String> santasList, List<String> children) {
        Set<String> goodchildren = new HashSet<>();
        children.forEach(child -> addChiledOnSanatasList(child, goodchildren, santasList) );
        return goodchildren.stream().sorted().collect(Collectors.toList());
    }

    public static void addChiledOnSanatasList( String chiled, Set<String> goodchildren, List<String> santasList){
        if(santasList.contains(chiled)){
            goodchildren.add(chiled);
        }
    }

    public static List<String> findChildrenTeBestSolution(List<String> santasList, List<String> children) {
        return children.stream().filter(c -> santasList.contains(c)).distinct().sorted().collect(Collectors.toList());
    }

}
