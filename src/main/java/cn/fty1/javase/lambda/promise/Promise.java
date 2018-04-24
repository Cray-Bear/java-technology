package cn.fty1.javase.lambda.promise;

import java.util.function.Function;

public class Promise<T,R> implements Function<T,R> {


    private String status =PromiseContant.PROMISE_STATUS_PENDINNG;

    @Override
    public R apply(T t) {
        return null;
    }

    @Override
    public <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
        return null;
    }

    @Override
    public <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
        return null;
    }
}
