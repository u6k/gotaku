
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.List;

import android.os.Parcelable;

public interface IGotakuQuestionInfo extends Parcelable {

    String getQuestion();

    List<String> getAnswerList();

}
