
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jp.gr.java_conf.u6k.gotaku.util.IOUtil;
import android.util.Log;

public class GotakuFileBuilder {

    public IGotakuInfo build(InputStream in) throws IOException {
        List<IGotakuGenreInfo> genreList = new ArrayList<IGotakuGenreInfo>();

        // ジャンル・ヘッダーを読み込みます。
        for (int i = 0; i < 8; i++) {
            String genreName = IOUtil.readString(in, 16);
            int genreReserved = IOUtil.readInt(in);
            int genreCount = IOUtil.readInt(in);
            int genreOffset = IOUtil.readInt(in);
            String genrePlayerData = IOUtil.readString(in, 12);
            String genreId = IOUtil.readString(in, 8);
            IOUtil.readSkip(in, 214);

            GotakuGenreInfo genre = new GotakuGenreInfo();
            genre.setName(genreName);
            genre.setCount(genreCount);
            genre.setOffset(genreOffset);

            genreList.add(genre);

            // TODO
            Log.v("gotaku", "ジャンル名: \"" + genre.getName() + "\"");
            Log.v("gotaku", "予約域: \"" + genreReserved + "\"");
            Log.v("gotaku", "問題数: \"" + genre.getCount() + "\"");
            Log.v("gotaku", "先頭位置: \"" + genre.getOffset() + "\"");
            Log.v("gotaku", "プレイヤーデータファイル名: \"" + genrePlayerData + "\"");
            Log.v("gotaku", "ID: \"" + genreId + "\"");
        }

        for (IGotakuGenreInfo gotakuGenre : genreList) {
            GotakuGenreInfo genre = (GotakuGenreInfo) gotakuGenre;

            List<IGotakuQuestionInfo> questionList = new ArrayList<IGotakuQuestionInfo>();

            for (int i = 0; i < genre.getCount(); i++) {
                GotakuQuestionInfo question = new GotakuQuestionInfo();

                String q = IOUtil.readQuestionString(in, 116);

                List<String> answerList = new ArrayList<String>();
                answerList.add(IOUtil.readQuestionString(in, 28));
                answerList.add(IOUtil.readQuestionString(in, 28));
                answerList.add(IOUtil.readQuestionString(in, 28));
                answerList.add(IOUtil.readQuestionString(in, 28));
                answerList.add(IOUtil.readQuestionString(in, 28));

                question.setQuestion(q);
                question.setAnswerList(answerList);

                questionList.add(question);
            }

            genre.setQuestionList(questionList);
        }

        GotakuInfo gotaku = new GotakuInfo();
        gotaku.setGenreList(genreList);

        return gotaku;
    }

    private class GotakuInfo implements IGotakuInfo {

        private List<IGotakuGenreInfo> _genreList = new ArrayList<IGotakuGenreInfo>();

        @Override
        public List<IGotakuGenreInfo> getGenreList() {
            return this._genreList;
        }

        public void setGenreList(List<IGotakuGenreInfo> genreList) {
            this._genreList = genreList;
        }

    }

    private class GotakuGenreInfo implements IGotakuGenreInfo {

        private String _name;

        private List<IGotakuQuestionInfo> _questionList;

        private int _count;

        private int _offset;

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

    private class GotakuQuestionInfo implements IGotakuQuestionInfo {

        private String _question;

        private List<String> _answerList = new ArrayList<String>();

        @Override
        public String getQuestion() {
            return this._question;
        }

        public void setQuestion(String question) {
            this._question = question;
        }

        @Override
        public List<String> getAnswerList() {
            return this._answerList;
        }

        public void setAnswerList(List<String> answerList) {
            this._answerList = answerList;
        }

    }

}
