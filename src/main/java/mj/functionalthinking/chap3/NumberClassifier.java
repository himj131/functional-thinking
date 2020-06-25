package mj.functionalthinking.chap3;

import com.googlecode.totallylazy.Sequence;
import com.googlecode.totallylazy.predicates.LogicalPredicate;

import static com.googlecode.totallylazy.Predicates.is;
import static com.googlecode.totallylazy.Predicates.where;
import static com.googlecode.totallylazy.numbers.Numbers.*;

public class NumberClassifier {
    public static LogicalPredicate<Number> isFactor(Number n){
        return where(remainder(n), is(zero));
    }

    public static Sequence getFactors(final Number n) {
        return range(1, n).filter(isFactor(n));
    }

}
