
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.util.ArrayList;
import java.util.List;

public class GotakuGenreInfo implements IGotakuGenreInfo {

    private long _id;

    private long _setId;

    private String _name;

    private List<IGotakuQuestionInfo> _questionList = new ArrayList<IGotakuQuestionInfo>();

    private int _count;

    private int _offset;

    public GotakuGenreInfo() {
    }

    @Override
    public long getId() {
        return this._id;
    }

    public void setId(long id) {
        this._id = id;
    }

    @Override
    public long getSetId() {
        return this._setId;
    }

    public void setSetId(long setId) {
        this._setId = setId;
    }

    @Override
    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    @Override
    public List<IGotakuQuestionInfo> getQuestionList() {
        return this._questionList;
    }

    public void setQuestionList(List<IGotakuQuestionInfo> questionList) {
        this._questionList = questionList;
    }

    public int getCount() {
        return this._count;
    }

    public void setCount(int count) {
        this._count = count;
    }

    public int getOffset() {
        return this._offset;
    }

    public void setOffset(int offset) {
        this._offset = offset;
    }

}
