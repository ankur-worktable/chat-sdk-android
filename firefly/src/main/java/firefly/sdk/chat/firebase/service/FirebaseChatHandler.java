package firefly.sdk.chat.firebase.service;

import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.firestore.FieldValue;

import java.util.Date;
import java.util.HashMap;

import javax.annotation.Nullable;

import firefly.sdk.chat.chat.Chat;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import firefly.sdk.chat.chat.User;
import io.reactivex.functions.Consumer;

public abstract class FirebaseChatHandler {

    public abstract Completable leaveChat(String chatId);
    public abstract Completable joinChat(String chatId);

    /**
     * Note in this case, we don't provide the path to the chat/meta
     * we provide it to the chat. This is because of differences between
     * Realtime and Firestore. The realtime database stores the data at
     *  - chat/meta/...
     * But in Firestore meta/... is stored as a field on the chat document
     * So we need to link to the chat document in both cases
     * @param chatPath path to chat document / entity
     * @return stream of data when chat meta changes
     */
    public abstract Observable<Chat.Meta> metaOn(Path chatPath);

    public abstract Single<String> add(Path path, HashMap<String, Object> data, @Nullable Consumer<String> newId);

    public Single<String> add(Path path, HashMap<String, Object> data) {
        return add(path, data, null);
    }

}
