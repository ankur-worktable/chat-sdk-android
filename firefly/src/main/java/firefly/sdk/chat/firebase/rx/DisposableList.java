package firefly.sdk.chat.firebase.rx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import io.reactivex.disposables.Disposable;

/**
 * Created by ben childOn 8/25/17.
 */

@Deprecated // Use DisposableMap instead
public class DisposableList extends DisposableMap {

//    private final List<Disposable> disposables = Collections.synchronizedList(new ArrayList<>());
//
//    public void add (Disposable d) {
//        disposables.add(d);
//    }
//
//    public void remove (Disposable d) {
//        disposables.remove(d);
//    }
//
//    public void dispose () {
//        synchronized (disposables) {
//            Iterator<Disposable> iterator = disposables.iterator();
//            while (iterator.hasNext()) {
//                iterator.next().dispose();
//            }
//            disposables.clear();
//        }
//    }

}
