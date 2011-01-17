
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.List;

public interface IGotakuGenreInfo {

    long getId();

    long getSetId();

    String getName();

    List<IGotakuQuestionInfo> getQuestionList();

}
