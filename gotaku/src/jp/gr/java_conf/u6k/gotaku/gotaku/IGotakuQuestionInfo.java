
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.List;

public interface IGotakuQuestionInfo {

    long getId();

    long getGenreId();

    String getQuestion();

    List<String> getAnswerList();

}
