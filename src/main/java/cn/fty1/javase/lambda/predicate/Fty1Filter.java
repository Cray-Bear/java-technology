package cn.fty1.javase.lambda.predicate;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Fty1Filter<T> {
    public Collection<T> conditionFilter(Collection<T> iterable, Predicate<T> predicate) {
        return iterable.stream().filter(predicate).collect(Collectors.toList());
    }

}
