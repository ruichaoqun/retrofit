package com.ruichaoquni.android;

import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * @author Rui Chaoqun
 * @date :2020/6/12 17:32
 * description:
 */
class CallEnqueueObservable<T> extends Observable<T> {

    @Override
    protected void subscribeActual(Observer<? super T> observer) {
        observer.onSubscribe();
    }
}
