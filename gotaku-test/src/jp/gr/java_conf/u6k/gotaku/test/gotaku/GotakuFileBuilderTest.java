
package jp.gr.java_conf.u6k.gotaku.test.gotaku;

import java.io.IOException;
import java.io.InputStream;

import jp.gr.java_conf.u6k.gotaku.gotaku.GotakuFileBuilder;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuGenreInfo;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuInfo;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuQuestionInfo;
import junit.framework.Assert;
import android.test.AndroidTestCase;

public class GotakuFileBuilderTest extends AndroidTestCase {

    public void test_build() throws IOException {
        IGotakuInfo gotaku;

        InputStream in = this.getContext().getAssets().open("testdata/SAD_M1&2.5TQ");
        try {
            GotakuFileBuilder gotakuBuilder = new GotakuFileBuilder();
            gotaku = gotakuBuilder.build(in);
        } finally {
            in.close();
        }

        this.subtest_build_genre1(gotaku);
        this.subtest_build_genre2(gotaku);
        this.subtest_build_genre3(gotaku);
        this.subtest_build_genre4(gotaku);
        this.subtest_build_genre5(gotaku);
        this.subtest_build_genre6(gotaku);
        this.subtest_build_genre7(gotaku);
        this.subtest_build_genre8(gotaku);
    }

    private void subtest_build_genre1(IGotakuInfo gotaku) {
        IGotakuGenreInfo genre = gotaku.getGenreList().get(0);

        Assert.assertEquals("仕事とコンピュタ", genre.getName());

        Assert.assertEquals(67, genre.getQuestionList().size());

        IGotakuQuestionInfo q = genre.getQuestionList().get(0);

        Assert.assertEquals("企業の組織における部門で、営業部や生産部など直接利益を生み出すための部門", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ライン部門", q.getAnswerList().get(0));
        Assert.assertEquals("スタッフ部門", q.getAnswerList().get(1));
        Assert.assertEquals("サービス部門", q.getAnswerList().get(2));
        Assert.assertEquals("マージン部門", q.getAnswerList().get(3));
        Assert.assertEquals("経理部門", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(1);

        Assert.assertEquals("企業の組織における経理部や人事部、総務部などを指し、各部門に共通の業務を代わりに一括して処理するサービス等を行う部門", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スタッフ部門", q.getAnswerList().get(0));
        Assert.assertEquals("ライン部門", q.getAnswerList().get(1));
        Assert.assertEquals("サービス部門", q.getAnswerList().get(2));
        Assert.assertEquals("オンライン部門", q.getAnswerList().get(3));
        Assert.assertEquals("一括処理部門", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(2);

        Assert.assertEquals("企業内における次の部門のうち、ライン部門に属するものはどれか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("営業部", q.getAnswerList().get(0));
        Assert.assertEquals("経理部", q.getAnswerList().get(1));
        Assert.assertEquals("人事部", q.getAnswerList().get(2));
        Assert.assertEquals("総務部", q.getAnswerList().get(3));
        Assert.assertEquals("情報処理部", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(3);

        Assert.assertEquals("企業内における次の部門のうち、スタッフ部門に属するものはどれか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("経理部", q.getAnswerList().get(0));
        Assert.assertEquals("営業部", q.getAnswerList().get(1));
        Assert.assertEquals("生産部", q.getAnswerList().get(2));
        Assert.assertEquals("購買部", q.getAnswerList().get(3));
        Assert.assertEquals("福女商マルチメディア部", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(4);

        Assert.assertEquals("データの収集方法で、異質なものはどれか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("時間の経過で量の変化を見る", q.getAnswerList().get(0));
        Assert.assertEquals("既存の資料を収集・分析する", q.getAnswerList().get(1));
        Assert.assertEquals("担当者にヒアリング調査を行う", q.getAnswerList().get(2));
        Assert.assertEquals("構成員の業務の手順を観察する", q.getAnswerList().get(3));
        Assert.assertEquals("伝票等の流れを観察・追跡する", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(5);

        Assert.assertEquals("集めたデータをもとに、数値にして分析する手法を何というか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("定量的分析", q.getAnswerList().get(0));
        Assert.assertEquals("定性的分析", q.getAnswerList().get(1));
        Assert.assertEquals("時系列分析", q.getAnswerList().get(2));
        Assert.assertEquals("統計的分析", q.getAnswerList().get(3));
        Assert.assertEquals("イメージ分析", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(6);

        Assert.assertEquals("業務におけるデータ流れを言葉ではなく、図形（丸や四角）・矢印などを使って表した分析・設計の技法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＦＤ", q.getAnswerList().get(0));
        Assert.assertEquals("ワークフロー", q.getAnswerList().get(1));
        Assert.assertEquals("アローダイヤグラム", q.getAnswerList().get(2));
        Assert.assertEquals("カマック図法", q.getAnswerList().get(3));
        Assert.assertEquals("デシジョンテーブル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(7);

        Assert.assertEquals("フローチャートの表現方法は、何の規格で定められているか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＪＩＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＪＡＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＪＡＮ", q.getAnswerList().get(2));
        Assert.assertEquals("ＡＮＳＩ", q.getAnswerList().get(3));
        Assert.assertEquals("ＩＥＥＥ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(8);

        Assert.assertEquals("データフローダイヤグラムでは、「データの流れ」はどんな記号で表すか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("矢印", q.getAnswerList().get(0));
        Assert.assertEquals("二重線（二重線）", q.getAnswerList().get(1));
        Assert.assertEquals("直線", q.getAnswerList().get(2));
        Assert.assertEquals("四角形", q.getAnswerList().get(3));
        Assert.assertEquals("楕円形", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(9);

        Assert.assertEquals("データフローダイヤグラムでは、「プロセス（入力データから出力データへの処理の内容）」はどんな記号で表すか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("円（楕円）", q.getAnswerList().get(0));
        Assert.assertEquals("矢印", q.getAnswerList().get(1));
        Assert.assertEquals("二重線（二重線）", q.getAnswerList().get(2));
        Assert.assertEquals("直線", q.getAnswerList().get(3));
        Assert.assertEquals("四角形", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(10);

        Assert.assertEquals("データフローダイヤグラムでは、「ファイル（データの一時的な蓄積）」はどんな記号で表すか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("直線（二重線）", q.getAnswerList().get(0));
        Assert.assertEquals("円（楕円）", q.getAnswerList().get(1));
        Assert.assertEquals("矢印", q.getAnswerList().get(2));
        Assert.assertEquals("二重線", q.getAnswerList().get(3));
        Assert.assertEquals("四角形", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(11);

        Assert.assertEquals("データフローダイヤグラムでは、「範囲外にあるデータの発生源または行き先、外部のシステムや組織」はどんな記号で表すか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("四角形", q.getAnswerList().get(0));
        Assert.assertEquals("直線（二重線）", q.getAnswerList().get(1));
        Assert.assertEquals("円（楕円）", q.getAnswerList().get(2));
        Assert.assertEquals("矢印", q.getAnswerList().get(3));
        Assert.assertEquals("二重線", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(12);

        Assert.assertEquals("ＳＡＤの仕事の一つとして問題の発見と原因分析、解決策の策定があるが、この「問題」とは何を指すか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("期待値（目標）と現状のズレ", q.getAnswerList().get(0));
        Assert.assertEquals("原因と結果の食い違い", q.getAnswerList().get(1));
        Assert.assertEquals("現実と予想の差", q.getAnswerList().get(2));
        Assert.assertEquals("課題と目標とのギャップ", q.getAnswerList().get(3));
        Assert.assertEquals("橋本Ｔと池田Ｔのハンサム度", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(13);

        Assert.assertEquals("本質的に、期待値（目標）と現状（実際の状況）の差として定義されるものは何か", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("問題", q.getAnswerList().get(0));
        Assert.assertEquals("現実", q.getAnswerList().get(1));
        Assert.assertEquals("原因", q.getAnswerList().get(2));
        Assert.assertEquals("障害", q.getAnswerList().get(3));
        Assert.assertEquals("理想", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(14);

        Assert.assertEquals("数名から数十名で行う一種のディスカッション。自由な発想で意見を述べ、質より量を重んじ他人の意見を批判しないのが特徴", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ブレーンストーミング", q.getAnswerList().get(0));
        Assert.assertEquals("ＫＪ法", q.getAnswerList().get(1));
        Assert.assertEquals("インタビュー", q.getAnswerList().get(2));
        Assert.assertEquals("ＰＤＰＣ", q.getAnswerList().get(3));
        Assert.assertEquals("ＫＲ法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(15);

        Assert.assertEquals("財務会計システム・販売管理システムなど、一般にコンピュータなどを利用して企業で扱われるシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＡ（ビジネス）システム", q.getAnswerList().get(0));
        Assert.assertEquals("マネジメントシステム", q.getAnswerList().get(1));
        Assert.assertEquals("オフィスシステム", q.getAnswerList().get(2));
        Assert.assertEquals("エンジニアリングシステム", q.getAnswerList().get(3));
        Assert.assertEquals("マーケティングシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(16);

        Assert.assertEquals("工業用ロボットの自動操縦や設計作業の合理化など、工場や設計部門・研究所などで利用されるコンピュータシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＡシステム", q.getAnswerList().get(0));
        Assert.assertEquals("マネジメントシステム", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＡＤシステム", q.getAnswerList().get(2));
        Assert.assertEquals("統合管理システム", q.getAnswerList().get(3));
        Assert.assertEquals("ファクトシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(17);

        Assert.assertEquals("工業用ロボットの自動操縦や設計作業の合理化など、工場や設計部門・研究所などで利用されるコンピュータシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エンジニアリングシステム", q.getAnswerList().get(0));
        Assert.assertEquals("マネジメントシステム", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＡＭシステム", q.getAnswerList().get(2));
        Assert.assertEquals("ＯＡシステム", q.getAnswerList().get(3));
        Assert.assertEquals("ファクトシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(18);

        Assert.assertEquals("コンピュータ支援設計。手書きで製図する代わりに、コンピュータの画面上で図面を引きデザイン・設計業務を効率化するもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＡＤ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＡＭ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＩＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＩＡ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＡＩ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(19);

        Assert.assertEquals("コンピュータ支援製造。工作機などに命令を与えて、思い通りに動かすなどのシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＡＭ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＡＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＩＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＩＡ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＡＩ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(20);

        Assert.assertEquals("工場内での作業を自動化で行うために、コンピュータを使って生産ラインを制御するなど広い概念を持つもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＡ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＡＭ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＡＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＩＭ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＢＭＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(21);

        Assert.assertEquals("ＣＡＤやＣＡＭ、ＦＡシステムなどを統合して管理するシステム。情報を一元化することを目的とするものである", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＩＭ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＡＩ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＩＦ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＲＤ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＲＦ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(22);

        Assert.assertEquals("パソコン通信などで、会員の誰でも読み書きできる不特定多数を対象とした掲示板のこと。意見交換や情報交換などを行う", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("電子掲示板", q.getAnswerList().get(0));
        Assert.assertEquals("電子メール", q.getAnswerList().get(1));
        Assert.assertEquals("電子会議システム", q.getAnswerList().get(2));
        Assert.assertEquals("フォーラム", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＩＧ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(23);

        Assert.assertEquals("ネットワーク上で複数の人が討議や意見のやりとりを行うことを目的としたシステム。時間や場所を特定しないで済む利点がある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("電子会議システム", q.getAnswerList().get(0));
        Assert.assertEquals("電子掲示板", q.getAnswerList().get(1));
        Assert.assertEquals("電子メール", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＵＧ", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＩＧ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(24);

        Assert.assertEquals("ＳＡＤの仕事として適切でないものはどれか？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("組織全体のシステム設計など", q.getAnswerList().get(0));
        Assert.assertEquals("自部門の業務の現状分析", q.getAnswerList().get(1));
        Assert.assertEquals("システム部門に改善案など提示", q.getAnswerList().get(2));
        Assert.assertEquals("自部門でのＥＵＣの推進", q.getAnswerList().get(3));
        Assert.assertEquals("自部門のシステム利用環境整備", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(25);

        Assert.assertEquals("ＳＡＤは（　　）のリーダーとして、自部門の業務の改善やシステム環境の整備などを行う任務を持つ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("情報化推進", q.getAnswerList().get(0));
        Assert.assertEquals("高度情報化社会", q.getAnswerList().get(1));
        Assert.assertEquals("会社全体", q.getAnswerList().get(2));
        Assert.assertEquals("システム構築", q.getAnswerList().get(3));
        Assert.assertEquals("福岡女子商業の体育祭", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(26);

        Assert.assertEquals("ＳＡＤは自部門のシステム化にあたり、どの部門と協力してシステム化を進めていくか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("システム部門", q.getAnswerList().get(0));
        Assert.assertEquals("エンドユーザ部門", q.getAnswerList().get(1));
        Assert.assertEquals("ライン部門", q.getAnswerList().get(2));
        Assert.assertEquals("総務部門", q.getAnswerList().get(3));
        Assert.assertEquals("端末操作部門", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(27);

        Assert.assertEquals("「ＤＦＤ」とは何を略した言葉か？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("データ・フロー・ダイヤグラム", q.getAnswerList().get(0));
        Assert.assertEquals("データ・ファイル・ディスク", q.getAnswerList().get(1));
        Assert.assertEquals("データ・ファイル・ダンプ", q.getAnswerList().get(2));
        Assert.assertEquals("データ・フリー・ダンプ", q.getAnswerList().get(3));
        Assert.assertEquals("でかい！・ふとい！・大好き！", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(28);

        Assert.assertEquals("ＤＦＤの特徴として、最も適しているものはどれか？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("業務の流れをデータに着目する", q.getAnswerList().get(0));
        Assert.assertEquals("ファイルを直接矢印で結ぶ手法", q.getAnswerList().get(1));
        Assert.assertEquals("簡単な２０個位の図形を使用", q.getAnswerList().get(2));
        Assert.assertEquals("ファイルを楕円形で表す", q.getAnswerList().get(3));
        Assert.assertEquals("新ＱＣ七つ道具の一つである", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(29);

        Assert.assertEquals("ＤＦＤにおいて、ファイルは必ず（　　）と（　　）で結ばれる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プロセス・矢印", q.getAnswerList().get(0));
        Assert.assertEquals("矢印・流れ線", q.getAnswerList().get(1));
        Assert.assertEquals("流れ線・プロセス", q.getAnswerList().get(2));
        Assert.assertEquals("愛・勇気", q.getAnswerList().get(3));
        Assert.assertEquals("赤い糸・青い糸", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(30);

        Assert.assertEquals("ＤＦＤでは、最低ひとつの（　　）を表す記号が必要である", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プロセス", q.getAnswerList().get(0));
        Assert.assertEquals("ファイル", q.getAnswerList().get(1));
        Assert.assertEquals("データフロー", q.getAnswerList().get(2));
        Assert.assertEquals("データ発生源", q.getAnswerList().get(3));
        Assert.assertEquals("自分の顔", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(31);

        Assert.assertEquals("ＤＦＤでは、必ず自分自身に戻ってくるような（　　）を書いてはいけないことになっている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("矢印", q.getAnswerList().get(0));
        Assert.assertEquals("プロセス", q.getAnswerList().get(1));
        Assert.assertEquals("ファイル", q.getAnswerList().get(2));
        Assert.assertEquals("コメント", q.getAnswerList().get(3));
        Assert.assertEquals("似顔絵", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(32);

        Assert.assertEquals("ＤＦＤでは、ひとつの図の中に入ってくるデータや出ていくデータは（　　）と結んでおくことになっている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("外部の記号", q.getAnswerList().get(0));
        Assert.assertEquals("プロセス", q.getAnswerList().get(1));
        Assert.assertEquals("ファイルの記号", q.getAnswerList().get(2));
        Assert.assertEquals("データフロー", q.getAnswerList().get(3));
        Assert.assertEquals("犬の首輪", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(33);

        Assert.assertEquals("具体的な帳票類の流れを細かく表すのに用いられるもので、産能大式の分析図であるものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("事務工程分析図", q.getAnswerList().get(0));
        Assert.assertEquals("事務処理分析図", q.getAnswerList().get(1));
        Assert.assertEquals("帳票細分化分析図", q.getAnswerList().get(2));
        Assert.assertEquals("産能大式事務処理分析図", q.getAnswerList().get(3));
        Assert.assertEquals("データフロー分析図", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(34);

        Assert.assertEquals("例えば、営業所ごとの売上高の比較や部門別の社員数の比較など、いくつかの数字や量を比較するときに使われるグラフ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("棒グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("円グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("レーダーチャート", q.getAnswerList().get(3));
        Assert.assertEquals("ヒストグラム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(35);

        Assert.assertEquals("例えば、電力の月別使用量の変化など、数値が時間的・連続的に推移するようなデータを表すときに使われるグラフ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("積み重ね棒グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("Ｚチャート", q.getAnswerList().get(2));
        Assert.assertEquals("円グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("帯グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(36);

        Assert.assertEquals("例えば、あるパソコンの支店別売上高の割合を見るなど、全体の中でのそれぞれの構成比を表すときに使われるグラフ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("円グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("帯グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("棒グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("レーダーチャート", q.getAnswerList().get(3));
        Assert.assertEquals("テニスの女王、グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(37);

        Assert.assertEquals("例えば、５科目の成績のつりあいを見るなど、いくつかの数値のバランスを表すときに使われるグラフ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("レーダーチャート", q.getAnswerList().get(0));
        Assert.assertEquals("パレート図", q.getAnswerList().get(1));
        Assert.assertEquals("面積グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("比較棒グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(38);

        Assert.assertEquals("次のグラフの中で、ある項目の値を「比較」をするときに適当でないと思われるものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("円グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("棒グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("積み上げ棒グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("ヒストグラム", q.getAnswerList().get(3));
        Assert.assertEquals("面積グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(39);

        Assert.assertEquals("次のグラフの中で、ある項目の値の「推移」を見る場合に適当でないと思われるものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("レーダーチャート", q.getAnswerList().get(0));
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("棒グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("動線グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("Ｚチャート", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(40);

        Assert.assertEquals("次のグラフの中で、ある項目の値の「構成」を見る場合に適当でないと思われるものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("円グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("帯グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("パレート図", q.getAnswerList().get(3));
        Assert.assertEquals("層グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(41);

        Assert.assertEquals("問題点の解決にあたり各種のデータを収集するが、これには大きく分けて（　　）なものと（　　）なものがある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("定性的・定量的", q.getAnswerList().get(0));
        Assert.assertEquals("定期的・不定期的", q.getAnswerList().get(1));
        Assert.assertEquals("定期的・変則的", q.getAnswerList().get(2));
        Assert.assertEquals("変性的・変態的", q.getAnswerList().get(3));
        Assert.assertEquals("男性的・女性的", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(42);

        Assert.assertEquals("次の中で、ブレーンストーミングの特徴でないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("馬鹿な意見は言わない", q.getAnswerList().get(0));
        Assert.assertEquals("批判をしない", q.getAnswerList().get(1));
        Assert.assertEquals("自由奔放に行う", q.getAnswerList().get(2));
        Assert.assertEquals("質より量", q.getAnswerList().get(3));
        Assert.assertEquals("他人の意見をまねる", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(43);

        Assert.assertEquals("川喜田二郎氏によって考案された問題解決技法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＫＪ法", q.getAnswerList().get(0));
        Assert.assertEquals("ＱＣ手法", q.getAnswerList().get(1));
        Assert.assertEquals("新ＱＣ手法", q.getAnswerList().get(2));
        Assert.assertEquals("連関図法", q.getAnswerList().get(3));
        Assert.assertEquals("福女商の風紀規定", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(44);

        Assert.assertEquals("多数の混沌としたデータの山から、何らかの法則やアイデアを見つけるときの手法。データ収集にあたって事実・現象を重視する", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＫＪ法", q.getAnswerList().get(0));
        Assert.assertEquals("デシジョンテーブル", q.getAnswerList().get(1));
        Assert.assertEquals("特性要因図", q.getAnswerList().get(2));
        Assert.assertEquals("マトリックス図法", q.getAnswerList().get(3));
        Assert.assertEquals("ＰＤＰＣ法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(45);

        Assert.assertEquals("ある事象に関していくつかの条件があるとき、その条件の組み合わせによって取るべき行動を記述した表。Ｙ／Ｎなどで表す", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デシジョンテーブル", q.getAnswerList().get(0));
        Assert.assertEquals("チェックシート", q.getAnswerList().get(1));
        Assert.assertEquals("特性要因図", q.getAnswerList().get(2));
        Assert.assertEquals("マトリックス図法", q.getAnswerList().get(3));
        Assert.assertEquals("連関図法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(46);

        Assert.assertEquals("デシジョンテーブルとは、もともと何のために使われるものであるか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プログラム開発のロジック", q.getAnswerList().get(0));
        Assert.assertEquals("製造業における品質管理運動", q.getAnswerList().get(1));
        Assert.assertEquals("テーブルをきれいに拭く道具", q.getAnswerList().get(2));
        Assert.assertEquals("日程計画の際の進捗管理", q.getAnswerList().get(3));
        Assert.assertEquals("２次元テーブルの初期値設定", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(47);

        Assert.assertEquals("日本の製造業で広く使われている品質管理運動。この存在が日本の製造業の強さを生み出したと言われる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＱＣ＝クォリティコントロール", q.getAnswerList().get(0));
        Assert.assertEquals("デシジョンテーブル", q.getAnswerList().get(1));
        Assert.assertEquals("ブレーンストーミング", q.getAnswerList().get(2));
        Assert.assertEquals("データフローダイヤグラム", q.getAnswerList().get(3));
        Assert.assertEquals("ラジオ体操などの準備運動", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(48);

        Assert.assertEquals("何らかの現象の原因となっている事項を、大きい順に並べて棒グラフで表すとともに、その累積数を折れ線グラフで描いたもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パレート図", q.getAnswerList().get(0));
        Assert.assertEquals("ヒストグラム", q.getAnswerList().get(1));
        Assert.assertEquals("散布図", q.getAnswerList().get(2));
        Assert.assertEquals("アローダイヤグラム", q.getAnswerList().get(3));
        Assert.assertEquals("原因降順図", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(49);

        Assert.assertEquals("「魚の骨」図とも言われる。ある事象に対してその原因を矢印で描き、さらのその原因を矢印で描いていくといった図のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("特性要因図", q.getAnswerList().get(0));
        Assert.assertEquals("パレート図", q.getAnswerList().get(1));
        Assert.assertEquals("管理図", q.getAnswerList().get(2));
        Assert.assertEquals("系統図", q.getAnswerList().get(3));
        Assert.assertEquals("原因解析図", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(50);

        Assert.assertEquals("データの存在する範囲をいくつかに分け、それぞれの出現する割合を棒グラフで表わしたもの。分布や中心値が一目で分かる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ヒストグラム", q.getAnswerList().get(0));
        Assert.assertEquals("マトリックス図法", q.getAnswerList().get(1));
        Assert.assertEquals("アロー・ダイヤグラム", q.getAnswerList().get(2));
        Assert.assertEquals("階級分布図", q.getAnswerList().get(3));
        Assert.assertEquals("層グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(51);

        Assert.assertEquals("何らかのデータを集めたとき、部門別とかクラス別などそれらを共通点のあるものでグループ分けすること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("層別", q.getAnswerList().get(0));
        Assert.assertEquals("識別", q.getAnswerList().get(1));
        Assert.assertEquals("決別", q.getAnswerList().get(2));
        Assert.assertEquals("分別", q.getAnswerList().get(3));
        Assert.assertEquals("原因別", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(52);

        Assert.assertEquals("対応する２種類のデータをそれぞれ縦軸と横軸にとって、該当する点をプロットしたもの。２種類のデータの相関関係がわかる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("散布図", q.getAnswerList().get(0));
        Assert.assertEquals("管理図", q.getAnswerList().get(1));
        Assert.assertEquals("特性要因図", q.getAnswerList().get(2));
        Assert.assertEquals("特性原因図", q.getAnswerList().get(3));
        Assert.assertEquals("系統図", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(53);

        Assert.assertEquals("データのとるべき値の中心（線）および上方管理限界線・下方管理限界線を記入した図に実際のデータをプロットしたもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("管理図", q.getAnswerList().get(0));
        Assert.assertEquals("散布図", q.getAnswerList().get(1));
        Assert.assertEquals("魚の骨図", q.getAnswerList().get(2));
        Assert.assertEquals("マトリックス図", q.getAnswerList().get(3));
        Assert.assertEquals("ぽん酢", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(54);

        Assert.assertEquals("従来からのＱＣ７つ道具に加えて、主に管理者・スタッフのために選ばれた技法。ＱＣ７つ道具に比べ言語データを対象とする", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("新ＱＣ７つ道具", q.getAnswerList().get(0));
        Assert.assertEquals("続ＱＣ７つ道具", q.getAnswerList().get(1));
        Assert.assertEquals("続ＱＣ７つ道倶", q.getAnswerList().get(2));
        Assert.assertEquals("新ＱＧ７つ道具", q.getAnswerList().get(3));
        Assert.assertEquals("空き巣狙い７つ道貝", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(55);

        Assert.assertEquals("次の中で、ＱＣ７つ道具に属さないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("連関図法", q.getAnswerList().get(0));
        Assert.assertEquals("ヒストグラム", q.getAnswerList().get(1));
        Assert.assertEquals("パレート図", q.getAnswerList().get(2));
        Assert.assertEquals("特性要因図", q.getAnswerList().get(3));
        Assert.assertEquals("層別", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(56);

        Assert.assertEquals("次の中で、ＱＣ７つ道具に属さないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ラジオペンチ", q.getAnswerList().get(0));
        Assert.assertEquals("チェックシート", q.getAnswerList().get(1));
        Assert.assertEquals("散布図", q.getAnswerList().get(2));
        Assert.assertEquals("ヒストグラム", q.getAnswerList().get(3));
        Assert.assertEquals("パレート図", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(57);

        Assert.assertEquals("原因と結果が複雑に絡み合っているときに、それらの因果関係を図の上で明らかにし、問題の状況を総合的にとらえるための手法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("連関図法", q.getAnswerList().get(0));
        Assert.assertEquals("関連図法", q.getAnswerList().get(1));
        Assert.assertEquals("因果図法", q.getAnswerList().get(2));
        Assert.assertEquals("パラダイス銀河法", q.getAnswerList().get(3));
        Assert.assertEquals("因果関係図法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(58);

        Assert.assertEquals("名前は異なるが、基本的には「ＫＪ法」と同じものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("親和図法", q.getAnswerList().get(0));
        Assert.assertEquals("連関図法", q.getAnswerList().get(1));
        Assert.assertEquals("特性要因図", q.getAnswerList().get(2));
        Assert.assertEquals("系統図法", q.getAnswerList().get(3));
        Assert.assertEquals("アロー・ダイヤグラム法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(59);

        Assert.assertEquals("ある特定の目的・目標を達成するための手段・方策を次々に展開していく技法。目標に対してツリー状の図を作成していく", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("系統図法", q.getAnswerList().get(0));
        Assert.assertEquals("親和図法", q.getAnswerList().get(1));
        Assert.assertEquals("散布図", q.getAnswerList().get(2));
        Assert.assertEquals("ＫＪ法", q.getAnswerList().get(3));
        Assert.assertEquals("ＲＤＢ法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(60);

        Assert.assertEquals("問題とする事象について、関連する２種類の項目を縦軸と横軸にとり、それぞれの交点に関連の有無や度合いを記入した図。", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マトリックス図法", q.getAnswerList().get(0));
        Assert.assertEquals("系統図法", q.getAnswerList().get(1));
        Assert.assertEquals("アロー・ダイヤグラム法", q.getAnswerList().get(2));
        Assert.assertEquals("パレート図", q.getAnswerList().get(3));
        Assert.assertEquals("ドッツ・カード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(61);

        Assert.assertEquals("マトリックス図における要素間の関連が数値で表される場合、これをわかりやすく図で表すための解析法。主成分分析法ともいう", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マトリックス・データ解析法", q.getAnswerList().get(0));
        Assert.assertEquals("マトリックス・要素間解析法", q.getAnswerList().get(1));
        Assert.assertEquals("マトリックス・要素解析法", q.getAnswerList().get(2));
        Assert.assertEquals("マトリックス・数値解析法", q.getAnswerList().get(3));
        Assert.assertEquals("マトリックス・主成分解析法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(62);

        Assert.assertEquals("ＯＲで用いられる手法。問題（事態）の進展とともに発生するであろう種々の事象に対し、あらかじめ対応策を考え図にしたもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＰＤＰＣ", q.getAnswerList().get(0));
        Assert.assertEquals("ＰＥＲＴ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＦＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＯＰＥＣ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＮＡ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(63);

        Assert.assertEquals("日程を計画する際に、進捗（しんちょく）管理を効率的に行うために用いられる図。作業の順序にしたがって矢印で表す", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アロー・ダイヤグラム法", q.getAnswerList().get(0));
        Assert.assertEquals("ハロー・キティー法", q.getAnswerList().get(1));
        Assert.assertEquals("ブロー・パーマネント法", q.getAnswerList().get(2));
        Assert.assertEquals("フロー・ヒストグラム法", q.getAnswerList().get(3));
        Assert.assertEquals("ジロー・いまさら法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(64);

        Assert.assertEquals("とりあえず試作品を作成してみて、利用者のニーズや希望を確かめながら、何度も工程を繰り返してシステムの構築を行う方式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プロトタイピング法", q.getAnswerList().get(0));
        Assert.assertEquals("ウォータフォール法", q.getAnswerList().get(1));
        Assert.assertEquals("クライアントサーバシステム", q.getAnswerList().get(2));
        Assert.assertEquals("エンジニアリングシステム", q.getAnswerList().get(3));
        Assert.assertEquals("ユーザーマネジメント技法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(65);

        Assert.assertEquals("システムを開発する場合、先に上流工程（概要）を行い、その後に詳細部分の設計や実体の開発といった下流工程へと進める方式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ウォータフォール法", q.getAnswerList().get(0));
        Assert.assertEquals("プロトタイピング法", q.getAnswerList().get(1));
        Assert.assertEquals("デシジョンテーブル法", q.getAnswerList().get(2));
        Assert.assertEquals("アロー・ダイヤグラム法", q.getAnswerList().get(3));
        Assert.assertEquals("トップダウンシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(66);

        Assert.assertEquals("ウォータフォール型モデルで、利用者の目的や要求されている仕様（機能・性能）を確かめて、システム全体を設計する工程", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("外部設計", q.getAnswerList().get(0));
        Assert.assertEquals("内部設計", q.getAnswerList().get(1));
        Assert.assertEquals("プログラム設計", q.getAnswerList().get(2));
        Assert.assertEquals("詳細設計", q.getAnswerList().get(3));
        Assert.assertEquals("プログラミング", q.getAnswerList().get(4));
    }

    private void subtest_build_genre2(IGotakuInfo gotaku) {
        IGotakuGenreInfo genre = gotaku.getGenreList().get(1);

        Assert.assertEquals("基幹システム開運", genre.getName());

        Assert.assertEquals(65, genre.getQuestionList().size());

        IGotakuQuestionInfo q = genre.getQuestionList().get(0);

        Assert.assertEquals("入力設計で注意すべきことは何か？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("標準化", q.getAnswerList().get(0));
        Assert.assertEquals("最適化", q.getAnswerList().get(1));
        Assert.assertEquals("専門化", q.getAnswerList().get(2));
        Assert.assertEquals("高度化", q.getAnswerList().get(3));
        Assert.assertEquals("暇か？", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(1);

        Assert.assertEquals("データをどのような画面で、どう入力するか設計すること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("レイアウト設計", q.getAnswerList().get(0));
        Assert.assertEquals("データ設計", q.getAnswerList().get(1));
        Assert.assertEquals("システム設計", q.getAnswerList().get(2));
        Assert.assertEquals("スケール設計", q.getAnswerList().get(3));
        Assert.assertEquals("イメージ設計", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(2);

        Assert.assertEquals("伝票データを入力画面に設計する際は、入力項目の順番と○○から○○へと順次移っていくように設計する", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("左上から右下", q.getAnswerList().get(0));
        Assert.assertEquals("右上から左下", q.getAnswerList().get(1));
        Assert.assertEquals("右上から右下", q.getAnswerList().get(2));
        Assert.assertEquals("左上から左下", q.getAnswerList().get(3));
        Assert.assertEquals("手上から足下", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(3);

        Assert.assertEquals("データ項目の編集表示の方法には、入力された項目データを○○させたり、リバースさせたりする方法をとる場合がある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ブリンク", q.getAnswerList().get(0));
        Assert.assertEquals("ブリック", q.getAnswerList().get(1));
        Assert.assertEquals("ブルックス", q.getAnswerList().get(2));
        Assert.assertEquals("ブランク", q.getAnswerList().get(3));
        Assert.assertEquals("ブリッコ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(4);

        Assert.assertEquals("ある入力項目の位置を目立たせるために、極力やってはいけない設計は何か？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("華美な画面設計", q.getAnswerList().get(0));
        Assert.assertEquals("適度な色の選定", q.getAnswerList().get(1));
        Assert.assertEquals("強調表示", q.getAnswerList().get(2));
        Assert.assertEquals("罫線を引く", q.getAnswerList().get(3));
        Assert.assertEquals("適度に目立つ項目", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(5);

        Assert.assertEquals("画面の切り替えでメニュー画面にいちいち戻らないで、別の画面に移行できるキーを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プログラムファンクションキー", q.getAnswerList().get(0));
        Assert.assertEquals("リターンキー", q.getAnswerList().get(1));
        Assert.assertEquals("チャイコフスキー", q.getAnswerList().get(2));
        Assert.assertEquals("エスケープキー", q.getAnswerList().get(3));
        Assert.assertEquals("ホームクリアーキー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(6);

        Assert.assertEquals("マウス、タッチスクリーン、ライトペンなどの入力装置を特に何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ポインティングデバイス", q.getAnswerList().get(0));
        Assert.assertEquals("イメージスキャナ", q.getAnswerList().get(1));
        Assert.assertEquals("マルチウインドウ", q.getAnswerList().get(2));
        Assert.assertEquals("ガイダンス", q.getAnswerList().get(3));
        Assert.assertEquals("トラックボール", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(7);

        Assert.assertEquals("システムを有効に利用することができるかどうかは、システムの○○が適切であるかどうかにかかっている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("出力", q.getAnswerList().get(0));
        Assert.assertEquals("入力", q.getAnswerList().get(1));
        Assert.assertEquals("学力", q.getAnswerList().get(2));
        Assert.assertEquals("体力", q.getAnswerList().get(3));
        Assert.assertEquals("握力", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(8);

        Assert.assertEquals("システムが出来上がってまずやらなければいけないことは何か", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("テスト", q.getAnswerList().get(0));
        Assert.assertEquals("レイアウト", q.getAnswerList().get(1));
        Assert.assertEquals("プリントアウト", q.getAnswerList().get(2));
        Assert.assertEquals("おはらい", q.getAnswerList().get(3));
        Assert.assertEquals("お祝い", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(9);

        Assert.assertEquals("ヒューマンインターフェースで設計しておいた、システムの各種の動きについてテストを行うことを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("機能テスト", q.getAnswerList().get(0));
        Assert.assertEquals("性能テスト", q.getAnswerList().get(1));
        Assert.assertEquals("実力テスト", q.getAnswerList().get(2));
        Assert.assertEquals("動作テスト", q.getAnswerList().get(3));
        Assert.assertEquals("期末テスト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(10);

        Assert.assertEquals("現在の業務処理の時間や状況と比較して、行うテストを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("性能テスト", q.getAnswerList().get(0));
        Assert.assertEquals("機能テスト", q.getAnswerList().get(1));
        Assert.assertEquals("運用テスト", q.getAnswerList().get(2));
        Assert.assertEquals("稼働テスト", q.getAnswerList().get(3));
        Assert.assertEquals("実力テスト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(11);

        Assert.assertEquals("操作中、コンピュータ処理中のトラブルを極力回避するために○○○○が必要である", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リカバリ", q.getAnswerList().get(0));
        Assert.assertEquals("システム", q.getAnswerList().get(1));
        Assert.assertEquals("チェック", q.getAnswerList().get(2));
        Assert.assertEquals("デバイス", q.getAnswerList().get(3));
        Assert.assertEquals("高校教師", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(12);

        Assert.assertEquals("システム運用のために定期的に処理しておかなければいけないこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("バックアップ", q.getAnswerList().get(0));
        Assert.assertEquals("ハングアップ", q.getAnswerList().get(1));
        Assert.assertEquals("セットアップ", q.getAnswerList().get(2));
        Assert.assertEquals("アップアップ", q.getAnswerList().get(3));
        Assert.assertEquals("ズームアップ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(13);

        Assert.assertEquals("システム運用のために定期的に確認しておかなければいけないこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("利用者ＩＤ", q.getAnswerList().get(0));
        Assert.assertEquals("利用者ＩＱ", q.getAnswerList().get(1));
        Assert.assertEquals("利用者ＩＣ", q.getAnswerList().get(2));
        Assert.assertEquals("利用者ＩＨ", q.getAnswerList().get(3));
        Assert.assertEquals("利用者ＩＯ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(14);

        Assert.assertEquals("企業内の全体的な活動の根幹となる、中枢的な情報システム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("基幹システム", q.getAnswerList().get(0));
        Assert.assertEquals("根幹システム", q.getAnswerList().get(1));
        Assert.assertEquals("新幹システム", q.getAnswerList().get(2));
        Assert.assertEquals("共幹システム", q.getAnswerList().get(3));
        Assert.assertEquals("短幹システム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(15);

        Assert.assertEquals("コンピュータシステムのアクセス権がある利用者かどうかを識別するもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パスワード", q.getAnswerList().get(0));
        Assert.assertEquals("キーワード", q.getAnswerList().get(1));
        Assert.assertEquals("クロスワード", q.getAnswerList().get(2));
        Assert.assertEquals("シスワード", q.getAnswerList().get(3));
        Assert.assertEquals("マニュアル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(16);

        Assert.assertEquals("ある会社が全社的に共有しているデータベースのこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("基幹データベース", q.getAnswerList().get(0));
        Assert.assertEquals("商用データベース", q.getAnswerList().get(1));
        Assert.assertEquals("利用データベース", q.getAnswerList().get(2));
        Assert.assertEquals("根幹データベース", q.getAnswerList().get(3));
        Assert.assertEquals("新幹データベース", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(17);

        Assert.assertEquals("システム利用のマニュアルは常にどうあるべきか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("最新", q.getAnswerList().get(0));
        Assert.assertEquals("最高", q.getAnswerList().get(1));
        Assert.assertEquals("細心", q.getAnswerList().get(2));
        Assert.assertEquals("最愛", q.getAnswerList().get(3));
        Assert.assertEquals("夫婦", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(18);

        Assert.assertEquals("マニュアルの更新履歴を管理する場合留意すべき点はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("変更点の記載内容", q.getAnswerList().get(0));
        Assert.assertEquals("データ処理のスピード", q.getAnswerList().get(1));
        Assert.assertEquals("ファイルのサイズ", q.getAnswerList().get(2));
        Assert.assertEquals("コピー権の設定", q.getAnswerList().get(3));
        Assert.assertEquals("データの入出力管理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(19);

        Assert.assertEquals("マニュアルの更新履歴を管理する場合留意すべき点はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("バージョン管理", q.getAnswerList().get(0));
        Assert.assertEquals("ネットワーク管理", q.getAnswerList().get(1));
        Assert.assertEquals("データ管理", q.getAnswerList().get(2));
        Assert.assertEquals("ファイル管理", q.getAnswerList().get(3));
        Assert.assertEquals("タスク管理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(20);

        Assert.assertEquals("マニュアルの更新履歴を管理する場合、留意すべき点はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("関係者への周知徹底", q.getAnswerList().get(0));
        Assert.assertEquals("購入者への周知徹底", q.getAnswerList().get(1));
        Assert.assertEquals("販売者への周知徹底", q.getAnswerList().get(2));
        Assert.assertEquals("購読者への周知徹底", q.getAnswerList().get(3));
        Assert.assertEquals("無礼者への周知徹底", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(21);

        Assert.assertEquals("マニュアルの更新履歴を管理する場合、留意すべき点はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("定期的な利用状況の点検", q.getAnswerList().get(0));
        Assert.assertEquals("定期的な製品名の点検", q.getAnswerList().get(1));
        Assert.assertEquals("定期的なパスワードの点検", q.getAnswerList().get(2));
        Assert.assertEquals("定期的なバス運行の点検", q.getAnswerList().get(3));
        Assert.assertEquals("定期的な媒体変換の点検", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(22);

        Assert.assertEquals("データ項目を編集する場合、特に考慮しなくてもよいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("福女商の教育課程", q.getAnswerList().get(0));
        Assert.assertEquals("左寄せ・右寄せ", q.getAnswerList().get(1));
        Assert.assertEquals("小数点の表示位置", q.getAnswerList().get(2));
        Assert.assertEquals("ブリンク（点滅）", q.getAnswerList().get(3));
        Assert.assertEquals("リバース（白黒反転表示）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(23);

        Assert.assertEquals("入力操作の定義において、特に考慮しなくてもよいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＨＰの利活用", q.getAnswerList().get(0));
        Assert.assertEquals("カーソルの移動順序", q.getAnswerList().get(1));
        Assert.assertEquals("色や罫線の利活用", q.getAnswerList().get(2));
        Assert.assertEquals("ヘルプ機能の利活用", q.getAnswerList().get(3));
        Assert.assertEquals("音声・警告音の利活用", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(24);

        Assert.assertEquals("帳票設計においては、どのようなレイアウトにするかが大切であるが、その場合の留意点として特に考慮しなくてもよいものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("池田先生の生年月日", q.getAnswerList().get(0));
        Assert.assertEquals("出力項目", q.getAnswerList().get(1));
        Assert.assertEquals("出力内容のソート順", q.getAnswerList().get(2));
        Assert.assertEquals("全体のイメージ", q.getAnswerList().get(3));
        Assert.assertEquals("文字の大きさや字体", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(25);

        Assert.assertEquals("出力設計では、認識しやすさが大きなポイントの一つになるが、次の中で特に考慮する必要のない項目はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("消費電力", q.getAnswerList().get(0));
        Assert.assertEquals("文字の大きさ", q.getAnswerList().get(1));
        Assert.assertEquals("字体", q.getAnswerList().get(2));
        Assert.assertEquals("罫線などの太さ", q.getAnswerList().get(3));
        Assert.assertEquals("シャドウ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(26);

        Assert.assertEquals("ユーザ部門として、構築されたシステムに最も期待すべきことは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("正常な動作の持続", q.getAnswerList().get(0));
        Assert.assertEquals("処理スピードの速さ", q.getAnswerList().get(1));
        Assert.assertEquals("大量データの処理", q.getAnswerList().get(2));
        Assert.assertEquals("操作方法の簡略化", q.getAnswerList().get(3));
        Assert.assertEquals("操作方法のヘルプ機能", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(27);

        Assert.assertEquals("構築されたシステムのテストに使用されるデータ。異常データも作成すべきである", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("テストデータ", q.getAnswerList().get(0));
        Assert.assertEquals("ラストデータ", q.getAnswerList().get(1));
        Assert.assertEquals("システムデータ", q.getAnswerList().get(2));
        Assert.assertEquals("月が出たデータ", q.getAnswerList().get(3));
        Assert.assertEquals("バックアップデータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(28);

        Assert.assertEquals("構築されたシステムで、どのようなテストを行うかの種類を示したもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("テストパターン", q.getAnswerList().get(0));
        Assert.assertEquals("ラストシーン", q.getAnswerList().get(1));
        Assert.assertEquals("ハッチングパターン", q.getAnswerList().get(2));
        Assert.assertEquals("テストラン", q.getAnswerList().get(3));
        Assert.assertEquals("ピックアップ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(29);

        Assert.assertEquals("ユーザ部門として、構築されたシステムの本稼働の前に特にやらなくてもよいものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("システムのメンテナンス", q.getAnswerList().get(0));
        Assert.assertEquals("取扱いデータ量のチェック", q.getAnswerList().get(1));
        Assert.assertEquals("データ処理能力のチェック", q.getAnswerList().get(2));
        Assert.assertEquals("応答時間のチェック", q.getAnswerList().get(3));
        Assert.assertEquals("基本設計書の仕様どおりか", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(30);

        Assert.assertEquals("テストデータを作成する場合、マスターデータではなくトランザクションデータとして作成すべきものは、次の中ではどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("単価", q.getAnswerList().get(0));
        Assert.assertEquals("得意先名", q.getAnswerList().get(1));
        Assert.assertEquals("住所", q.getAnswerList().get(2));
        Assert.assertEquals("ＦＡＸ番号", q.getAnswerList().get(3));
        Assert.assertEquals("電話番号", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(31);

        Assert.assertEquals("テストデータを作成する場合、異常データも作成するが、次の中でどれが異常データでないか？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("取扱商品の仕入れ", q.getAnswerList().get(0));
        Assert.assertEquals("貸借金額の不一致", q.getAnswerList().get(1));
        Assert.assertEquals("会計期間以外の仕訳伝票", q.getAnswerList().get(2));
        Assert.assertEquals("在庫数量以上の売り上げ", q.getAnswerList().get(3));
        Assert.assertEquals("存在しない科目の仕訳", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(32);

        Assert.assertEquals("機能テストの内容として取り上げられない項目はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("処理のスピード", q.getAnswerList().get(0));
        Assert.assertEquals("画面レイアウト", q.getAnswerList().get(1));
        Assert.assertEquals("帳票レイアウト", q.getAnswerList().get(2));
        Assert.assertEquals("処理のロジック", q.getAnswerList().get(3));
        Assert.assertEquals("　", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(33);

        Assert.assertEquals("テスト結果の検収時に、検収内容を整理して作成した書類", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("テスト成績書", q.getAnswerList().get(0));
        Assert.assertEquals("通知表", q.getAnswerList().get(1));
        Assert.assertEquals("検収報告書", q.getAnswerList().get(2));
        Assert.assertEquals("検査証明書", q.getAnswerList().get(3));
        Assert.assertEquals("確定申告書", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(34);

        Assert.assertEquals("テスト成績書に記入する検収項目として、異質なもはのどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("バックアップ方法", q.getAnswerList().get(0));
        Assert.assertEquals("品質の確認", q.getAnswerList().get(1));
        Assert.assertEquals("トラブル発生頻度", q.getAnswerList().get(2));
        Assert.assertEquals("性能の確認", q.getAnswerList().get(3));
        Assert.assertEquals("リカバリ方法の有無", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(35);

        Assert.assertEquals("システムの円滑な運用を行う場合の、処理スケジュールの内容と異質なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("メンテナンスをしない", q.getAnswerList().get(0));
        Assert.assertEquals("データ入力の締切時間", q.getAnswerList().get(1));
        Assert.assertEquals("バッチ処理の実行時間", q.getAnswerList().get(2));
        Assert.assertEquals("日次処理", q.getAnswerList().get(3));
        Assert.assertEquals("月次処理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(36);

        Assert.assertEquals("ＳＡＤは、システムの利用状況について特に注意して把握しておくべきであるが、それと異質なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチメディアの技術動向", q.getAnswerList().get(0));
        Assert.assertEquals("システム利用上の不具合の記録", q.getAnswerList().get(1));
        Assert.assertEquals("マスタのファイルサイズ", q.getAnswerList().get(2));
        Assert.assertEquals("データ量の急激な増大", q.getAnswerList().get(3));
        Assert.assertEquals("システムの利用者", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(37);

        Assert.assertEquals("ＳＡＤは、一般の利用者がシステムを円滑に運用できるよう考慮すべきであるが、次の中でＳＡＤが自ら行うべきでないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("基幹システムの再構築", q.getAnswerList().get(0));
        Assert.assertEquals("重要ファイルのバックアップ", q.getAnswerList().get(1));
        Assert.assertEquals("データのアップロードの確認", q.getAnswerList().get(2));
        Assert.assertEquals("データのダウンロードの確認", q.getAnswerList().get(3));
        Assert.assertEquals("利用者ＩＤ・パスワードの確認", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(38);

        Assert.assertEquals("システムの利用マニュアルは、利用の主体者が積極的に作成することが望ましい。それについて特に明記しなくてもよいものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("得意先", q.getAnswerList().get(0));
        Assert.assertEquals("禁止事項", q.getAnswerList().get(1));
        Assert.assertEquals("人員体制", q.getAnswerList().get(2));
        Assert.assertEquals("業務の流れ", q.getAnswerList().get(3));
        Assert.assertEquals("運用上の諸注意", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(39);

        Assert.assertEquals("情報システムを設計する上で大事なことはユーザが満足することであるが、それとは異質なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ゲーム感覚で面白みがある", q.getAnswerList().get(0));
        Assert.assertEquals("希望のデータが出力可能", q.getAnswerList().get(1));
        Assert.assertEquals("情報の品質が高い", q.getAnswerList().get(2));
        Assert.assertEquals("操作性がよい", q.getAnswerList().get(3));
        Assert.assertEquals("費用が安い", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(40);

        Assert.assertEquals("基幹システムの開発を担当するのはどこ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("情報システム部門", q.getAnswerList().get(0));
        Assert.assertEquals("情報処理部門", q.getAnswerList().get(1));
        Assert.assertEquals("エンドユーザ部門", q.getAnswerList().get(2));
        Assert.assertEquals("情報リーダー部門", q.getAnswerList().get(3));
        Assert.assertEquals("福女商の第１学年部", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(41);

        Assert.assertEquals("基幹システムの開発におけるＳＡＤの役割りとして正しくないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("システム開発の一員となる", q.getAnswerList().get(0));
        Assert.assertEquals("ユーザ調査への協力", q.getAnswerList().get(1));
        Assert.assertEquals("ヒューマンインタフェース設計", q.getAnswerList().get(2));
        Assert.assertEquals("システムのテストと検収・評価", q.getAnswerList().get(3));
        Assert.assertEquals("システム運用とユーザとの接触", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(42);

        Assert.assertEquals("システム化を考える業務の調査を行うために、実際に使っている伝票類・帳票類・マニュアル類などすべての資料を収集すること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("資料収集", q.getAnswerList().get(0));
        Assert.assertEquals("事例研究", q.getAnswerList().get(1));
        Assert.assertEquals("事例集め", q.getAnswerList().get(2));
        Assert.assertEquals("コレクション", q.getAnswerList().get(3));
        Assert.assertEquals("資料押収", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(43);

        Assert.assertEquals("調査方法の一つ。全体の意見を把握するのによい。無記名にすると言いにくいことも書けるが、反面隠れた問題点を発見しにくい", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アンケート", q.getAnswerList().get(0));
        Assert.assertEquals("集団面接", q.getAnswerList().get(1));
        Assert.assertEquals("集団疎開", q.getAnswerList().get(2));
        Assert.assertEquals("個人面接", q.getAnswerList().get(3));
        Assert.assertEquals("ＫＪ法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(44);

        Assert.assertEquals("調査方法の一つ。全体の意見を把握するのに時間がかかるが、隠れた問題点を発見しやすい。警戒心を解きほぐすことが必要", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("面接", q.getAnswerList().get(0));
        Assert.assertEquals("アンケート", q.getAnswerList().get(1));
        Assert.assertEquals("ＫＪ法", q.getAnswerList().get(2));
        Assert.assertEquals("ＮＯＭＡ", q.getAnswerList().get(3));
        Assert.assertEquals("事例研究", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(45);

        Assert.assertEquals("現状業務の整理の方法として、業務手続きをチャートにしておくことがあるが、このチャートの方法で実際に存在しないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("七田式", q.getAnswerList().get(0));
        Assert.assertEquals("ＮＯＭＡ式", q.getAnswerList().get(1));
        Assert.assertEquals("能大式", q.getAnswerList().get(2));
        Assert.assertEquals("ＪＭＡ式", q.getAnswerList().get(3));
        Assert.assertEquals("ＩＴＴ式", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(46);

        Assert.assertEquals("入力設計における画面レイアウトデザインのポイントとして、最も重要なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デフォルト値", q.getAnswerList().get(0));
        Assert.assertEquals("血糖値", q.getAnswerList().get(1));
        Assert.assertEquals("あっち", q.getAnswerList().get(2));
        Assert.assertEquals("ＧＯＴ値", q.getAnswerList().get(3));
        Assert.assertEquals("インサート値", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(47);

        Assert.assertEquals("入力設計における画面レイアウトデザインのポイントとして、最も重要なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＰＦキー", q.getAnswerList().get(0));
        Assert.assertEquals("エスケープキー", q.getAnswerList().get(1));
        Assert.assertEquals("コントロールキー", q.getAnswerList().get(2));
        Assert.assertEquals("ヤンキー", q.getAnswerList().get(3));
        Assert.assertEquals("リターンキー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(48);

        Assert.assertEquals("コード設計におけるコードの種類の一つ。先頭から順番に番号を付けていく方法で、桁数は少ないが後で途中への挿入が難しい", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("シーケンスコード", q.getAnswerList().get(0));
        Assert.assertEquals("桁別コード", q.getAnswerList().get(1));
        Assert.assertEquals("グループ分類コード", q.getAnswerList().get(2));
        Assert.assertEquals("じゃじゃまるコード", q.getAnswerList().get(3));
        Assert.assertEquals("デシマルコード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(49);

        Assert.assertEquals("コード設計におけるコードの種類の一つ。大分類・中分類・小分類を桁ごとに表す方法で、桁数が長くなるのが欠点", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("桁別コード", q.getAnswerList().get(0));
        Assert.assertEquals("延長コード", q.getAnswerList().get(1));
        Assert.assertEquals("格別コード", q.getAnswerList().get(2));
        Assert.assertEquals("１０進コード", q.getAnswerList().get(3));
        Assert.assertEquals("連番コード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(50);

        Assert.assertEquals("コード設計におけるコードの種類の一つ。図書分類に使われる。下位分類するごとに桁が増えるためコンピュータ処理がしにくい", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デシマルコード", q.getAnswerList().get(0));
        Assert.assertEquals("じゃじゃまるコード", q.getAnswerList().get(1));
        Assert.assertEquals("ぴっころコード", q.getAnswerList().get(2));
        Assert.assertEquals("ポロリコード", q.getAnswerList().get(3));
        Assert.assertEquals("レッシーコード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(51);

        Assert.assertEquals("値の変化の度合いが少ない項目で構成されるもので、業務処理に対して永続性があるファイル", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マスタファイル", q.getAnswerList().get(0));
        Assert.assertEquals("発生ファイル", q.getAnswerList().get(1));
        Assert.assertEquals("トランザクションファイル", q.getAnswerList().get(2));
        Assert.assertEquals("累積ファイル", q.getAnswerList().get(3));
        Assert.assertEquals("ワークファイル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(52);

        Assert.assertEquals("分類（ソート）処理などにおける作業用ファイルや、プログラム間の中間ファイル", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワークファイル", q.getAnswerList().get(0));
        Assert.assertEquals("マスタファイル", q.getAnswerList().get(1));
        Assert.assertEquals("バックアップファイル", q.getAnswerList().get(2));
        Assert.assertEquals("トランザクションファイル", q.getAnswerList().get(3));
        Assert.assertEquals("累積ファイル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(53);

        Assert.assertEquals("「ファイル」は物理的アクセスの単位である「ＩＢＧ＋（　　）」で構成される", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ブロック", q.getAnswerList().get(0));
        Assert.assertEquals("セクタ", q.getAnswerList().get(1));
        Assert.assertEquals("フィールド", q.getAnswerList().get(2));
        Assert.assertEquals("レコード", q.getAnswerList().get(3));
        Assert.assertEquals("アイテム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(54);

        Assert.assertEquals("６行／インチ用が一般的で、帳票設計に用いられる方眼紙のようなもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スペーシングチャート", q.getAnswerList().get(0));
        Assert.assertEquals("スペースシャトル", q.getAnswerList().get(1));
        Assert.assertEquals("コーディングシート", q.getAnswerList().get(2));
        Assert.assertEquals("プログラムシート", q.getAnswerList().get(3));
        Assert.assertEquals("フォノシート", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(55);

        Assert.assertEquals("入力された値が「数値」であるかをチェックする方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ニューメリックチェック", q.getAnswerList().get(0));
        Assert.assertEquals("リミットチェック", q.getAnswerList().get(1));
        Assert.assertEquals("マッチングチェック", q.getAnswerList().get(2));
        Assert.assertEquals("カウントチェック", q.getAnswerList().get(3));
        Assert.assertEquals("パリティチェック", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(56);

        Assert.assertEquals("入力された値が、「ある範囲内にあるかどうか」をチェックする方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リミットチェック", q.getAnswerList().get(0));
        Assert.assertEquals("股ズレチェック", q.getAnswerList().get(1));
        Assert.assertEquals("桁ズレチェック", q.getAnswerList().get(2));
        Assert.assertEquals("サイトチェック", q.getAnswerList().get(3));
        Assert.assertEquals("検問", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(57);

        Assert.assertEquals("コードの最後に１桁分の余分のコードを付加し、入力した時点である計算を行い結果が一致したかを確認するチェックの方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("チェックディジットチェック", q.getAnswerList().get(0));
        Assert.assertEquals("チックタックボーンボン", q.getAnswerList().get(1));
        Assert.assertEquals("ダブルレコードチェック", q.getAnswerList().get(2));
        Assert.assertEquals("シーケンスチェック", q.getAnswerList().get(3));
        Assert.assertEquals("ニューメリックチェック", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(58);

        Assert.assertEquals("ソフトウェア開発を支援するソフトウェアツール群", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＡＳＥツール", q.getAnswerList().get(0));
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(1));
        Assert.assertEquals("制御プログラム", q.getAnswerList().get(2));
        Assert.assertEquals("ユーティリティープログラム", q.getAnswerList().get(3));
        Assert.assertEquals("パスツール", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(59);

        Assert.assertEquals("ソフトウェア開発を支援するソフトウェア群をＣＡＳＥツールと言うが、このツールとして存在しないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("分割ＣＡＳＥ", q.getAnswerList().get(0));
        Assert.assertEquals("上流ＣＡＳＥ", q.getAnswerList().get(1));
        Assert.assertEquals("下流ＣＡＳＥ", q.getAnswerList().get(2));
        Assert.assertEquals("保守ＣＡＳＥ", q.getAnswerList().get(3));
        Assert.assertEquals("統合ＣＡＳＥ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(60);

        Assert.assertEquals("プログラムをいくつかの機能ごとに分けること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("モジュール分割", q.getAnswerList().get(0));
        Assert.assertEquals("プログラム分割", q.getAnswerList().get(1));
        Assert.assertEquals("機能分解", q.getAnswerList().get(2));
        Assert.assertEquals("メインルーチン化", q.getAnswerList().get(3));
        Assert.assertEquals("ルーチン分割", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(61);

        Assert.assertEquals("流れ図記号の一つ。他の場所からの入口や他への出口を表すもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("結合子", q.getAnswerList().get(0));
        Assert.assertEquals("端子", q.getAnswerList().get(1));
        Assert.assertEquals("入出力", q.getAnswerList().get(2));
        Assert.assertEquals("一方通行", q.getAnswerList().get(3));
        Assert.assertEquals("進入禁止", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(62);

        Assert.assertEquals("流れ図記号の一つ。繰り返しの始めを表すもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ループ始端", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＦ", q.getAnswerList().get(1));
        Assert.assertEquals("処理", q.getAnswerList().get(2));
        Assert.assertEquals("端子", q.getAnswerList().get(3));
        Assert.assertEquals("始め", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(63);

        Assert.assertEquals("次の中で、モジュール分割技法に関係のない用語はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＦＤ法", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＴＳ分割技法", q.getAnswerList().get(1));
        Assert.assertEquals("ワーニエ法", q.getAnswerList().get(2));
        Assert.assertEquals("ジャクソン法", q.getAnswerList().get(3));
        Assert.assertEquals("　", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(64);

        Assert.assertEquals("テストデータを想定し流れ図を机上で実行させて、正しい結果が出るかどうかを確認する作業", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("トレース", q.getAnswerList().get(0));
        Assert.assertEquals("テストラン", q.getAnswerList().get(1));
        Assert.assertEquals("デバッグ", q.getAnswerList().get(2));
        Assert.assertEquals("チャート", q.getAnswerList().get(3));
        Assert.assertEquals("ワカラン", q.getAnswerList().get(4));
    }

    private void subtest_build_genre3(IGotakuInfo gotaku) {
        IGotakuGenreInfo genre = gotaku.getGenreList().get(2);

        Assert.assertEquals("ＥＵＣ・オフィス", genre.getName());

        Assert.assertEquals(116, genre.getQuestionList().size());

        IGotakuQuestionInfo q = genre.getQuestionList().get(0);

        Assert.assertEquals("現在のコンピュータのもととなる、１９４６年に開発された世界最初のコンピュータ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＮＩＡＣ", q.getAnswerList().get(0));
        Assert.assertEquals("ＥＤＳＡＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＵＮＩＶＡＣ", q.getAnswerList().get(2));
        Assert.assertEquals("江戸幕府", q.getAnswerList().get(3));
        Assert.assertEquals("ＫＡＭＡＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(1);

        Assert.assertEquals("ＥＮＩＡＣ（エニアック）は、演算素子として何を使っていた？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("真空管", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＣ", q.getAnswerList().get(1));
        Assert.assertEquals("トランジスタ", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＳＩ", q.getAnswerList().get(3));
        Assert.assertEquals("ソロバン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(2);

        Assert.assertEquals("「真空管・ＬＳＩ・ＩＣ・トランジスタ」の演算素子で、古い順に並んでいるのはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("真空管・トラ～・ＩＣ・ＬＳＩ", q.getAnswerList().get(0));
        Assert.assertEquals("真空管・ＩＣ・トラ～・ＬＳＩ", q.getAnswerList().get(1));
        Assert.assertEquals("トラ～・真空管・ＩＣ・ＬＳＩ", q.getAnswerList().get(2));
        Assert.assertEquals("トラ～・ＩＣ・真空管・ＬＳＩ", q.getAnswerList().get(3));
        Assert.assertEquals("ＩＣ・真空管・トラ～・ＬＳＩ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(3);

        Assert.assertEquals("次の中で正しい組み合わせは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＩＣ＝第３世代コンピュータ", q.getAnswerList().get(0));
        Assert.assertEquals("真空管＝第２世代コンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("ＬＳＩ＝第５世代コンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("トランジスタ＝第１世代コン～", q.getAnswerList().get(3));
        Assert.assertEquals("真空管＝第４世代コンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(4);

        Assert.assertEquals("汎用コンピュータは、またの名を何と呼ばれる？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("メインフレームコンピュータ", q.getAnswerList().get(0));
        Assert.assertEquals("ミニコンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("スーパーコンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("オフィスコンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(5);

        Assert.assertEquals("世界で最初に開発されたワークステーション", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａｌｔｏ（アルト）", q.getAnswerList().get(0));
        Assert.assertEquals("ＦＡＣＯＭ（ファコム）", q.getAnswerList().get(1));
        Assert.assertEquals("ＥＮＩＡＣ（エニアック）", q.getAnswerList().get(2));
        Assert.assertEquals("Ａｐｐｌｅ－Ｉ（アップル）", q.getAnswerList().get(3));
        Assert.assertEquals("ＵＮＩＶＡＣ－Ｉ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(6);

        Assert.assertEquals("世界最初のワークステーション「Ａｌｔｏ」（アルト）は、どこの会社が開発したものか？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＸＥＲＯＸ（ゼロックス）社", q.getAnswerList().get(0));
        Assert.assertEquals("マイクロソフト社", q.getAnswerList().get(1));
        Assert.assertEquals("ロータス社", q.getAnswerList().get(2));
        Assert.assertEquals("ジャストシステム社", q.getAnswerList().get(3));
        Assert.assertEquals("スズキ社", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(7);

        Assert.assertEquals("パソコンＬＡＮのサーバとしてよく利用されるコンピュータ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(0));
        Assert.assertEquals("ファミリーコンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("スーパーコンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("汎用コンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("オフィスコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(8);

        Assert.assertEquals("１９７１年、インテル社から発表された世界初の４ビット・マイクロプロセッサの名前は何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ｉ４００４", q.getAnswerList().get(0));
        Assert.assertEquals("ｉ８０８０", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＣ６８００", q.getAnswerList().get(2));
        Assert.assertEquals("Ｚ－８０", q.getAnswerList().get(3));
        Assert.assertEquals("Ｐｅｎｔｉｕｍ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(9);

        Assert.assertEquals("１９７１年、インテル社から発表された世界初のものとは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("４ビットマイクロプロセッサ", q.getAnswerList().get(0));
        Assert.assertEquals("８ビットマイクロプロセッサ", q.getAnswerList().get(1));
        Assert.assertEquals("１６ビットマイクロプロセッサ", q.getAnswerList().get(2));
        Assert.assertEquals("３２ビットマイクロプロセッサ", q.getAnswerList().get(3));
        Assert.assertEquals("２ビットマイクロプロセッサ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(10);

        Assert.assertEquals("１９７１年に発表された、世界初の４ビット・マイクロプロセッサはどこの製品？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インテル社", q.getAnswerList().get(0));
        Assert.assertEquals("モトローラ社", q.getAnswerList().get(1));
        Assert.assertEquals("ザイログ社", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＢＭ社", q.getAnswerList().get(3));
        Assert.assertEquals("アップル社", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(11);

        Assert.assertEquals("アップル社の有名なパソコンと言えば何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マッキントッシュ", q.getAnswerList().get(0));
        Assert.assertEquals("ＦＭ－Ｔｏｗｎｓ", q.getAnswerList().get(1));
        Assert.assertEquals("ＰＣ－９８２１", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＢＭ－ＰＣ", q.getAnswerList().get(3));
        Assert.assertEquals("ダイナブック", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(12);

        Assert.assertEquals("１９９２年、アメリカで発表された有名なＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＳ－ＤＯＳ５．０", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＰＭ／８６", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＢＭ－ＯＳ２", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＯＳ／Ｖ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(13);

        Assert.assertEquals("１９９１年、米アップル社が発表したＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｓｙｓｔｅｍ７．０", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＳ－ＤＯＳ５．０", q.getAnswerList().get(1));
        Assert.assertEquals("ＯＳ／２", q.getAnswerList().get(2));
        Assert.assertEquals("Ｗｉｎｄｏｗｓ３．１", q.getAnswerList().get(3));
        Assert.assertEquals("ＷｉｎｄｏｗｓＮＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(14);

        Assert.assertEquals("ハードウェアを動かす基本的なソフトウェアを一般に何というか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オペレーティングシステム", q.getAnswerList().get(0));
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(1));
        Assert.assertEquals("グループウェア", q.getAnswerList().get(2));
        Assert.assertEquals("ユーティリティーソフト", q.getAnswerList().get(3));
        Assert.assertEquals("オーサリングソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(15);

        Assert.assertEquals("１９９４年現在、世界で圧倒的に広く使われている、汎用機用のＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＶＳ（エムブイエス）", q.getAnswerList().get(0));
        Assert.assertEquals("ＵＮＩＸ（ユニックス）", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＳ－ＤＯＳ（エムエスドス）", q.getAnswerList().get(2));
        Assert.assertEquals("ＯＳ／２（オーエスツー）", q.getAnswerList().get(3));
        Assert.assertEquals("Ｓｙｓｔｅｍ７（システム７）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(16);

        Assert.assertEquals("１９９４年現在、世界で圧倒的に広く使われている、ミニコン・ワークステーション用のＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＵＮＩＸ（ユニックス）", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＶＳ（エムブイエス）", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＳ－ＤＯＳ（エムエスドス）", q.getAnswerList().get(2));
        Assert.assertEquals("ＯＳ／２（オーエスツー）", q.getAnswerList().get(3));
        Assert.assertEquals("Ｗｉｎｄｏｗｓ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(17);

        Assert.assertEquals("１９９４年現在、世界で圧倒的に広く使われている、パソコン用のＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳ－ＤＯＳ（エムエスドス）", q.getAnswerList().get(0));
        Assert.assertEquals("ＵＮＩＸ（ユニックス）", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＶＳ（エムブイエス）", q.getAnswerList().get(2));
        Assert.assertEquals("ＯＳ／２（オーエスツー）", q.getAnswerList().get(3));
        Assert.assertEquals("漢字Ｔａｌｋ７", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(18);

        Assert.assertEquals("マイクロソフト社が開発したパソコンの代表的な１６ビットＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳ－ＤＯＳ（エムエスドス）", q.getAnswerList().get(0));
        Assert.assertEquals("ＵＮＩＸ（ユニックス）", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＶＳ（エムブイエス）", q.getAnswerList().get(2));
        Assert.assertEquals("ＯＳ／２（オーエスツー）", q.getAnswerList().get(3));
        Assert.assertEquals("ＷｉｎｄｏｗｓＮＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(19);

        Assert.assertEquals("ＭＳ－ＤＯＳ上で、ＧＵＩを実現するためのマイクロソフト社のＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｗｉｎｄｏｗｓ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＯＳ／Ｖ", q.getAnswerList().get(1));
        Assert.assertEquals("ＯＳ／２", q.getAnswerList().get(2));
        Assert.assertEquals("Ｓｙｓｔｅｍ７", q.getAnswerList().get(3));
        Assert.assertEquals("漢字Ｔａｌｋ７", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(20);

        Assert.assertEquals("次のＯＳの中で、パソコン用のＯＳでないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＶＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＳ－ＤＯＳ", q.getAnswerList().get(1));
        Assert.assertEquals("Ｗｉｎｄｏｗｓ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＯＳ／Ｖ", q.getAnswerList().get(3));
        Assert.assertEquals("ＯＳ／２", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(21);

        Assert.assertEquals("次のＯＳの中で、パソコン用のＯＳはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｓｙｓｔｅｍ７", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＶＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＶＭＳ", q.getAnswerList().get(2));
        Assert.assertEquals("ＡＣＯＳ－４", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳＰ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(22);

        Assert.assertEquals("ＩＢＭ社が開発した、マルチタスク・ＧＵＩの３２ビットＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＳ／２", q.getAnswerList().get(0));
        Assert.assertEquals("漢字Ｔａｌｋ７", q.getAnswerList().get(1));
        Assert.assertEquals("ＵＮＩＸ", q.getAnswerList().get(2));
        Assert.assertEquals("Ｗｉｎｄｏｗｓ３．１", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳ－ＤＯＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(23);

        Assert.assertEquals("次のハードウェアの中で、主にＵＮＩＸをＯＳとしているものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(0));
        Assert.assertEquals("汎用コンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("オフィスコンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("パーソナルコンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("スーパーコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(24);

        Assert.assertEquals("１９６９年、米国ＡＴ＆Ｔ社のベル研究所開発されたＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＵＮＩＸ", q.getAnswerList().get(0));
        Assert.assertEquals("ＯＳ／２", q.getAnswerList().get(1));
        Assert.assertEquals("Ｓｙｓｔｅｍ７", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＯＳ／Ｖ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＰＭ／８６", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(25);

        Assert.assertEquals("１９６９年、ＵＮＩＸというＯＳを開発したのは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("米ＡＴ＆Ｔ社（ベル研究所）", q.getAnswerList().get(0));
        Assert.assertEquals("米ＸＥＲＯＸ社", q.getAnswerList().get(1));
        Assert.assertEquals("米モトローラ社", q.getAnswerList().get(2));
        Assert.assertEquals("米インテリ（？）社", q.getAnswerList().get(3));
        Assert.assertEquals("米ＩＢＭ社", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(26);

        Assert.assertEquals("ＵＮＩＸというＯＳはどんな言語で書かれている？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｃ", q.getAnswerList().get(0));
        Assert.assertEquals("アセンブラ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＯＢＯＬ８５", q.getAnswerList().get(2));
        Assert.assertEquals("ＢＡＳＩＣ", q.getAnswerList().get(3));
        Assert.assertEquals("マシン語", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(27);

        Assert.assertEquals("１９９３年に、アメリカのマイクロソフト社が発表したＭＳ－ＤＯＳのバージョンは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳ－ＤＯＳ６．１", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＳ－ＤＯＳ３．３Ｄ", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＳ－ＤＯＳ５．１", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＳ－ＤＯＳ５．０", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳ－ＤＯＳ３．３Ａ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(28);

        Assert.assertEquals("対話型処理システムの操作性の向上のために、画面に表示する絵文字（図形）やパターン", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アイコン", q.getAnswerList().get(0));
        Assert.assertEquals("プルダウンメニュー", q.getAnswerList().get(1));
        Assert.assertEquals("ウインドウ", q.getAnswerList().get(2));
        Assert.assertEquals("ホップアップメニュー", q.getAnswerList().get(3));
        Assert.assertEquals("チャート", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(29);

        Assert.assertEquals("マウスの左ボタンをすばやく１回押す操作", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("クリック", q.getAnswerList().get(0));
        Assert.assertEquals("ドラッグ", q.getAnswerList().get(1));
        Assert.assertEquals("クリニック", q.getAnswerList().get(2));
        Assert.assertEquals("クリッワ", q.getAnswerList().get(3));
        Assert.assertEquals("タッチング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(30);

        Assert.assertEquals("マウスの左ボタンをすばやく２回押す操作", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ダブルクリック", q.getAnswerList().get(0));
        Assert.assertEquals("ドラッグ", q.getAnswerList().get(1));
        Assert.assertEquals("クリニック", q.getAnswerList().get(2));
        Assert.assertEquals("ダブルドリブル", q.getAnswerList().get(3));
        Assert.assertEquals("クリック", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(31);

        Assert.assertEquals("マウスの左ボタンを押したまま、マウスを移動させ画面上の位置を変化させる操作", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ドラッグ", q.getAnswerList().get(0));
        Assert.assertEquals("ダブルクリック", q.getAnswerList().get(1));
        Assert.assertEquals("クリニック", q.getAnswerList().get(2));
        Assert.assertEquals("クリック", q.getAnswerList().get(3));
        Assert.assertEquals("プレス", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(32);

        Assert.assertEquals("グラフィックスを多用した、人間にとって操作しやすい環境を提供するコンピュータとの接点", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＧＵＩ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＡＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＩＳＯ", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＨＡ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＤ－Ｇ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(33);

        Assert.assertEquals("最初に発表されたパソコンの表計算ソフトは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ビジカルク", q.getAnswerList().get(0));
        Assert.assertEquals("ＬＯＴＵＳ１２３", q.getAnswerList().get(1));
        Assert.assertEquals("マルチプラン", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＸＣＥＬ", q.getAnswerList().get(3));
        Assert.assertEquals("アシストカマック", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(34);

        Assert.assertEquals("次の中で、表計算ソフトでないものはどれか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＡＳＹＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＬＯＴＵＳ１２３", q.getAnswerList().get(1));
        Assert.assertEquals("マルチプラン", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＸＣＥＬ", q.getAnswerList().get(3));
        Assert.assertEquals("アシストカルク", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(35);

        Assert.assertEquals("次の中で、特にワークステーション用に利用されるデータベースソフトはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ｉｎｆｏｒｍｉｘ", q.getAnswerList().get(0));
        Assert.assertEquals("ｄＢＡＳＥⅢ", q.getAnswerList().get(1));
        Assert.assertEquals("ｄＢＡＳＥⅣ", q.getAnswerList().get(2));
        Assert.assertEquals("桐", q.getAnswerList().get(3));
        Assert.assertEquals("Ｔｈｅ・ｃａｒｄ３", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(36);

        Assert.assertEquals("次の中で、定型業務パッケージソフトと言えるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("販売管理ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＡＤソフト", q.getAnswerList().get(2));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(3));
        Assert.assertEquals("シミュレーションソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(37);

        Assert.assertEquals("次の中で、非定型業務パッケージソフトと言えるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＡＤソフト", q.getAnswerList().get(0));
        Assert.assertEquals("販売管理ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ユーティリティーソフト", q.getAnswerList().get(2));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(3));
        Assert.assertEquals("財務会計ソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(38);

        Assert.assertEquals("１台のコンピュータですべてのデータ処理を行う処理形態", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("集中処理", q.getAnswerList().get(0));
        Assert.assertEquals("分散処理", q.getAnswerList().get(1));
        Assert.assertEquals("分割処理", q.getAnswerList().get(2));
        Assert.assertEquals("時分割処理", q.getAnswerList().get(3));
        Assert.assertEquals("リアルタイム処理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(39);

        Assert.assertEquals("ひとつの業務を分割して、複数のコンピュータに仕事を割り振って処理する形態", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("分散処理", q.getAnswerList().get(0));
        Assert.assertEquals("集中処理", q.getAnswerList().get(1));
        Assert.assertEquals("時分割処理", q.getAnswerList().get(2));
        Assert.assertEquals("リアルタイム処理", q.getAnswerList().get(3));
        Assert.assertEquals("バッチ処理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(40);

        Assert.assertEquals("データ処理において、次の中で「集中処理」の形態を採用すべきでないケースはどれか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リスクの分散を図りたいとき", q.getAnswerList().get(0));
        Assert.assertEquals("強いＣＰＵパワーが必要なとき", q.getAnswerList().get(1));
        Assert.assertEquals("全データを一括処理するとき", q.getAnswerList().get(2));
        Assert.assertEquals("オンラインリアルタイム処理", q.getAnswerList().get(3));
        Assert.assertEquals("入出力データが膨大なとき", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(41);

        Assert.assertEquals("企業における中心的な業務を処理するシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("基幹システム", q.getAnswerList().get(0));
        Assert.assertEquals("センターシステム", q.getAnswerList().get(1));
        Assert.assertEquals("業務システム", q.getAnswerList().get(2));
        Assert.assertEquals("メインシステム", q.getAnswerList().get(3));
        Assert.assertEquals("集中システム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(42);

        Assert.assertEquals("企業において主にひとつの部門内でのみ使用され、そのシステムでの処理が他の部門に影響を与えないようなシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エンドユーザーシステム", q.getAnswerList().get(0));
        Assert.assertEquals("エンドコンピュータシステム", q.getAnswerList().get(1));
        Assert.assertEquals("部門管理システム", q.getAnswerList().get(2));
        Assert.assertEquals("基幹ユーザーシステム", q.getAnswerList().get(3));
        Assert.assertEquals("コンピュータ部門システム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(43);

        Assert.assertEquals("情報システム部門から見た業務担当者。", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エンドユーザ", q.getAnswerList().get(0));
        Assert.assertEquals("システムアナリスト", q.getAnswerList().get(1));
        Assert.assertEquals("システムアドミニストレータ", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＵＣ", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＵＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(44);

        Assert.assertEquals("システムの利用者自身が自分たちに必要な情報や出力帳票を得るために、システムを使って情報の加工や取り出しを行うこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＵＣ", q.getAnswerList().get(0));
        Assert.assertEquals("ＥＵＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＡＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＧＵＩ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＡＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(45);

        Assert.assertEquals("必要なデータ処理を行うために、システムの利用者自身がシステムの企画・設計から構築まで行うこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＵＤ", q.getAnswerList().get(0));
        Assert.assertEquals("ＥＵＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＡＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＥＣ", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＳＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(46);

        Assert.assertEquals("ホストコンピュータを利用した基幹システムの（　　）化は、利用者側だけの都合で決めることはできない", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＵＣ化", q.getAnswerList().get(0));
        Assert.assertEquals("ＥＵＤ化", q.getAnswerList().get(1));
        Assert.assertEquals("データベース化", q.getAnswerList().get(2));
        Assert.assertEquals("分散化", q.getAnswerList().get(3));
        Assert.assertEquals("ネットワーク化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(47);

        Assert.assertEquals("これまでの基幹システムの構築は、ほとんど（　　）部門にまかされており、要求を提出しシステム化を待つだけであった", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("情報システム", q.getAnswerList().get(0));
        Assert.assertEquals("ユーザ", q.getAnswerList().get(1));
        Assert.assertEquals("エンドユーザ", q.getAnswerList().get(2));
        Assert.assertEquals("総務", q.getAnswerList().get(3));
        Assert.assertEquals("管理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(48);

        Assert.assertEquals("模擬実験。コンピュータで検証する机上実験と考えればよい。", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("シミュレーション", q.getAnswerList().get(0));
        Assert.assertEquals("シュミレーション", q.getAnswerList().get(1));
        Assert.assertEquals("シュミレーショソ", q.getAnswerList().get(2));
        Assert.assertEquals("シミュレーツョン", q.getAnswerList().get(3));
        Assert.assertEquals("ツミュレーション", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(49);

        Assert.assertEquals("ＥＵＣに用いられるハードウェアで最適なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(0));
        Assert.assertEquals("オフコン", q.getAnswerList().get(1));
        Assert.assertEquals("ミニコン", q.getAnswerList().get(2));
        Assert.assertEquals("汎用コンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("スーパーコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(50);

        Assert.assertEquals("ＥＵＣに用いられるハードウェアで最適なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パソコン", q.getAnswerList().get(0));
        Assert.assertEquals("オフコン", q.getAnswerList().get(1));
        Assert.assertEquals("ミニコン", q.getAnswerList().get(2));
        Assert.assertEquals("マザコン", q.getAnswerList().get(3));
        Assert.assertEquals("スーパーコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(51);

        Assert.assertEquals("「端末」。さて英語では？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ノード", q.getAnswerList().get(0));
        Assert.assertEquals("クライアント", q.getAnswerList().get(1));
        Assert.assertEquals("サーバ", q.getAnswerList().get(2));
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(3));
        Assert.assertEquals("エンドユーザ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(52);

        Assert.assertEquals("ＥＵＣにおいて、パソコンの役割として適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワープロ専用機として", q.getAnswerList().get(0));
        Assert.assertEquals("スタンドアロンとして", q.getAnswerList().get(1));
        Assert.assertEquals("ネットワークでのクライアント", q.getAnswerList().get(2));
        Assert.assertEquals("ネットワークでの端末として", q.getAnswerList().get(3));
        Assert.assertEquals("ワークステーションとして", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(53);

        Assert.assertEquals("見積書や稟議書の作成・加工・保存・印刷などを行うソフト。ＥＵＣにおいては特にデータの「加工」が重要になる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワープロソフト", q.getAnswerList().get(0));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＴＰソフト", q.getAnswerList().get(2));
        Assert.assertEquals("グラフィックスソフト", q.getAnswerList().get(3));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(54);

        Assert.assertEquals("２次元の表を利用して、合計や平均・順位付け・グラフの作成などを行うソフト。データの加工やシミュレーションができる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("ユーティリティーソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＴＰソフト", q.getAnswerList().get(2));
        Assert.assertEquals("グラフィックスソフト", q.getAnswerList().get(3));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(55);

        Assert.assertEquals("例えば住所禄ファイルの各データを入力・変更・追加したり、あるいはデータを格納する構造の定義などを行うソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(0));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＴＰソフト", q.getAnswerList().get(2));
        Assert.assertEquals("グラフィックスソフト", q.getAnswerList().get(3));
        Assert.assertEquals("オンラインソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(56);

        Assert.assertEquals("画面表示や操作方法などにおける、コンピュータと利用者との接点。人間にわかりやすく操作しやすい環境が大切である", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ヒューマンインタフェース", q.getAnswerList().get(0));
        Assert.assertEquals("ＲＳ－２３２Ｃインタフェース", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＣＳＩインタフェース", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＣＳＩ－２インタフェース", q.getAnswerList().get(3));
        Assert.assertEquals("アニマルインタフェース", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(57);

        Assert.assertEquals("ある部門で使用するソフトウェアや行う業務の操作方法を、できる限り統一して、操作する人間にわかりやすいものにすること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("標準化", q.getAnswerList().get(0));
        Assert.assertEquals("一体化", q.getAnswerList().get(1));
        Assert.assertEquals("統一化", q.getAnswerList().get(2));
        Assert.assertEquals("アイコン化", q.getAnswerList().get(3));
        Assert.assertEquals("ＧＵＩ化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(58);

        Assert.assertEquals("ヒューマンインタフェースの標準化にあたって、特に考慮しなくてもよい点は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("おもしろさ", q.getAnswerList().get(0));
        Assert.assertEquals("見やすさ", q.getAnswerList().get(1));
        Assert.assertEquals("使いやすさ", q.getAnswerList().get(2));
        Assert.assertEquals("わかりやすさ", q.getAnswerList().get(3));
        Assert.assertEquals("快適さ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(59);

        Assert.assertEquals("「情報の伝達」を目的として作成される文書", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ドキュメント", q.getAnswerList().get(0));
        Assert.assertEquals("テキスト", q.getAnswerList().get(1));
        Assert.assertEquals("マニュアル", q.getAnswerList().get(2));
        Assert.assertEquals("アセスメント", q.getAnswerList().get(3));
        Assert.assertEquals("オニマル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(60);

        Assert.assertEquals("ＥＵＣに限らず、人事異動などに備えて、情報システムの開発において常に心がけるべきことは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ドキュメントの標準化", q.getAnswerList().get(0));
        Assert.assertEquals("ＯＳのバージョン", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＰＵの性能比", q.getAnswerList().get(2));
        Assert.assertEquals("企業内部の組織構造", q.getAnswerList().get(3));
        Assert.assertEquals("ソフトウェアの個別化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(61);

        Assert.assertEquals("ドキュメントの標準化にあたって、特に考慮しなくてもよい点は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("用紙の質", q.getAnswerList().get(0));
        Assert.assertEquals("記載項目", q.getAnswerList().get(1));
        Assert.assertEquals("フォーマット", q.getAnswerList().get(2));
        Assert.assertEquals("用語・用字", q.getAnswerList().get(3));
        Assert.assertEquals("文章技法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(62);

        Assert.assertEquals("標準化において「最低限度守るべき基準」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スタンダード", q.getAnswerList().get(0));
        Assert.assertEquals("ガイドライン", q.getAnswerList().get(1));
        Assert.assertEquals("プラットフォーム", q.getAnswerList().get(2));
        Assert.assertEquals("プライバシー", q.getAnswerList().get(3));
        Assert.assertEquals("カリキュラム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(63);

        Assert.assertEquals("標準化において「守った方がよいと言えるべき基準」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ガイドライン", q.getAnswerList().get(0));
        Assert.assertEquals("スタンダード", q.getAnswerList().get(1));
        Assert.assertEquals("カンカラコモデケア", q.getAnswerList().get(2));
        Assert.assertEquals("プライバシー", q.getAnswerList().get(3));
        Assert.assertEquals("建築基準法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(64);

        Assert.assertEquals("次の中で、ハードウェア以上に標準化すべきものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＳ", q.getAnswerList().get(0));
        Assert.assertEquals("各種インターフェース", q.getAnswerList().get(1));
        Assert.assertEquals("マウスパッド", q.getAnswerList().get(2));
        Assert.assertEquals("バックアップ時の手順", q.getAnswerList().get(3));
        Assert.assertEquals("プリンタのメーカー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(65);

        Assert.assertEquals("コンピュータの小型化・高性能化に伴い、システム構築に際し、コスト削減と期間短縮の目的などでパソコンなどを利用する動向", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ダウンサイジング", q.getAnswerList().get(0));
        Assert.assertEquals("オープンシステム", q.getAnswerList().get(1));
        Assert.assertEquals("マルチメディア", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＵＣ化", q.getAnswerList().get(3));
        Assert.assertEquals("ネットワーク化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(66);

        Assert.assertEquals("ネットワークＯＳの普及により、パソコンをネットワークで利用し、その目的や利用範囲・利用方法が大きく変化している現象", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ネットワーク化", q.getAnswerList().get(0));
        Assert.assertEquals("ダウンサイジング", q.getAnswerList().get(1));
        Assert.assertEquals("オープンシステム", q.getAnswerList().get(2));
        Assert.assertEquals("マルチメディア", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＵＣ化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(67);

        Assert.assertEquals("他社の機器の接続が容易にできるシステム。拡張性と多用性を実現する反面、サポート体制やトラブル処理の問題点もある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オープンシステム", q.getAnswerList().get(0));
        Assert.assertEquals("ネットワーク化", q.getAnswerList().get(1));
        Assert.assertEquals("ダウンサイジング", q.getAnswerList().get(2));
        Assert.assertEquals("マルチメディア", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＵＣ化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(68);

        Assert.assertEquals("コンピュータ上で、音声や静止画・動画・音楽・文字など、複数のデータをデジタル処理し双方向で通信などを行う利用形態", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチメディア", q.getAnswerList().get(0));
        Assert.assertEquals("オープンシステム", q.getAnswerList().get(1));
        Assert.assertEquals("ネットワーク化", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＵＣ化", q.getAnswerList().get(3));
        Assert.assertEquals("ダウンサイジング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(69);

        Assert.assertEquals("１バイトは何ビット？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("　８ビット", q.getAnswerList().get(0));
        Assert.assertEquals("１６ビット", q.getAnswerList().get(1));
        Assert.assertEquals("　４ビット", q.getAnswerList().get(2));
        Assert.assertEquals("　２ビット", q.getAnswerList().get(3));
        Assert.assertEquals("３２ビット", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(70);

        Assert.assertEquals("情報量を表すための２進数の１桁", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ビット", q.getAnswerList().get(0));
        Assert.assertEquals("バイト", q.getAnswerList().get(1));
        Assert.assertEquals("ワード", q.getAnswerList().get(2));
        Assert.assertEquals("チップ", q.getAnswerList().get(3));
        Assert.assertEquals("スマップ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(71);

        Assert.assertEquals("現在のコンピュータのもととなる、１９４６年に開発された世界最初のコンピュータ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＮＩＡＣ", q.getAnswerList().get(0));
        Assert.assertEquals("ＥＤＳＡＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＵＮＩＶＡＣ", q.getAnswerList().get(2));
        Assert.assertEquals("江戸幕府", q.getAnswerList().get(3));
        Assert.assertEquals("ＫＡＭＡＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(72);

        Assert.assertEquals("ＥＮＩＡＣ（エニアック）は、演算素子として何を使っていた？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("真空管", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＣ", q.getAnswerList().get(1));
        Assert.assertEquals("トランジスタ", q.getAnswerList().get(2));
        Assert.assertEquals("暗記パン", q.getAnswerList().get(3));
        Assert.assertEquals("ソロバン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(73);

        Assert.assertEquals("パソコンＬＡＮのサーバとしてよく利用されるコンピュータ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(0));
        Assert.assertEquals("ファミリーコンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("スーパーコンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("汎用コンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("オフィスコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(74);

        Assert.assertEquals("ハードウェアを動かす基本的なソフトウェアを一般に何というか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オペレーティングシステム", q.getAnswerList().get(0));
        Assert.assertEquals("電気グルーブ", q.getAnswerList().get(1));
        Assert.assertEquals("グループウェア", q.getAnswerList().get(2));
        Assert.assertEquals("ユーティリティーソフト", q.getAnswerList().get(3));
        Assert.assertEquals("オーサリングソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(75);

        Assert.assertEquals("１９９４年現在、世界で圧倒的に広く使われている、パソコン用のＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳ－ＤＯＳ（エムエスドス）", q.getAnswerList().get(0));
        Assert.assertEquals("ＵＮＩＸ（ユニックス）", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＶＳ（エムブイエス）", q.getAnswerList().get(2));
        Assert.assertEquals("ＯＳ／２（オーエスツー）", q.getAnswerList().get(3));
        Assert.assertEquals("漢字Ｔａｌｋ７", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(76);

        Assert.assertEquals("グラフィックスを多用した、人間にとって操作しやすい環境を提供するコンピュータとの接点", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＧＵＩ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＡＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＩＳＯ", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＨＡ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＤ－Ｇ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(77);

        Assert.assertEquals("ひとつの業務を分割して、複数のコンピュータに仕事を割り振って処理する形態", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("分散処理", q.getAnswerList().get(0));
        Assert.assertEquals("集中処理", q.getAnswerList().get(1));
        Assert.assertEquals("時分割処理", q.getAnswerList().get(2));
        Assert.assertEquals("リアルタイム処理", q.getAnswerList().get(3));
        Assert.assertEquals("バッチ処理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(78);

        Assert.assertEquals("企業における中心的な業務を処理するシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("基幹システム", q.getAnswerList().get(0));
        Assert.assertEquals("ごたくシステム", q.getAnswerList().get(1));
        Assert.assertEquals("業務システム", q.getAnswerList().get(2));
        Assert.assertEquals("メインシステム", q.getAnswerList().get(3));
        Assert.assertEquals("集中システム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(79);

        Assert.assertEquals("必要なデータ処理を行うために、システムの利用者自身がシステムの企画・設計から構築まで行うこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＵＤ", q.getAnswerList().get(0));
        Assert.assertEquals("ＥＵＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＡＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＥＣ", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＳＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(80);

        Assert.assertEquals("「情報の伝達」を目的として作成される文書", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ドキュメント", q.getAnswerList().get(0));
        Assert.assertEquals("テキスト", q.getAnswerList().get(1));
        Assert.assertEquals("マニュアル", q.getAnswerList().get(2));
        Assert.assertEquals("アセスメント", q.getAnswerList().get(3));
        Assert.assertEquals("オニマル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(81);

        Assert.assertEquals("コンピュータの小型化・高性能化に伴い、システム構築に際し、コスト削減と期間短縮の目的などでパソコンなどを利用する動向", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ダウンサイジング", q.getAnswerList().get(0));
        Assert.assertEquals("オープンシステム", q.getAnswerList().get(1));
        Assert.assertEquals("マルチメディア", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＵＣ化", q.getAnswerList().get(3));
        Assert.assertEquals("ネットワーク化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(82);

        Assert.assertEquals("ネットワークＯＳの普及により、パソコンをネットワークで利用し、その目的や利用範囲・利用方法が大きく変化している現象", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ネットワーク化", q.getAnswerList().get(0));
        Assert.assertEquals("ダウンサイジング", q.getAnswerList().get(1));
        Assert.assertEquals("オープンシステム", q.getAnswerList().get(2));
        Assert.assertEquals("マルチメディア", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＵＣ化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(83);

        Assert.assertEquals("他社の機器の接続が容易にできるシステム。拡張性と多用性を実現する反面、サポート体制やトラブル処理の問題点もある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オープンシステム", q.getAnswerList().get(0));
        Assert.assertEquals("ネットワーク化", q.getAnswerList().get(1));
        Assert.assertEquals("ダウンサイジング", q.getAnswerList().get(2));
        Assert.assertEquals("マルチメディア", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＵＣ化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(84);

        Assert.assertEquals("コンピュータ上で、音声や静止画・動画・音楽・文字など、複数のデータをデジタル処理し双方向で通信などを行う利用形態", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチメディア", q.getAnswerList().get(0));
        Assert.assertEquals("オープンシステム", q.getAnswerList().get(1));
        Assert.assertEquals("ネットワーク化", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＵＣ化", q.getAnswerList().get(3));
        Assert.assertEquals("ダウンサイジング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(85);

        Assert.assertEquals("コンピュータの専門家ではない実務の担当者。いわゆるシステムを利用する者", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エンドユーザ", q.getAnswerList().get(0));
        Assert.assertEquals("システム設計者", q.getAnswerList().get(1));
        Assert.assertEquals("システム構築者", q.getAnswerList().get(2));
        Assert.assertEquals("素人（しろうと）", q.getAnswerList().get(3));
        Assert.assertEquals("セーラームーン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(86);

        Assert.assertEquals("「（　　）をマウスで（　　）する」。適切な組み合わせはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アイコン・クリック", q.getAnswerList().get(0));
        Assert.assertEquals("ダイコン・グリグリ", q.getAnswerList().get(1));
        Assert.assertEquals("フロッピィ・ドラッグ", q.getAnswerList().get(2));
        Assert.assertEquals("データ・バックドロップ", q.getAnswerList().get(3));
        Assert.assertEquals("ねこ・おいでおいで", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(87);

        Assert.assertEquals("生活空間としてのオフィスの「快適さ」。英語では？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アメニティ", q.getAnswerList().get(0));
        Assert.assertEquals("アニメティ", q.getAnswerList().get(1));
        Assert.assertEquals("ゾーニング", q.getAnswerList().get(2));
        Assert.assertEquals("エリゴノミ", q.getAnswerList().get(3));
        Assert.assertEquals("エルゴノミクス", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(88);

        Assert.assertEquals("「オフィス」って日本語では？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("事務所", q.getAnswerList().get(0));
        Assert.assertEquals("学校", q.getAnswerList().get(1));
        Assert.assertEquals("総理官邸", q.getAnswerList().get(2));
        Assert.assertEquals("屋根裏部屋", q.getAnswerList().get(3));
        Assert.assertEquals("地下室", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(89);

        Assert.assertEquals("オフィスにおけるコンピュータや机、あるいは部署や部門などの「配置」。英語では？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("レイアウト", q.getAnswerList().get(0));
        Assert.assertEquals("パーティション", q.getAnswerList().get(1));
        Assert.assertEquals("ゾーニング", q.getAnswerList().get(2));
        Assert.assertEquals("ソーイング", q.getAnswerList().get(3));
        Assert.assertEquals("人事異動", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(90);

        Assert.assertEquals("企業にはさまざまな部門があるが、これらの部門やその机・椅子などをフロアにどのように配置するかを決めること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ゾーニング", q.getAnswerList().get(0));
        Assert.assertEquals("パーティション", q.getAnswerList().get(1));
        Assert.assertEquals("エルゴノミクス", q.getAnswerList().get(2));
        Assert.assertEquals("アメニティ", q.getAnswerList().get(3));
        Assert.assertEquals("席替え", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(91);

        Assert.assertEquals("「人間工学」。英語では？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エルゴノミクス", q.getAnswerList().get(0));
        Assert.assertEquals("アメニティ", q.getAnswerList().get(1));
        Assert.assertEquals("ゾーニング", q.getAnswerList().get(2));
        Assert.assertEquals("マンマシーン", q.getAnswerList().get(3));
        Assert.assertEquals("カマックス", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(92);

        Assert.assertEquals("人間のさまざまな部分の大きさや動き方の特性を研究したもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エルゴノミクス", q.getAnswerList().get(0));
        Assert.assertEquals("アメニティ", q.getAnswerList().get(1));
        Assert.assertEquals("ゾーニング", q.getAnswerList().get(2));
        Assert.assertEquals("ルーバー", q.getAnswerList().get(3));
        Assert.assertEquals("アクティビティ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(93);

        Assert.assertEquals("職場において仕事に疲れたときなどに、ひと休みするような息抜きのコーナー", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リフレッシュコーナー", q.getAnswerList().get(0));
        Assert.assertEquals("ゲームコーナー", q.getAnswerList().get(1));
        Assert.assertEquals("第４コーナー", q.getAnswerList().get(2));
        Assert.assertEquals("禁煙コーナー", q.getAnswerList().get(3));
        Assert.assertEquals("赤コーナー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(94);

        Assert.assertEquals("職場における、受け付けや打ち合わせ場所・応接室などのコーナーの「仕切り」のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パーティション", q.getAnswerList().get(0));
        Assert.assertEquals("オフィスレイアウト", q.getAnswerList().get(1));
        Assert.assertEquals("リフレッシュコーナー", q.getAnswerList().get(2));
        Assert.assertEquals("仕切り書", q.getAnswerList().get(3));
        Assert.assertEquals("始末書", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(95);

        Assert.assertEquals("照明機器の「まぶしさ」のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("グレア", q.getAnswerList().get(0));
        Assert.assertEquals("ドライアイ", q.getAnswerList().get(1));
        Assert.assertEquals("映像シャウト", q.getAnswerList().get(2));
        Assert.assertEquals("ゾーニング", q.getAnswerList().get(3));
        Assert.assertEquals("スクリーンセーバ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(96);

        Assert.assertEquals("「ＢＧＭ」の「Ｂ」と「Ｇ」って何の略？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("バック・グラウンド", q.getAnswerList().get(0));
        Assert.assertEquals("ブルー・グリーン", q.getAnswerList().get(1));
        Assert.assertEquals("ビリー・ジョエル", q.getAnswerList().get(2));
        Assert.assertEquals("ベスト・ジェネラル", q.getAnswerList().get(3));
        Assert.assertEquals("ボーイズ＆ガールズ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(97);

        Assert.assertEquals("オフィス環境として、次の中で特に考慮しなくてもよいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("社員食堂（定食・一品物など）", q.getAnswerList().get(0));
        Assert.assertEquals("照明機器（明るさ・まぶしさ）", q.getAnswerList().get(1));
        Assert.assertEquals("音（騒音・ＢＧＭ）", q.getAnswerList().get(2));
        Assert.assertEquals("色彩（壁・机・床など）", q.getAnswerList().get(3));
        Assert.assertEquals("空気（温度・湿度・空調）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(98);

        Assert.assertEquals("快適なオフィスレイアウト実現のために注意すべき点は多いが、特に考慮しなくてもよいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("社員の趣味や好きな色", q.getAnswerList().get(0));
        Assert.assertEquals("ゾーニング（形状や配置）", q.getAnswerList().get(1));
        Assert.assertEquals("床やカーペットの素材", q.getAnswerList().get(2));
        Assert.assertEquals("リフレッシュコーナー", q.getAnswerList().get(3));
        Assert.assertEquals("パーティション", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(99);

        Assert.assertEquals("コンピュータの利用者が、身体に静電気をためないようにするには一般に何を確保すればよいか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アース", q.getAnswerList().get(0));
        Assert.assertEquals("パーティション", q.getAnswerList().get(1));
        Assert.assertEquals("グレア", q.getAnswerList().get(2));
        Assert.assertEquals("エアーフィルタ", q.getAnswerList().get(3));
        Assert.assertEquals("防弾チョッキ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(100);

        Assert.assertEquals("快適なオフィス環境を考えるとき、特に考慮しなくてもよいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("防空（ぼうくう）", q.getAnswerList().get(0));
        Assert.assertEquals("防塵（ぼうじん）", q.getAnswerList().get(1));
        Assert.assertEquals("防湿（ぼうしつ）", q.getAnswerList().get(2));
        Assert.assertEquals("防水（ぼうすい）", q.getAnswerList().get(3));
        Assert.assertEquals("防磁（ぼうじ）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(101);

        Assert.assertEquals("一定時間同じ画面のまま放置しないための、画面の焼き付けを防ぐためのソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スクリーンセーバ", q.getAnswerList().get(0));
        Assert.assertEquals("エアーコンディショナー", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＲＴセンサー", q.getAnswerList().get(2));
        Assert.assertEquals("スクリーンミュージック", q.getAnswerList().get(3));
        Assert.assertEquals("ディスプレイストッパー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(102);

        Assert.assertEquals("どの電源がどの機器からのものかわからないような、１つのコンセントから多くの機器に接続すること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("タコ足配線", q.getAnswerList().get(0));
        Assert.assertEquals("イカ足配線", q.getAnswerList().get(1));
        Assert.assertEquals("ダイコン足配線", q.getAnswerList().get(2));
        Assert.assertEquals("スルメ足配線", q.getAnswerList().get(3));
        Assert.assertEquals("忍び足配線", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(103);

        Assert.assertEquals("オフィスにおける「カーペット」を選ぶ場合、特に考慮しなくてもよいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ブランド", q.getAnswerList().get(0));
        Assert.assertEquals("靴音の防音", q.getAnswerList().get(1));
        Assert.assertEquals("歩行の快適性", q.getAnswerList().get(2));
        Assert.assertEquals("歩行の安全性", q.getAnswerList().get(3));
        Assert.assertEquals("照明反射の減少", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(104);

        Assert.assertEquals("光源が直接、人間やディスプレイに映らないようにそれにかぶせる器具", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ルーバ", q.getAnswerList().get(0));
        Assert.assertEquals("ヘッドギア", q.getAnswerList().get(1));
        Assert.assertEquals("照明ストッパー", q.getAnswerList().get(2));
        Assert.assertEquals("グレア", q.getAnswerList().get(3));
        Assert.assertEquals("フィルター", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(105);

        Assert.assertEquals("騒音は働く人に疲労感・不安定感を与えてしまうが、オフィスでは約何ｄＢ（デシベル）位までが適当か", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("　５０", q.getAnswerList().get(0));
        Assert.assertEquals("　１５", q.getAnswerList().get(1));
        Assert.assertEquals("　　５", q.getAnswerList().get(2));
        Assert.assertEquals("１２０", q.getAnswerList().get(3));
        Assert.assertEquals("２５０", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(106);

        Assert.assertEquals("一般にオフィスにおける快適な「温度」の範囲はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("２０゜～２７゜位", q.getAnswerList().get(0));
        Assert.assertEquals("１５゜～２２゜位", q.getAnswerList().get(1));
        Assert.assertEquals("１１゜～１８゜位", q.getAnswerList().get(2));
        Assert.assertEquals("２５゜～３２゜位", q.getAnswerList().get(3));
        Assert.assertEquals("２８゜～３５゜位", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(107);

        Assert.assertEquals("一般にオフィスにおける快適な「湿度」の範囲はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("５０％～６０％位", q.getAnswerList().get(0));
        Assert.assertEquals("６５％～８０％位", q.getAnswerList().get(1));
        Assert.assertEquals("３０％～４５％位", q.getAnswerList().get(2));
        Assert.assertEquals("２０％～３５％位", q.getAnswerList().get(3));
        Assert.assertEquals("７５％～９０％位", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(108);

        Assert.assertEquals("次の中でフロッピィディスクの天敵は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スピーカー", q.getAnswerList().get(0));
        Assert.assertEquals("エボラウイルス", q.getAnswerList().get(1));
        Assert.assertEquals("カセットテープ", q.getAnswerList().get(2));
        Assert.assertEquals("オーディオアンプ", q.getAnswerList().get(3));
        Assert.assertEquals("ビデオデッキ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(109);

        Assert.assertEquals("パソコンを使っていないときには自動的に節電モードに切り替え、消費電力を抑える計画を発表したアメリカの局は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("環境保護局", q.getAnswerList().get(0));
        Assert.assertEquals("片縄郵便局", q.getAnswerList().get(1));
        Assert.assertEquals("情報研究局", q.getAnswerList().get(2));
        Assert.assertEquals("科学技術局", q.getAnswerList().get(3));
        Assert.assertEquals("電気通信局", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(110);

        Assert.assertEquals("コンピュータの端末などのディスプレイ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＶＤＴ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＴＭ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＲＴ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＶＤ", q.getAnswerList().get(3));
        Assert.assertEquals("ＶＤＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(111);

        Assert.assertEquals("ローパーティションって何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("間仕切り", q.getAnswerList().get(0));
        Assert.assertEquals("低血圧", q.getAnswerList().get(1));
        Assert.assertEquals("低天井", q.getAnswerList().get(2));
        Assert.assertEquals("中２階", q.getAnswerList().get(3));
        Assert.assertEquals("足元", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(112);

        Assert.assertEquals("オフィス全体の明かりを間接照明として照らす方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アンビエントライト", q.getAnswerList().get(0));
        Assert.assertEquals("ゾンビ発見用ライト", q.getAnswerList().get(1));
        Assert.assertEquals("タスクライト", q.getAnswerList().get(2));
        Assert.assertEquals("Ｗｉｎｄｏｗｓライト", q.getAnswerList().get(3));
        Assert.assertEquals("フロントエンドライト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(113);

        Assert.assertEquals("個々の作業員が自分の仕事に応じて照らす、手元にある照明", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("タスクライト", q.getAnswerList().get(0));
        Assert.assertEquals("ジョブライト", q.getAnswerList().get(1));
        Assert.assertEquals("デスクライト", q.getAnswerList().get(2));
        Assert.assertEquals("ライムライト", q.getAnswerList().get(3));
        Assert.assertEquals("ムーンライト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(114);

        Assert.assertEquals("「無秩序な音」。英語では？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ホワイトノイズ", q.getAnswerList().get(0));
        Assert.assertEquals("グリーンノイズ", q.getAnswerList().get(1));
        Assert.assertEquals("レッドノイズ", q.getAnswerList().get(2));
        Assert.assertEquals("ブルーノイズ", q.getAnswerList().get(3));
        Assert.assertEquals("アルカノイド", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(115);

        Assert.assertEquals("オフィスの床などを高くして、電源の引き回しに柔軟性や余裕を持たせる方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フリーアクセス配線", q.getAnswerList().get(0));
        Assert.assertEquals("フリーマーケット配線", q.getAnswerList().get(1));
        Assert.assertEquals("フリーコード配線", q.getAnswerList().get(2));
        Assert.assertEquals("フリーパーティション配線", q.getAnswerList().get(3));
        Assert.assertEquals("フリーソフト配線", q.getAnswerList().get(4));
    }

    private void subtest_build_genre4(IGotakuInfo gotaku) {
        IGotakuGenreInfo genre = gotaku.getGenreList().get(3);

        Assert.assertEquals("ハード・ソフト", genre.getName());

        Assert.assertEquals(175, genre.getQuestionList().size());

        IGotakuQuestionInfo q = genre.getQuestionList().get(0);

        Assert.assertEquals("ＣＰＵを制御する基本命令などを簡素化し、数を少なくすることで演算処理速度を向上させたコンピュータのこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＩＳＣ", q.getAnswerList().get(0));
        Assert.assertEquals("メインフレームコンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(2));
        Assert.assertEquals("ＰＬ／Ｉ", q.getAnswerList().get(3));
        Assert.assertEquals("ファミコン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(1);

        Assert.assertEquals("記憶・制御・演算という、コンピュータに必要な最小限の機能を１個のＬＳＩに詰め込んだもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マイクロコンピュータ", q.getAnswerList().get(0));
        Assert.assertEquals("パームトップコンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("パーソナルコンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＰＵ", q.getAnswerList().get(3));
        Assert.assertEquals("想いでまくら", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(2);

        Assert.assertEquals("重量２～４㎏位、Ａ４判で厚さ５～６㎝位のサイズのパソコンの名称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ノートパソコン", q.getAnswerList().get(0));
        Assert.assertEquals("ラップトップパソコン", q.getAnswerList().get(1));
        Assert.assertEquals("パームトップパソコン", q.getAnswerList().get(2));
        Assert.assertEquals("デスクトップパソコン", q.getAnswerList().get(3));
        Assert.assertEquals("フィンガートップパソコン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(3);

        Assert.assertEquals("ビデオカセットサイズで、手のひらに乗るタイプのパソコンの名称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パームトップパソコン", q.getAnswerList().get(0));
        Assert.assertEquals("ノートパソコン", q.getAnswerList().get(1));
        Assert.assertEquals("ヒップアップパソコン", q.getAnswerList().get(2));
        Assert.assertEquals("デスクトップパソコン", q.getAnswerList().get(3));
        Assert.assertEquals("フィンガーファイブパソコン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(4);

        Assert.assertEquals("重量５～１０㎏位、Ａ４判～Ｂ４判位で厚さ７～１０㎝位のサイズのパソコンの名称。膝に乗せる大きさ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ラップトップパソコン", q.getAnswerList().get(0));
        Assert.assertEquals("ノートパソコン", q.getAnswerList().get(1));
        Assert.assertEquals("パームトップパソコン", q.getAnswerList().get(2));
        Assert.assertEquals("デスクトップパソコン", q.getAnswerList().get(3));
        Assert.assertEquals("フィンガートップパソコン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(5);

        Assert.assertEquals("パソコンより高速・高機能で、ディスプレイサイズもひとまわり大きいコンピュータ。ネットワークのサーバとしても使用される", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(0));
        Assert.assertEquals("オフィスコンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("汎用コンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("マイクロコンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("メインフレームコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(6);

        Assert.assertEquals("事務用コンピュータ。中規模の事業所で、主に給与計算・請求書発行などの事務処理に使用される", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オフィスコンピュータ", q.getAnswerList().get(0));
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(1));
        Assert.assertEquals("パーソナルコンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("マイクロコンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("メインフレームコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(7);

        Assert.assertEquals("全システムの中枢となるコンピュータ。技術用・事務用両方に使用できるので、汎用コンピュータともいわれる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("メインフレームコンピュータ", q.getAnswerList().get(0));
        Assert.assertEquals("オフィスコンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(2));
        Assert.assertEquals("パーソナルコンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("スーパーコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(8);

        Assert.assertEquals("次の中で、一般に大きさから考えて「２番目」に小さいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(0));
        Assert.assertEquals("汎用コンピュータ", q.getAnswerList().get(1));
        Assert.assertEquals("オフィスコンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("パーソナルコンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("スーパーコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(9);

        Assert.assertEquals("短時間で膨大な量の計算を行うコンピュータ。気象情報や飛行機のシミュレーションなど科学技術分野で使われることが多い", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スーパーコンピュータ", q.getAnswerList().get(0));
        Assert.assertEquals("ワークステーション", q.getAnswerList().get(1));
        Assert.assertEquals("メインフレームコンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("オフィスコンピュータ", q.getAnswerList().get(3));
        Assert.assertEquals("パーソナルコンピュータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(10);

        Assert.assertEquals("ハードウェア。さて日本語では？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("金物", q.getAnswerList().get(0));
        Assert.assertEquals("鉱物", q.getAnswerList().get(1));
        Assert.assertEquals("硬物", q.getAnswerList().get(2));
        Assert.assertEquals("機械", q.getAnswerList().get(3));
        Assert.assertEquals("硬質装置", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(11);

        Assert.assertEquals("中央（演算）処理装置。さて英略語では？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＰＵ", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＰＵ", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＣＵ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＣＵ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＣＵ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(12);

        Assert.assertEquals("次の中で、正しい組み合わせはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("内部記憶装置＝メインメモリ", q.getAnswerList().get(0));
        Assert.assertEquals("中央処理装置＝ＮＣＵ", q.getAnswerList().get(1));
        Assert.assertEquals("外部記憶装置＝主記憶装置", q.getAnswerList().get(2));
        Assert.assertEquals("補助記憶装置＝ＣＰＵ", q.getAnswerList().get(3));
        Assert.assertEquals("主記憶憶装置＝ＣＰＵ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(13);

        Assert.assertEquals("次の中で、入力装置でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＸＹプロッタ", q.getAnswerList().get(0));
        Assert.assertEquals("トラックボール", q.getAnswerList().get(1));
        Assert.assertEquals("マウス", q.getAnswerList().get(2));
        Assert.assertEquals("デジタイザ", q.getAnswerList().get(3));
        Assert.assertEquals("ＯＣＲ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(14);

        Assert.assertEquals("次の中で、出力装置でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("タブレット", q.getAnswerList().get(0));
        Assert.assertEquals("ＸＹプロッタ", q.getAnswerList().get(1));
        Assert.assertEquals("フィルムレコーダ", q.getAnswerList().get(2));
        Assert.assertEquals("液晶ディスプレイ", q.getAnswerList().get(3));
        Assert.assertEquals("イメージセッタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(15);

        Assert.assertEquals("コンピュータに与えられる命令（プログラム）を解析して、それを実行するマイクロプロセッサ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＰＵ", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＰＬ", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＡＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＰＤＡ", q.getAnswerList().get(3));
        Assert.assertEquals("ＰＨＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(16);

        Assert.assertEquals("ＪＩＳでは「計算機の機械命令からなる人工言語」。０と１の組み合わせで、コンピュータが直接解釈できる言語", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("機械語", q.getAnswerList().get(0));
        Assert.assertEquals("アセンブラ言語", q.getAnswerList().get(1));
        Assert.assertEquals("中国語", q.getAnswerList().get(2));
        Assert.assertEquals("Ｃ言語", q.getAnswerList().get(3));
        Assert.assertEquals("ＪＣＬ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(17);

        Assert.assertEquals("コンピュータのメモリ（主記憶装置）や入出力装置などに割り振られた、位置を示す番地", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アドレス", q.getAnswerList().get(0));
        Assert.assertEquals("セル", q.getAnswerList().get(1));
        Assert.assertEquals("コプロセッサ", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＯポート", q.getAnswerList().get(3));
        Assert.assertEquals("ページフレーム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(18);

        Assert.assertEquals("ＣＰＵは、メインメモリに入っているプログラムを１命令ずつ順に読み込み、（　　）して（　　）する処理を繰り返す", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("解読・実行", q.getAnswerList().get(0));
        Assert.assertEquals("判断・解読", q.getAnswerList().get(1));
        Assert.assertEquals("実行・記憶", q.getAnswerList().get(2));
        Assert.assertEquals("記憶・判断", q.getAnswerList().get(3));
        Assert.assertEquals("食べ・消化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(19);

        Assert.assertEquals("コンピュータの五大機能って何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("入力・記憶・演算・出力・制御", q.getAnswerList().get(0));
        Assert.assertEquals("演算・実行・制御・記憶・解読", q.getAnswerList().get(1));
        Assert.assertEquals("制御・記憶・出力・入力・処理", q.getAnswerList().get(2));
        Assert.assertEquals("入力・制御・出力・記憶・解読", q.getAnswerList().get(3));
        Assert.assertEquals("演算・出力・制御・命令・記憶", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(20);

        Assert.assertEquals("人間からの命令を受け付けたり、データの読み込みを行うための装置", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("入力装置", q.getAnswerList().get(0));
        Assert.assertEquals("読込装置", q.getAnswerList().get(1));
        Assert.assertEquals("解読装置", q.getAnswerList().get(2));
        Assert.assertEquals("タケコプター", q.getAnswerList().get(3));
        Assert.assertEquals("出力装置", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(21);

        Assert.assertEquals("コンピュータの処理状況を人間に知らせるために、文字や図形データなどを表示したり印字したりする装置", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("出力装置", q.getAnswerList().get(0));
        Assert.assertEquals("入力装置", q.getAnswerList().get(1));
        Assert.assertEquals("表示装置", q.getAnswerList().get(2));
        Assert.assertEquals("処理装置", q.getAnswerList().get(3));
        Assert.assertEquals("連絡装置", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(22);

        Assert.assertEquals("ＣＰＵなどのマイクロプロセッサの動作を補完する役割をもつマイクロプロセッサ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("コプロセッサ", q.getAnswerList().get(0));
        Assert.assertEquals("マザーボード", q.getAnswerList().get(1));
        Assert.assertEquals("インターフェースボード", q.getAnswerList().get(2));
        Assert.assertEquals("コネクタ", q.getAnswerList().get(3));
        Assert.assertEquals("アドイン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(23);

        Assert.assertEquals("ＣＰＵを中心とした電子回路で出来ているプリント基盤", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マザーボード", q.getAnswerList().get(0));
        Assert.assertEquals("マザーグース", q.getAnswerList().get(1));
        Assert.assertEquals("メモリボード", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＭＳボード", q.getAnswerList().get(3));
        Assert.assertEquals("インターフェースボード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(24);

        Assert.assertEquals("日本語で「接点」。ＪＩＳでは、「２つの機能単位で共有される境界部分で・・・」と定義されている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インターフェース", q.getAnswerList().get(0));
        Assert.assertEquals("スロット", q.getAnswerList().get(1));
        Assert.assertEquals("コネクタ", q.getAnswerList().get(2));
        Assert.assertEquals("プラットフォーム", q.getAnswerList().get(3));
        Assert.assertEquals("ページフレーム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(25);

        Assert.assertEquals("机の上における程度の本体とディスプレイ、キーボードで構成されるパソコンの形態。持ち運びには不便だが多くのモデルがある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デスクトップ型", q.getAnswerList().get(0));
        Assert.assertEquals("ラップトップ型", q.getAnswerList().get(1));
        Assert.assertEquals("ノートブック型", q.getAnswerList().get(2));
        Assert.assertEquals("パームトップ型", q.getAnswerList().get(3));
        Assert.assertEquals("フロア（タワー）型", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(26);

        Assert.assertEquals("本体を床などに置くやや大きめのパソコンの形態。本体を縦に置くこともあり縦置き型とも言われる。サーバ用途など考えられる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フロア型", q.getAnswerList().get(0));
        Assert.assertEquals("福岡タワー型", q.getAnswerList().get(1));
        Assert.assertEquals("デスクトップ型", q.getAnswerList().get(2));
        Assert.assertEquals("パームトップ型", q.getAnswerList().get(3));
        Assert.assertEquals("ワークステーション型", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(27);

        Assert.assertEquals("次の中で、「ＰＤＡ」に属するハードウェアはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        // Assert.assertEquals("電子手帳", q.getAnswerList().get(0)); TODO
        Assert.assertEquals("変復調装置（モデム）", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＯディスク", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＤ－Ｇ", q.getAnswerList().get(3));
        Assert.assertEquals("ギタ次郎", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(28);

        Assert.assertEquals("最も一般的な補助記憶装置。少量データの記憶媒体・提供媒体として利用され、ぺらぺらした柔らかい磁性体の円盤でできている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フロッピィーディスク", q.getAnswerList().get(0));
        Assert.assertEquals("ハードディスク", q.getAnswerList().get(1));
        Assert.assertEquals("光磁気ディスク", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＤ－ＲＯＭ", q.getAnswerList().get(3));
        Assert.assertEquals("ＵＦＯキャッチャー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(29);

        Assert.assertEquals("実際に存在しないフロッピィーディスクの規格はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("２ＬＤ", q.getAnswerList().get(0));
        Assert.assertEquals("２ＥＤ", q.getAnswerList().get(1));
        Assert.assertEquals("２ＤＤ", q.getAnswerList().get(2));
        Assert.assertEquals("２ＨＤ", q.getAnswerList().get(3));
        Assert.assertEquals("１ＤＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(30);

        Assert.assertEquals("実際に存在しないフロッピィーディスクの規格はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("４．５インチ", q.getAnswerList().get(0));
        Assert.assertEquals("８インチ", q.getAnswerList().get(1));
        Assert.assertEquals("５．２５インチ", q.getAnswerList().get(2));
        Assert.assertEquals("３．５インチ", q.getAnswerList().get(3));
        Assert.assertEquals("２インチ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(31);

        Assert.assertEquals("フロッピィーディスクの「２ＥＤ」ってどういう意味？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("両面超高密度倍トラック", q.getAnswerList().get(0));
        Assert.assertEquals("両面高密度倍トラック", q.getAnswerList().get(1));
        Assert.assertEquals("両面単密度倍トラック", q.getAnswerList().get(2));
        Assert.assertEquals("片面高密度倍トラック", q.getAnswerList().get(3));
        Assert.assertEquals("２割引・店じまい・どんと来い", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(32);

        Assert.assertEquals("５インチフロッピィーディスクの中央の大きな穴の横にある、直径５ｍｍほどの小さな穴", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インデックスホール", q.getAnswerList().get(0));
        Assert.assertEquals("ブラックホール", q.getAnswerList().get(1));
        Assert.assertEquals("セントラルホール", q.getAnswerList().get(2));
        Assert.assertEquals("ニューセントラルホール", q.getAnswerList().get(3));
        Assert.assertEquals("ライスボール", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(33);

        Assert.assertEquals("３．５インチフロッピィーディスクの書き込み禁止孔を「開いた状態」にした場合、読み書きは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("読み＝可能、書き＝不可", q.getAnswerList().get(0));
        Assert.assertEquals("読み＝不可、書き＝可能", q.getAnswerList().get(1));
        Assert.assertEquals("読み＝可能、書き＝可能", q.getAnswerList().get(2));
        Assert.assertEquals("読み＝不可、書き＝不可", q.getAnswerList().get(3));
        Assert.assertEquals("記憶容量によって変わる", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(34);

        Assert.assertEquals("記憶容量が大きく（４０メガ～１ギガ位）、ＦＤに比べアクセス時間も短い。パソコン内蔵と外付けがあり丸い円盤で出来ている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ハードディスク", q.getAnswerList().get(0));
        Assert.assertEquals("フレキシブルディスク", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＯディスク", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＣカード", q.getAnswerList().get(3));
        Assert.assertEquals("フォトＣＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(35);

        Assert.assertEquals("一種の大型ハードディスク。数ギガの記憶容量を持ち、複数の入出力を並行して処理する能力やデータの安全性を保つ機能がある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ディスクアレイ", q.getAnswerList().get(0));
        Assert.assertEquals("光磁気ディスク", q.getAnswerList().get(1));
        Assert.assertEquals("ストリーマ", q.getAnswerList().get(2));
        Assert.assertEquals("磁気ネックレス", q.getAnswerList().get(3));
        Assert.assertEquals("シーケンサー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(36);

        Assert.assertEquals("１２センチのもので約６００ＭＢの記憶容量がある。読み取り専用で、マルチメディア時代のメディアとして有望視されている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＤ－ＲＯＭ", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＯディスク", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＡＭディスク", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＣカード", q.getAnswerList().get(3));
        Assert.assertEquals("ＲＯＭカード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(37);

        Assert.assertEquals("ＣＤ－ＲＯＭの記録形式。ソニー・マイクロソフトなどが提唱したフォーマットで、ＩＳＯがＩＳＯ９６６０として標準化した", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ハイシェラ・フォーマット", q.getAnswerList().get(0));
        Assert.assertEquals("ハイレゾ・フォーマット", q.getAnswerList().get(1));
        Assert.assertEquals("ハイレグ・フォーマット", q.getAnswerList().get(2));
        Assert.assertEquals("ハイハイ・フォーマット", q.getAnswerList().get(3));
        Assert.assertEquals("ハイバリュー・フォーマット", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(38);

        Assert.assertEquals("光ディスクの一種。読み書きとも可能で、数ＭＢから数ＧＢと大容量だが転送速度はやや遅い。データの移動用媒体として便利", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("光磁気ディスク", q.getAnswerList().get(0));
        Assert.assertEquals("ＮＯディスク", q.getAnswerList().get(1));
        Assert.assertEquals("レーザーディスク", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＤ－ＲＯＭ", q.getAnswerList().get(3));
        Assert.assertEquals("ハードディスク", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(39);

        Assert.assertEquals("半導体メモリを補助記憶装置として用いるもの。読み書き可能で、転送速度は磁気媒体より速いが通常電源を切ると消えてしまう", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＡＭディスク", q.getAnswerList().get(0));
        Assert.assertEquals("ハードディスク", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＯディスク", q.getAnswerList().get(2));
        Assert.assertEquals("フォトＣＤ", q.getAnswerList().get(3));
        Assert.assertEquals("スペシウム光線", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(40);

        Assert.assertEquals("電流を流し続けなくても記録したデータが消えない半導体メモリ。書き換えも可能なＲＯＭ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フラッシュメモリ", q.getAnswerList().get(0));
        Assert.assertEquals("メモリーグラス", q.getAnswerList().get(1));
        Assert.assertEquals("ハイメモリ", q.getAnswerList().get(2));
        Assert.assertEquals("イモリミユキ", q.getAnswerList().get(3));
        Assert.assertEquals("キャッシュメモリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(41);

        Assert.assertEquals("集積回路を埋め込んだキャッシュカードのような薄いカード。ＲＡＭディスクをカード化したもの。日米の共通規格がある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＩＣカード", q.getAnswerList().get(0));
        Assert.assertEquals("ＲＡＭカード", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＯＭカード", q.getAnswerList().get(2));
        Assert.assertEquals("Ｔｈｅカード", q.getAnswerList().get(3));
        Assert.assertEquals("ワイルドカード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(42);

        Assert.assertEquals("１９９１年に日本電子工業振興協議会が中心になってまとめた、ＩＣカードの日米の共通規格", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＪＥＩＤＡ　Ｙｅｒ４．１", q.getAnswerList().get(0));
        Assert.assertEquals("ＪＥＩＤＡ　Ｙｅｒ３．１", q.getAnswerList().get(1));
        Assert.assertEquals("ＩＳＯ　３６８８", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＳＯ　３８８０", q.getAnswerList().get(3));
        Assert.assertEquals("ＪＩＳ　ＩＣ９１", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(43);

        Assert.assertEquals("フロッピーディスクやハードディスクのように、記録媒体のどの部分（クラスタなど）にも直接データの読み書きができる方式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ランダムアクセス方式", q.getAnswerList().get(0));
        Assert.assertEquals("シーケンシャルアクセス方式", q.getAnswerList().get(1));
        Assert.assertEquals("順次アクセス方式", q.getAnswerList().get(2));
        Assert.assertEquals("シーケンスチェック方式", q.getAnswerList().get(3));
        Assert.assertEquals("チェックディジット方式", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(44);

        Assert.assertEquals("磁気テープのように、順番にデータの読み書きを行う方式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("シーケンシャルアクセス方式", q.getAnswerList().get(0));
        Assert.assertEquals("ランダムアクセス方式", q.getAnswerList().get(1));
        Assert.assertEquals("直接アクセス方式", q.getAnswerList().get(2));
        Assert.assertEquals("磁気チェック方式", q.getAnswerList().get(3));
        Assert.assertEquals("バイナリデータ方式", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(45);

        Assert.assertEquals("いわゆる「ブラウン管」。スタンドアロン型のパソコンで最も多く使用され、細かい点や文字でも鮮明に表示できる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＲＴディスプレイ", q.getAnswerList().get(0));
        Assert.assertEquals("液晶ディスプレイ", q.getAnswerList().get(1));
        Assert.assertEquals("フラットパネルディスプレイ", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＥＤディスプレイ", q.getAnswerList().get(3));
        Assert.assertEquals("プラズマディスプレイ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(46);

        Assert.assertEquals("ＣＲＴディスプレイは解像度によって走査周波数が異なるが、様々な解像度のパソコンに対応できるようなディスプレイは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチスキャン型", q.getAnswerList().get(0));
        Assert.assertEquals("マルチメディア型", q.getAnswerList().get(1));
        Assert.assertEquals("マルチスクリーン型", q.getAnswerList().get(2));
        Assert.assertEquals("マルチモニター型", q.getAnswerList().get(3));
        Assert.assertEquals("マルチーズ型", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(47);

        Assert.assertEquals("ディスプレイの描画方式で、ちらつきが少なく現在主流となっている方式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インタレース式", q.getAnswerList().get(0));
        Assert.assertEquals("インターフェース式", q.getAnswerList().get(1));
        Assert.assertEquals("マルチボード式", q.getAnswerList().get(2));
        Assert.assertEquals("ＴＦＴ方式", q.getAnswerList().get(3));
        Assert.assertEquals("ＬＥＤ方式", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(48);

        Assert.assertEquals("液晶物質を利用した表示装置。ノートブック型・ラップトップ型などのパソコンによく使われている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("液晶ディスプレイ", q.getAnswerList().get(0));
        Assert.assertEquals("プラズマディスプレイ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＲＴディスプレイ", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＥＤディスプレイ", q.getAnswerList().get(3));
        Assert.assertEquals("ディスクアレイ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(49);

        Assert.assertEquals("次の中で、カラー液晶ディスプレイに関係のある用語はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＳＴＮ", q.getAnswerList().get(0));
        Assert.assertEquals("ＴＦＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＴＴ", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＥＤ", q.getAnswerList().get(3));
        Assert.assertEquals("ＴＳＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(50);

        Assert.assertEquals("液晶ディスプレイで、ＳＴＮ方式とＴＦＴ方式ではどちらが表示性能は高い？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＴＦＴ方式", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＴＮ方式", q.getAnswerList().get(1));
        Assert.assertEquals("モノにより一概には言えない", q.getAnswerList().get(2));
        Assert.assertEquals("ほとんど変わらない", q.getAnswerList().get(3));
        Assert.assertEquals("　", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(51);

        Assert.assertEquals("ガス放電から出る光を利用した薄型ディスプレイ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プラズマディスプレイ", q.getAnswerList().get(0));
        Assert.assertEquals("ＬＣＤディスプレイ", q.getAnswerList().get(1));
        Assert.assertEquals("液晶ディスプレイ", q.getAnswerList().get(2));
        Assert.assertEquals("マルチスキャンディスプレイ", q.getAnswerList().get(3));
        Assert.assertEquals("ガスプレイ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(52);

        Assert.assertEquals("光電動物質を塗った感光ドラムにレーザー光線で画像をつくり、帯電部分にトナーを付着させて印字する装置。印字品質が良い", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("レーザプリンタ", q.getAnswerList().get(0));
        Assert.assertEquals("インクジェットプリンタ", q.getAnswerList().get(1));
        Assert.assertEquals("熱転写プリンタ", q.getAnswerList().get(2));
        Assert.assertEquals("ドットインパクトプリンタ", q.getAnswerList().get(3));
        Assert.assertEquals("プッチンプリンタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(53);

        Assert.assertEquals("インクの粒子を飛ばして吹き付け、ドットを描く方式のプリンタ。小型・軽量化されており低価格。印字速度は速くて静かである", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インクジェットプリンタ", q.getAnswerList().get(0));
        Assert.assertEquals("レーザプリンタ", q.getAnswerList().get(1));
        Assert.assertEquals("熱転写プリンタ", q.getAnswerList().get(2));
        Assert.assertEquals("ドットインパクトプリンタ", q.getAnswerList().get(3));
        Assert.assertEquals("ぷりんとごっこ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(54);

        Assert.assertEquals("熱で溶けるインクを加熱ヘッドで溶かして、紙に転写させる方式のプリンタ。印字速度は遅いが低価格で印字品質も良い", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("熱転写プリンタ", q.getAnswerList().get(0));
        Assert.assertEquals("インクジェットプリンタ", q.getAnswerList().get(1));
        Assert.assertEquals("レーザプリンタ", q.getAnswerList().get(2));
        Assert.assertEquals("ドットインパクトプリンタ", q.getAnswerList().get(3));
        Assert.assertEquals("プロッタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(55);

        Assert.assertEquals("インクリボンをピンで叩いて印字する方式のプリンタ。連続用紙への印刷に向くが印字音が大きい。複写伝票に印字が可能である", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ドットインパクトプリンタ", q.getAnswerList().get(0));
        Assert.assertEquals("熱転写プリンタ", q.getAnswerList().get(1));
        Assert.assertEquals("インクジェットプリンタ", q.getAnswerList().get(2));
        Assert.assertEquals("レーザプリンタ", q.getAnswerList().get(3));
        Assert.assertEquals("ページプリンタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(56);

        Assert.assertEquals("紙媒体への出力装置の一種。直接、ペンや筆を移動させて図形を描く。ＣＡＤ・デザイン作成などに利用される", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プロッタ", q.getAnswerList().get(0));
        Assert.assertEquals("フィルムレコーダ", q.getAnswerList().get(1));
        Assert.assertEquals("イメージセッタ", q.getAnswerList().get(2));
        Assert.assertEquals("イメージスキャナ", q.getAnswerList().get(3));
        Assert.assertEquals("デジタルカメラ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(57);

        Assert.assertEquals("次の中で、実際に存在しないプロッタの名称は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("イメージプロッタ", q.getAnswerList().get(0));
        Assert.assertEquals("カッティングプロッタ", q.getAnswerList().get(1));
        Assert.assertEquals("ＸＹプロッタ", q.getAnswerList().get(2));
        Assert.assertEquals("ペンプロッタ", q.getAnswerList().get(3));
        Assert.assertEquals("　", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(58);

        Assert.assertEquals("文字や図形を、紙ではなく写真の印画紙に感光させる装置。プレゼンテーション用スライドの作成などに便利である", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フィルムレコーダ", q.getAnswerList().get(0));
        Assert.assertEquals("イメージセッタ", q.getAnswerList().get(1));
        Assert.assertEquals("ＸＹプロッタ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＧプロッタ", q.getAnswerList().get(3));
        Assert.assertEquals("フォトＣＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(59);

        Assert.assertEquals("前後左右に動かすことで、その移動量や方向を情報として入力する装置。アイコンを指示したりメニューを選択したりする", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マウス", q.getAnswerList().get(0));
        Assert.assertEquals("ジョイスティック", q.getAnswerList().get(1));
        Assert.assertEquals("タッチペン", q.getAnswerList().get(2));
        Assert.assertEquals("コードペン", q.getAnswerList().get(3));
        Assert.assertEquals("ミートボール", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(60);

        Assert.assertEquals("次の中で、ポインティングデバイスではないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("イメージスキャナ", q.getAnswerList().get(0));
        Assert.assertEquals("デジタイザ", q.getAnswerList().get(1));
        Assert.assertEquals("マウス", q.getAnswerList().get(2));
        Assert.assertEquals("トラックボール", q.getAnswerList().get(3));
        Assert.assertEquals("タッチパネル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(61);

        Assert.assertEquals("ラップトップパソコンに付いているものもある。画面の矢印などを動かすボールを指で回すことによって画面の位置を指示する", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("トラックボール", q.getAnswerList().get(0));
        Assert.assertEquals("マウス", q.getAnswerList().get(1));
        Assert.assertEquals("テンキー", q.getAnswerList().get(2));
        Assert.assertEquals("ジョイスティック", q.getAnswerList().get(3));
        Assert.assertEquals("ライトペン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(62);

        Assert.assertEquals("専用のパネルの上で座標の指示ボタンを動かし図形情報を入力する装置。実際の入力にはスタイラスペンやカーソルが使われる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デジタイザ", q.getAnswerList().get(0));
        Assert.assertEquals("タンブラー", q.getAnswerList().get(1));
        Assert.assertEquals("イメージスキャナ", q.getAnswerList().get(2));
        Assert.assertEquals("タッチパネル", q.getAnswerList().get(3));
        Assert.assertEquals("ライトペン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(63);

        Assert.assertEquals("デジタイザよりも小型で、それに比べてやや精度も劣る卓上の入力装置", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("タブレット", q.getAnswerList().get(0));
        Assert.assertEquals("タッチパネル", q.getAnswerList().get(1));
        Assert.assertEquals("タッチペン", q.getAnswerList().get(2));
        Assert.assertEquals("ライトペン", q.getAnswerList().get(3));
        Assert.assertEquals("プロッタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(64);

        Assert.assertEquals("手書きのイラスト・写真などの画像を読み取る装置。コピー機と同様、光の反射を利用して画像をデジタル化する", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("イメージスキャナ", q.getAnswerList().get(0));
        Assert.assertEquals("タブレット", q.getAnswerList().get(1));
        Assert.assertEquals("タッチパネル", q.getAnswerList().get(2));
        Assert.assertEquals("ＯＣＲ", q.getAnswerList().get(3));
        Assert.assertEquals("胃カメラ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(65);

        Assert.assertEquals("紙やカードに書かれた文字を画像として読み込み、その形から文字として認識し文字コード化する装置。光学式文字読み取り装置", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＣＲ", q.getAnswerList().get(0));
        Assert.assertEquals("ＯＭＲ", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＭＲ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＯＭ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＩＣＲ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(66);

        Assert.assertEquals("内容の書き換えが出来ないメモリ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＯＭ", q.getAnswerList().get(0));
        Assert.assertEquals("ＲＡＭ", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＵＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＡＭ", q.getAnswerList().get(3));
        Assert.assertEquals("ＬＯＭ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(67);

        Assert.assertEquals("パソコンの電源を入れたときに自動的に動かす基礎的なプログラムは、次のどれに組み込んでおいたほうが望ましいか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＯＭ", q.getAnswerList().get(0));
        Assert.assertEquals("ＲＡＭ", q.getAnswerList().get(1));
        Assert.assertEquals("フラッシュメモリ", q.getAnswerList().get(2));
        Assert.assertEquals("キャッシュメモリ", q.getAnswerList().get(3));
        Assert.assertEquals("愛のメモリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(68);

        Assert.assertEquals("次の中で、正しい記述はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("メインメモリの大半はＲＡＭ", q.getAnswerList().get(0));
        Assert.assertEquals("ＲＡＭが大きいほど処理も遅い", q.getAnswerList().get(1));
        Assert.assertEquals("メモリはＯＳとは無関係である", q.getAnswerList().get(2));
        Assert.assertEquals("拡張メモリにＥＷＳなどがある", q.getAnswerList().get(3));
        Assert.assertEquals("外部記憶装置＝メインメモリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(69);

        Assert.assertEquals("ＭＳ－ＤＯＳにおいて、アプリケーションソフトがメインメモリとして利用できる大きさの上限は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("６４０ＫＢ", q.getAnswerList().get(0));
        Assert.assertEquals("１ＭＢ", q.getAnswerList().get(1));
        Assert.assertEquals("２５６ＫＢ", q.getAnswerList().get(2));
        Assert.assertEquals("５１２ＭＢ", q.getAnswerList().get(3));
        Assert.assertEquals("３８４ＫＢ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(70);

        Assert.assertEquals("ＭＳ－ＤＯＳで、実際に６４０ＫＢより多量のメモリを利用するために開発された拡張メモリで代表的なモノは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＭＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＥＳＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＵＭＢ", q.getAnswerList().get(2));
        Assert.assertEquals("ＸＮＳ", q.getAnswerList().get(3));
        Assert.assertEquals("Ｘ’ＭＡＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(71);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１を利用するための必須の拡張メモリ方式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＸＭＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＥＷＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＥＷＳ", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＭＳ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＭＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(72);

        Assert.assertEquals("ＥＭＳ拡張メモリ方式では（　　）と呼ばれる領域を設け、このメモリを通じて拡張メモリのデータを処理している", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ページフレーム", q.getAnswerList().get(0));
        Assert.assertEquals("ウィンドウ", q.getAnswerList().get(1));
        Assert.assertEquals("アキュムレータ", q.getAnswerList().get(2));
        Assert.assertEquals("キャッシュメモリ", q.getAnswerList().get(3));
        Assert.assertEquals("ワークエリア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(73);

        Assert.assertEquals("活字形成媒体により、タイプドラム式とタイプチェーン式がある出力装置は何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ラインプリンタ", q.getAnswerList().get(0));
        Assert.assertEquals("イメージスキャナ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＯＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＸＹプロッタ", q.getAnswerList().get(3));
        Assert.assertEquals("磁気ドラム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(74);

        Assert.assertEquals("ディスプレイ画面はドットの集合で構成されているが、このドットの数を示すもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("解像度", q.getAnswerList().get(0));
        Assert.assertEquals("周波数", q.getAnswerList().get(1));
        Assert.assertEquals("走査周波数", q.getAnswerList().get(2));
        Assert.assertEquals("ピッチ", q.getAnswerList().get(3));
        Assert.assertEquals("クロック周波数", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(75);

        Assert.assertEquals("文書の入力・編集・印刷や、文書データの加工（検索・修正・追加など）を行うソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワープロソフト", q.getAnswerList().get(0));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＴＰソフト", q.getAnswerList().get(3));
        Assert.assertEquals("基本ソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(76);

        Assert.assertEquals("表の集計（各種の計算など）を行うもので、それ以外に検索やソート・グラフ作成などの機能をもつソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("ワープロソフト", q.getAnswerList().get(1));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(2));
        Assert.assertEquals("プレゼンテーションソフト", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＡＤソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(77);

        Assert.assertEquals("データを何らかの形で蓄積し、後で必要なデータを見つけたり変更したりして再利用するためのソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(0));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("グラフィックスソフト", q.getAnswerList().get(2));
        Assert.assertEquals("通信ソフト", q.getAnswerList().get(3));
        Assert.assertEquals("スプレッドシートソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(78);

        Assert.assertEquals("ＯＳとアプリケーションソフト間のデータ交換を行うためのソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インタフェース用ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＤＢソフト", q.getAnswerList().get(2));
        Assert.assertEquals("ターミナルソフト", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＴＰソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(79);

        Assert.assertEquals("ＯＳとアプリケーションソフト間のデータ交換を行うためのインタフェース用ソフトは次のどれに属する？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(0));
        Assert.assertEquals("基本ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("アプリケーションソフト", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＡＳＥツール", q.getAnswerList().get(3));
        Assert.assertEquals("グループウェア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(80);

        Assert.assertEquals("次の中で「言語プロセッサ」でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳ－ＤＯＳ", q.getAnswerList().get(0));
        Assert.assertEquals("アセンブラ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＯＢＯＬ", q.getAnswerList().get(2));
        Assert.assertEquals("ＦＯＲＴＲＡＮ", q.getAnswerList().get(3));
        Assert.assertEquals("Ｃ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(81);

        Assert.assertEquals("アセンブラ、ＣＯＢＯＬ、Ｃ、４ＧＬなど、さまざまな用途に応用できるソフトウェアの総称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("言語プロセッサ", q.getAnswerList().get(0));
        Assert.assertEquals("汎用ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("アプリケーションソフト", q.getAnswerList().get(2));
        Assert.assertEquals("ユーティリティーソフト", q.getAnswerList().get(3));
        Assert.assertEquals("応用ソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(82);

        Assert.assertEquals("次の中で「汎用アプリケーションソフトウェア」でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("販売管理ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("ワープロソフト", q.getAnswerList().get(1));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(2));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(3));
        Assert.assertEquals("グラフィックスソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(83);

        Assert.assertEquals("ワープロソフト・データベースソフト・表計算ソフトなど、特定の目的のために利用するソフトウェアの総称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("汎用アプリケーションソフト", q.getAnswerList().get(0));
        Assert.assertEquals("業務アプリケーションソフト", q.getAnswerList().get(1));
        Assert.assertEquals("言語アプリケーションソフト", q.getAnswerList().get(2));
        Assert.assertEquals("定型アプリケーションソフト", q.getAnswerList().get(3));
        Assert.assertEquals("チューリップのアップリケ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(84);

        Assert.assertEquals("次の中で「業務アプリケーションソフトウェア」でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("会　計ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("販売管理ソフト", q.getAnswerList().get(2));
        Assert.assertEquals("在庫管理ソフト", q.getAnswerList().get(3));
        Assert.assertEquals("給与計算ソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(85);

        Assert.assertEquals("会計ソフト・販売管理ソフト・給与計算ソフトなど、特定の業務のために開発されたソフトウェアの総称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("業務アプリケーションソフト", q.getAnswerList().get(0));
        Assert.assertEquals("汎用アプリケーションソフト", q.getAnswerList().get(1));
        Assert.assertEquals("特定アプリケーションソフト", q.getAnswerList().get(2));
        Assert.assertEquals("凡用アプリケーションソフト", q.getAnswerList().get(3));
        Assert.assertEquals("業種別アプリケーションソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(86);

        Assert.assertEquals("ハードウェアとソフトウェアの機能を管理し、使いやすい環境を提供するもの。基本ソフトウェアとミドルウェアに分けられる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("システムソフトウェア", q.getAnswerList().get(0));
        Assert.assertEquals("オペレーティングシステム", q.getAnswerList().get(1));
        Assert.assertEquals("応用ソフトウェア", q.getAnswerList().get(2));
        Assert.assertEquals("ＧＵＩソフトウェア", q.getAnswerList().get(3));
        Assert.assertEquals("環境設定ソフトウェア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(87);

        Assert.assertEquals("財務会計ソフト・成績処理ソフト・給与計算ソフトなど、特定の業務のために開発されたソフトウェアの総称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("応用ソフトウェア", q.getAnswerList().get(0));
        Assert.assertEquals("特定ソフトウェア", q.getAnswerList().get(1));
        Assert.assertEquals("基本ソフトウェア", q.getAnswerList().get(2));
        Assert.assertEquals("特殊ソフトウェア", q.getAnswerList().get(3));
        Assert.assertEquals("言語ソフトウェア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(88);

        Assert.assertEquals("基本ソフトと応用ソフトの中間に位置するソフトウェア。ＧＵＩ制御やデータベースソフト・ワープロソフトなどがある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(0));
        Assert.assertEquals("グループウェア", q.getAnswerList().get(1));
        Assert.assertEquals("テニスウェア", q.getAnswerList().get(2));
        Assert.assertEquals("制御ソフトウェア", q.getAnswerList().get(3));
        Assert.assertEquals("オペレーティングシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(89);

        Assert.assertEquals("次の中で「ミドルウェア」でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エーアイソフト", q.getAnswerList().get(0));
        Assert.assertEquals("プレゼンテーションソフト", q.getAnswerList().get(1));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(2));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(3));
        Assert.assertEquals("ＧＵＩ制御ソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(90);

        Assert.assertEquals("ソフトウェアの「受託開発」において、ある程度かたちが決まっているソフトウェアを目的に合わせて修正してもらう方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("イージーオーダ", q.getAnswerList().get(0));
        Assert.assertEquals("カスタムメード", q.getAnswerList().get(1));
        Assert.assertEquals("自主開発", q.getAnswerList().get(2));
        Assert.assertEquals("オリジナル", q.getAnswerList().get(3));
        Assert.assertEquals("サイズ直し", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(91);

        Assert.assertEquals("ソフトウェアの「受託開発」において、完全に１から開発してもらう方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("カスタムメード", q.getAnswerList().get(0));
        Assert.assertEquals("イージーオーダ", q.getAnswerList().get(1));
        Assert.assertEquals("自主開発", q.getAnswerList().get(2));
        Assert.assertEquals("オリジナル", q.getAnswerList().get(3));
        Assert.assertEquals("出直し", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(92);

        Assert.assertEquals("表計算ソフトやデータベースソフトなどに用意されている、一種のプロトタイプモデル（テンプレート）", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フォーム集", q.getAnswerList().get(0));
        Assert.assertEquals("ファーム集", q.getAnswerList().get(1));
        Assert.assertEquals("モデル集", q.getAnswerList().get(2));
        Assert.assertEquals("データ集", q.getAnswerList().get(3));
        Assert.assertEquals("みなの集", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(93);

        Assert.assertEquals("ＣＯＢＯＬやＣなどで書いたプログラムを機械語に翻訳するソフトウェア。翻訳後まとめて実行する", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("コンパイラ", q.getAnswerList().get(0));
        Assert.assertEquals("アセンブラ", q.getAnswerList().get(1));
        Assert.assertEquals("イナイイナイバア", q.getAnswerList().get(2));
        Assert.assertEquals("オペレーティングシステム", q.getAnswerList().get(3));
        Assert.assertEquals("インタプリタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(94);

        Assert.assertEquals("ＢＡＳＩＣなどで書いたプログラムを機械語に翻訳するソフトウェア。１命令ずつ翻訳・実行を繰り返す", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インタプリタ", q.getAnswerList().get(0));
        Assert.assertEquals("コンパイラ", q.getAnswerList().get(1));
        Assert.assertEquals("アセンブラ", q.getAnswerList().get(2));
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳ－ＤＯＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(95);

        Assert.assertEquals("パソコンのハードとソフトを管理し、各種のソフトウェアを操作できる状態にまで環境を設定する働きをもつ基本ソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オペレーティングシステム", q.getAnswerList().get(0));
        Assert.assertEquals("システムソフト", q.getAnswerList().get(1));
        Assert.assertEquals("アプリケーションソフト", q.getAnswerList().get(2));
        Assert.assertEquals("イニシャルプログラムローダ", q.getAnswerList().get(3));
        Assert.assertEquals("ＷＩＺＡＲＤ９８", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(96);

        Assert.assertEquals("機械語の命令に１対１で対応した、記号形式を備えたプログラム言語", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アセンブラ言語", q.getAnswerList().get(0));
        Assert.assertEquals("マシン語", q.getAnswerList().get(1));
        Assert.assertEquals("ＰＬ／Ｉ言語", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＯＢＯＬ言語", q.getAnswerList().get(3));
        Assert.assertEquals("Ｃ言語", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(97);

        Assert.assertEquals("事務処理用の言語で、ファイル操作を行うのに適したデータ構造をもつ。オフコンでよく使われる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＯＢＯＬ", q.getAnswerList().get(0));
        Assert.assertEquals("ＲＰＧ", q.getAnswerList().get(1));
        Assert.assertEquals("Ｃ言語", q.getAnswerList().get(2));
        Assert.assertEquals("４ＧＬ", q.getAnswerList().get(3));
        Assert.assertEquals("ＬＩＳＰ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(98);

        Assert.assertEquals("化学技術計算用の言語で、数式をそのまま書ける。スパコンなどで使われている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＯＲＴＲＡＮ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＯＢＯＬ", q.getAnswerList().get(1));
        Assert.assertEquals("Ｃ言語", q.getAnswerList().get(2));
        Assert.assertEquals("ＢＡＳＩＣ", q.getAnswerList().get(3));
        Assert.assertEquals("ＰＬ／Ｉ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(99);

        Assert.assertEquals("ワークステーションやパソコンで多目的に使用される言語で、移植性が高い。システム記述言語", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｃ言語", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＯＢＯＬ", q.getAnswerList().get(1));
        Assert.assertEquals("アセンブラ", q.getAnswerList().get(2));
        Assert.assertEquals("ＦＯＲＴＲＡＮ", q.getAnswerList().get(3));
        Assert.assertEquals("ギリシャ語", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(100);

        Assert.assertEquals("事務処理用の言語で、特に報告書作成機能が充実している。一部のオフコンで標準言語となっている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＰＧ", q.getAnswerList().get(0));
        Assert.assertEquals("機械語", q.getAnswerList().get(1));
        Assert.assertEquals("Ｃ言語", q.getAnswerList().get(2));
        Assert.assertEquals("アセンブラ", q.getAnswerList().get(3));
        Assert.assertEquals("ギャンブラ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(101);

        Assert.assertEquals("文書や図形の入力・編集・保存・印刷などを行うもので、オフィスでは必須のソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワープロソフト", q.getAnswerList().get(0));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＴＰソフト", q.getAnswerList().get(2));
        Assert.assertEquals("ペイントソフト", q.getAnswerList().get(3));
        Assert.assertEquals("プレゼンテーションソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(102);

        Assert.assertEquals("パソコンで、売上票など集計を行うソフトの総称。ビジネスグラフ作成やデータベース機能を持ち合わせているものが多い", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(1));
        Assert.assertEquals("グラフィックソフト", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＴＰソフト", q.getAnswerList().get(3));
        Assert.assertEquals("販売管理ソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(103);

        Assert.assertEquals("各種データの集合を構築・管理・検索・更新したりするソフト。パソコンでは、ＲＤＢ型とカード型が主流である", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(0));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ワープロソフト", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＴＰソフト", q.getAnswerList().get(3));
        Assert.assertEquals("プレゼンテーションソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(104);

        Assert.assertEquals("絵・イラスト・動画などを作成ソフトの総称。ペイント系・ドロー系がある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("グラフィックソフト", q.getAnswerList().get(0));
        Assert.assertEquals("スクリーンソフト", q.getAnswerList().get(1));
        Assert.assertEquals("マルチペイントソフト", q.getAnswerList().get(2));
        Assert.assertEquals("イラストソフト", q.getAnswerList().get(3));
        Assert.assertEquals("ピクチャーズソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(105);

        Assert.assertEquals("グラフィックソフトの中で、イラストや絵を描くタイプのソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ペイント系ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("ドロー系ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("イラスト系ソフト", q.getAnswerList().get(2));
        Assert.assertEquals("プロッタ系ソフト", q.getAnswerList().get(3));
        Assert.assertEquals("ＪＰＥＧ系ソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(106);

        Assert.assertEquals("グラフィックソフトの中で、図面作成や設計図を描くタイプのソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ドロー系ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("ペイント系ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("イラスト系ソフト", q.getAnswerList().get(2));
        Assert.assertEquals("プロッタ系ソフト", q.getAnswerList().get(3));
        Assert.assertEquals("ハウスプランニング系ソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(107);

        Assert.assertEquals("ビジュアル資料・ＯＨＰ用の資料などを作成するソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プレゼンテーションソフト", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＴＰソフト", q.getAnswerList().get(1));
        Assert.assertEquals("オーバーヘッドソフト", q.getAnswerList().get(2));
        Assert.assertEquals("ミーティングソフト", q.getAnswerList().get(3));
        Assert.assertEquals("リハーサルソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(108);

        Assert.assertEquals("装置やソフトウェア、データ形式などが異なった機種でも共通して使用できる環境の呼び名", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("互換性がある", q.getAnswerList().get(0));
        Assert.assertEquals("汎用性がある", q.getAnswerList().get(1));
        Assert.assertEquals("移植性がある", q.getAnswerList().get(2));
        Assert.assertEquals("拡張性がある", q.getAnswerList().get(3));
        Assert.assertEquals("中毒性がある", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(109);

        Assert.assertEquals("異なるソフト間（例：一太郎とＯＡＳＹＳ）で、文書の受け渡しを行うときに一般的に行われるファイルの変換方法の形式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("テキストファイル形式", q.getAnswerList().get(0));
        Assert.assertEquals("ランダムファイル形式", q.getAnswerList().get(1));
        Assert.assertEquals("バイナリファイル形式", q.getAnswerList().get(2));
        Assert.assertEquals("シーケンシャルファイル形式", q.getAnswerList().get(3));
        Assert.assertEquals("マシン語ファイル形式", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(110);

        Assert.assertEquals("コンピュータを動かすにあたって、ソフトの実行を管理したり、周辺装置と本体との情報交換を調整したりする基本ソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＦＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＥＵＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＡＵＴＨＯＲ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＡＩＮ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(111);

        Assert.assertEquals("ソフトウェアとハードウェアの仲介役ともなるべき基本的なソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オペレーティングシステム", q.getAnswerList().get(0));
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(1));
        Assert.assertEquals("システムソフト", q.getAnswerList().get(2));
        Assert.assertEquals("アナライザー", q.getAnswerList().get(3));
        Assert.assertEquals("ノートンドクター", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(112);

        Assert.assertEquals("１９９５年現在、最も広く用いられている１６ビットパソコンのＯＳ。マイクロソフト社が開発した", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳ－ＤＯＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＯＳ／９", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＡＣ－ＯＳ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＯＳ／Ｖ", q.getAnswerList().get(3));
        Assert.assertEquals("ウルトラ７", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(113);

        Assert.assertEquals("ＭＳ－ＤＯＳ上で動作し、その機能を拡張するＧＵＩ環境を提供するソフト。ミドルウェアと言うべきである", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ", q.getAnswerList().get(0));
        Assert.assertEquals("ＯＳ／２", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＰＭ－８６", q.getAnswerList().get(2));
        Assert.assertEquals("ＵＮＩＸ", q.getAnswerList().get(3));
        Assert.assertEquals("漢字ＴＡＬＫ７", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(114);

        Assert.assertEquals("フロッピィディスクの初期化やディスクのコピーなど、ＯＳを利用する上で必要な操作を行うソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ユーティリティプログラム", q.getAnswerList().get(0));
        Assert.assertEquals("言語処理プログラム", q.getAnswerList().get(1));
        Assert.assertEquals("制御プログラム", q.getAnswerList().get(2));
        Assert.assertEquals("コピーツール", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＡＳＥツール", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(115);

        Assert.assertEquals("マルチメディアなどの作品を制作するために、絵・音・アニメーションなどを統合するソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オーサリングソフト", q.getAnswerList().get(0));
        Assert.assertEquals("プレゼンテーションソフト", q.getAnswerList().get(1));
        Assert.assertEquals("エディタソフト", q.getAnswerList().get(2));
        Assert.assertEquals("マルチメディアソフト", q.getAnswerList().get(3));
        Assert.assertEquals("エミュレーションソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(116);

        Assert.assertEquals("コンピュータ特有の曲線のギザギザ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ジャギー", q.getAnswerList().get(0));
        Assert.assertEquals("ヤンキー", q.getAnswerList().get(1));
        Assert.assertEquals("ジャッキ", q.getAnswerList().get(2));
        Assert.assertEquals("ジョッキ", q.getAnswerList().get(3));
        Assert.assertEquals("ジューキ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(117);

        Assert.assertEquals("グラフィック情報をドット（点）ではなく、数式（数値）として保持しているデータ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ベクターデータ", q.getAnswerList().get(0));
        Assert.assertEquals("ドローデータ", q.getAnswerList().get(1));
        Assert.assertEquals("ペイントデータ", q.getAnswerList().get(2));
        Assert.assertEquals("ヌメリックデータ", q.getAnswerList().get(3));
        Assert.assertEquals("月がデータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(118);

        Assert.assertEquals("コンピュータを使って図面設計などを行うソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＡＤソフト", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＡＭソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＡＩソフト", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＭＩソフト", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＣＢソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(119);

        Assert.assertEquals("ＩＢＭ社のパソコンおよびその互換機の上で動作するＭＳ－ＤＯＳに、日本語処理機能を追加したもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＯＳ／Ｖ", q.getAnswerList().get(0));
        Assert.assertEquals("ＯＳ／９", q.getAnswerList().get(1));
        Assert.assertEquals("ウルティマ７", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳ－ＤＯＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(120);

        Assert.assertEquals("ＩＢＭ社とマイクロソフト社が、ＭＳ－ＤＯＳの次世代のＯＳとして共同開発したマルチタスクＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＳ／２", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＡＣ－ＯＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＳ－ＤＯＳ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＯＳ／Ｖ", q.getAnswerList().get(3));
        Assert.assertEquals("ＦＥＰ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(121);

        Assert.assertEquals("ＯＳ／２の最大の特徴として最も適しているものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチタスク", q.getAnswerList().get(0));
        Assert.assertEquals("シングルタスク", q.getAnswerList().get(1));
        Assert.assertEquals("シングルアゲイン", q.getAnswerList().get(2));
        Assert.assertEquals("１６ビットＯＳ", q.getAnswerList().get(3));
        Assert.assertEquals("スタンドアロン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(122);

        Assert.assertEquals("一つのＣＰＵで、複数のプログラムを同時に動作させること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチタスク", q.getAnswerList().get(0));
        Assert.assertEquals("シングルタスク", q.getAnswerList().get(1));
        Assert.assertEquals("デュプレクシング", q.getAnswerList().get(2));
        Assert.assertEquals("多重プロセッシング", q.getAnswerList().get(3));
        Assert.assertEquals("ＴＳＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(123);

        Assert.assertEquals("一つのＣＰＵでは、一つのプログラムしか実行できないこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("シングルタスク", q.getAnswerList().get(0));
        Assert.assertEquals("マルチタスク", q.getAnswerList().get(1));
        Assert.assertEquals("デュプレクシング", q.getAnswerList().get(2));
        Assert.assertEquals("マルチベンダ", q.getAnswerList().get(3));
        Assert.assertEquals("タイムシェアリング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(124);

        Assert.assertEquals("マッキントッシュ。さて開発会社は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アップル社", q.getAnswerList().get(0));
        Assert.assertEquals("ストロベリー社", q.getAnswerList().get(1));
        Assert.assertEquals("オレンジ社", q.getAnswerList().get(2));
        Assert.assertEquals("オーム社", q.getAnswerList().get(3));
        Assert.assertEquals("ロータス社", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(125);

        Assert.assertEquals("キーボードから入力された文字を受け付けて、漢字仮名混じり文変換し、ワープロソフトなどに渡す機能も持つプログラムの総称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＥＰ", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＴＯＫ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＱＬ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＯＳ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＩＲ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(126);

        Assert.assertEquals("「ＦＥＰ」って何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フロントエンドプロセッサ", q.getAnswerList().get(0));
        Assert.assertEquals("フリーエディットプログラム", q.getAnswerList().get(1));
        Assert.assertEquals("フリーエラープログラム", q.getAnswerList().get(2));
        Assert.assertEquals("ファイルエンドプライム", q.getAnswerList().get(3));
        Assert.assertEquals("ファースト＆エンドホーン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(127);

        Assert.assertEquals("ユーザが最後に変換した漢字や頻繁に使う漢字を、次に使う場合、最も高い優先順位として表示する機能", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("学習機能", q.getAnswerList().get(0));
        Assert.assertEquals("優先機能", q.getAnswerList().get(1));
        Assert.assertEquals("辞書機能", q.getAnswerList().get(2));
        Assert.assertEquals("暗記機能", q.getAnswerList().get(3));
        Assert.assertEquals("採点機能", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(128);

        Assert.assertEquals("ＩＢＭ－ＰＣなどのＤＯＳ／Ｖマシンにおける、２ＨＤのフロッピィディスクのフォーマット形式は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１．４４ＭＢ", q.getAnswerList().get(0));
        Assert.assertEquals("１．２　ＭＢ", q.getAnswerList().get(1));
        Assert.assertEquals("１．２４ＭＢ", q.getAnswerList().get(2));
        Assert.assertEquals("１．０　ＭＢ", q.getAnswerList().get(3));
        Assert.assertEquals("　６４０ＫＢ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(129);

        Assert.assertEquals("データ互換のために、１レコード（１件分のデータ）をカンマで区切って１行に並べて記録する形式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＳＶ形式", q.getAnswerList().get(0));
        Assert.assertEquals("Ｋ３形式", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＹＬＫ形式", q.getAnswerList().get(2));
        Assert.assertEquals("ＲＤＢ形式", q.getAnswerList().get(3));
        Assert.assertEquals("福女商形式", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(130);

        Assert.assertEquals("ＭＳ－ＤＯＳのコマンドは２つに分けることができるが、分けたときの呼び名は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("内部コマンド・外部コマンド", q.getAnswerList().get(0));
        Assert.assertEquals("メインコマンド・サブコマンド", q.getAnswerList().get(1));
        Assert.assertEquals("主コマンド・副コマンド", q.getAnswerList().get(2));
        Assert.assertEquals("行コマンド・列コマンド", q.getAnswerList().get(3));
        Assert.assertEquals("制御コマンド・実行コマンド", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(131);

        Assert.assertEquals("ＭＳ－ＤＯＳが起動すると、何というプログラムがメモリに常駐する？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＯＭＭＡＮＤ．ＣＯＭ", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＯ．ＳＹＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＳＤＯＳ．ＳＹＳ", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＲＩＫＡ１Ａ．ＥＸＥ", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＭＭ３８６．ＥＸＥ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(132);

        Assert.assertEquals("ＣＯＭＭＡＮＤ．ＣＯＭに含まれていて、いつも実行できるコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("内部コマンド", q.getAnswerList().get(0));
        Assert.assertEquals("外部コマンド", q.getAnswerList().get(1));
        Assert.assertEquals("制御コマンド", q.getAnswerList().get(2));
        Assert.assertEquals("実行コマンド", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＯＳコマンド", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(133);

        Assert.assertEquals("外部記憶装置にプログラムとして保存され、必要に応じてそこから呼び出されるＭＳ－ＤＯＳのコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("外部コマンド", q.getAnswerList().get(0));
        Assert.assertEquals("内部コマンド", q.getAnswerList().get(1));
        Assert.assertEquals("制御コマンド", q.getAnswerList().get(2));
        Assert.assertEquals("補助コマンド", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳコマンド", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(134);

        Assert.assertEquals("ＭＳ－ＤＯＳが起動したときなどの現れる「Ａ＞」。何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プロンプト", q.getAnswerList().get(0));
        Assert.assertEquals("ディレクトリ", q.getAnswerList().get(1));
        Assert.assertEquals("カレント", q.getAnswerList().get(2));
        Assert.assertEquals("ワイルドカード", q.getAnswerList().get(3));
        Assert.assertEquals("「Ａ」が大きい！", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(135);

        Assert.assertEquals("ＭＳ－ＤＯＳのプロンプト（例　Ａ＞）における、「Ａ」って何の意味？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("現在使用中のドライブ名", q.getAnswerList().get(0));
        Assert.assertEquals("現在使用中のトイレ名", q.getAnswerList().get(1));
        Assert.assertEquals("直前に使用したドライブ名", q.getAnswerList().get(2));
        Assert.assertEquals("直前に使用したコマンド名", q.getAnswerList().get(3));
        Assert.assertEquals("ＡＫＩＫＯ（明子）の「Ａ」", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(136);

        Assert.assertEquals("ＭＳ－ＤＯＳでは、ドライブに付けられる番号は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ、Ｂ、Ｃ・・・", q.getAnswerList().get(0));
        Assert.assertEquals("１、２、３・・・", q.getAnswerList().get(1));
        Assert.assertEquals("ア、イ、ウ・・・", q.getAnswerList().get(2));
        Assert.assertEquals("イー、アル、サン・・・", q.getAnswerList().get(3));
        Assert.assertEquals("ド、レ、ミ・・・", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(137);

        Assert.assertEquals("プロンプトで表示されているドライブ装置で、現在の操作対象となっているもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("カレントドライブ", q.getAnswerList().get(0));
        Assert.assertEquals("ドライブスルー", q.getAnswerList().get(1));
        Assert.assertEquals("ルートディレクトリ", q.getAnswerList().get(2));
        Assert.assertEquals("ルートドライブ", q.getAnswerList().get(3));
        Assert.assertEquals("ワークドライブ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(138);

        Assert.assertEquals("ＭＳ－ＤＯＳのファイル名は、何と何から構成される？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("主ファイル名・拡張子", q.getAnswerList().get(0));
        Assert.assertEquals("サブファイル名・データ名", q.getAnswerList().get(1));
        Assert.assertEquals("データファイル名・拡張子", q.getAnswerList().get(2));
        Assert.assertEquals("サブファイル名・識別子", q.getAnswerList().get(3));
        Assert.assertEquals("主ファイル名・識別子", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(139);

        Assert.assertEquals("ＭＳ－ＤＯＳの（主）ファイル名は、何文字までと決まっている？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("半角・８文字以内", q.getAnswerList().get(0));
        Assert.assertEquals("半角・６文字以内", q.getAnswerList().get(1));
        Assert.assertEquals("半角・７文字以内", q.getAnswerList().get(2));
        Assert.assertEquals("全角・８文字以内", q.getAnswerList().get(3));
        Assert.assertEquals("全角・６文字以内", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(140);

        Assert.assertEquals("ＭＳ－ＤＯＳの（主）ファイル名は、何文字までと決まっている？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("全角・４文字以内", q.getAnswerList().get(0));
        Assert.assertEquals("半角・６文字以内", q.getAnswerList().get(1));
        Assert.assertEquals("半角・９文字以内", q.getAnswerList().get(2));
        Assert.assertEquals("全角・６文字以内", q.getAnswerList().get(3));
        Assert.assertEquals("全角・８文字以内", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(141);

        Assert.assertEquals("ＭＳ－ＤＯＳの拡張子は、何文字までと決まっている？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("半角・３文字以内", q.getAnswerList().get(0));
        Assert.assertEquals("半角・６文字以内", q.getAnswerList().get(1));
        Assert.assertEquals("半角・８文字以内", q.getAnswerList().get(2));
        Assert.assertEquals("全角・３文字以内", q.getAnswerList().get(3));
        Assert.assertEquals("全角・８文字以内", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(142);

        Assert.assertEquals("ＭＳ－ＤＯＳの（主）ファイル名で、使用できない文字はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("／", q.getAnswerList().get(0));
        Assert.assertEquals("’", q.getAnswerList().get(1));
        Assert.assertEquals("！", q.getAnswerList().get(2));
        Assert.assertEquals("％", q.getAnswerList().get(3));
        Assert.assertEquals("（", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(143);

        Assert.assertEquals("次の中で、実行形式のＭＳ－ＤＯＳファイルの拡張子はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＯＭ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＯＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＨＬＰ", q.getAnswerList().get(2));
        Assert.assertEquals("ＴＸＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＹＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(144);

        Assert.assertEquals("次の中で、実行形式のＭＳ－ＤＯＳファイルの拡張子はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＸＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＢＡＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＩＣ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＡＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＢＡＫ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(145);

        Assert.assertEquals("ＭＳ－ＤＯＳのファイル管理の特徴の一つ。ツリー構造とも言う", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("階層ディレクトリ", q.getAnswerList().get(0));
        Assert.assertEquals("サブディレクトリ", q.getAnswerList().get(1));
        Assert.assertEquals("制御ディレクトリ", q.getAnswerList().get(2));
        Assert.assertEquals("番地ディレクトリ", q.getAnswerList().get(3));
        Assert.assertEquals("カレントディレクトリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(146);

        Assert.assertEquals("階層ディレクトリにおいて、最も最上部のおおもとのディレクトリ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ルートディレクトリ", q.getAnswerList().get(0));
        Assert.assertEquals("カレントディレクトリ", q.getAnswerList().get(1));
        Assert.assertEquals("メインディレクトリ", q.getAnswerList().get(2));
        Assert.assertEquals("サブディレクトリ", q.getAnswerList().get(3));
        Assert.assertEquals("クリスマスツリー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(147);

        Assert.assertEquals("ディレクトリの中のディレクトリ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サブディレクトリ", q.getAnswerList().get(0));
        Assert.assertEquals("ルートディレクトリ", q.getAnswerList().get(1));
        Assert.assertEquals("ザブディレクトリ", q.getAnswerList().get(2));
        Assert.assertEquals("レートディレクトリ", q.getAnswerList().get(3));
        Assert.assertEquals("副ディレタトリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(148);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ディレクトリの中に記録されているファイル名を表示するコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＩＲ", q.getAnswerList().get(0));
        Assert.assertEquals("ＴＹＰＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＰＲＩＮＴ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＵＭＰ", q.getAnswerList().get(3));
        Assert.assertEquals("ＬＵＣＫ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(149);

        Assert.assertEquals("通常、ＭＳ－ＤＯＳの「ＤＩＲ」コマンドで、／Ｗスイッチを指定すると、１行に表示されるファイル名は何個？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("５個", q.getAnswerList().get(0));
        Assert.assertEquals("４個", q.getAnswerList().get(1));
        Assert.assertEquals("３個", q.getAnswerList().get(2));
        Assert.assertEquals("２個", q.getAnswerList().get(3));
        Assert.assertEquals("６個", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(150);

        Assert.assertEquals("ＭＳ－ＤＯＳの「ＤＩＲ」コマンドの、／Ｐスイッチの意味は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１画面ごとにスクロール停止", q.getAnswerList().get(0));
        Assert.assertEquals("１ファイルごとスクロール停止", q.getAnswerList().get(1));
        Assert.assertEquals("ファイル名を横いっぱいに表示", q.getAnswerList().get(2));
        Assert.assertEquals("ファイル名の日時を表示しない", q.getAnswerList().get(3));
        Assert.assertEquals("ファイルサイズを表示しない", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(151);

        Assert.assertEquals("トランプのジョーカーと同じ。自分の希望の文字に変身させることができる魔法の記号。通常２つある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワイルドカード", q.getAnswerList().get(0));
        Assert.assertEquals("へんしんカード", q.getAnswerList().get(1));
        Assert.assertEquals("オールマイティカード", q.getAnswerList().get(2));
        Assert.assertEquals("バッチカード", q.getAnswerList().get(3));
        Assert.assertEquals("ディレクトリカード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(152);

        Assert.assertEquals("任意の複数文字を意味するワイルドカードは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アスタリスク（＊）", q.getAnswerList().get(0));
        Assert.assertEquals("スラッシュ（／）", q.getAnswerList().get(1));
        Assert.assertEquals("ハイフン（－）", q.getAnswerList().get(2));
        Assert.assertEquals("クウェスチョン（？）", q.getAnswerList().get(3));
        Assert.assertEquals("パーセント（％）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(153);

        Assert.assertEquals("任意の１文字を意味するワイルドカードは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("？", q.getAnswerList().get(0));
        Assert.assertEquals("＊", q.getAnswerList().get(1));
        Assert.assertEquals("！", q.getAnswerList().get(2));
        Assert.assertEquals("￥", q.getAnswerList().get(3));
        Assert.assertEquals("＞", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(154);

        Assert.assertEquals("「ＡＢＣ．ＤＡＴ」「ＡＣＥ．ＣＯＢ」「ＣＤＥ．ＥＸＥ」がある。ファイル名が「Ａ」から始まるファイルを表示するには？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＩＲ　Ａ＊．＊", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＩＲ　Ａ？．＊", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＩＲ　Ａ＊．？", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＩＲ　Ａ？．？", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＩＲ　Ａ？？？．＊", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(155);

        Assert.assertEquals("ＭＳ－ＤＯＳで、テキストファイルの内容を表示するコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＴＹＰＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＩＲ", q.getAnswerList().get(1));
        Assert.assertEquals("ＴＥＸＴ", q.getAnswerList().get(2));
        Assert.assertEquals("ＦＩＬＥＳ", q.getAnswerList().get(3));
        Assert.assertEquals("ＨＹＯＪＩ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(156);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ファイルの複写を行うコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＯＰＹ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＩＳＫＣＯＰＹ", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＯＶＥ", q.getAnswerList().get(2));
        Assert.assertEquals("ＦＩＬＥＣＯＰＹ", q.getAnswerList().get(3));
        Assert.assertEquals("ＦＣＯＰＹ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(157);

        Assert.assertEquals("ＭＳ－ＤＯＳで、Ａドライブのファイルを全てＢドライブに複写したい。コマンドの書式は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＯＰＹ　Ａ：＊．＊　Ｂ：", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＯＰＹ　Ａ：＊．＊　／Ｂ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＯＰＹ　Ａ：￥＊．＊　Ｂ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＯＰＹ　Ａ：￥＊　Ｂ：", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＯＰＹ　Ａ：＊．＊　Ｂ／", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(158);

        Assert.assertEquals("ＭＳ－ＤＯＳで、新しいディレクトリを作るコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＤ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＦＤ", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(159);

        Assert.assertEquals("ＭＳ－ＤＯＳで、カレントディレクトリを変更するコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＨＤＩＲ", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＨＤ", q.getAnswerList().get(3));
        Assert.assertEquals("ＩＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(160);

        Assert.assertEquals("ＭＳ－ＤＯＳで、「ＫＡＭＡＣ」という新しいディレクトリを作るコマンドの記述は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＤ　ＫＡＭＡＣ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＤ　ＫＡＭＡＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＤ　ＫＡＭＡＣ", q.getAnswerList().get(2));
        Assert.assertEquals("ＮＫＤＩＲ　ＫＡＭＡＣ", q.getAnswerList().get(3));
        Assert.assertEquals("ＲＭＤＩＲ　ＫＡＭＡＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(161);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ディレクトリを削除するコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＤ", q.getAnswerList().get(0));
        Assert.assertEquals("ＫＩＬＬ", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＫＤＩＲ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＥＬＥＴＥ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＥＬ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(162);

        Assert.assertEquals("ＭＳ－ＤＯＳで、指定したファイルを削除するコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＥＬ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＥＬＥＴＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＫＩＬＬ", q.getAnswerList().get(2));
        Assert.assertEquals("ＲＤ", q.getAnswerList().get(3));
        Assert.assertEquals("ＦＫＩＬＬ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(163);

        Assert.assertEquals("ＭＳ－ＤＯＳで、指定したファイルを削除するコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＲＡＳＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＥＬＥＴＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＫＩＬＬ", q.getAnswerList().get(2));
        Assert.assertEquals("ＴＯＮＤＥＫＥ！", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＫＤＩＲ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(164);

        Assert.assertEquals("次のＭＳ－ＤＯＳのコマンドで、内部コマンドでないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＯＲＭＡＴ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＯＰＹ", q.getAnswerList().get(1));
        Assert.assertEquals("ＴＹＰＥ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＩＲ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＡＴＥ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(165);

        Assert.assertEquals("ＭＳ－ＤＯＳで、新たに購入したフロッピィディスクなどを初期化するコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＯＲＭＡＴ", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＮＳＴＡＬＬ", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＥＳＴＯＲＥ", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＨＯＫＩＫＡ", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＹＳＴＥＭ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(166);

        Assert.assertEquals("ＭＳ－ＤＯＳで、Ｂドライブのフロッピィディスクを初期化した後、システムを転送するときのコマンドの記述は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＯＲＭＡＴ　Ｂ：　／Ｓ", q.getAnswerList().get(0));
        Assert.assertEquals("ＦＯＲＭＡＴ　Ｓ：　／Ｂ", q.getAnswerList().get(1));
        Assert.assertEquals("ＦＯＲＭＡＴ　Ｂ／　Ｓ：", q.getAnswerList().get(2));
        Assert.assertEquals("ＦＯＲＭＡＴ　Ｂ：　Ｓ", q.getAnswerList().get(3));
        Assert.assertEquals("ＦＯＲＭＡＴ　Ｂ／　Ｓ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(167);

        Assert.assertEquals("ＭＳ－ＤＯＳのＦＯＲＭＡＴコマンドで、ハードディスクを初期化するときのスイッチは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("／Ｈ", q.getAnswerList().get(0));
        Assert.assertEquals("／Ｄ", q.getAnswerList().get(1));
        Assert.assertEquals("／Ｆ", q.getAnswerList().get(2));
        Assert.assertEquals("／Ｓ", q.getAnswerList().get(3));
        Assert.assertEquals("／Ａ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(168);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ＡドライブからＢドライブにフロッピィディスクの複写を行うコマンドの記述は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＩＳＫＣＯＰＹ　Ａ：　Ｂ：", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＯＰＹＤＩＳＫ　Ａ：　Ｂ：", q.getAnswerList().get(1));
        Assert.assertEquals("ＦＤＣＯＰＹ　Ａ：￥　Ｂ：￥", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＯＶＥＣＯＰＹ　Ａ：　Ｂ：", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＩＳＫＭＯＶＥ　Ａ：　Ｂ：", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(169);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ディスクの使用状態を調べて結果を画面などに出力するコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＨＫＤＳＫ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＨＯＳＡ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＩＳＫＣＨＥＣＫ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＩＳＫＣＫ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＩＳＫ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(170);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ディスク上の各ファイルの位置や属性などを管理しているところ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＡＴ", q.getAnswerList().get(0));
        Assert.assertEquals("ＧＡＰ４", q.getAnswerList().get(1));
        Assert.assertEquals("セクタ", q.getAnswerList().get(2));
        Assert.assertEquals("クラスタ", q.getAnswerList().get(3));
        Assert.assertEquals("通産省", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(171);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ハードディスクのファイルをフロッピィディスクなどに分割して待避・記録させるコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＢＡＣＫＵＰ", q.getAnswerList().get(0));
        Assert.assertEquals("ＲＥＳＴＯＲＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＯＰＹ２", q.getAnswerList().get(2));
        Assert.assertEquals("ＸＭＯＤＥＭ", q.getAnswerList().get(3));
        Assert.assertEquals("Ｈ／ＦＣＯＰＹ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(172);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ＢＡＣＫＵＰコマンドでバックアップしたファイルをハードディスクに戻すときのコマンド", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＥＳＴＯＲＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＢＡＣＫ", q.getAnswerList().get(1));
        Assert.assertEquals("ＢＡＣＫＤＯＷＮ", q.getAnswerList().get(2));
        Assert.assertEquals("Ｔ－ＢＡＣＫ", q.getAnswerList().get(3));
        Assert.assertEquals("ＦＩＬＥＢＡＣＫ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(173);

        Assert.assertEquals("次の中で、「一太郎Ｖｅｒ６」というワープロソフトに付属しているＦＥＰは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＡＴＯＫ９", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＴＯＫ７", q.getAnswerList().get(1));
        Assert.assertEquals("ウルトラ７", q.getAnswerList().get(2));
        Assert.assertEquals("松茸", q.getAnswerList().get(3));
        Assert.assertEquals("椎茸", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(174);

        Assert.assertEquals("明朝体やゴシック体などの文字の字体", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フォント", q.getAnswerList().get(0));
        Assert.assertEquals("シソーラス", q.getAnswerList().get(1));
        Assert.assertEquals("チャート", q.getAnswerList().get(2));
        Assert.assertEquals("スキーマ", q.getAnswerList().get(3));
        Assert.assertEquals("ベクター", q.getAnswerList().get(4));
    }

    private void subtest_build_genre5(IGotakuInfo gotaku) {
        IGotakuGenreInfo genre = gotaku.getGenreList().get(4);

        Assert.assertEquals("表計算とＤＢ", genre.getName());

        Assert.assertEquals(142, genre.getQuestionList().size());

        IGotakuQuestionInfo q = genre.getQuestionList().get(0);

        Assert.assertEquals("表計算ソフトで、縦横のます目で区切られた集計用紙のような画面", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワークシート", q.getAnswerList().get(0));
        Assert.assertEquals("何がおかシート？", q.getAnswerList().get(1));
        Assert.assertEquals("セル", q.getAnswerList().get(2));
        Assert.assertEquals("セルポインタ", q.getAnswerList().get(3));
        Assert.assertEquals("アイコン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(1);

        Assert.assertEquals("次の中で、表計算ソフトとは異質のものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スキーマ", q.getAnswerList().get(0));
        Assert.assertEquals("スプレッドシート", q.getAnswerList().get(1));
        Assert.assertEquals("カルク", q.getAnswerList().get(2));
        Assert.assertEquals("シミュレーション", q.getAnswerList().get(3));
        Assert.assertEquals("アクティブセル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(2);

        Assert.assertEquals("ＬＯＴＵＳ１２３で扱えるワークシートの大きさは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("　８１９２行×２５６列", q.getAnswerList().get(0));
        Assert.assertEquals("１６３８４行×２５６列", q.getAnswerList().get(1));
        Assert.assertEquals("　４０９６行×１２８列", q.getAnswerList().get(2));
        Assert.assertEquals("　８１９２行×１２８列", q.getAnswerList().get(3));
        Assert.assertEquals("　４０９６行×２５６列", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(3);

        Assert.assertEquals("表計算ソフトで、現在入力・編集の対象となっているセル", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アクティブセル", q.getAnswerList().get(0));
        Assert.assertEquals("カルーセル", q.getAnswerList().get(1));
        Assert.assertEquals("ポイントセル", q.getAnswerList().get(2));
        Assert.assertEquals("ワーキングセル", q.getAnswerList().get(3));
        Assert.assertEquals("コマンドセル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(4);

        Assert.assertEquals("表計算ソフトで、縦方向（行）に１，２・・と連番を、横方向（列）にＡ，Ｂ・・とアルファベットを付ける方式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ１方式", q.getAnswerList().get(0));
        Assert.assertEquals("Ｒ１Ｃ１方式", q.getAnswerList().get(1));
        Assert.assertEquals("Ｒ１Ｆ１方式", q.getAnswerList().get(2));
        Assert.assertEquals("行列方式", q.getAnswerList().get(3));
        Assert.assertEquals("縦横方式", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(5);

        Assert.assertEquals("表計算ソフトで、セルに入力するデータとして異質なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("画像", q.getAnswerList().get(0));
        Assert.assertEquals("数値", q.getAnswerList().get(1));
        Assert.assertEquals("文字列", q.getAnswerList().get(2));
        Assert.assertEquals("計算式", q.getAnswerList().get(3));
        Assert.assertEquals("関数", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(6);

        Assert.assertEquals("表計算ソフトで日付は連番で管理されるが、ＬＯＴＵＳ１２３では、どの時点を「１」としているか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１９００年１月１日", q.getAnswerList().get(0));
        Assert.assertEquals("１８５０年１月１日", q.getAnswerList().get(1));
        Assert.assertEquals("１９５０年１月１日", q.getAnswerList().get(2));
        Assert.assertEquals("１８００年１月１日", q.getAnswerList().get(3));
        Assert.assertEquals("１９５８年６月２０日", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(7);

        Assert.assertEquals("ワークシートを縦の構成と横の構成で分割したときの１つのます目", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("セル", q.getAnswerList().get(0));
        Assert.assertEquals("カーソル", q.getAnswerList().get(1));
        Assert.assertEquals("ワークシート", q.getAnswerList().get(2));
        Assert.assertEquals("セルポインタ", q.getAnswerList().get(3));
        Assert.assertEquals("ポインタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(8);

        Assert.assertEquals("「Ｂ３」などのように、列と行を結合した形式で表現されるもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("セル番地", q.getAnswerList().get(0));
        Assert.assertEquals("相対番地", q.getAnswerList().get(1));
        Assert.assertEquals("絶対番地", q.getAnswerList().get(2));
        Assert.assertEquals("識別子", q.getAnswerList().get(3));
        Assert.assertEquals("範囲名", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(9);

        Assert.assertEquals("ＬＯＴＵＳ１２３の場合、文字データの先頭には識別子として何が付く？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("’", q.getAnswerList().get(0));
        Assert.assertEquals("＋", q.getAnswerList().get(1));
        Assert.assertEquals("＠", q.getAnswerList().get(2));
        Assert.assertEquals("＾", q.getAnswerList().get(3));
        Assert.assertEquals("”", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(10);

        Assert.assertEquals("表計算ソフトで、一般に合計を求める関数は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＳＵＭ", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＡＶＧ", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＧＯＫ", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＧＯＵ", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＫＥＩ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(11);

        Assert.assertEquals("表計算ソフトで、一般に順位を求める関数は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＲＡＮＫ", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＬＡＮＫ", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＪＵＮＩ", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＳＯＲＴ", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＪＵＮ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(12);

        Assert.assertEquals("計算の対象となっているセル番地を、自動変更しないようにして複写する場合の最も大事な注意点は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("複写元が絶対番地化されている", q.getAnswerList().get(0));
        Assert.assertEquals("複写元が相対番地化されている", q.getAnswerList().get(1));
        Assert.assertEquals("複写元が文字データである", q.getAnswerList().get(2));
        Assert.assertEquals("複写元が数値データである", q.getAnswerList().get(3));
        Assert.assertEquals("複写元に計算式が存在する", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(13);

        Assert.assertEquals("例えば、Ａ３の番地を、行に対して絶対番地化すると？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ＄３", q.getAnswerList().get(0));
        Assert.assertEquals("＄Ａ３", q.getAnswerList().get(1));
        Assert.assertEquals("Ａ３", q.getAnswerList().get(2));
        Assert.assertEquals("＄Ａ＄３", q.getAnswerList().get(3));
        Assert.assertEquals("Ａ３＄", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(14);

        Assert.assertEquals("表計算ソフトの次の関数の中で、統計関数と算術関数以外のものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＩＦ", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＳＵＭ", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＰＵＲＥＡＶＧ", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＩＮＴ", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＭＯＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(15);

        Assert.assertEquals("表計算ソフトで、セルＢ２からＤ５の範囲に入力されている数値の合計に対して、数値が入力されているセルの数で割る計算式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＰＵＲＥＡＶＧ（Ｂ２～Ｄ５）", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＶＧ（Ｂ２～Ｄ５）", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＯＤ（Ｂ２～Ｄ５）", q.getAnswerList().get(2));
        Assert.assertEquals("ＲＯＵＮＤ（Ｂ２～Ｄ５）", q.getAnswerList().get(3));
        Assert.assertEquals("ＲＯＵＮＤＵＰ（Ｂ２～Ｄ５）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(16);

        Assert.assertEquals("表計算ソフトで、一般に切り上げを行う関数", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＲＯＵＮＤＵＰ", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＲＯＵＮＤＩＮ", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＡＤＤ", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＩＮＴ", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＫＩＲＩＡＧＥ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(17);

        Assert.assertEquals("表計算ソフトで、Ｃ５のセルに入力されている値を３で割った余りを求める関数", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＭＯＤ（Ｃ５，３）", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＩＮＴ（Ｃ５，３）", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＣＮＴ（Ｃ５，３）", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＩＮＴ（Ｃ５：３）", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＭＱＤ（Ｃ５，３）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(18);

        Assert.assertEquals("表計算ソフトで、Ｂ３のセルに西暦年を表示する関数", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＹＥＡＲ（Ｂ３）", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＮＥＮ（Ｂ３）", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＷＡＲＥＫＩ（Ｂ３）", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＴＯＤＡＹ（Ｂ３）", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＤＡＹ（Ｂ３）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(19);

        Assert.assertEquals("表計算ソフトで、Ｂ４のセルに入力されている文字データの中から「福」という文字を探し出し、何文字目にあるかを求める関数", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＩＮＤ（”福”，Ｂ４，２）", q.getAnswerList().get(0));
        Assert.assertEquals("ＬＯＯＫ（”福”，Ｂ４，２）", q.getAnswerList().get(1));
        Assert.assertEquals("ＥＯＦ（”福”，Ｂ４，２）", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＴＲ（”福”，Ｂ４，２）", q.getAnswerList().get(3));
        Assert.assertEquals("ＲＥＡＤ（”福”，Ｂ４，２）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(20);

        Assert.assertEquals("表計算ソフトの　＠ＩＦ関数で、Ａ３のセルが１０以下という場合の条件式の書式は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ３＜１１", q.getAnswerList().get(0));
        Assert.assertEquals("Ａ３＜＝９", q.getAnswerList().get(1));
        Assert.assertEquals("Ａ３＝＜１０", q.getAnswerList().get(2));
        Assert.assertEquals("Ａ３＜＝１１", q.getAnswerList().get(3));
        Assert.assertEquals("Ａ３＜１０", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(21);

        Assert.assertEquals("表計算ソフトの　＠ＩＦ関数で、Ａ４のセルの値が５を超えて、なおかつＢ３～という場合の条件式の書式は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ４＞５　＃ＡＮＤ＃　Ｂ３", q.getAnswerList().get(0));
        Assert.assertEquals("Ａ４＞＝５　＃ＡＮＤ＃　Ｂ３", q.getAnswerList().get(1));
        Assert.assertEquals("Ａ４＝＞５　＃ＡＮＤ＃　Ｂ３", q.getAnswerList().get(2));
        Assert.assertEquals("Ａ４＜５　＃ＡＮＤ＃　Ｂ３", q.getAnswerList().get(3));
        Assert.assertEquals("Ａ４＜５　＃ＯＲ＃　Ｂ３", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(22);

        Assert.assertEquals("表計算ソフトで、条件を設定する論理式において「論理和」の算術演算記号はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＃ＯＲ＃", q.getAnswerList().get(0));
        Assert.assertEquals("＃ＮＯＴ＃", q.getAnswerList().get(1));
        Assert.assertEquals("＃ＡＮＤ＃", q.getAnswerList().get(2));
        Assert.assertEquals("＃ＸＯＲ＃", q.getAnswerList().get(3));
        Assert.assertEquals("＃ＡＤＤ＃", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(23);

        Assert.assertEquals("表計算ソフトで、Ｂ５のセルからＧ９のセルの中で最も小さい数値を求める場合の関数", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＭＩＮ（Ｂ５～Ｇ９）", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＭＡＸ（Ｂ５～Ｇ９）", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＤＡＩ（Ｂ５～Ｇ９）", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＳＨＯ（Ｂ５～Ｇ９）", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＭＩＮ（Ｇ９．Ｂ５）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(24);

        Assert.assertEquals("表計算ソフトの次の関数で、「表参照関数」はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＶＬＯＯＫＵＰ", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＤＣＯＵＮＴ", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＩＤＥＸ", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＦＩＮＤ", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＫＡＭＡＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(25);

        Assert.assertEquals("表計算ソフトの関数、＠ＶＬＯＯＫＵＰ（引数１，２，３）で、引数１に入力する内容は何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("照合値（またはそのセル）", q.getAnswerList().get(0));
        Assert.assertEquals("表（マスタ）の範囲", q.getAnswerList().get(1));
        Assert.assertEquals("参照データの表中の位置＝列番", q.getAnswerList().get(2));
        Assert.assertEquals("参照データの表中の位置＝行番", q.getAnswerList().get(3));
        Assert.assertEquals("照合範囲", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(26);

        Assert.assertEquals("表計算ソフトの関数で、引数１に表の範囲・引数２に参照データの列位置・引数３に参照データの行位置を記述する関数", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＩＮＤＥＸ", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＨＬＯＯＫＵＰ", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＶＬＯＯＫＵＰ", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＩＦ", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＤＣＯＵＮＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(27);

        Assert.assertEquals("表計算ソフトで、＠ＶＬＯＯＫＵＰ（６，Ｂ３～Ｅ５，２）の場合、参照データの表中の位置（列番）を表しているのはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("２", q.getAnswerList().get(0));
        Assert.assertEquals("６", q.getAnswerList().get(1));
        Assert.assertEquals("Ｂ３～Ｅ５", q.getAnswerList().get(2));
        Assert.assertEquals("６，Ｂ３～Ｅ５", q.getAnswerList().get(3));
        Assert.assertEquals("Ｂ３～Ｅ５，２", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(28);

        Assert.assertEquals("表計算ソフトで、＠ＨＬＯＯＫＵＰ（５，Ｂ２～Ｆ５，３）の場合、照合値を表しているのはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("５", q.getAnswerList().get(0));
        Assert.assertEquals("３", q.getAnswerList().get(1));
        Assert.assertEquals("Ｂ２～Ｆ５", q.getAnswerList().get(2));
        Assert.assertEquals("５，Ｂ２～Ｆ５", q.getAnswerList().get(3));
        Assert.assertEquals("Ｂ２～Ｆ５，３", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(29);

        Assert.assertEquals("例えば、セルＢ２からＥ５のデータを対象に、その範囲で２列目と３行目で確定するデータを参照する場合に使用する関数", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＩＮＤＥＸ", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＨＬＯＯＫＵＰ", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＶＬＯＯＫＵＰ", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＨＲＯＯＫＵＰ", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＰＵＲＥ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(30);

        Assert.assertEquals("表計算ソフトで、＠ＶＬＯＯＫＵＰ関数を使用する場合、参照する表の最左列のデータは（　　）に整列されていることが前提", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("昇順", q.getAnswerList().get(0));
        Assert.assertEquals("降順", q.getAnswerList().get(1));
        Assert.assertEquals("五十音順", q.getAnswerList().get(2));
        Assert.assertEquals("日付順", q.getAnswerList().get(3));
        Assert.assertEquals("背の高い順", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(31);

        Assert.assertEquals("表計算ソフトで、＠ＨＬＯＯＫＵＰ関数を使用する場合、参照する表の（　　）のデータは（　　）に整列されていることが前提", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("先頭行・昇順", q.getAnswerList().get(0));
        Assert.assertEquals("最左列・昇順", q.getAnswerList().get(1));
        Assert.assertEquals("最終行・降順", q.getAnswerList().get(2));
        Assert.assertEquals("先頭行・降順", q.getAnswerList().get(3));
        Assert.assertEquals("最左列・降順", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(32);

        Assert.assertEquals("表計算ソフトで、＠ＤＳＵＭ（引数１，引数２，引数３）というデータベース統計関数を利用する場合、引数１に設定するもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表範囲", q.getAnswerList().get(0));
        Assert.assertEquals("対象列番号", q.getAnswerList().get(1));
        Assert.assertEquals("条件設定範囲", q.getAnswerList().get(2));
        Assert.assertEquals("抽出条件", q.getAnswerList().get(3));
        Assert.assertEquals("対象行番号", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(33);

        Assert.assertEquals("表計算ソフト「ＬＯＴＵＳ１２３」で、データベース統計関数に関して誤っているものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＲもＡＮＤも同列に設定する", q.getAnswerList().get(0));
        Assert.assertEquals("ＯＲ条件は異なる行に設定する", q.getAnswerList().get(1));
        Assert.assertEquals("ＡＮＤ条件は同一行に設定する", q.getAnswerList().get(2));
        Assert.assertEquals("条件式は論理関数と同様である", q.getAnswerList().get(3));
        Assert.assertEquals("論理和＝ＯＲ、論理積＝ＡＮＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(34);

        Assert.assertEquals("表計算ソフトの「ソート」について、次の説明の中で間違っているものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("見出し行もソート範囲に含める", q.getAnswerList().get(0));
        Assert.assertEquals("ソート＝分類＝整列", q.getAnswerList().get(1));
        Assert.assertEquals("昇順は小さい値から大きい値へ", q.getAnswerList().get(2));
        Assert.assertEquals("ソートキーは通常、複数指定可", q.getAnswerList().get(3));
        Assert.assertEquals("行も列もソートができる", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(35);

        Assert.assertEquals("表計算ソフトで関数を利用する場合、必ず関数の後に（　）があるが、その中に記述するものを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("引数", q.getAnswerList().get(0));
        Assert.assertEquals("因数", q.getAnswerList().get(1));
        Assert.assertEquals("書式", q.getAnswerList().get(2));
        Assert.assertEquals("論理式", q.getAnswerList().get(3));
        Assert.assertEquals("条件文", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(36);

        Assert.assertEquals("表計算ソフトで、＠ＳＵＭ（Ａ１．．Ａ５）と入力した場合、そのセルに実際に表示される値", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("戻り値", q.getAnswerList().get(0));
        Assert.assertEquals("リターン文", q.getAnswerList().get(1));
        Assert.assertEquals("返り血", q.getAnswerList().get(2));
        Assert.assertEquals("引数", q.getAnswerList().get(3));
        Assert.assertEquals("ネスティング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(37);

        Assert.assertEquals("表計算ソフトの次の関数の中で、「引数」を持たないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＰＩ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＳＵＭ", q.getAnswerList().get(1));
        Assert.assertEquals("ＩＮＤＥＸ", q.getAnswerList().get(2));
        Assert.assertEquals("ＡＢＳ", q.getAnswerList().get(3));
        Assert.assertEquals("ＶＡＬ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(38);

        Assert.assertEquals("表計算ソフトに関する次の記述で、誤っているものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("一般に「ＵＮＤＯ」が可能", q.getAnswerList().get(0));
        Assert.assertEquals("データの型を指定する必要なし", q.getAnswerList().get(1));
        Assert.assertEquals("時はシリアル値で管理している", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＦ文はネスティングが可能", q.getAnswerList().get(3));
        Assert.assertEquals("列データはフィールドと呼ぶ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(39);

        Assert.assertEquals("表計算ソフトで、＠ＩＦ関数を使う場合、＠ＩＦ（［　］，［　］，［　］）に入る組み合わせの正しいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("論理式，真の場合，偽の場合", q.getAnswerList().get(0));
        Assert.assertEquals("論理式，偽の場合，真の場合", q.getAnswerList().get(1));
        Assert.assertEquals("数値式，偽の場合，真の場合", q.getAnswerList().get(2));
        Assert.assertEquals("数値式，真の場合，偽の場合", q.getAnswerList().get(3));
        Assert.assertEquals("諭理式，真の場合，偽の場合", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(40);

        Assert.assertEquals("通常、データベースを操作する場合の１件分のデータ。いわゆる「行」のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("レコード", q.getAnswerList().get(0));
        Assert.assertEquals("フィールド", q.getAnswerList().get(1));
        Assert.assertEquals("項目", q.getAnswerList().get(2));
        Assert.assertEquals("アイテム", q.getAnswerList().get(3));
        Assert.assertEquals("カラム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(41);

        Assert.assertEquals("通常、データベースを操作する場合の同じ特性を持ったそれぞれの項目。いわゆる「列」のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フィールド", q.getAnswerList().get(0));
        Assert.assertEquals("ファイル", q.getAnswerList().get(1));
        Assert.assertEquals("レコード", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＤ", q.getAnswerList().get(3));
        Assert.assertEquals("スキーマ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(42);

        Assert.assertEquals("表計算ソフトでデータベースの検索を行う場合、データベース範囲と（　　）の２つを指定する必要がある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("検索条件", q.getAnswerList().get(0));
        Assert.assertEquals("抽出範囲", q.getAnswerList().get(1));
        Assert.assertEquals("好きな人のタイプ", q.getAnswerList().get(2));
        Assert.assertEquals("タイトル行", q.getAnswerList().get(3));
        Assert.assertEquals("絶対指定", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(43);

        Assert.assertEquals("表計算ソフトで、目的（条件）にあったデータを探すこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("検索", q.getAnswerList().get(0));
        Assert.assertEquals("健作", q.getAnswerList().get(1));
        Assert.assertEquals("分類", q.getAnswerList().get(2));
        Assert.assertEquals("照合", q.getAnswerList().get(3));
        Assert.assertEquals("併合", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(44);

        Assert.assertEquals("表計算ソフトで、「氏名」「金額」などデータベース範囲の一番上にある見出しのこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フィールド名", q.getAnswerList().get(0));
        Assert.assertEquals("レコード名", q.getAnswerList().get(1));
        Assert.assertEquals("サブメニュー", q.getAnswerList().get(2));
        Assert.assertEquals("条件記号", q.getAnswerList().get(3));
        Assert.assertEquals("ワークシート名", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(45);

        Assert.assertEquals("表計算ソフト「ＬＯＴＵＳ１２３」の条件記号の中で、「等しくない」を表しているのは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＜＞", q.getAnswerList().get(0));
        Assert.assertEquals("ＮＯ", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＯＴ　＝", q.getAnswerList().get(2));
        Assert.assertEquals("不一致", q.getAnswerList().get(3));
        Assert.assertEquals("≠", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(46);

        Assert.assertEquals("表計算ソフトで、「単価が２００円以上で、値引が１０％未満」の検索式は「単価　＞＝　２００　（　　　　　）」である", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＃ＡＮＤ＃　値引　＜　０．１", q.getAnswerList().get(0));
        Assert.assertEquals("＃ＡＮＤ＃　値引　＜　１０", q.getAnswerList().get(1));
        Assert.assertEquals("＃ＯＲ＃　値引　＜　０．１", q.getAnswerList().get(2));
        Assert.assertEquals("＃ＯＲ＃　値引　＜　１０", q.getAnswerList().get(3));
        Assert.assertEquals("＃ＯＲ＃　値引　＞　０．１", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(47);

        Assert.assertEquals("「ＬＯＴＵＳ１２３」で、検索条件を横に並べて書くと（例えばＣ列の金額欄に　＞３０　Ｄ列の回収欄に　０）どういう意味？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("金額が３０を越えかつ回収が０", q.getAnswerList().get(0));
        Assert.assertEquals("金額が３０を越えるか回収が０", q.getAnswerList().get(1));
        Assert.assertEquals("金額も回収も０を越える", q.getAnswerList().get(2));
        Assert.assertEquals("金額が回収も０", q.getAnswerList().get(3));
        Assert.assertEquals("　", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(48);

        Assert.assertEquals("「ＬＯＴＵＳ１２３」で検索を行う場合、複合条件を作るのに検索条件を縦に並べて書くとどういう意味？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＲ", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＮＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＯＴ", q.getAnswerList().get(2));
        Assert.assertEquals("ＮＯＲ", q.getAnswerList().get(3));
        Assert.assertEquals("直列", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(49);

        Assert.assertEquals("表計算ソフトで、条件に合ったレコードとフィールドのみを取り出して新しい表を作ること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("抽出", q.getAnswerList().get(0));
        Assert.assertEquals("マージ", q.getAnswerList().get(1));
        Assert.assertEquals("セレクト", q.getAnswerList().get(2));
        Assert.assertEquals("生成", q.getAnswerList().get(3));
        Assert.assertEquals("射影", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(50);

        Assert.assertEquals("表計算ソフトで、レコードの抽出を行う場合に指定するものは、「データベース範囲」「（　　）」「抽出範囲」の３つである", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("抽出条件", q.getAnswerList().get(0));
        Assert.assertEquals("検索条件", q.getAnswerList().get(1));
        Assert.assertEquals("論理式", q.getAnswerList().get(2));
        Assert.assertEquals("涙の条件", q.getAnswerList().get(3));
        Assert.assertEquals("フィールド値", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(51);

        Assert.assertEquals("表計算ソフトで、抽出を行う場合の「抽出範囲の指定」とは、どこへ・（　　　）・何件表示するかの指定をいう", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("どのカラムを", q.getAnswerList().get(0));
        Assert.assertEquals("どの行を", q.getAnswerList().get(1));
        Assert.assertEquals("どのセルを", q.getAnswerList().get(2));
        Assert.assertEquals("どのレコードを", q.getAnswerList().get(3));
        Assert.assertEquals("どのＭＡＧファイルを", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(52);

        Assert.assertEquals("表計算ソフトで、商品番号などの固有の値をもとに他の表から商品名などの値を持ってくること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表引き", q.getAnswerList().get(0));
        Assert.assertEquals("綱引き", q.getAnswerList().get(1));
        Assert.assertEquals("地引き", q.getAnswerList().get(2));
        Assert.assertEquals("索引き", q.getAnswerList().get(3));
        Assert.assertEquals("けん引", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(53);

        Assert.assertEquals("表計算ソフトの、＠ＶＬＯＯＫＵＰ関数の引数の記述で正しいのはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("（検索値，範囲，列番号）", q.getAnswerList().get(0));
        Assert.assertEquals("（検索値，列番号，範囲）", q.getAnswerList().get(1));
        Assert.assertEquals("（範囲，検索値，列番号）", q.getAnswerList().get(2));
        Assert.assertEquals("（範囲，列番号，検索値）", q.getAnswerList().get(3));
        Assert.assertEquals("（列番号，範囲，検索値）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(54);

        Assert.assertEquals("表計算ソフトで、＠ＶＬＯＯＫＵＰ関数は、検索値と等しい値を検索するのではなく、（　　）を検索する", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("検索値以下の最大の値", q.getAnswerList().get(0));
        Assert.assertEquals("検索値以上の最小の値", q.getAnswerList().get(1));
        Assert.assertEquals("森田健作以上のいい男", q.getAnswerList().get(2));
        Assert.assertEquals("検索値未満の最大の値", q.getAnswerList().get(3));
        Assert.assertEquals("検索値を越える最小の値", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(55);

        Assert.assertEquals("表計算ソフトで、ワークシートのある範囲の中で、条件に合った数値の平均を求める関数", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＠ＤＡＶＧ", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＤＳＵＭ", q.getAnswerList().get(1));
        Assert.assertEquals("＠ＡＶＲ", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＡＶＧ", q.getAnswerList().get(3));
        Assert.assertEquals("＠ＨＥＩＫＩＮ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(56);

        Assert.assertEquals("表計算ソフトの、＠ＤＳＵＭ関数の引数の記述で正しいのはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("（範囲，フィールド，条件）", q.getAnswerList().get(0));
        Assert.assertEquals("（範囲，条件，レコード）", q.getAnswerList().get(1));
        Assert.assertEquals("（範囲，条件，フィールド）", q.getAnswerList().get(2));
        Assert.assertEquals("（条件，レコード，範囲）", q.getAnswerList().get(3));
        Assert.assertEquals("（条件，フィールド，範囲）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(57);

        Assert.assertEquals("表計算ソフトで、いくつかの処理手順をひとまとめにして自動実行できるようにしたもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マクロ機能", q.getAnswerList().get(0));
        Assert.assertEquals("オートスタート機能", q.getAnswerList().get(1));
        Assert.assertEquals("レジューム機能", q.getAnswerList().get(2));
        Assert.assertEquals("リストア機能", q.getAnswerList().get(3));
        Assert.assertEquals("リピート機能", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(58);

        Assert.assertEquals("表計算ソフトで、マクロ機能によって記録された一連の手続き", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マクロプログラム", q.getAnswerList().get(0));
        Assert.assertEquals("マグロ－ダー", q.getAnswerList().get(1));
        Assert.assertEquals("マクロアルゴリズム", q.getAnswerList().get(2));
        Assert.assertEquals("マイクロプログラム", q.getAnswerList().get(3));
        Assert.assertEquals("マタロプログラム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(59);

        Assert.assertEquals("表計算ソフトの活用があまり効果的でない業務と言えるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("建築物の間取図の作成", q.getAnswerList().get(0));
        Assert.assertEquals("借入金の返済計画表の作成", q.getAnswerList().get(1));
        Assert.assertEquals("資金シミュレーション", q.getAnswerList().get(2));
        Assert.assertEquals("統計学法によるアンケート分析", q.getAnswerList().get(3));
        Assert.assertEquals("販売管理や仕入管理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(60);

        Assert.assertEquals("表計算ソフトにおいて、複数の機能を対話形式で使用したものを、いくつかにまとめて登録するマクロ命令", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("基本マクロ命令", q.getAnswerList().get(0));
        Assert.assertEquals("応用マクロ命令", q.getAnswerList().get(1));
        Assert.assertEquals("マクロ専用命令", q.getAnswerList().get(2));
        Assert.assertEquals("キー標識命令", q.getAnswerList().get(3));
        Assert.assertEquals("カジキマグロ命令", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(61);

        Assert.assertEquals("表計算ソフトにおいて、マクロ命令の実行を制御する命令など、それ専用のもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マクロ専用命令", q.getAnswerList().get(0));
        Assert.assertEquals("マクロ基本命令", q.getAnswerList().get(1));
        Assert.assertEquals("基本マクロ命令", q.getAnswerList().get(2));
        Assert.assertEquals("応用マクロ命令", q.getAnswerList().get(3));
        Assert.assertEquals("専用ミクロ命令", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(62);

        Assert.assertEquals("表計算ソフト「ＬＯＴＵＳ１２３」では、基本マクロ命令・（　　）命令・マクロ専用命令の３つのマクロ命令がある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("キー標識", q.getAnswerList().get(0));
        Assert.assertEquals("関数マクロ", q.getAnswerList().get(1));
        Assert.assertEquals("コマンドマクロ", q.getAnswerList().get(2));
        Assert.assertEquals("マクロキー", q.getAnswerList().get(3));
        Assert.assertEquals("配置転換", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(63);

        Assert.assertEquals("表計算ソフト「ＥＸＣＥＬ（エクセル）」のマクロ命令には（　　）命令と（　　）命令がある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("コマンドマクロ・関数マクロ", q.getAnswerList().get(0));
        Assert.assertEquals("システムマクロ・シートマクロ", q.getAnswerList().get(1));
        Assert.assertEquals("キー標識マクロ・基本マクロ", q.getAnswerList().get(2));
        Assert.assertEquals("基本マクロ・専用マクロ", q.getAnswerList().get(3));
        Assert.assertEquals("カジキマクロ・ホンマクロ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(64);

        Assert.assertEquals("表計算ソフトのマクロプログラムは、（　　）処理・（　　）処理・（　　）処理の３つの制御構文で作成できる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("順次・分岐・ループ", q.getAnswerList().get(0));
        Assert.assertEquals("基本・応用・専用", q.getAnswerList().get(1));
        Assert.assertEquals("生ゴミ・不燃物・汚物", q.getAnswerList().get(2));
        Assert.assertEquals("順次・直接・索引順次", q.getAnswerList().get(3));
        Assert.assertEquals("コマンド・メニュー・バッチ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(65);

        Assert.assertEquals("表計算ソフトで、ある特定の機能を実現するためにこれを一つのマクロ（プログラム）として記録したもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サブルーチン", q.getAnswerList().get(0));
        Assert.assertEquals("アイコン", q.getAnswerList().get(1));
        Assert.assertEquals("メインメニュー", q.getAnswerList().get(2));
        Assert.assertEquals("スクリーンセーバ", q.getAnswerList().get(3));
        Assert.assertEquals("範囲名", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(66);

        Assert.assertEquals("表計算ソフトにおいて、その機能を補完する役目を果たすソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アドインソフト", q.getAnswerList().get(0));
        Assert.assertEquals("ドメインソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ＰＤＳ", q.getAnswerList().get(2));
        Assert.assertEquals("シェアウェア", q.getAnswerList().get(3));
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(67);

        Assert.assertEquals("表計算ソフトにおいて、実際に画面に表示されている部分", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ウィンドウ", q.getAnswerList().get(0));
        Assert.assertEquals("セル", q.getAnswerList().get(1));
        Assert.assertEquals("ワークシート", q.getAnswerList().get(2));
        Assert.assertEquals("スプレッドシート", q.getAnswerList().get(3));
        Assert.assertEquals("メニュー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(68);

        Assert.assertEquals("ワークシート上の数値や文字を変更したとき、関連するセル番地の計算を自動的に計算し直し正しい結果を求める機能", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("再計算機能", q.getAnswerList().get(0));
        Assert.assertEquals("複写機能", q.getAnswerList().get(1));
        Assert.assertEquals("再編集機能", q.getAnswerList().get(2));
        Assert.assertEquals("編集機能", q.getAnswerList().get(3));
        Assert.assertEquals("自動計算機能", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(69);

        Assert.assertEquals("ワークシートはかなり大きく、画面にはウィンドウしか表示できないが（　　）することによって他の部分を見ることもできる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スクロール", q.getAnswerList().get(0));
        Assert.assertEquals("アップロード", q.getAnswerList().get(1));
        Assert.assertEquals("ページコントロール", q.getAnswerList().get(2));
        Assert.assertEquals("ミラーリング", q.getAnswerList().get(3));
        Assert.assertEquals("リストア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(70);

        Assert.assertEquals("パソコンにおいて、関係型とカード型が主流なソフトウェアの総称と言えば何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("データベースソフト", q.getAnswerList().get(0));
        Assert.assertEquals("ＲＤＢソフト", q.getAnswerList().get(1));
        Assert.assertEquals("アドインソフト", q.getAnswerList().get(2));
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(3));
        Assert.assertEquals("マイクロソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(71);

        Assert.assertEquals("データベースソフトでは、１件分のデータすなわちレコードを何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("行", q.getAnswerList().get(0));
        Assert.assertEquals("列", q.getAnswerList().get(1));
        Assert.assertEquals("カラム", q.getAnswerList().get(2));
        Assert.assertEquals("項目", q.getAnswerList().get(3));
        Assert.assertEquals("フィールド", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(72);

        Assert.assertEquals("データベースソフトでは、レコード（行）を構成する個々の項目を何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("列", q.getAnswerList().get(0));
        Assert.assertEquals("行", q.getAnswerList().get(1));
        Assert.assertEquals("カラム", q.getAnswerList().get(2));
        Assert.assertEquals("レコード", q.getAnswerList().get(3));
        Assert.assertEquals("アイタム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(73);

        Assert.assertEquals("データベースソフトでは、レコード（行）を構成する個々の項目を何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フィールド", q.getAnswerList().get(0));
        Assert.assertEquals("行", q.getAnswerList().get(1));
        Assert.assertEquals("カラム", q.getAnswerList().get(2));
        Assert.assertEquals("レコード", q.getAnswerList().get(3));
        Assert.assertEquals("表", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(74);

        Assert.assertEquals("データベースソフトの（　　）は行の集まりであり、行は列の集まりである", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表", q.getAnswerList().get(0));
        Assert.assertEquals("ファイラー", q.getAnswerList().get(1));
        Assert.assertEquals("レコード", q.getAnswerList().get(2));
        Assert.assertEquals("項目", q.getAnswerList().get(3));
        Assert.assertEquals("ドット", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(75);

        Assert.assertEquals("データベースソフトの（　　）は、データを更新するときの最小単位であり、書式やデータの型などを指定できる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("項目", q.getAnswerList().get(0));
        Assert.assertEquals("属性", q.getAnswerList().get(1));
        Assert.assertEquals("ビット", q.getAnswerList().get(2));
        Assert.assertEquals("レコード", q.getAnswerList().get(3));
        Assert.assertEquals("セルポインタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(76);

        Assert.assertEquals("１９７０年代にＩＢＭの（　　　）が、数学の集合論をベースにしたリレーショナルデ・ータベースの考え方を提案した", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("コッド博士", q.getAnswerList().get(0));
        Assert.assertEquals("ゴッホ博士", q.getAnswerList().get(1));
        Assert.assertEquals("キッド博士", q.getAnswerList().get(2));
        Assert.assertEquals("サド博士", q.getAnswerList().get(3));
        Assert.assertEquals("お茶の水博士", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(77);

        Assert.assertEquals("行と列からなる表形式でデータベースを構成し、さらに表と表を結び付けて各種の情報を表現する考え方", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＤＢ", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＱＬ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＤＢ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＤＬ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＭＬ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(78);

        Assert.assertEquals("行と列からなる表形式でデータベースを構成し、さらに表と表を結び付けて各種の情報を表現する考え方", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リレーショナルデータベース", q.getAnswerList().get(0));
        Assert.assertEquals("カード型データベース", q.getAnswerList().get(1));
        Assert.assertEquals("ディレクトリ型データベース", q.getAnswerList().get(2));
        Assert.assertEquals("エンドユーザデータベース", q.getAnswerList().get(3));
        Assert.assertEquals("マルチメディアデータベース", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(79);

        Assert.assertEquals("ワークステーションやパソコン上で動く、リレーショナルデータベース（ＲＤＢ）はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オラクル", q.getAnswerList().get(0));
        Assert.assertEquals("ミラクル", q.getAnswerList().get(1));
        Assert.assertEquals("インフォメーション", q.getAnswerList().get(2));
        Assert.assertEquals("エルゴノミクス", q.getAnswerList().get(3));
        Assert.assertEquals("Ｔｈｅ－ＣＲＡＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(80);

        Assert.assertEquals("しなければならない積み残しの仕事", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("バックログ", q.getAnswerList().get(0));
        Assert.assertEquals("バックドロップ", q.getAnswerList().get(1));
        Assert.assertEquals("バックアップ", q.getAnswerList().get(2));
        Assert.assertEquals("バックジョブ", q.getAnswerList().get(3));
        Assert.assertEquals("バックタスク", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(81);

        Assert.assertEquals("ＩＢＭより開発されたＲＤＢの設計思想（ＳＱＬ）に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＪＡＳで標準化", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＥＬＥＣＴ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＤＬ", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＳＯ", q.getAnswerList().get(3));
        Assert.assertEquals("データ操作言語", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(82);

        Assert.assertEquals("リレーショナルデータベース（ＲＤＢ）に命令を与える言葉", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＳＱＬ", q.getAnswerList().get(0));
        Assert.assertEquals("ＪＣＬ", q.getAnswerList().get(1));
        Assert.assertEquals("ＯＣＬ", q.getAnswerList().get(2));
        Assert.assertEquals("ＪＦＬ", q.getAnswerList().get(3));
        Assert.assertEquals("ＪＡＬ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(83);

        Assert.assertEquals("列・行・表からなるデータベースの構造を宣言する「ＳＱＬ－ＤＤＬ」って何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スキーマ定義言語", q.getAnswerList().get(0));
        Assert.assertEquals("データ定義言語", q.getAnswerList().get(1));
        Assert.assertEquals("データ操作言語", q.getAnswerList().get(2));
        Assert.assertEquals("スキーマ操作言語", q.getAnswerList().get(3));
        Assert.assertEquals("スキャナ操作言語", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(84);

        Assert.assertEquals("値を取り出す・値を挿入する・値を更新する・値を削除するなどのデータ（行）に対する操作を行う「ＳＱＬ－ＤＭＬ」って何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("データ操作言語", q.getAnswerList().get(0));
        Assert.assertEquals("スキーマ定義言語", q.getAnswerList().get(1));
        Assert.assertEquals("データ定義言語", q.getAnswerList().get(2));
        Assert.assertEquals("スキーマ操作言語", q.getAnswerList().get(3));
        Assert.assertEquals("意味不明言語", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(85);

        Assert.assertEquals("データを重複させないように表を分けること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("正規化", q.getAnswerList().get(0));
        Assert.assertEquals("単一化", q.getAnswerList().get(1));
        Assert.assertEquals("空洞化", q.getAnswerList().get(2));
        Assert.assertEquals("一本化", q.getAnswerList().get(3));
        Assert.assertEquals("単純化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(86);

        Assert.assertEquals("２つ（以上）の表の行に対する、和・差・積の演算で、これによって新しい表を作り出す", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("集合演算", q.getAnswerList().get(0));
        Assert.assertEquals("論理演算", q.getAnswerList().get(1));
        Assert.assertEquals("関係演算", q.getAnswerList().get(2));
        Assert.assertEquals("行列演算", q.getAnswerList().get(3));
        Assert.assertEquals("複表演算", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(87);

        Assert.assertEquals("集合演算において、２つの表の行を加えること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("和（ＵＮＩＯＮ）", q.getAnswerList().get(0));
        Assert.assertEquals("合併（ＵＮＩＣＯＮ）", q.getAnswerList().get(1));
        Assert.assertEquals("積（ＩＮＴＥＲＳＥＣＴ）", q.getAnswerList().get(2));
        Assert.assertEquals("差（ＭＩＮＵＳ）", q.getAnswerList().get(3));
        Assert.assertEquals("結合（ＪＯＩＮ）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(88);

        Assert.assertEquals("集合演算において、２つの表の共通部分を取り出すこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("積（ＩＮＴＥＲＳＥＣＴ）", q.getAnswerList().get(0));
        Assert.assertEquals("和（ＵＮＩＯＮ）", q.getAnswerList().get(1));
        Assert.assertEquals("合併（ＵＮＩＣＯＮ）", q.getAnswerList().get(2));
        Assert.assertEquals("差（ＭＩＮＵＳ）", q.getAnswerList().get(3));
        Assert.assertEquals("結合（ＪＯＩＮ）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(89);

        Assert.assertEquals("集合演算において、２つの表の異なる行を取り出すこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("差（ＭＩＮＵＳ）", q.getAnswerList().get(0));
        Assert.assertEquals("積（ＩＮＴＥＲＳＥＣＴ）", q.getAnswerList().get(1));
        Assert.assertEquals("和（ＵＮＩＯＮ）", q.getAnswerList().get(2));
        Assert.assertEquals("合併（ＵＮＩＣＯＮ）", q.getAnswerList().get(3));
        Assert.assertEquals("結合（ＪＯＩＮ）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(90);

        Assert.assertEquals("ＲＤＢで、一つの表の中からいくつかの行を導き出し、新しい表を作ること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("選択（Ｓｅｌｅｃｔｉｏｎ）", q.getAnswerList().get(0));
        Assert.assertEquals("射影（Ｐｒｏｊｅｃｔｉｏｎ）", q.getAnswerList().get(1));
        Assert.assertEquals("結合（Ｊｏｉｎ）", q.getAnswerList().get(2));
        Assert.assertEquals("和（Ｕｎｉｏｎ）", q.getAnswerList().get(3));
        Assert.assertEquals("差（Ｍｉｎｕｓ）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(91);

        Assert.assertEquals("ＲＤＢで、一つの表の中からいくつかの列を導き出し、新しい表を作ること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("射影（Ｐｒｏｊｅｃｔｉｏｎ）", q.getAnswerList().get(0));
        Assert.assertEquals("選択（Ｓｅｌｅｃｔｉｏｎ）", q.getAnswerList().get(1));
        Assert.assertEquals("結合（Ｊｏｉｎ）", q.getAnswerList().get(2));
        Assert.assertEquals("和（Ｕｎｉｏｎ）", q.getAnswerList().get(3));
        Assert.assertEquals("差（Ｍｉｎｕｓ）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(92);

        Assert.assertEquals("ＲＤＢで、複数の表からいくつかの行または列を導き出し、新しい表を作ること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("結合（Ｊｏｉｎ）", q.getAnswerList().get(0));
        Assert.assertEquals("射影（Ｐｒｏｊｅｃｔｉｏｎ）", q.getAnswerList().get(1));
        Assert.assertEquals("選択（Ｓｅｌｅｃｔｉｏｎ）", q.getAnswerList().get(2));
        Assert.assertEquals("積（ＩＮＴＥＲＳＥＣＴ）", q.getAnswerList().get(3));
        Assert.assertEquals("和（Ｕｎｉｏｎ）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(93);

        Assert.assertEquals("ＪＩＳでは、ＲＤＢにおいて、もともと存在する表のことを何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("実表", q.getAnswerList().get(0));
        Assert.assertEquals("ビュー表", q.getAnswerList().get(1));
        Assert.assertEquals("仮想表", q.getAnswerList().get(2));
        Assert.assertEquals("家相表", q.getAnswerList().get(3));
        Assert.assertEquals("基本表", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(94);

        Assert.assertEquals("ＪＩＳでは、ＲＤＢにおいて、新しく導き出された表のことを何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ビュー表", q.getAnswerList().get(0));
        Assert.assertEquals("実表", q.getAnswerList().get(1));
        Assert.assertEquals("仮想表", q.getAnswerList().get(2));
        Assert.assertEquals("基本表", q.getAnswerList().get(3));
        Assert.assertEquals("関係表", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(95);

        Assert.assertEquals("データ操作言語に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表の機密保護の定義", q.getAnswerList().get(0));
        Assert.assertEquals("表の登録・変更", q.getAnswerList().get(1));
        Assert.assertEquals("表中のデータの追加・削除", q.getAnswerList().get(2));
        Assert.assertEquals("表中のデータの変更", q.getAnswerList().get(3));
        Assert.assertEquals("表の保存と復旧", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(96);

        Assert.assertEquals("ＳＱＬの特徴に関する記述で、正しいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＥＵＣの手段", q.getAnswerList().get(0));
        Assert.assertEquals("ヒューマンインタフェース言語", q.getAnswerList().get(1));
        Assert.assertEquals("ネットワーク向き言語", q.getAnswerList().get(2));
        Assert.assertEquals("ダウンサイジングに逆行", q.getAnswerList().get(3));
        Assert.assertEquals("表計算・グラフ処理が得意", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(97);

        Assert.assertEquals("ＳＱＬの特徴に関する記述で、正しいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エンドユーザ部門でも利用可能", q.getAnswerList().get(0));
        Assert.assertEquals("データ検索のみに使用される", q.getAnswerList().get(1));
        Assert.assertEquals("定期的データ処理向きの言語", q.getAnswerList().get(2));
        Assert.assertEquals("パソコンの全データを扱える", q.getAnswerList().get(3));
        Assert.assertEquals("ＪＩＳでは標準化されていない", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(98);

        Assert.assertEquals("リレーショナルデータベースに関する記述で、正しいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("関係型データベースとも呼ぶ", q.getAnswerList().get(0));
        Assert.assertEquals("検索とグラフ加工に向いている", q.getAnswerList().get(1));
        Assert.assertEquals("昭和３５年頃にＩＢＭ社が開発", q.getAnswerList().get(2));
        Assert.assertEquals("一つの表から構成される", q.getAnswerList().get(3));
        Assert.assertEquals("汎用コンピュータしか扱えない", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(99);

        Assert.assertEquals("ＲＤＢにおける、ＳＱＬのデータ操作コマンドである「ＳＥＬＥＣＴ　Ａ」の意味は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａという項目を参照（選択）", q.getAnswerList().get(0));
        Assert.assertEquals("Ａという表を探せ", q.getAnswerList().get(1));
        Assert.assertEquals("Ａという条件に合う", q.getAnswerList().get(2));
        Assert.assertEquals("Ａという文字を含む", q.getAnswerList().get(3));
        Assert.assertEquals("Ａという順序で", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(100);

        Assert.assertEquals("ＲＤＢにおける、ＳＱＬのデータ操作コマンドである「ＷＨＥＲＥ　Ｂ」の意味は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｂという条件に合う", q.getAnswerList().get(0));
        Assert.assertEquals("Ｂという項目を選択", q.getAnswerList().get(1));
        Assert.assertEquals("Ｂという場所に存在する", q.getAnswerList().get(2));
        Assert.assertEquals("Ｂという文字を含む", q.getAnswerList().get(3));
        Assert.assertEquals("Ｂという順序で", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(101);

        Assert.assertEquals("ＳＱＬで「ＳＥＬＥＣＴ　氏名　ＦＲＯＭ　成績表　」と記述したときの意味は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("成績表より氏名を抽出せよ", q.getAnswerList().get(0));
        Assert.assertEquals("成績表に氏名を挿入せよ", q.getAnswerList().get(1));
        Assert.assertEquals("成績表の氏名を削除せよ", q.getAnswerList().get(2));
        Assert.assertEquals("成績表の氏名を更新せよ", q.getAnswerList().get(3));
        Assert.assertEquals("成績表から氏名を消去せよ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(102);

        Assert.assertEquals("ＳＱＬで「ＳＥＬＥＣＴ　＊　ＦＲＯＭ　売上表　」と記述したときの意味は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("売上表より全てのデータを参照", q.getAnswerList().get(0));
        Assert.assertEquals("売上表より＊印のデータを参照", q.getAnswerList().get(1));
        Assert.assertEquals("売上表に全てのデータを転記", q.getAnswerList().get(2));
        Assert.assertEquals("売上表の全てのデータを更新", q.getAnswerList().get(3));
        Assert.assertEquals("売上表より全ての＊印を消せ！", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(103);

        Assert.assertEquals("ＳＱＬで参照したい列名などが不明の場合、「ＳＥＬＥＣＴ　（　　）　ＦＲＯＭ　～　」と記述したらよい", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＊", q.getAnswerList().get(0));
        Assert.assertEquals("？", q.getAnswerList().get(1));
        Assert.assertEquals("＞", q.getAnswerList().get(2));
        Assert.assertEquals("％", q.getAnswerList().get(3));
        Assert.assertEquals("！", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(104);

        Assert.assertEquals("ＳＱＬで使用する比較演算子。「年齢が２０以上」はどのように書く？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("年齢　＞　　１９", q.getAnswerList().get(0));
        Assert.assertEquals("年齢　＜＝　２０", q.getAnswerList().get(1));
        Assert.assertEquals("年齢　＞　　２０", q.getAnswerList().get(2));
        Assert.assertEquals("年齢　＞＝　１９", q.getAnswerList().get(3));
        Assert.assertEquals("年齢　＜　　１９", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(105);

        Assert.assertEquals("ＳＱＬで使用する比較演算子。「年齢が１８未満」はどのように書く？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("年齢　＜　　１８", q.getAnswerList().get(0));
        Assert.assertEquals("年齢　＞＝　１７", q.getAnswerList().get(1));
        Assert.assertEquals("年齢　＜　　１７", q.getAnswerList().get(2));
        Assert.assertEquals("年齢　＞＝　１８", q.getAnswerList().get(3));
        Assert.assertEquals("年齢　＜＝　１８", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(106);

        Assert.assertEquals("ＳＱＬで使用する比較演算子。「性別が男でない」はどのように書く？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("性別　＜＞　’男’", q.getAnswerList().get(0));
        Assert.assertEquals("性別　＜＞　＃男＃", q.getAnswerList().get(1));
        Assert.assertEquals("性別　≠　　’男’", q.getAnswerList().get(2));
        Assert.assertEquals("性別　＝　　’♂’", q.getAnswerList().get(3));
        Assert.assertEquals("性別　≒　　’女’", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(107);

        Assert.assertEquals("ＳＱＬで「ＷＨＥＲＥ　年齢　ＢＥＴＷＥＥＮ　１６　ＡＮＤ　１８；　」と記述したときの意味は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("年齢が１６歳から１８歳まで", q.getAnswerList().get(0));
        Assert.assertEquals("年齢が１６歳と　１８歳の", q.getAnswerList().get(1));
        Assert.assertEquals("年齢が１６歳と　１８歳でない", q.getAnswerList().get(2));
        Assert.assertEquals("年齢が１６歳から１８歳でない", q.getAnswerList().get(3));
        Assert.assertEquals("年齢が１７歳の", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(108);

        Assert.assertEquals("ＳＱＬで「ＷＨＥＲＥ　年齢　ＩＮ（２０，３０，４０）；　」と記述したときの意味は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("年齢が２０歳と３０歳と４０歳", q.getAnswerList().get(0));
        Assert.assertEquals("年齢が２０歳から４０歳", q.getAnswerList().get(1));
        Assert.assertEquals("年齢が２０台と３０台と４０台", q.getAnswerList().get(2));
        Assert.assertEquals("年齢が２０歳から４０歳でない", q.getAnswerList().get(3));
        Assert.assertEquals("年齢が２０と３０と４０の平均", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(109);

        Assert.assertEquals("ＳＱＬで、指定した文字パターンと一致するものを選択たいときに使用するものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＬＩＫＥ述語", q.getAnswerList().get(0));
        Assert.assertEquals("ＬＵＣＫ述語", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＨＲ述語", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＴＲＩＮＧ述語", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＴＲ＄述語", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(110);

        Assert.assertEquals("ＳＱＬで「ＷＨＥＲＥ　名前　ＬＩＫＥ　’池％’；　」と記述したときに条件に当てはまるデータはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("池田　蟷螂", q.getAnswerList().get(0));
        Assert.assertEquals("小池　ピュー太", q.getAnswerList().get(1));
        Assert.assertEquals("森崎　池男", q.getAnswerList().get(2));
        Assert.assertEquals("ソレ池　レッシー", q.getAnswerList().get(3));
        Assert.assertEquals("イケ内　大池", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(111);

        Assert.assertEquals("論理演算子の「論理和」って何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＲ", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＮＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＯＲ", q.getAnswerList().get(2));
        Assert.assertEquals("ＮＯＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＸＯＲ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(112);

        Assert.assertEquals("論理演算子の優先順位で正しいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＮＯＴ＞ＡＮＤ＞ＯＲ", q.getAnswerList().get(0));
        Assert.assertEquals("ＮＯＴ＜ＡＮＤ＜ＯＲ", q.getAnswerList().get(1));
        Assert.assertEquals("ＡＮＤ＞ＮＯＴ＞ＯＲ", q.getAnswerList().get(2));
        Assert.assertEquals("ＮＯＴ＞ＡＮＤ＝ＯＲ", q.getAnswerList().get(3));
        Assert.assertEquals("ＮＯＴ＞ＯＲ　＞ＡＮＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(113);

        Assert.assertEquals("ＳＱＬで「２０未満の男性」という条件は、「ＷＨＥＲＥ　性別＝’男’（　　　）　年齢＜２０；　」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＡＮＤ", q.getAnswerList().get(0));
        Assert.assertEquals("ＯＲ", q.getAnswerList().get(1));
        Assert.assertEquals("ＩＮ", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＩＫＥ", q.getAnswerList().get(3));
        Assert.assertEquals("ＮＯＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(114);

        Assert.assertEquals("ＳＱＬで「体重が５０ｋｇを越える女性」という条件は、「ＷＨＥＲＥ　性別（　　）’男’　ＡＮＤ　体重（　　）５０；　」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＜＞　と　＞", q.getAnswerList().get(0));
        Assert.assertEquals("＝　　と　＞＝", q.getAnswerList().get(1));
        Assert.assertEquals("＝　　と　＞", q.getAnswerList().get(2));
        Assert.assertEquals("＜＞　と　＞＝", q.getAnswerList().get(3));
        Assert.assertEquals("＜＞　と　＜", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(115);

        Assert.assertEquals("ＳＱＬで、特定項目のデータ内容によって、表示方法の並び替えを制御する句", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＲＤＥＲ　ＢＹ", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＳＣＥＮＤＩＮＧ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＯＲＴ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＩＳＰＬＡＹ　ＳＯＲＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＥＳＣ　ＯＮ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(116);

        Assert.assertEquals("ＳＱＬの「ＯＲＤＥＲ　ＢＹ句」で、参照したデータを昇順に並び替える命令は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＡＳＣ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＥＳＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＥＳＣ", q.getAnswerList().get(2));
        Assert.assertEquals("ＡＳＫＥＹ", q.getAnswerList().get(3));
        Assert.assertEquals("ＫＥＹ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(117);

        Assert.assertEquals("ＳＱＬの「ＯＲＤＥＲ　ＢＹ句」で、参照したデータを降順に並び替える命令は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＥＳＣ", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＳＣ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＡＳＣ", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＳＣ", q.getAnswerList().get(3));
        Assert.assertEquals("ＡＥＳＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(118);

        Assert.assertEquals("ＳＱＬで「身長の低い順にソートする」という記述は、「ＯＥＤＥＲ　ＢＹ　身長　（　　　）；　」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("特に指定しなくてもよい", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＳＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＥＳＣ", q.getAnswerList().get(2));
        Assert.assertEquals("ＡＳＥ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＳＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(119);

        Assert.assertEquals("ＳＱＬで「年齢の若い順にソートする」は、「ＯＥＤＥＲ　ＢＹ　生年月日　（　　　）；　」（ただし、生年月日は数値６桁）", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＥＳＣ", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＳＣ", q.getAnswerList().get(1));
        Assert.assertEquals("特に指定しなくてもよい", q.getAnswerList().get(2));
        Assert.assertEquals("ＡＳＮ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＳＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(120);

        Assert.assertEquals("利用者から見たデータベースであり、仮想表（ビュー表）を表すスキーマ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("外部スキーマ", q.getAnswerList().get(0));
        Assert.assertEquals("内部スキーマ", q.getAnswerList().get(1));
        Assert.assertEquals("概念スキーマ", q.getAnswerList().get(2));
        Assert.assertEquals("抽象スキーマ", q.getAnswerList().get(3));
        Assert.assertEquals("仮想スキーマ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(121);

        Assert.assertEquals("実際に記憶されているデータベース全体であり、複数の外部スキーマに対して一つだけ存在していて、表（実表）を表すスキーマ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("概念スキーマ", q.getAnswerList().get(0));
        Assert.assertEquals("外部スキーマ", q.getAnswerList().get(1));
        Assert.assertEquals("内部スキーマ", q.getAnswerList().get(2));
        Assert.assertEquals("実表スキーマ", q.getAnswerList().get(3));
        Assert.assertEquals("全体スキーマ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(122);

        Assert.assertEquals("実際のデータ構造を表すスキーマ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("内部スキーマ", q.getAnswerList().get(0));
        Assert.assertEquals("概念スキーマ", q.getAnswerList().get(1));
        Assert.assertEquals("外部スキーマ", q.getAnswerList().get(2));
        Assert.assertEquals("構造スキーマ", q.getAnswerList().get(3));
        Assert.assertEquals("存在スキーマ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(123);

        Assert.assertEquals("データベース定義言語で、データベース全体を定義する文は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＲＥＡＴＥ　ＳＣＨＥＭＡ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＲＥＡＴＥ　ＴＡＢＬＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＲＥＡＴＥ　ＶＩＷＥ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＲＥＡＴＥ　ＢＡＳＥ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＲＥＡＴＥ　ＦＯＲＭＡＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(124);

        Assert.assertEquals("データベース定義言語で、表（実表）を定義する文は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＲＥＡＴＥ　ＴＡＢＬＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＲＥＡＴＥ　ＳＣＨＥＭＡ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＲＥＡＴＥ　ＶＩＷＥ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＲＥＡＴＥ　ＤＡＴＡ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＲＥＡＴＥ　ＦＯＲＭ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(125);

        Assert.assertEquals("ＳＱＬで定義されている代表的なデータで、「ＮＡＴＩＯＮＡＬ　ＣＨＡＲＡＣＴＥＲ」ってどんな属性？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("漢字（文字列）", q.getAnswerList().get(0));
        Assert.assertEquals("英数字", q.getAnswerList().get(1));
        Assert.assertEquals("整数", q.getAnswerList().get(2));
        Assert.assertEquals("実数", q.getAnswerList().get(3));
        Assert.assertEquals("アルファベット", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(126);

        Assert.assertEquals("ＳＱＬ－ＤＭＬのＬＩＫＥ述語で使用できるワイルドカードには何と何がある？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("％　と　＿", q.getAnswerList().get(0));
        Assert.assertEquals("％　と　？", q.getAnswerList().get(1));
        Assert.assertEquals("＊　と　？", q.getAnswerList().get(2));
        Assert.assertEquals("＊　と　％", q.getAnswerList().get(3));
        Assert.assertEquals("＿　と　＊", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(127);

        Assert.assertEquals("ＳＱＬ－ＤＭＬのＬＩＫＥ述語で使用するワイルドカードの、「＿（下線）」はどんな意味？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("任意の１文字", q.getAnswerList().get(0));
        Assert.assertEquals("任意の文字列（０文字以上）", q.getAnswerList().get(1));
        Assert.assertEquals("任意の文字列（１文字以上）", q.getAnswerList().get(2));
        Assert.assertEquals("漢字１文字", q.getAnswerList().get(3));
        Assert.assertEquals("数値１ケタ（１バイト）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(128);

        Assert.assertEquals("ＳＱＬ－ＤＭＬで、表に新しい行を追加するときに使用する文", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＩＮＳＥＲＴ", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＮＴＯ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＲＥＡＴＥ", q.getAnswerList().get(2));
        Assert.assertEquals("ＵＰＬＯＡＤ", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＥＴＵＰ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(129);

        Assert.assertEquals("ＳＱＬ－ＤＭＬで、表に新しい行を直接追加するときに使用する文は「ＩＮＳＥＲＴ　ＩＮＴＯ　表　（　　　）（値リスト）」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＶＡＬＵＥＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＥＴ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＥＴＴＩＮＧ", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＮＳＴＡＬＬ", q.getAnswerList().get(3));
        Assert.assertEquals("ＷＨＡＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(130);

        Assert.assertEquals("ＳＱＬで、表の特定の列に値を直接追加するときに使用する文は「ＩＮＳＥＲＴ　ＩＮＴＯ　（　　）　ＶＡＬＵＥＳ（　　）」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表（列リスト）　値リスト", q.getAnswerList().get(0));
        Assert.assertEquals("表（値リスト）　列リスト", q.getAnswerList().get(1));
        Assert.assertEquals("列（値リスト）　値リスト", q.getAnswerList().get(2));
        Assert.assertEquals("列（値リスト）　表リスト", q.getAnswerList().get(3));
        Assert.assertEquals("値（表リスト）　列リスト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(131);

        Assert.assertEquals("「ＮＵＬＬ」は、値が不定であることを示すが、ＫがＮＵＬＬの場合「Ｋ＊３＋５」の演算結果は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＮＵＬＬ", q.getAnswerList().get(0));
        Assert.assertEquals("５", q.getAnswerList().get(1));
        Assert.assertEquals("８", q.getAnswerList().get(2));
        Assert.assertEquals("０", q.getAnswerList().get(3));
        Assert.assertEquals("ヌルヌル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(132);

        Assert.assertEquals("ＳＱＬ－ＤＭＬで、表における行の値を更新するときに使用する文", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＵＰＤＡＴＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＥＴ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＲＥＡＴＥ", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＥＴＵＰ", q.getAnswerList().get(3));
        Assert.assertEquals("ＲＥＣＯＲＤＩＮＧ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(133);

        Assert.assertEquals("ＳＱＬ－ＤＭＬのＵＰＤＡＴＥ文で、全行を更新する記述は「ＵＰＤＡＴＥ　表　（　　　　　）」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＳＥＴ　列名＝計算式（，…）", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＥＴ　行名＝値", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＥＴ　行名＝値リスト", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＥＴ　行名＝計算式（，…）", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＥＴ　行名＝文字列データ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(134);

        Assert.assertEquals("ＳＱＬ－ＤＭＬのＵＰＤＡＴＥ文で、売上表の価格を全て５０円値上げする記述は「ＵＰＤＡＴＥ　売上表　（　　　　　）」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＳＥＴ　価格＝価格＋５０", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＥＴ　価格＝＋５０", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＥＴ　価格＝５０", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＥＴ　価格＋５０", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＥＴ　＋５０", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(135);

        Assert.assertEquals("ＵＰＤＡＴＥ文で、Ａ表の社名を昭和社から平成社に変更する記述は「ＵＰＤＡＴＥ　Ａ表　ＳＥＴ　社名＝平成社　（　　）」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＷＨＥＲＥ　社名＝昭和社", q.getAnswerList().get(0));
        Assert.assertEquals("ＵＰＤＡＴＥ　社名＝昭和社", q.getAnswerList().get(1));
        Assert.assertEquals("ＷＨＥＲＥ　昭和社＝社名", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＮＴＯ　社名＝昭和社", q.getAnswerList().get(3));
        Assert.assertEquals("ＩＮＴＯ　昭和社＝社名", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(136);

        Assert.assertEquals("ＳＱＬ－ＤＭＬで、表から行（レコード）を削除するときに使用する文", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＥＬＥＴＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＥＬ", q.getAnswerList().get(1));
        Assert.assertEquals("ＫＩＬＬ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＬＥＡＲ", q.getAnswerList().get(3));
        Assert.assertEquals("ＦＯＲＭＡＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(137);

        Assert.assertEquals("ＳＱＬ－ＤＭＬのＤＥＬＥＴＥ文で、検索条件に合う行を削除する記述は「（　　　　　）　ＷＨＥＲＥ　検索条件」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＥＬＥＴＥ　ＦＲＯＭ　表", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＥＬＥＴＥ　表", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＥＬ　表", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＥＬ　ＦＲＯＭ　表", q.getAnswerList().get(3));
        Assert.assertEquals("ＫＩＬＬ　表", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(138);

        Assert.assertEquals("ＳＱＬのＤＥＬＥＴＥ文で、Ａ表のＢの値が５以下の行を削除する記述は「（　　）　ＦＲＯＭ　Ａ表　ＷＨＥＲＥ　（　　）」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＥＬＥＴＥ　Ｂ＜＝５", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＥＬＥＴＥ　Ｂ＜　５", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＥＬＥＴＥ　Ｂ＞＝５", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＥＬ      　Ｂ＜＝５", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＥＬＥＴＥ　Ｂ＝＜５", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(139);

        Assert.assertEquals("ＳＱＬ－ＤＭＬの操作手順とは異質なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＲＥＡＴＥ　＝　定義", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＥＬＥＣＴ　＝　選択", q.getAnswerList().get(1));
        Assert.assertEquals("ＩＮＳＥＲＴ　＝　挿入", q.getAnswerList().get(2));
        Assert.assertEquals("ＵＰＤＡＴＥ　＝　更新", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＥＬＥＴＥ　＝　削除", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(140);

        Assert.assertEquals("ＳＱＬ－ＤＭＬで、数量が１０以上で２０以下の行を抽出する記述は「ＷＨＥＲＥ　数量　（　　　　　）；」", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＢＥＴＷＥＥＮ（１０，２０）", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＮ（１０，２０）", q.getAnswerList().get(1));
        Assert.assertEquals("ＢＥＴＷＥＥＮ（１０：２０）", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＮ（１０＜＝，２０＞＝）", q.getAnswerList().get(3));
        Assert.assertEquals("ＩＮ（１０＜＝２０）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(141);

        Assert.assertEquals("ＳＱＬ－ＤＭＬで、ＵＰＤＡＴＥ文の「ＳＥＴ」の意味は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("どのように更新するか", q.getAnswerList().get(0));
        Assert.assertEquals("どの表を更新するか", q.getAnswerList().get(1));
        Assert.assertEquals("どういった条件にするか", q.getAnswerList().get(2));
        Assert.assertEquals("どの項目を対象とするか", q.getAnswerList().get(3));
        Assert.assertEquals("どこにタンスを置くか", q.getAnswerList().get(4));
    }

    private void subtest_build_genre6(IGotakuInfo gotaku) {
        IGotakuGenreInfo genre = gotaku.getGenreList().get(5);

        Assert.assertEquals("ネット、マルチ等", genre.getName());

        Assert.assertEquals(129, genre.getQuestionList().size());

        IGotakuQuestionInfo q = genre.getQuestionList().get(0);

        Assert.assertEquals("企業内などある限定された場所において、コンピュータ同士でデータを相互に通信するネットワークシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＬＡＮ", q.getAnswerList().get(0));
        Assert.assertEquals("ＷＡＮ", q.getAnswerList().get(1));
        Assert.assertEquals("ＶＡＮ", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＡＮ", q.getAnswerList().get(3));
        Assert.assertEquals("ＫＡＮ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(1);

        Assert.assertEquals("１０ＢＡＳＥ５・１０ＢＡＳＥ２・１０ＢＡＳＥ－Ｔなどに分類されるＬＡＮは何か？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("イーサネット型ＬＡＮ", q.getAnswerList().get(0));
        Assert.assertEquals("トークンリング型ＬＡＮ", q.getAnswerList().get(1));
        Assert.assertEquals("ＦＤＤＩ型ＬＡＮ", q.getAnswerList().get(2));
        Assert.assertEquals("光ファイバー型ＬＡＮ", q.getAnswerList().get(3));
        Assert.assertEquals("トークンパッシング型ＬＡＮ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(2);

        Assert.assertEquals("イーサネット型ＬＡＮに関係のないものはどれか？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１０ＢＡＳＥ１", q.getAnswerList().get(0));
        Assert.assertEquals("１０ＢＡＳＥＴ", q.getAnswerList().get(1));
        Assert.assertEquals("１０ＢＡＳＥ２", q.getAnswerList().get(2));
        Assert.assertEquals("１０ＢＡＳＥ５", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＳＭＡ／ＣＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(3);

        Assert.assertEquals("「ＩＥＥＥ８０２．３」という仕様で標準化されているバス型のＬＡＮ。ＣＳＭＡ／ＣＤという制御方式がとられている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("イーサネット型ＬＡＮ", q.getAnswerList().get(0));
        Assert.assertEquals("トークンリング型ＬＡＮ", q.getAnswerList().get(1));
        Assert.assertEquals("ＦＤＤＩ", q.getAnswerList().get(2));
        Assert.assertEquals("ＦＦＤＩ", q.getAnswerList().get(3));
        Assert.assertEquals("ＰＣネット型ＬＡＮ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(4);

        Assert.assertEquals("太い同軸ケーブルを使うことから「シック・イーサネット」とも呼ばれる、最大伝送距離５００ｍのバス型ＬＡＮ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１０ＢＡＳＥ５", q.getAnswerList().get(0));
        Assert.assertEquals("１０ＢＡＳＥＴ", q.getAnswerList().get(1));
        Assert.assertEquals("１０ＢＡＳＥ３", q.getAnswerList().get(2));
        Assert.assertEquals("１０ＢＡＳＥ２", q.getAnswerList().get(3));
        Assert.assertEquals("１０ＢＡＳＥ１", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(5);

        Assert.assertEquals("細い同軸ケーブルを使うことから「シン・イーサネット」とも呼ばれる、最大伝送距離２００ｍのバス型ＬＡＮ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１０ＢＡＳＥ２", q.getAnswerList().get(0));
        Assert.assertEquals("１０ＢＡＳＥ５", q.getAnswerList().get(1));
        Assert.assertEquals("１０ＢＡＳＥＴ", q.getAnswerList().get(2));
        Assert.assertEquals("１０ＢＡＳＥ３", q.getAnswerList().get(3));
        Assert.assertEquals("１０ＢＡＳＥ１", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(6);

        Assert.assertEquals("細いツイストペアケーブルによる手軽な配線システムとして、オフィス内で多用される、最大伝送距離１００ｍのスター型ＬＡＮ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１０ＢＡＳＥＴ", q.getAnswerList().get(0));
        Assert.assertEquals("１０ＢＡＳＥ５", q.getAnswerList().get(1));
        Assert.assertEquals("１０ＢＡＳＥ２", q.getAnswerList().get(2));
        Assert.assertEquals("１０ＢＡＳＥ３", q.getAnswerList().get(3));
        Assert.assertEquals("１０ＢＡＳＥ１０", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(7);

        Assert.assertEquals("ＩＢＭ社が開発したリング型のＬＡＮ。オフィス内で手軽に利用でき、ＩＥＥＥ８０２．５の仕様として標準化されているもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("トークンリング型ＬＡＮ", q.getAnswerList().get(0));
        Assert.assertEquals("イーサネット型ＬＡＮ", q.getAnswerList().get(1));
        Assert.assertEquals("ＦＤＤＩ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＤＦＩ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＳＭＡ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(8);

        Assert.assertEquals("光ファイバーを利用した高速のリング型ＬＡＮ。伝送速度は１００Ｍｂｐｓで、企業の基幹ネットワークに適している", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＤＤＩ", q.getAnswerList().get(0));
        Assert.assertEquals("イーサネット型ＬＡＮ", q.getAnswerList().get(1));
        Assert.assertEquals("トークンリング型ＬＡＮ", q.getAnswerList().get(2));
        Assert.assertEquals("ＨＵＢ", q.getAnswerList().get(3));
        Assert.assertEquals("ＨＡＢ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(9);

        Assert.assertEquals("ＮＴＴなど自ら回線を持っている業者ではなく、回線を借りて回線リセールや付加価値通信サービスを行う業者", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("第二種電気通信事業者", q.getAnswerList().get(0));
        Assert.assertEquals("第一種電気通信事業者", q.getAnswerList().get(1));
        Assert.assertEquals("第三種電気通信事業者", q.getAnswerList().get(2));
        Assert.assertEquals("第四種電気通信事業者", q.getAnswerList().get(3));
        Assert.assertEquals("第五種電気通信事業者", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(10);

        Assert.assertEquals("通信回線を通じて離れた場所でも通信できるネットワーク。ＬＡＮとＬＡＮの間に通信回線があり、公衆回線などで結ばれている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＷＡＮ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＡＰＴＥＮ", q.getAnswerList().get(1));
        Assert.assertEquals("ＶＡＮ", q.getAnswerList().get(2));
        Assert.assertEquals("こりゃいかん！", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＡＴＶ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(11);

        Assert.assertEquals("パソコンネットワークにおいて、複数のユーザが利用するプログラムやデータを集めて入れておく核となるパソコン", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ファイルサーバ", q.getAnswerList().get(0));
        Assert.assertEquals("プリンタサーバ", q.getAnswerList().get(1));
        Assert.assertEquals("通信サーバ", q.getAnswerList().get(2));
        Assert.assertEquals("コミュニケーションサーバ", q.getAnswerList().get(3));
        Assert.assertEquals("クライアント・サーバ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(12);

        Assert.assertEquals("あるユーザからあるユーザに１対１（または１対多）で、メッセージやデータを送るシステム。ネットワーク化により実現可能", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("電子メール", q.getAnswerList().get(0));
        Assert.assertEquals("かもめーる", q.getAnswerList().get(1));
        Assert.assertEquals("電子掲示板", q.getAnswerList().get(2));
        Assert.assertEquals("チャット", q.getAnswerList().get(3));
        Assert.assertEquals("オンライントーク", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(13);

        Assert.assertEquals("単純に、本体を操作する能力しかもたない専用端末のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ダム端末", q.getAnswerList().get(0));
        Assert.assertEquals("ダミー端末", q.getAnswerList().get(1));
        Assert.assertEquals("ガード端末", q.getAnswerList().get(2));
        Assert.assertEquals("ノード端末", q.getAnswerList().get(3));
        Assert.assertEquals("どぶ端末", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(14);

        Assert.assertEquals("パソコンを汎用コンピュータの端末として利用するための通信用プログラム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("端末エミュレータ", q.getAnswerList().get(0));
        Assert.assertEquals("端末シミュレータ", q.getAnswerList().get(1));
        Assert.assertEquals("汎用シミュレータ", q.getAnswerList().get(2));
        Assert.assertEquals("汎用モジュレータ", q.getAnswerList().get(3));
        Assert.assertEquals("端未エミュレータ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(15);

        Assert.assertEquals("パソコンやワークステーションのみを接続したＬＡＮ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("水平ＬＡＮ", q.getAnswerList().get(0));
        Assert.assertEquals("垂直ＬＡＮ", q.getAnswerList().get(1));
        Assert.assertEquals("断層ＬＡＮ", q.getAnswerList().get(2));
        Assert.assertEquals("階層ＬＡＮ", q.getAnswerList().get(3));
        Assert.assertEquals("りんりんらんＬＡＮ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(16);

        Assert.assertEquals("パソコンをネットワーク化するメリットとして、適切でないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＩＤ番号の共有", q.getAnswerList().get(0));
        Assert.assertEquals("外部記憶装置の共有", q.getAnswerList().get(1));
        Assert.assertEquals("入出力装置の共有", q.getAnswerList().get(2));
        Assert.assertEquals("プログラムの共有", q.getAnswerList().get(3));
        Assert.assertEquals("データの共有", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(17);

        Assert.assertEquals("パソコンを「ネットワーク化する」ことに最も関係のないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スタンドアロン", q.getAnswerList().get(0));
        Assert.assertEquals("トークンパッシング", q.getAnswerList().get(1));
        Assert.assertEquals("クライアント", q.getAnswerList().get(2));
        Assert.assertEquals("ファイルサーバ", q.getAnswerList().get(3));
        Assert.assertEquals("ピア・ツー・ピア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(18);

        Assert.assertEquals("ネットワークを介して、離れたコンピュータに接続してデータの送受信を行うこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アクセス", q.getAnswerList().get(0));
        Assert.assertEquals("ログイン", q.getAnswerList().get(1));
        Assert.assertEquals("オートダイヤル", q.getAnswerList().get(2));
        Assert.assertEquals("オートログイン", q.getAnswerList().get(3));
        Assert.assertEquals("プロトコル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(19);

        Assert.assertEquals("ネットワークにおいて、次の中でそういう呼び方をしないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スクリーンサーバ", q.getAnswerList().get(0));
        Assert.assertEquals("ファイルサーバ", q.getAnswerList().get(1));
        Assert.assertEquals("コミュニケーションサーバ", q.getAnswerList().get(2));
        Assert.assertEquals("電子メールサーバ", q.getAnswerList().get(3));
        Assert.assertEquals("プリントサーバ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(20);

        Assert.assertEquals("ネットワークの中で、特に何かの処理を行う場合の中心（核）となるコンピュータ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サーバ", q.getAnswerList().get(0));
        Assert.assertEquals("クライアント", q.getAnswerList().get(1));
        Assert.assertEquals("ゾーニング", q.getAnswerList().get(2));
        Assert.assertEquals("ＢＢＳ", q.getAnswerList().get(3));
        Assert.assertEquals("パーティション", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(21);

        Assert.assertEquals("次の中で、ネットワークＯＳに関係のあるものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｗｉｎｄｏｗｓ／ＮＴ", q.getAnswerList().get(0));
        Assert.assertEquals("システム７", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＳ－ＤＯＳ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＰＭ／８６", q.getAnswerList().get(3));
        Assert.assertEquals("ＵＮＩＸ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(22);

        Assert.assertEquals("ＬＡＮなど、ネットワークを構築するために必要不可欠な基本機能を備えたＯＳ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ネットワークＯＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＮＷ－ＯＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＬＡＮ－Ｗｉｎｄｏｗｓ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＯＳ／Ｖ", q.getAnswerList().get(3));
        Assert.assertEquals("Ｗｉｎ／ＯＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(23);

        Assert.assertEquals("ネットワークＯＳの一つである「ＮｅｔＷａｒｅ」。開発会社は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("米ノベル社", q.getAnswerList().get(0));
        Assert.assertEquals("米ゼロックス社", q.getAnswerList().get(1));
        Assert.assertEquals("米ロータス社", q.getAnswerList().get(2));
        Assert.assertEquals("米ＩＢＭ社", q.getAnswerList().get(3));
        Assert.assertEquals("日本ＳＯＮＹ社", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(24);

        Assert.assertEquals("ＬＡＮシステムの配線形態として、関係のないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アダムスキー型", q.getAnswerList().get(0));
        Assert.assertEquals("バス型", q.getAnswerList().get(1));
        Assert.assertEquals("スター型", q.getAnswerList().get(2));
        Assert.assertEquals("リング型", q.getAnswerList().get(3));
        Assert.assertEquals("メッシュ型", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(25);

        Assert.assertEquals("専用のサーバを設ける必要がなく、低コストで導入できる小規模向けのパソコンＬＡＮは別に何と呼ばれているか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ピア・ツー・ピアＰＣ－ＬＡＮ", q.getAnswerList().get(0));
        Assert.assertEquals("ピア・ツー・ピアＮＴ－ＬＡＮ", q.getAnswerList().get(1));
        Assert.assertEquals("ネットウェアＰＣ－ＬＡＮ", q.getAnswerList().get(2));
        Assert.assertEquals("ネットウェアＮＴ－ＬＡＮ", q.getAnswerList().get(3));
        Assert.assertEquals("トークンリング型－ＬＡＮ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(26);

        Assert.assertEquals("パソコンで利用するＬＡＮケーブルのうち、電話線のような細くて柔らかい電線をより合わせたケーブル", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ツイストペアケーブル", q.getAnswerList().get(0));
        Assert.assertEquals("同軸ケーブル", q.getAnswerList().get(1));
        Assert.assertEquals("モジュラーケーブル", q.getAnswerList().get(2));
        Assert.assertEquals("アナログケーブル", q.getAnswerList().get(3));
        Assert.assertEquals("端末ケーブル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(27);

        Assert.assertEquals("ケーブルを接続するコネクタがいくつかあり、ここからパソコンや周辺装置のＬＡＮアダプタに接続される。集線装置のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＨＵＢ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＳＶ", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＯＳ", q.getAnswerList().get(2));
        Assert.assertEquals("ＮＣＵ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＡＧ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(28);

        Assert.assertEquals("通信手順とか通信規約のこと。データ通信を行う場合の送受信に関する約束ごと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プロトコル", q.getAnswerList().get(0));
        Assert.assertEquals("モジュラー", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＳ－２３２Ｃ", q.getAnswerList().get(2));
        Assert.assertEquals("ローカルエコー", q.getAnswerList().get(3));
        Assert.assertEquals("ＡＴコマンド", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(29);

        Assert.assertEquals("国際的な規模のプロトコルとして標準化を進めているモデル。ネットワークのもつ役割を７つに分けている専門的モデル", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＳＩ基本参照モデル", q.getAnswerList().get(0));
        Assert.assertEquals("０ＳＩ国際標準モデル", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＯＳ基本参照モデル", q.getAnswerList().get(2));
        Assert.assertEquals("ＩＳＯ国際標準モデル", q.getAnswerList().get(3));
        Assert.assertEquals("ＩＳＯ標準参照モデル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(30);

        Assert.assertEquals("ネットワークにおいて、クライアントのパーソナルコンピュータに直接接続されている外部記憶装置", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ローカルドライブ", q.getAnswerList().get(0));
        Assert.assertEquals("カレントドライブ", q.getAnswerList().get(1));
        Assert.assertEquals("アクセスドライブ", q.getAnswerList().get(2));
        Assert.assertEquals("マスタードライブ", q.getAnswerList().get(3));
        Assert.assertEquals("ドライブスルー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(31);

        Assert.assertEquals("ＬＡＮで、条件によって複数のパソコンから同じデータをどのように共有できるかを設定し、矛盾がおこらないようにすること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("排他制御", q.getAnswerList().get(0));
        Assert.assertEquals("歯医者盛業", q.getAnswerList().get(1));
        Assert.assertEquals("共有制御", q.getAnswerList().get(2));
        Assert.assertEquals("条件制御", q.getAnswerList().get(3));
        Assert.assertEquals("データ制御", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(32);

        Assert.assertEquals("パソコンからの印刷命令やデータを受け取って、プリンタが正常に印刷できるように通訳するソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プリンタドライバ", q.getAnswerList().get(0));
        Assert.assertEquals("マイナスドライバ", q.getAnswerList().get(1));
        Assert.assertEquals("ディスクドライバ", q.getAnswerList().get(2));
        Assert.assertEquals("セントロニクスドライバ", q.getAnswerList().get(3));
        Assert.assertEquals("ＲＳ－２３２Ｃドライバ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(33);

        Assert.assertEquals("プリンタサーバによりプリンタの共有を行う場合、順番に印刷処理を待たせておく機能", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プリントキュー", q.getAnswerList().get(0));
        Assert.assertEquals("バーベキュー", q.getAnswerList().get(1));
        Assert.assertEquals("プリンタサーバキュー", q.getAnswerList().get(2));
        Assert.assertEquals("シーケンスキュー", q.getAnswerList().get(3));
        Assert.assertEquals("クライアントキュー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(34);

        Assert.assertEquals("通常、ネットワークを利用する場合、予め手続きを行い登録してもらった「２つ」のものを入力する必要がある。この２つとは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＩＤ・パスワード", q.getAnswerList().get(0));
        Assert.assertEquals("キーワード・ＩＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ログインＮＯ・ハンドルネーム", q.getAnswerList().get(2));
        Assert.assertEquals("ハンドルネーム・キーワード", q.getAnswerList().get(3));
        Assert.assertEquals("パスワード・１Ｄ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(35);

        Assert.assertEquals("ネットワークＯＳのほとんどは、ユーザーＩＤとパスワードによるどんな設定機能をもっているか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        // Assert.assertEquals("アクセス権", q.getAnswerList().get(0)); TODO
        // Assert.assertEquals("サクセス権", q.getAnswerList().get(1)); TODO
        // Assert.assertEquals("基本的人権", q.getAnswerList().get(2)); TODO
        // Assert.assertEquals("スーパバイザ権", q.getAnswerList().get(3)); TODO
        // Assert.assertEquals("セキュリティ権", q.getAnswerList().get(4)); TODO

        q = genre.getQuestionList().get(36);

        Assert.assertEquals("パソコン通信などで、あるホストに登録されたユーザーＩＤのことを他に何という言い方をしているか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ハンドル名", q.getAnswerList().get(0));
        Assert.assertEquals("ブレーキ名", q.getAnswerList().get(1));
        Assert.assertEquals("アクセス名", q.getAnswerList().get(2));
        Assert.assertEquals("アクセル名", q.getAnswerList().get(3));
        Assert.assertEquals("クラッチ名", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(37);

        Assert.assertEquals("パソコン通信などで、そのホストのシステム管理者のことを通常何と言っているか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("シスオペ", q.getAnswerList().get(0));
        Assert.assertEquals("シスアド", q.getAnswerList().get(1));
        Assert.assertEquals("シスマネ", q.getAnswerList().get(2));
        Assert.assertEquals("シスコン", q.getAnswerList().get(3));
        Assert.assertEquals("シスプロ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(38);

        Assert.assertEquals("バックアップにおいて、一方のディスクにデータを書き込み更新などを行うと、同等の処理が他方にも自動的に行われるしくみ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ミラーリング", q.getAnswerList().get(0));
        Assert.assertEquals("デュプレクシング", q.getAnswerList().get(1));
        Assert.assertEquals("ディスク２重化", q.getAnswerList().get(2));
        Assert.assertEquals("フォールトトレラント", q.getAnswerList().get(3));
        Assert.assertEquals("リストア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(39);

        Assert.assertEquals("ＨＤＤの制御ボードを２個用意し、一方の制御ボードが破壊されたり異常が生じた場合、片方が正常に動作するように保つしくみ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デュプレクシング", q.getAnswerList().get(0));
        Assert.assertEquals("ミラーリング", q.getAnswerList().get(1));
        Assert.assertEquals("ディスクの最適化", q.getAnswerList().get(2));
        Assert.assertEquals("ディスクアレイ", q.getAnswerList().get(3));
        Assert.assertEquals("リストア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(40);

        Assert.assertEquals("停電になっても一定時間電気の供給をしてくれる機械。無停電電源（装置）のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＵＰＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＤＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＡＧ", q.getAnswerList().get(2));
        Assert.assertEquals("ＡＰＩ", q.getAnswerList().get(3));
        Assert.assertEquals("ＴＣＰ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(41);

        Assert.assertEquals("マッキントッシュでＬＡＮを構築する場合、ネットワークプロトコルとして本体に標準装備されているソフトウェアは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａｐｐｌｅ－Ｔａｌｋ", q.getAnswerList().get(0));
        Assert.assertEquals("Ｍａｃ－Ｓｈａｋｅ", q.getAnswerList().get(1));
        Assert.assertEquals("Ｌｏｃａｌ－Ｔａｌｋ", q.getAnswerList().get(2));
        Assert.assertEquals("Ｍａｃ－Ｔａｌｋ", q.getAnswerList().get(3));
        Assert.assertEquals("Ｓｈａｒｅ－Ｐｒｏ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(42);

        Assert.assertEquals("ファイルサーバの機能の一つ。複数のユーザが同時に同じファイルにアクセスしたときに、矛盾しないように管理する機能", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("排他制御", q.getAnswerList().get(0));
        Assert.assertEquals("アクセス制御", q.getAnswerList().get(1));
        Assert.assertEquals("ファイル制御", q.getAnswerList().get(2));
        Assert.assertEquals("順次制御", q.getAnswerList().get(3));
        Assert.assertEquals("ディスク制御", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(43);

        Assert.assertEquals("サーバ側とクライアント側でプログラムを用意し、接続した複数のコンピュータで１つのアプリケーションを使い分けるシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("クライアントサーバシステム", q.getAnswerList().get(0));
        Assert.assertEquals("サーバマネージャーシステム", q.getAnswerList().get(1));
        Assert.assertEquals("ネットウェアーシステム", q.getAnswerList().get(2));
        Assert.assertEquals("パソコンＬＡＮシステム", q.getAnswerList().get(3));
        Assert.assertEquals("ホストサーバシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(44);

        Assert.assertEquals("クライアントサーバシステムにおいて、クライアント側で処理した方がよい仕事として適切なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ユーザ操作のための画面処理", q.getAnswerList().get(0));
        Assert.assertEquals("データベース処理", q.getAnswerList().get(1));
        Assert.assertEquals("プリントキュー機能の設定", q.getAnswerList().get(2));
        Assert.assertEquals("クライアントのアクセス権設定", q.getAnswerList().get(3));
        Assert.assertEquals("共有データの検索・更新など", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(45);

        Assert.assertEquals("クライアントサーバシステムに対し、ファイルサーバ型のシステムではデータは通常どこに格納されているか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サーバ", q.getAnswerList().get(0));
        Assert.assertEquals("クライアント", q.getAnswerList().get(1));
        Assert.assertEquals("サーバとクライアント両方", q.getAnswerList().get(2));
        Assert.assertEquals("端末", q.getAnswerList().get(3));
        Assert.assertEquals("福岡女子商業の食堂の冷蔵庫", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(46);

        Assert.assertEquals("クライアントサーバシステムに対し、端末エミュレーション型のシステムではデータは通常どこに格納されているか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サーバ", q.getAnswerList().get(0));
        Assert.assertEquals("クライアント", q.getAnswerList().get(1));
        Assert.assertEquals("サーバとクライアント両方", q.getAnswerList().get(2));
        Assert.assertEquals("端末機", q.getAnswerList().get(3));
        Assert.assertEquals("ＫＡＭＡＣ先生の家の押入れ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(47);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１などのように、基本ソフトウェアと応用ソフトウェアの中間に位置する各種ソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(0));
        Assert.assertEquals("センターウェア", q.getAnswerList().get(1));
        Assert.assertEquals("オペレーティングシステム", q.getAnswerList().get(2));
        Assert.assertEquals("グループウェア", q.getAnswerList().get(3));
        Assert.assertEquals("ユーティリティーソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(48);

        Assert.assertEquals("クライアントサーバシステムにおいて、サーバ上のソフトとクライアント上のソフトが連動して動くように調節するソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(0));
        Assert.assertEquals("オーサリングソフト", q.getAnswerList().get(1));
        Assert.assertEquals("グループウェア", q.getAnswerList().get(2));
        Assert.assertEquals("ブリッジウェア", q.getAnswerList().get(3));
        Assert.assertEquals("エミュレーションソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(49);

        Assert.assertEquals("パソコンでクライアントサーバシステムを構築する場合、通常クライアントに置くプログラムモジュール（ミドルウェア）は何か", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("データベースリクエスタ", q.getAnswerList().get(0));
        Assert.assertEquals("Ｂｔｒｉｅｖｅ", q.getAnswerList().get(1));
        Assert.assertEquals("ＴＣＰ／ＩＰプロトコル", q.getAnswerList().get(2));
        Assert.assertEquals("エミュレータ", q.getAnswerList().get(3));
        Assert.assertEquals("転送プロトコル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(50);

        Assert.assertEquals("データ管理を行うＣＰＵと、そのデータを受け取って処理を行うＣＰＵとで構成した分散処理システム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("クライアントサーバシステム", q.getAnswerList().get(0));
        Assert.assertEquals("サーバマネージャーシステム", q.getAnswerList().get(1));
        Assert.assertEquals("ネットウェアーシステム", q.getAnswerList().get(2));
        Assert.assertEquals("パソコンＬＡＮシステム", q.getAnswerList().get(3));
        Assert.assertEquals("ホストサーバシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(51);

        Assert.assertEquals("ひとつのファイルを複数のＣＰＵで使えるようにした分散処理システム。ピアツーピア型ＬＡＮなど", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ファイル共有方式", q.getAnswerList().get(0));
        Assert.assertEquals("クライアントサーバシステム", q.getAnswerList().get(1));
        Assert.assertEquals("サーバマネージャーシステム", q.getAnswerList().get(2));
        Assert.assertEquals("ジャストシステム", q.getAnswerList().get(3));
        Assert.assertEquals("ホストサーバシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(52);

        Assert.assertEquals("ホストコンピュータのファイルをダウンロードし、それを用いて処理を行うもの。汎用機と接続する場合この方式が多い", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ファイル転送方式", q.getAnswerList().get(0));
        Assert.assertEquals("サーバクライアントシステム", q.getAnswerList().get(1));
        Assert.assertEquals("サーバマネージャーシステム", q.getAnswerList().get(2));
        Assert.assertEquals("Ｘ２０００システム", q.getAnswerList().get(3));
        Assert.assertEquals("ホストサーバシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(53);

        Assert.assertEquals("文字や数値に加えて、音声・映像・画像など多彩なデータをコンピュータで統合的にデジタル処理をする技術", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチメディア", q.getAnswerList().get(0));
        Assert.assertEquals("ニューメディア", q.getAnswerList().get(1));
        Assert.assertEquals("マルチシステム", q.getAnswerList().get(2));
        Assert.assertEquals("マルチーズ", q.getAnswerList().get(3));
        Assert.assertEquals("マスメディア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(54);

        Assert.assertEquals("次の中で、マルチメディアの最大の特徴と言えるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デジタル化", q.getAnswerList().get(0));
        Assert.assertEquals("アナログ化", q.getAnswerList().get(1));
        Assert.assertEquals("静止画が中心", q.getAnswerList().get(2));
        Assert.assertEquals("データの非圧縮化", q.getAnswerList().get(3));
        Assert.assertEquals("一方通行", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(55);

        Assert.assertEquals("次の中で、マルチメディアの最大の特徴と言えるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インタラクティブ（双方向性）", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＡＴＶ", q.getAnswerList().get(1));
        Assert.assertEquals("静止衛星", q.getAnswerList().get(2));
        Assert.assertEquals("アナログ信号", q.getAnswerList().get(3));
        Assert.assertEquals("音声多重放送", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(56);

        Assert.assertEquals("次の中で、マルチメディアの特徴と言えないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチタスク", q.getAnswerList().get(0));
        Assert.assertEquals("双方向性", q.getAnswerList().get(1));
        Assert.assertEquals("デジタル信号", q.getAnswerList().get(2));
        Assert.assertEquals("シームレス化", q.getAnswerList().get(3));
        Assert.assertEquals("動画の再生", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(57);

        Assert.assertEquals("次の中で、マルチメディアシステムの構成に特に必要でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＰＵ（ｉ８０２８６）", q.getAnswerList().get(0));
        Assert.assertEquals("ビデオキャプチャボード", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＩＤＩインタフェース", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＯディスクドライブ", q.getAnswerList().get(3));
        Assert.assertEquals("マルチシンクディスプレイ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(58);

        Assert.assertEquals("次の中で、マルチメディアシステムの構成に特に必要でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エディタ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＤ－ＲＯＭドライブ", q.getAnswerList().get(1));
        Assert.assertEquals("マルチメディア対応ＯＳ", q.getAnswerList().get(2));
        Assert.assertEquals("イメージスキャナ", q.getAnswerList().get(3));
        Assert.assertEquals("グラフィックアクセラレータ～", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(59);

        Assert.assertEquals("次の中で、動画データの圧縮・伸長に使用される、ＩＳＯで定められたフォーマット形式はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＰＥＧ", q.getAnswerList().get(0));
        Assert.assertEquals("ＪＰＥＧ", q.getAnswerList().get(1));
        Assert.assertEquals("ＺＩＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＶＩ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＤ－Ｉ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(60);

        Assert.assertEquals("次の中で、音楽・映像・プログラムなどの符号化に使用される、フィリップス・ソニー・松下で定めたフォーマット形式はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＤ－Ｉ", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＰＥＧ", q.getAnswerList().get(1));
        Assert.assertEquals("ＪＰＥＧ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＤ－ＤＡ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＶＩ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(61);

        Assert.assertEquals("マイクロソフト社が発売している動画再生用のソフトウェアの名称は何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ビデオ・フォー・ウィンドウズ", q.getAnswerList().get(0));
        Assert.assertEquals("クイック・タイム", q.getAnswerList().get(1));
        Assert.assertEquals("プリントショップⅡ", q.getAnswerList().get(2));
        Assert.assertEquals("Ｗｉｎｄｏｗｓ９５", q.getAnswerList().get(3));
        Assert.assertEquals("スクリーン・マジック", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(62);

        Assert.assertEquals("Ａｐｐｌｅ社が発売している動画再生用のソフトウェアの名称は何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｑｕｉｃｋ　Ｔｉｍｅ", q.getAnswerList().get(0));
        Assert.assertEquals("ビデオ・フォー・ウィンドウズ", q.getAnswerList().get(1));
        Assert.assertEquals("ＰＲＩＮＴ　ＳｈｏｐⅡ", q.getAnswerList().get(2));
        Assert.assertEquals("シカゴ", q.getAnswerList().get(3));
        Assert.assertEquals("動くぞう！", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(63);

        Assert.assertEquals("コンピュータに動画を入力するために、ビデオ信号をデジタル信号に変換する拡張ボード", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ビデオキャプチャボード", q.getAnswerList().get(0));
        Assert.assertEquals("グラフィックアセロラボード", q.getAnswerList().get(1));
        Assert.assertEquals("ビデオスキャナボード", q.getAnswerList().get(2));
        Assert.assertEquals("バナナボート", q.getAnswerList().get(3));
        Assert.assertEquals("エクステンションボード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(64);

        Assert.assertEquals("コンピュータで音を入出力するために、音声信号とデジタル信号の相互変換を行う拡張ボード", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サウンドボード", q.getAnswerList().get(0));
        Assert.assertEquals("ビデオチャプチャプボード", q.getAnswerList().get(1));
        Assert.assertEquals("ビデオキャプチャボード", q.getAnswerList().get(2));
        Assert.assertEquals("イメージボード", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＭＳボード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(65);

        Assert.assertEquals("パソコン内蔵のディスプレイ出力端子では、発色数が少なく描画速度が遅いので、（　　　　）ボードを使用することが多い", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("グラフィックアクセラレータ", q.getAnswerList().get(0));
        Assert.assertEquals("ビデオキャプチャ", q.getAnswerList().get(1));
        Assert.assertEquals("キャプテンツバサ", q.getAnswerList().get(2));
        Assert.assertEquals("モニターハイスピード", q.getAnswerList().get(3));
        Assert.assertEquals("マルチスキャナ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(66);

        Assert.assertEquals("絵や写真などの静止画像を入力するための装置", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("イメージスキャナ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＴスキャン", q.getAnswerList().get(1));
        Assert.assertEquals("イメージトレーニング", q.getAnswerList().get(2));
        Assert.assertEquals("イメージカッター", q.getAnswerList().get(3));
        Assert.assertEquals("ひまわり", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(67);

        Assert.assertEquals("マルチメディア用語の「ＣＤ－Ｉ」。この「Ｉ」の意味は何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インタラクティブ", q.getAnswerList().get(0));
        Assert.assertEquals("イメージ", q.getAnswerList().get(1));
        Assert.assertEquals("インフォメーション", q.getAnswerList().get(2));
        Assert.assertEquals("インタフェース", q.getAnswerList().get(3));
        Assert.assertEquals("いやいや", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(68);

        Assert.assertEquals("マルチメディア（処理）のソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチメディアタイトル", q.getAnswerList().get(0));
        Assert.assertEquals("マルチメディアブック", q.getAnswerList().get(1));
        Assert.assertEquals("マルチメディアストック", q.getAnswerList().get(2));
        Assert.assertEquals("マルチメディアモジュール", q.getAnswerList().get(3));
        Assert.assertEquals("マルチメディアパッケージ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(69);

        Assert.assertEquals("あるストーリーに基づいて、絵や音声・動画・文字などのメディアを組み合わせるためのソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オーサリングソフト", q.getAnswerList().get(0));
        Assert.assertEquals("読経ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("メディアミックスソフト", q.getAnswerList().get(2));
        Assert.assertEquals("プレゼンテーションソフト", q.getAnswerList().get(3));
        Assert.assertEquals("マルチメディアソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(70);

        Assert.assertEquals("マルチメディアに関するソフトウェアで、特に必要のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("表計算ソフト", q.getAnswerList().get(0));
        Assert.assertEquals("プレーヤーソフト", q.getAnswerList().get(1));
        Assert.assertEquals("オーサリングソフト", q.getAnswerList().get(2));
        Assert.assertEquals("サンプリングソフト", q.getAnswerList().get(3));
        Assert.assertEquals("グラフィックソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(71);

        Assert.assertEquals("疑似体験などの仮想現実（感）を英語で言うと？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ヴァーチャルリアリティ", q.getAnswerList().get(0));
        Assert.assertEquals("カーナビゲーション", q.getAnswerList().get(1));
        Assert.assertEquals("プレマスタリング", q.getAnswerList().get(2));
        Assert.assertEquals("インフラストラクチャ", q.getAnswerList().get(3));
        Assert.assertEquals("デジタルライツ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(72);

        Assert.assertEquals("「ヴァーチャルリアリティ」。さて、どういう意味？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("仮想現実（感）", q.getAnswerList().get(0));
        Assert.assertEquals("疑似体験", q.getAnswerList().get(1));
        Assert.assertEquals("魔のトライアングル", q.getAnswerList().get(2));
        Assert.assertEquals("現状維持", q.getAnswerList().get(3));
        Assert.assertEquals("透明人間", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(73);

        Assert.assertEquals("マルチメディアのオーサリングソフトとして「ＨｙｐｅｒＣａｒｄ」「Ｄｉｒｅｃｔｏｒ」などあるが、これはどのパソコン用？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｍａｃ用", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＢＭ用", q.getAnswerList().get(1));
        Assert.assertEquals("富士通用", q.getAnswerList().get(2));
        Assert.assertEquals("ＮＥＣ用", q.getAnswerList().get(3));
        Assert.assertEquals("エプソン用", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(74);

        Assert.assertEquals("マルチメディアの応用例としては、パッケージ系と通信系があるが、前者に属さないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("テレビ会議", q.getAnswerList().get(0));
        Assert.assertEquals("英会話教材", q.getAnswerList().get(1));
        Assert.assertEquals("カーナビゲーションシステム", q.getAnswerList().get(2));
        Assert.assertEquals("プラネタリウム体験ソフト", q.getAnswerList().get(3));
        Assert.assertEquals("パイロット機内教育システム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(75);

        Assert.assertEquals("次の中で、誤っているものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マウス　　　　＝　座標入力", q.getAnswerList().get(0));
        Assert.assertEquals("ビデオカメラ　＝　動画入力", q.getAnswerList().get(1));
        Assert.assertEquals("マイクロホン　＝　音声入力", q.getAnswerList().get(2));
        Assert.assertEquals("スキャナ　　　＝　画像出力", q.getAnswerList().get(3));
        Assert.assertEquals("スピーカ　　　＝　音声出力", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(76);

        Assert.assertEquals("「飛行機の操縦の訓練」に最も関係のある言葉はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("仮想現実", q.getAnswerList().get(0));
        Assert.assertEquals("仮想記憶", q.getAnswerList().get(1));
        Assert.assertEquals("火葬現実", q.getAnswerList().get(2));
        Assert.assertEquals("仮装記憶", q.getAnswerList().get(3));
        Assert.assertEquals("家相占い", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(77);

        Assert.assertEquals("共同で作業を行うワークグループ専用に設計された、コンピュータ支援システムの総称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("グループウェア", q.getAnswerList().get(0));
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(1));
        Assert.assertEquals("フリーウェア", q.getAnswerList().get(2));
        Assert.assertEquals("アシスタントウェア", q.getAnswerList().get(3));
        Assert.assertEquals("トレーニングウェア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(78);

        Assert.assertEquals("グループウェアの基礎技術に、特に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("キーボードタイピング技術", q.getAnswerList().get(0));
        Assert.assertEquals("ヒューマンインタフェース技術", q.getAnswerList().get(1));
        Assert.assertEquals("マルチメディア技術", q.getAnswerList().get(2));
        Assert.assertEquals("ハイパーテキスト技術", q.getAnswerList().get(3));
        Assert.assertEquals("ネットワーク技術", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(79);

        Assert.assertEquals("グループウェアに関するツールとして特に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ロードランナーのソフト", q.getAnswerList().get(0));
        Assert.assertEquals("プロジェクト管理ソフト", q.getAnswerList().get(1));
        Assert.assertEquals("スケジュール管理ソフト", q.getAnswerList().get(2));
        Assert.assertEquals("グループライティングソフト", q.getAnswerList().get(3));
        Assert.assertEquals("プレゼンテーションソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(80);

        Assert.assertEquals("公衆電話回線を使って、ホストコンピュータ（センター）を介して不特定多数の人とパソコンでなど情報交換をするシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パソコン通信", q.getAnswerList().get(0));
        Assert.assertEquals("データ通信", q.getAnswerList().get(1));
        Assert.assertEquals("学級通信", q.getAnswerList().get(2));
        Assert.assertEquals("オンライン通信", q.getAnswerList().get(3));
        Assert.assertEquals("メール通信", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(81);

        Assert.assertEquals("日本電気（株）が運営しているパソコン通信のホスト局名は何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＰＣ－ＶＡＮ", q.getAnswerList().get(0));
        Assert.assertEquals("ＮＩＦＴＹ－Ｓｅｒｖｅ", q.getAnswerList().get(1));
        Assert.assertEquals("アスキーネット", q.getAnswerList().get(2));
        Assert.assertEquals("マスターネット", q.getAnswerList().get(3));
        Assert.assertEquals("福女商ＮＥＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(82);

        Assert.assertEquals("パソコン通信で手紙のやりとりを行うもの。特定の人や複数の人との送信ができるシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("電子メール", q.getAnswerList().get(0));
        Assert.assertEquals("電子掲示板", q.getAnswerList().get(1));
        Assert.assertEquals("オンライントーク", q.getAnswerList().get(2));
        Assert.assertEquals("チャット", q.getAnswerList().get(3));
        Assert.assertEquals("ゲートウェイ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(83);

        Assert.assertEquals("不特定多数のユーザが自由に書き込みを行い、情報交換をするシステム。駅の伝言板などと同じような機能を持つ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("電子掲示板", q.getAnswerList().get(0));
        Assert.assertEquals("電子メール", q.getAnswerList().get(1));
        Assert.assertEquals("チャット", q.getAnswerList().get(2));
        Assert.assertEquals("物々交換", q.getAnswerList().get(3));
        Assert.assertEquals("フォーラム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(84);

        Assert.assertEquals("電子会議とも言われ、特定のテーマについて情報交換や意見交換を行うシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フォーラム", q.getAnswerList().get(0));
        Assert.assertEquals("電子掲示板", q.getAnswerList().get(1));
        Assert.assertEquals("電子メール", q.getAnswerList().get(2));
        Assert.assertEquals("ＯＬＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＵＧ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(85);

        Assert.assertEquals("新聞社や企業などと提携して、ニュースや天気予報・新製品情報などのサービスを行うシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("情報提供", q.getAnswerList().get(0));
        Assert.assertEquals("情報収集", q.getAnswerList().get(1));
        Assert.assertEquals("情報交換", q.getAnswerList().get(2));
        Assert.assertEquals("情報加工", q.getAnswerList().get(3));
        Assert.assertEquals("情報処理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(86);

        Assert.assertEquals("企業活動や社会活動などに関する情報をデータベースに蓄積し、その内容とアクセス方法を提供するシステムの総称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("商用データベース", q.getAnswerList().get(0));
        Assert.assertEquals("リファレンスデータベース", q.getAnswerList().get(1));
        Assert.assertEquals("ファクトデータベース", q.getAnswerList().get(2));
        Assert.assertEquals("フルテキストデータベース", q.getAnswerList().get(3));
        Assert.assertEquals("無償データベース", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(87);

        Assert.assertEquals("パソコン通信のネットワークにおいて、ホストコンピュータから遠く離れた地点に設置される中継地点", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アクセスポイント", q.getAnswerList().get(0));
        Assert.assertEquals("ゲートウェイ", q.getAnswerList().get(1));
        Assert.assertEquals("エミュレータ", q.getAnswerList().get(2));
        Assert.assertEquals("インターネット", q.getAnswerList().get(3));
        Assert.assertEquals("関所", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(88);

        Assert.assertEquals("パソコン通信において、パソコン本体の端子とモデムを接続するケーブルのこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＳ－２３２Ｃケーブル", q.getAnswerList().get(0));
        Assert.assertEquals("モジュラージャック", q.getAnswerList().get(1));
        Assert.assertEquals("ロープウェイ", q.getAnswerList().get(2));
        Assert.assertEquals("モジュレイターケーブル", q.getAnswerList().get(3));
        Assert.assertEquals("リバースケーブル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(89);

        Assert.assertEquals("コンピュータで取り扱われるデジタル信号を、電話回線のアナログ信号に変換したり、その逆を行う装置", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("モデム", q.getAnswerList().get(0));
        Assert.assertEquals("ターミナル", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＣＵ", q.getAnswerList().get(2));
        Assert.assertEquals("モスラー", q.getAnswerList().get(3));
        Assert.assertEquals("変態装置", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(90);

        Assert.assertEquals("ホストコンピュータのデータを、自分のパソコンのディスクに取り込むこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ダウンロード", q.getAnswerList().get(0));
        Assert.assertEquals("アップロード", q.getAnswerList().get(1));
        Assert.assertEquals("オートログイン", q.getAnswerList().get(2));
        Assert.assertEquals("フリーターム", q.getAnswerList().get(3));
        Assert.assertEquals("プロトコル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(91);

        Assert.assertEquals("自分のパソコンのディスクなどから、データをホストコンピュータに送信すること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アップロード", q.getAnswerList().get(0));
        Assert.assertEquals("ダウンロード", q.getAnswerList().get(1));
        Assert.assertEquals("オートダイヤル", q.getAnswerList().get(2));
        Assert.assertEquals("フリーアクセス", q.getAnswerList().get(3));
        Assert.assertEquals("ゲートウェイ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(92);

        Assert.assertEquals("パソコン通信で接続先を呼び出すときに、自動的にパソコンから電話をかける機能", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オートダイヤル", q.getAnswerList().get(0));
        Assert.assertEquals("オートログイン", q.getAnswerList().get(1));
        Assert.assertEquals("オートアクセス", q.getAnswerList().get(2));
        Assert.assertEquals("オートローダー", q.getAnswerList().get(3));
        Assert.assertEquals("オートファックス", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(93);

        Assert.assertEquals("ネットワークにアクセスするための会員番号（ＩＤ）や暗唱番号（パスワード）を、自動的に発信してくれる機能", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オートログイン", q.getAnswerList().get(0));
        Assert.assertEquals("オートダイヤル", q.getAnswerList().get(1));
        Assert.assertEquals("オートアクセス", q.getAnswerList().get(2));
        Assert.assertEquals("オートテレフォン", q.getAnswerList().get(3));
        Assert.assertEquals("オートパス", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(94);

        Assert.assertEquals("送信側と受信側とのタイミングをとることなしに送受信を行う方式。通信速度が比較的遅いパソコン通信などで用いられている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("非同期式通信", q.getAnswerList().get(0));
        Assert.assertEquals("同期式通信", q.getAnswerList().get(1));
        Assert.assertEquals("パケット通信", q.getAnswerList().get(2));
        Assert.assertEquals("バスケット通信", q.getAnswerList().get(3));
        Assert.assertEquals("動悸・息切れ式通信", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(95);

        Assert.assertEquals("パソコン通信の電子メールで使用する、郵便局の私書箱に相当するもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("メールボックス", q.getAnswerList().get(0));
        Assert.assertEquals("ブラックボックス", q.getAnswerList().get(1));
        Assert.assertEquals("ＩＤボックス", q.getAnswerList().get(2));
        Assert.assertEquals("パーソナルボックス", q.getAnswerList().get(3));
        Assert.assertEquals("ボックス席", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(96);

        Assert.assertEquals("複数のネットワークを相互に接続すること。または、ネットワーク間の情報交換の窓口となっている地点自体を指すこともある", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ゲートウェイ", q.getAnswerList().get(0));
        Assert.assertEquals("マイウェイ", q.getAnswerList().get(1));
        Assert.assertEquals("ゲッターロボ", q.getAnswerList().get(2));
        Assert.assertEquals("アクセスポイント", q.getAnswerList().get(3));
        Assert.assertEquals("ポイントゲッター", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(97);

        Assert.assertEquals("著作者が著作権を保留したままネットワーク会員が自由にコピーして使用してよい、使用料金不要のソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フリーウェア", q.getAnswerList().get(0));
        Assert.assertEquals("シェアウェア", q.getAnswerList().get(1));
        Assert.assertEquals("ＰＤＳ", q.getAnswerList().get(2));
        Assert.assertEquals("コピーツール", q.getAnswerList().get(3));
        Assert.assertEquals("オンラインソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(98);

        Assert.assertEquals("ネットワーク上で入手できるもので、使用してみて価値を見い出し継続して使用する場合には一定の料金を支払うソフトウェア", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("シェアウェア", q.getAnswerList().get(0));
        Assert.assertEquals("フリーウェア", q.getAnswerList().get(1));
        Assert.assertEquals("ＰＤＳ", q.getAnswerList().get(2));
        Assert.assertEquals("ＧＰＬ", q.getAnswerList().get(3));
        Assert.assertEquals("オンラインソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(99);

        Assert.assertEquals("モデムと電話回線、はて何で接続する？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("モジュラージャック", q.getAnswerList().get(0));
        Assert.assertEquals("リバースケーブル", q.getAnswerList().get(1));
        Assert.assertEquals("リバーシブルコート", q.getAnswerList().get(2));
        Assert.assertEquals("ストレートケーブル", q.getAnswerList().get(3));
        Assert.assertEquals("赤い糸", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(100);

        Assert.assertEquals("「モデム」に関係のない言葉はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("セントロニクス", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＴコマンド", q.getAnswerList().get(1));
        Assert.assertEquals("エコーバック", q.getAnswerList().get(2));
        Assert.assertEquals("データの圧縮", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＩＡ－２３２Ｄ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(101);

        Assert.assertEquals("パソコン通信のプロトコルに関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＩＤＩ信号", q.getAnswerList().get(0));
        Assert.assertEquals("パリティビット", q.getAnswerList().get(1));
        Assert.assertEquals("データ長", q.getAnswerList().get(2));
        Assert.assertEquals("通信速度", q.getAnswerList().get(3));
        Assert.assertEquals("全二重・半二重", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(102);

        Assert.assertEquals("「ＩＳＤＮ」って何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("統合デジタル通信網", q.getAnswerList().get(0));
        Assert.assertEquals("全米情報基盤", q.getAnswerList().get(1));
        Assert.assertEquals("移動体通信網", q.getAnswerList().get(2));
        Assert.assertEquals("宇宙情報ハイウェイ構想", q.getAnswerList().get(3));
        Assert.assertEquals("気象衛星ひまわり", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(103);

        Assert.assertEquals("パソコン通信のネットワークで、それぞれの利用者に割り振られた番号。利用者はこれによって相手を特定できる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＩＤ番号", q.getAnswerList().get(0));
        Assert.assertEquals("ニックネーム", q.getAnswerList().get(1));
        Assert.assertEquals("ハンドル名", q.getAnswerList().get(2));
        Assert.assertEquals("パスワード", q.getAnswerList().get(3));
        Assert.assertEquals("ノートナンバー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(104);

        Assert.assertEquals("電話回線などで伝えられる音声信号", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アナログ信号", q.getAnswerList().get(0));
        Assert.assertEquals("デジタル信号", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＩＤＩ信号", q.getAnswerList().get(2));
        Assert.assertEquals("クロック信号", q.getAnswerList().get(3));
        Assert.assertEquals("押しボタン式信号", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(105);

        Assert.assertEquals("コンピュータ内部で表現される、０と１の２進数の信号", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デジタル信号", q.getAnswerList().get(0));
        Assert.assertEquals("アナログ信号", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＩＤＩ信号", q.getAnswerList().get(2));
        Assert.assertEquals("ＦＳＫ信号", q.getAnswerList().get(3));
        Assert.assertEquals("押しボタン式信号", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(106);

        Assert.assertEquals("世界１３７カ国（１９９４年現在）を結ぶ地球規模のネットワーク。相互に接続されているネットワークの集合体を意味する", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インターネット", q.getAnswerList().get(0));
        Assert.assertEquals("ＪＡＬ－ＮＥＴ", q.getAnswerList().get(1));
        Assert.assertEquals("タッチネット", q.getAnswerList().get(2));
        Assert.assertEquals("アスキーネット", q.getAnswerList().get(3));
        Assert.assertEquals("ワールドネット", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(107);

        Assert.assertEquals("米国マイクロコム社開発の、モデム間におけるデータ通信方式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＮＰ", q.getAnswerList().get(0));
        Assert.assertEquals("ＴＭＮ", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＳＰ", q.getAnswerList().get(2));
        Assert.assertEquals("ＴＲＦ", q.getAnswerList().get(3));
        Assert.assertEquals("ＦＪＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(108);

        Assert.assertEquals("パソコン通信をやりたい！　次の中で、特になくてもよいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("シーケンサー", q.getAnswerList().get(0));
        Assert.assertEquals("モデム", q.getAnswerList().get(1));
        Assert.assertEquals("通信ソフト", q.getAnswerList().get(2));
        Assert.assertEquals("モジュラー式電話回線", q.getAnswerList().get(3));
        Assert.assertEquals("パソコンまたはワープロ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(109);

        Assert.assertEquals("ネットワークの正規の利用者であることを認識するためのコード。キャッシュカードの暗証番号と同じ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パスワード", q.getAnswerList().get(0));
        Assert.assertEquals("キーワード", q.getAnswerList().get(1));
        Assert.assertEquals("キーボード", q.getAnswerList().get(2));
        Assert.assertEquals("チェッカー", q.getAnswerList().get(3));
        Assert.assertEquals("チェックディジット", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(110);

        Assert.assertEquals("１秒間に送受信することのできるビット数。通信速度を表す", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ｂｐｓ", q.getAnswerList().get(0));
        Assert.assertEquals("ＫＨｚ", q.getAnswerList().get(1));
        Assert.assertEquals("ＦＳＫ", q.getAnswerList().get(2));
        Assert.assertEquals("クロック周波数", q.getAnswerList().get(3));
        Assert.assertEquals("マッハ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(111);

        Assert.assertEquals("音声・音色・音階などを数値化し、電子楽器同士あるいはパソコンと電子楽器との間でやりとりを行う場合の国際規格", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＩＤＩ", q.getAnswerList().get(0));
        Assert.assertEquals("ＧＳ規格", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＩＭＰＩ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＴＭ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＭ５００", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(112);

        Assert.assertEquals("マルチメディア市場において、テレビの番組や映画などを自宅に居ながらにして、見たいときに見たいものが見れるサービス", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ビデオ・オン・デマンド", q.getAnswerList().get(0));
        Assert.assertEquals("ヴァーチャル・カンパニー", q.getAnswerList().get(1));
        Assert.assertEquals("ホーム・ビデオ・プロジェクタ", q.getAnswerList().get(2));
        Assert.assertEquals("ホーム・ハイビジョン・テレビ", q.getAnswerList().get(3));
        Assert.assertEquals("ビデオ・フォー・ウィンドウズ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(113);

        Assert.assertEquals("ＣＤ－ＲＯＭの製作工程に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("コンパイル", q.getAnswerList().get(0));
        Assert.assertEquals("プレマスタリング", q.getAnswerList().get(1));
        Assert.assertEquals("マスタリング", q.getAnswerList().get(2));
        Assert.assertEquals("反射膜生成", q.getAnswerList().get(3));
        Assert.assertEquals("原盤作成", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(114);

        Assert.assertEquals("日本におけるウィルス対策のパイオニア。ウィルス対策商品の提供・コンサルティングなどを行っている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リンク社", q.getAnswerList().get(0));
        Assert.assertEquals("オーム社", q.getAnswerList().get(1));
        Assert.assertEquals("フィリップス社", q.getAnswerList().get(2));
        Assert.assertEquals("ウィルス対策研究社", q.getAnswerList().get(3));
        Assert.assertEquals("ネルソン社", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(115);

        Assert.assertEquals("リンク社が発売している有名な統合型ウィルス対策ソフト", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ウイルスバスター　", q.getAnswerList().get(0));
        Assert.assertEquals("ウイルスチェッカー", q.getAnswerList().get(1));
        Assert.assertEquals("ウイルス退治", q.getAnswerList().get(2));
        Assert.assertEquals("ウイルススキャン", q.getAnswerList().get(3));
        Assert.assertEquals("ウイルス皆殺し", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(116);

        Assert.assertEquals("関係するプログラムやデータおよびドキュメントなど、まとめて圧縮し一つのファイルにしたもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アーカイブファイル", q.getAnswerList().get(0));
        Assert.assertEquals("書籍ファイル", q.getAnswerList().get(1));
        Assert.assertEquals("ストックファイル", q.getAnswerList().get(2));
        Assert.assertEquals("ヒドンファイル", q.getAnswerList().get(3));
        Assert.assertEquals("ＬＨＡファイル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(117);

        Assert.assertEquals("オンラインソフトなどがバージョンアップした場合に使用する、新旧ファイルの異なる部分の情報だけを収めたファイル", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("差分ファイル", q.getAnswerList().get(0));
        Assert.assertEquals("新旧ファイル", q.getAnswerList().get(1));
        Assert.assertEquals("更新ファイル", q.getAnswerList().get(2));
        Assert.assertEquals("バージョンアップファイル", q.getAnswerList().get(3));
        Assert.assertEquals("トランザクションファイル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(118);

        Assert.assertEquals("入会したいパソコン通信ネットに接続し、所定の手続きに従って、住所・電話番号・氏名などを入力して登録する入会方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オンラインサインアップ", q.getAnswerList().get(0));
        Assert.assertEquals("オンラインメンバーズ", q.getAnswerList().get(1));
        Assert.assertEquals("オンラインゲートウェイ", q.getAnswerList().get(2));
        Assert.assertEquals("オンラインサランラップ", q.getAnswerList().get(3));
        Assert.assertEquals("オンラインネームアップ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(119);

        Assert.assertEquals("有償で市場に提供される情報サービスで、企業活動や社会活動に関する情報を多く蓄積しており必要なデータを的確に検索できる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("商用データベース", q.getAnswerList().get(0));
        Assert.assertEquals("パソコン通信", q.getAnswerList().get(1));
        Assert.assertEquals("オンラインサインアップ", q.getAnswerList().get(2));
        Assert.assertEquals("ＢＢＳ", q.getAnswerList().get(3));
        Assert.assertEquals("サービス統合通信網", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(120);

        Assert.assertEquals("企業をはじめ、さまざまな組織体の内部で利用されるデータベース", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インハウスデータベース", q.getAnswerList().get(0));
        Assert.assertEquals("フルハウスデータベース", q.getAnswerList().get(1));
        Assert.assertEquals("ホワイトハウスデータベース", q.getAnswerList().get(2));
        Assert.assertEquals("インベーダデータベース", q.getAnswerList().get(3));
        Assert.assertEquals("インテグラデータベース", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(121);

        Assert.assertEquals("データや各種の記事、論文などの書誌情報・抄録などを収めたデータベース", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リファレンスデータベース", q.getAnswerList().get(0));
        Assert.assertEquals("インハウスデータベース", q.getAnswerList().get(1));
        Assert.assertEquals("レディファインズデータベース", q.getAnswerList().get(2));
        Assert.assertEquals("ハウジングデータベース", q.getAnswerList().get(3));
        Assert.assertEquals("ファクトデータベース", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(122);

        Assert.assertEquals("産業統計（各種数値など）のオリジナル情報そのものを収めたデータベース", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ファクトデータベース", q.getAnswerList().get(0));
        Assert.assertEquals("オリジナルデータベース", q.getAnswerList().get(1));
        Assert.assertEquals("バイナリデータベース", q.getAnswerList().get(2));
        Assert.assertEquals("インハウスデータベース", q.getAnswerList().get(3));
        Assert.assertEquals("商業データベース", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(123);

        Assert.assertEquals("記事や論文などのオリジナル情報の全文を収めたデータベース", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フルテキストデータベース", q.getAnswerList().get(0));
        Assert.assertEquals("テキストファイルデータベース", q.getAnswerList().get(1));
        Assert.assertEquals("プルダウンデータベース", q.getAnswerList().get(2));
        Assert.assertEquals("オリジナルデータベース", q.getAnswerList().get(3));
        Assert.assertEquals("ブッフスデータベース", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(124);

        Assert.assertEquals("次の中で「商用データベース」の特徴とは言えないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("会員同士がデータを相互に提供", q.getAnswerList().get(0));
        Assert.assertEquals("システム運用者がデータを提供", q.getAnswerList().get(1));
        Assert.assertEquals("ユーザはデータ利用が主な目的", q.getAnswerList().get(2));
        Assert.assertEquals("データ量が多い", q.getAnswerList().get(3));
        Assert.assertEquals("検索方法が提供されている", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(125);

        Assert.assertEquals("次の中で「商用データベース」の大きな特徴はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("一般にゲートウェイ機能をもつ", q.getAnswerList().get(0));
        Assert.assertEquals("データ量が少ない", q.getAnswerList().get(1));
        Assert.assertEquals("一般に検索方法は提供されない", q.getAnswerList().get(2));
        Assert.assertEquals("情報の交換・流通が主な目的", q.getAnswerList().get(3));
        Assert.assertEquals("データの提供はユーザが多い", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(126);

        Assert.assertEquals("帝国データバンクが提供している、企業情報・個人情報の商用データベースの名称は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＯＳＭＯＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＪＯＩＳ－１", q.getAnswerList().get(1));
        Assert.assertEquals("ＮＥＥＤＳ", q.getAnswerList().get(2));
        Assert.assertEquals("Ｊ－ＢＩＳＣ", q.getAnswerList().get(3));
        Assert.assertEquals("Ｊ－ＷＡＬＫ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(127);

        Assert.assertEquals("データベースが一定の基準で管理している語。スムーズに検索するための検索用語辞書のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("シソーラス", q.getAnswerList().get(0));
        Assert.assertEquals("フリーターム", q.getAnswerList().get(1));
        Assert.assertEquals("キーワード", q.getAnswerList().get(2));
        Assert.assertEquals("ディクショナリ", q.getAnswerList().get(3));
        Assert.assertEquals("セレクタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(128);

        Assert.assertEquals("データベースにおける検索で、キーワードが見つからないとき検索者が思いついた語を指定したりするが、そのような検索方式", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("フリーターム検索", q.getAnswerList().get(0));
        Assert.assertEquals("サマータイム検索", q.getAnswerList().get(1));
        Assert.assertEquals("フリータイム検索", q.getAnswerList().get(2));
        Assert.assertEquals("キーボード検索", q.getAnswerList().get(3));
        Assert.assertEquals("キーワード検索", q.getAnswerList().get(4));
    }

    private void subtest_build_genre7(IGotakuInfo gotaku) {
        IGotakuGenreInfo genre = gotaku.getGenreList().get(6);

        Assert.assertEquals("環境整備運用管理", genre.getName());

        Assert.assertEquals(129, genre.getQuestionList().size());

        IGotakuQuestionInfo q = genre.getQuestionList().get(0);

        Assert.assertEquals("業務のシステム化をパソコンを基本に考える場合、適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("業務担当者の好みでＯＳを選ぶ", q.getAnswerList().get(0));
        Assert.assertEquals("利用業務・展望を明らかにする", q.getAnswerList().get(1));
        Assert.assertEquals("必要なパッケージソフトを選ぶ", q.getAnswerList().get(2));
        Assert.assertEquals("ソフトが動作するＯＳを選ぶ", q.getAnswerList().get(3));
        Assert.assertEquals("ＯＳが動作する周辺機器を選ぶ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(1);

        Assert.assertEquals("パソコンを購入する場合、特に考慮する必要のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デザイン", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＰＵの種類", q.getAnswerList().get(1));
        Assert.assertEquals("メモリ容量", q.getAnswerList().get(2));
        Assert.assertEquals("クロック周波数", q.getAnswerList().get(3));
        Assert.assertEquals("拡張性", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(2);

        Assert.assertEquals("ＦＤやＣＤ－ＲＯＭで供給されるソフトウェアを、ハードディスクなどに組み込んで環境を設定し使用できるようにする作業", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インストール", q.getAnswerList().get(0));
        Assert.assertEquals("リストア", q.getAnswerList().get(1));
        Assert.assertEquals("ユーザ登録", q.getAnswerList().get(2));
        Assert.assertEquals("バックアップ", q.getAnswerList().get(3));
        Assert.assertEquals("セッティング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(3);

        Assert.assertEquals("「インストール」。この言葉に特に関係のない用語はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ダウンロード", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＯＮＦＩＧ．ＳＹＳ", q.getAnswerList().get(1));
        Assert.assertEquals("セットアップ", q.getAnswerList().get(2));
        Assert.assertEquals("ＡＵＴＯＥＸＥＣ．ＢＡＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＯＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(4);

        Assert.assertEquals("次のファイル名の中で、ＭＳ－ＤＯＳのシステムファイルに属するものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＯＭＭＡＮＤ．ＣＯＭ", q.getAnswerList().get(0));
        Assert.assertEquals("ＦＯＲＭＡＴ．ＥＸＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＥＡＤＭＥ．ＤＯＣ", q.getAnswerList().get(2));
        Assert.assertEquals("ＲＥＡＤＭＥ．ＴＸＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＥＴＵＰ．ＤＥＦ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(5);

        Assert.assertEquals("次のファイル名の中で、ＭＳ－ＤＯＳのシステムファイルに属さないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＳＥＴＵＰ．ＤＥＦ", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＯ．ＳＹＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＯＭＭＡＮＤ．ＣＯＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＳＤＯＳ．ＳＹＳ", q.getAnswerList().get(3));
        Assert.assertEquals("　", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(6);

        Assert.assertEquals("インストールなどにおける注意事項として、ファイルに記述されていることがあるが、次の中では通常何というファイル名か", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＲＥＡＤＭＥ．ＤＯＣ", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＮＳＴ．ＥＸＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＥＴＵＰ．ＴＸＴ", q.getAnswerList().get(2));
        Assert.assertEquals("ＨＡＪＩＭＥ．ＴＸＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳＤＯＳ．ＤＯＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(7);

        Assert.assertEquals("ＭＳ－ＤＯＳで立ち上げ時に数々の環境設定を行うファイル。直訳すると「外形・配置」という意味", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＯＮＦＩＧ．ＳＹＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＵＴＯＥＸＥＣ．ＢＡＴ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＯＭＭＡＮＤ．ＣＯＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＭＭ．ＳＹＳ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳＤＯＳ．ＳＹＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(8);

        Assert.assertEquals("通常、見て読める文字（画面上に表示されて意味が通じる文字）のことを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("テキストファイル", q.getAnswerList().get(0));
        Assert.assertEquals("バイナリファイル", q.getAnswerList().get(1));
        Assert.assertEquals("ワイルドカード", q.getAnswerList().get(2));
        Assert.assertEquals("デバイスファイル", q.getAnswerList().get(3));
        Assert.assertEquals("バインダーファイル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(9);

        Assert.assertEquals("次の中で、テキストファイルはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＡＵＴＯＥＸＥＣ．ＢＡＴ", q.getAnswerList().get(0));
        Assert.assertEquals("ＥＭＭ３８６．ＳＹＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＦＯＲＭＡＴ．ＥＸＥ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＢＡＳＥ．ＤＢＦ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＯＭＭＮＡＤ．ＣＯＭ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(10);

        Assert.assertEquals("ＭＳ－ＤＯＳで、デバイスドライバをメモリに組み込むコマンドは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＡＤＤＤＲＶ", q.getAnswerList().get(0));
        Assert.assertEquals("ＡＰＰＥＮＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＡＳＳＩＧＮ", q.getAnswerList().get(2));
        Assert.assertEquals("ＷＡＮＤＳ", q.getAnswerList().get(3));
        Assert.assertEquals("ＡＢＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(11);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１で、キーボードやマウスなどドライバの追加・削除の動作環境設定はどこで行う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｗｉｎｄｏｗｓセットアップ", q.getAnswerList().get(0));
        Assert.assertEquals("ファイルマネージャ", q.getAnswerList().get(1));
        Assert.assertEquals("プログラムマネージャ", q.getAnswerList().get(2));
        Assert.assertEquals("スタートアップ", q.getAnswerList().get(3));
        Assert.assertEquals("マインスイーバ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(12);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１の立ち上げ時に読み込まれるファイルで、ユーザの要求に応じて環境をカスタマイズするためのもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＷＩＮ．ＩＮＩ", q.getAnswerList().get(0));
        Assert.assertEquals("ＳＹＳＴＥＭ．ＩＮＩ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＥＴＵＰ．ＩＮＩ", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＴＡＲＴ．ＩＮＩ", q.getAnswerList().get(3));
        Assert.assertEquals("ＷＩＮＤＯＷＳ．ＩＮＩ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(13);

        Assert.assertEquals("現在の環境で使用している「日本語入力ＦＥＰ」を取り外したい。ＭＳ－ＤＯＳのどのコマンドを使用すればよいか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＥＬＤＲＶ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＥＬＥＴＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＥＬ", q.getAnswerList().get(2));
        Assert.assertEquals("ＰＲＯＭＰＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＲＩＶＥＲ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(14);

        Assert.assertEquals("ＮＥＣ版のＭＳ－ＤＯＳ３．３で、一つのパーティションで使えるハードディスクの容量は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１２８ＭＢまで", q.getAnswerList().get(0));
        Assert.assertEquals("　６４ＭＢまで", q.getAnswerList().get(1));
        Assert.assertEquals("２５６ＭＢまで", q.getAnswerList().get(2));
        Assert.assertEquals("５１２ＭＢまで", q.getAnswerList().get(3));
        Assert.assertEquals("１ＧＢまで", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(15);

        Assert.assertEquals("ＮＥＣ版のＭＳ－ＤＯＳ３．３で、１台のハードディスクで同時に使えるパーティションの数は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("４つまで", q.getAnswerList().get(0));
        Assert.assertEquals("魂１００まで", q.getAnswerList().get(1));
        Assert.assertEquals("２つまで", q.getAnswerList().get(2));
        Assert.assertEquals("８つまで", q.getAnswerList().get(3));
        Assert.assertEquals("１６まで", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(16);

        Assert.assertEquals("ＭＳ－ＤＯＳ５．０では、一つのパーティションで使えるハードディスクの容量は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("２ＧＢまで", q.getAnswerList().get(0));
        Assert.assertEquals("２ＭＢまで", q.getAnswerList().get(1));
        Assert.assertEquals("４ＧＢまで", q.getAnswerList().get(2));
        Assert.assertEquals("４ＭＢまで", q.getAnswerList().get(3));
        Assert.assertEquals("４ＫＢまで", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(17);

        Assert.assertEquals("各種ハードウェアなどで、純正の品物以外の製品のことを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サードパーティ製", q.getAnswerList().get(0));
        Assert.assertEquals("逆輸入製", q.getAnswerList().get(1));
        Assert.assertEquals("他社ブランド製", q.getAnswerList().get(2));
        Assert.assertEquals("不純製", q.getAnswerList().get(3));
        Assert.assertEquals("ノーブランド製", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(18);

        Assert.assertEquals("ＭＳ－ＤＯＳで初期化を行う場合、通常ハードディスクを対象としたい場合に付けるオプションは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("／Ｈ", q.getAnswerList().get(0));
        Assert.assertEquals("／Ｍ", q.getAnswerList().get(1));
        Assert.assertEquals("／Ｂ", q.getAnswerList().get(2));
        Assert.assertEquals("／Ｐ", q.getAnswerList().get(3));
        Assert.assertEquals("／Ｓ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(19);

        Assert.assertEquals("次の中で、ＭＳ－ＤＯＳ５．０の大きな特徴と言えるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＯＳシェル", q.getAnswerList().get(0));
        Assert.assertEquals("ＦＥＰの追加・削除", q.getAnswerList().get(1));
        Assert.assertEquals("ファイル内容の１６進ダンプ", q.getAnswerList().get(2));
        Assert.assertEquals("ＢＡＳＩＣとのファイル変換", q.getAnswerList().get(3));
        Assert.assertEquals("コマンドプロンプトの変更", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(20);

        Assert.assertEquals("次の中で、ＭＳ－ＤＯＳ５．０の大きな特徴と言えるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("メモリの再配置が可能", q.getAnswerList().get(0));
        Assert.assertEquals("サブディレクトリごと複写可能", q.getAnswerList().get(1));
        Assert.assertEquals("テキストファイルを表示可能", q.getAnswerList().get(2));
        Assert.assertEquals("メモリスイッチの内容変更可能", q.getAnswerList().get(3));
        Assert.assertEquals("ボリュームラベルを設定可能", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(21);

        Assert.assertEquals("ＭＳ－ＤＯＳで使用可能な１ＭＢのメモリのうち、ＲＡＭとしてユーザが使用できる６４０ＫＢ部分のメモリ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("コンベンショナルメモリ", q.getAnswerList().get(0));
        Assert.assertEquals("アッパーメモリ", q.getAnswerList().get(1));
        Assert.assertEquals("プロテクトメモリ", q.getAnswerList().get(2));
        Assert.assertEquals("キャッシュメモリ", q.getAnswerList().get(3));
        Assert.assertEquals("ミユキ・イモリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(22);

        Assert.assertEquals("ＰＣ９８シリーズで、電源を入れたときに「ＭＥＭＯＲＹ　６４０ＫＢ＋１０２４ＫＢ」と表示される場合の搭載メモリは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１．６ＭＢ", q.getAnswerList().get(0));
        Assert.assertEquals("１．４ＭＢ", q.getAnswerList().get(1));
        Assert.assertEquals("１．２ＭＢ", q.getAnswerList().get(2));
        Assert.assertEquals("１．０ＭＢ", q.getAnswerList().get(3));
        Assert.assertEquals("１．８ＭＢ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(23);

        Assert.assertEquals("ｉ８０２８６以上のＣＰＵにおける、１ＭＢ以降のメモリ領域", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プロテクトメモリ", q.getAnswerList().get(0));
        Assert.assertEquals("フラッシュメモリ", q.getAnswerList().get(1));
        Assert.assertEquals("デジタルメモリ", q.getAnswerList().get(2));
        Assert.assertEquals("コンベンショナルメモリ", q.getAnswerList().get(3));
        Assert.assertEquals("メインメモリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(24);

        Assert.assertEquals("ディスクのアクセス内容を一時的にメモリに記憶しておき、再度同じアクセスがあったときメモリから読み込むことまたは方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ディスクキャッシュ", q.getAnswerList().get(0));
        Assert.assertEquals("ディスクトップ", q.getAnswerList().get(1));
        Assert.assertEquals("キャッシュディスク", q.getAnswerList().get(2));
        Assert.assertEquals("キャッシュメモリ", q.getAnswerList().get(3));
        Assert.assertEquals("アクセスメモリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(25);

        Assert.assertEquals("ＭＳ－ＤＯＳは、メモリチェック→システム読込→（　　）→ＣＯＭＭＡＮＤ．ＣＯＭ読込→ＡＵＴＯＥＸＥＣ．ＢＡＴ順に起動", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＯＮＦＩＧ．ＳＹＳ読込", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＯ．ＳＹＳ読込", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＳＤＯＳ．ＳＹＳ読込", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＥＮＵ．ＣＯＭ読込", q.getAnswerList().get(3));
        Assert.assertEquals("ＦＡＴチェック", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(26);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ＣＯＮＦＩＧ．ＳＹＳを作成する場合は、（　　）という書式で記述することになっている", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("コマンド＝パラメータ", q.getAnswerList().get(0));
        Assert.assertEquals("パラメータ＝コマンド", q.getAnswerList().get(1));
        Assert.assertEquals("パラメータ＝オプション", q.getAnswerList().get(2));
        Assert.assertEquals("コマンド＝ドライバ", q.getAnswerList().get(3));
        Assert.assertEquals("スイッチ＝コマンド", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(27);

        Assert.assertEquals("ＭＳ－ＤＯＳのＣＯＮＦＩＧ．ＳＹＳコマンドで、デバイスドライバを組み込むときに使用するのは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＥＶＩＣＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＯＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＲＶ", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＨＥＬＬ", q.getAnswerList().get(3));
        Assert.assertEquals("ＩＮＳＴＡＬＬ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(28);

        Assert.assertEquals("ＭＳ－ＤＯＳのＣＯＮＦＩＧ．ＳＹＳコマンドで、ＵＭＢへのデバイスドライバを組み込むときに使用するのは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＥＶＩＣＥＨＩＧＨ", q.getAnswerList().get(0));
        Assert.assertEquals("ＤＥＶＩＣＥＵＭＢ", q.getAnswerList().get(1));
        Assert.assertEquals("ＵＭＢＤＥＶＩＣＥ", q.getAnswerList().get(2));
        Assert.assertEquals("ＤＥＶＩＣＥＥＭＳ", q.getAnswerList().get(3));
        Assert.assertEquals("ＤＥＶＩＣＥ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(29);

        Assert.assertEquals("ＭＳ－ＤＯＳのＣＯＮＦＩＧ．ＳＹＳコマンドで、同時にオープンできるファイル数を設定するのは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＩＬＥＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＢＵＦＦＥＲＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＩＲ", q.getAnswerList().get(2));
        Assert.assertEquals("ＬＡＳＴＤＲＩＶＥ", q.getAnswerList().get(3));
        Assert.assertEquals("ＦＣＢＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(30);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ＣＯＮＦＩＧ．ＳＹＳを作成する場合に異質なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＪＰＥＧ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＵＳＴＯＭ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＥＤＩＴ", q.getAnswerList().get(2));
        Assert.assertEquals("ＶＺ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＩＦＥＳ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(31);

        Assert.assertEquals("ＭＳ－ＤＯＳのＣＯＮＦＩＧ．ＳＹＳコマンド「ＢＵＦＦＥＲＳ」は、バッファ１に対してどれくらいのメモリを消費するか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１～２ＫＢ", q.getAnswerList().get(0));
        Assert.assertEquals("２～４ＫＢ", q.getAnswerList().get(1));
        Assert.assertEquals("４～８ＫＢ", q.getAnswerList().get(2));
        Assert.assertEquals("３％", q.getAnswerList().get(3));
        Assert.assertEquals("消費ゼロ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(32);

        Assert.assertEquals("ＭＳ－ＤＯＳを起動させたあとに、自動的にあるソフトウェアを実行させたい場合に作成するファイルのことを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("バッチファイル", q.getAnswerList().get(0));
        Assert.assertEquals("テキストファイル", q.getAnswerList().get(1));
        Assert.assertEquals("バイナリファイル", q.getAnswerList().get(2));
        Assert.assertEquals("コムファイル", q.getAnswerList().get(3));
        Assert.assertEquals("オートファイル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(33);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ＡＵＴＯＥＸＥＣ．ＢＡＴを作成する場合、異質なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＢＲＥＡＫ", q.getAnswerList().get(0));
        Assert.assertEquals("＠ＥＣＨＯ", q.getAnswerList().get(1));
        Assert.assertEquals("ＰＡＴＨ", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＥＴ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＩＲＲＯＲ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(34);

        Assert.assertEquals("ＭＳ－ＤＯＳ５．０のＤＯＳシェルの主な機能として、適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("イラクの監視", q.getAnswerList().get(0));
        Assert.assertEquals("ファイルの管理", q.getAnswerList().get(1));
        Assert.assertEquals("プログラムの実行", q.getAnswerList().get(2));
        Assert.assertEquals("タスクの切り替え", q.getAnswerList().get(3));
        Assert.assertEquals("ファイルの検索", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(35);

        Assert.assertEquals("マウスの操作に関係のない言葉はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リピート", q.getAnswerList().get(0));
        Assert.assertEquals("クリック", q.getAnswerList().get(1));
        Assert.assertEquals("ダブルクリック", q.getAnswerList().get(2));
        Assert.assertEquals("ドラッグ", q.getAnswerList().get(3));
        Assert.assertEquals("プレス", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(36);

        Assert.assertEquals("マウスを移動させない状態で、そのままボタンを押し続ける操作", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プレス", q.getAnswerList().get(0));
        Assert.assertEquals("クリック", q.getAnswerList().get(1));
        Assert.assertEquals("クリニック", q.getAnswerList().get(2));
        Assert.assertEquals("ドラッグ", q.getAnswerList().get(3));
        Assert.assertEquals("ピップ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(37);

        Assert.assertEquals("ＭＳ－ＤＯＳで、日付を表示・設定するコマンドは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＤＡＴＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＴＩＭＥ", q.getAnswerList().get(1));
        Assert.assertEquals("ＨＩＺＵＫＥ", q.getAnswerList().get(2));
        Assert.assertEquals("＠ＨＩＺＵＫＥ", q.getAnswerList().get(3));
        Assert.assertEquals("ＣＬＥＮＤＥＲ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(38);

        Assert.assertEquals("ＭＳ－ＤＯＳで、フロッピィディスクやハードディスクを初期化するコマンドは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＯＲＭＡＴ", q.getAnswerList().get(0));
        Assert.assertEquals("ＩＮＩＴ", q.getAnswerList().get(1));
        Assert.assertEquals("ＩＮＳＴ", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＥＴＵＰ", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＴＡＲＴＵＰ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(39);

        Assert.assertEquals("ＭＳ－ＤＯＳで、初期化を行った後にシステムファイルをコピーしたい。／（スラッシュ）のあとに付けるオプションは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｓ", q.getAnswerList().get(0));
        Assert.assertEquals("Ｃ", q.getAnswerList().get(1));
        Assert.assertEquals("Ｍ", q.getAnswerList().get(2));
        Assert.assertEquals("Ｄ", q.getAnswerList().get(3));
        Assert.assertEquals("Ｏ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(40);

        Assert.assertEquals("周辺機器を制御するプログラム群", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デバイスドライバ", q.getAnswerList().get(0));
        Assert.assertEquals("ケースツール", q.getAnswerList().get(1));
        Assert.assertEquals("オーサリングソフト", q.getAnswerList().get(2));
        Assert.assertEquals("サービスプログラム", q.getAnswerList().get(3));
        Assert.assertEquals("グループウェア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(41);

        Assert.assertEquals("画面を制御するための制御文字列。これにより、画面の消去・カーソル移動など様々な処理が可能になる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("エスケープシーケンス", q.getAnswerList().get(0));
        Assert.assertEquals("デバイスドライバ", q.getAnswerList().get(1));
        Assert.assertEquals("ＤＯＳシェル", q.getAnswerList().get(2));
        Assert.assertEquals("スクロールバー", q.getAnswerList().get(3));
        Assert.assertEquals("バーティカルライン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(42);

        Assert.assertEquals("ハードウェア・ソフトウェアの改訂のこと。誤りの訂正や機能強化が目的である", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("バージョンアップ", q.getAnswerList().get(0));
        Assert.assertEquals("セットアップ", q.getAnswerList().get(1));
        Assert.assertEquals("パイナップル", q.getAnswerList().get(2));
        Assert.assertEquals("インタフェース", q.getAnswerList().get(3));
        Assert.assertEquals("レビュー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(43);

        Assert.assertEquals("次のファイルの中で、通常ルートディレクトリに存在しないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＦＯＲＭＡＴ．ＥＸＥ", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＳＤＯＳ．ＳＹＳ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＯＭＭＡＮＤ．ＣＯＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＣＯＮＦＩＧ．ＳＹＳ", q.getAnswerList().get(3));
        Assert.assertEquals("ＡＵＴＯＥＸＥＣ．ＢＡＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(44);

        Assert.assertEquals("次のファイルの中で、リードオンリー属性のファイルはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳＤＯＳ．ＳＹＳ", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＯＭＭＡＮＤ．ＣＯＭ", q.getAnswerList().get(1));
        Assert.assertEquals("ＲＥＡＤＭＥ．ＤＯＣ", q.getAnswerList().get(2));
        Assert.assertEquals("ＲＳＤＲＶ．ＳＹＳ", q.getAnswerList().get(3));
        Assert.assertEquals("ＰＲＩＮＴ．ＥＸＥ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(45);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ルート以外のディレクトリを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サブディレクトリ", q.getAnswerList().get(0));
        Assert.assertEquals("ディレクトリ", q.getAnswerList().get(1));
        Assert.assertEquals("メインディレクトリ", q.getAnswerList().get(2));
        Assert.assertEquals("メニューディレクトリ", q.getAnswerList().get(3));
        Assert.assertEquals("カレントディレクトリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(46);

        Assert.assertEquals("ＭＳ－ＤＯＳで、現在自分がいる操作の対象となっているディレクトリを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("カレントディレクトリ", q.getAnswerList().get(0));
        Assert.assertEquals("ルートディレクトリ", q.getAnswerList().get(1));
        Assert.assertEquals("サブディレクトリ", q.getAnswerList().get(2));
        Assert.assertEquals("メインディレクトリ", q.getAnswerList().get(3));
        Assert.assertEquals("ザブディレクトリ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(47);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ルートディレクトリ下に「ＳＡＤ」というディレクトリを作るときの記述は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ：￥＞ＭＤ　ＳＡＤ", q.getAnswerList().get(0));
        Assert.assertEquals("Ａ：￥＞ＲＤ　ＳＡＤ", q.getAnswerList().get(1));
        Assert.assertEquals("Ａ：￥＞ＣＤ　ＳＡＤ", q.getAnswerList().get(2));
        Assert.assertEquals("Ａ：￥＞ＳＡＤ　ＭＤ", q.getAnswerList().get(3));
        Assert.assertEquals("Ａ：￥＞ＳＡＤ　ＲＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(48);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ルートディレクトリから「ＳＡＤ」というサブディレクトリに移動するときの記述は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ：￥＞ＣＤ　ＳＡＤ", q.getAnswerList().get(0));
        Assert.assertEquals("Ａ：￥＞ＲＤ　ＳＡＤ", q.getAnswerList().get(1));
        Assert.assertEquals("Ａ：￥＞ＭＤ　ＳＡＤ", q.getAnswerList().get(2));
        Assert.assertEquals("Ａ：￥＞ＳＡＤ　ＣＤ", q.getAnswerList().get(3));
        Assert.assertEquals("Ａ：￥＞ＳＡＤ　ＲＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(49);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ルートディレクトリから「ＳＡＤ」というサブディレクトリに移動した。直後のプロンプト表示で正しいのは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ：￥ＳＡＤ＞", q.getAnswerList().get(0));
        Assert.assertEquals("Ａ：￥＞ＳＡＤ", q.getAnswerList().get(1));
        Assert.assertEquals("ＳＡＤ＞", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＡＤ：Ａ＞", q.getAnswerList().get(3));
        Assert.assertEquals("ＳＡＤ￥Ａ＞", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(50);

        Assert.assertEquals("ＭＳ－ＤＯＳで、「ＳＡＤ」というサブディレクトリから、ルートディレクトリに戻るときの記述は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ：￥ＳＡＤ＞ＣＤ　￥", q.getAnswerList().get(0));
        Assert.assertEquals("Ａ：￥ＳＡＤ＞ＲＤ　￥", q.getAnswerList().get(1));
        Assert.assertEquals("Ａ：￥ＳＡＤ＞ＣＤ　Ａ", q.getAnswerList().get(2));
        Assert.assertEquals("Ａ：￥ＳＡＤ＞ＣＤ　￥：", q.getAnswerList().get(3));
        Assert.assertEquals("Ａ：￥ＳＡＤ＞シュワッチ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(51);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ルートディレクトリ下の「ＳＡＤ」というサブディレクトリを削除するときの記述は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ：￥＞ＲＤ　ＳＡＤ", q.getAnswerList().get(0));
        Assert.assertEquals("Ａ：￥＞ＭＤ　ＳＡＤ", q.getAnswerList().get(1));
        Assert.assertEquals("Ａ：￥＞ＣＤ　ＳＡＤ", q.getAnswerList().get(2));
        Assert.assertEquals("Ａ：￥＞ＳＡＤ　ＭＤ", q.getAnswerList().get(3));
        Assert.assertEquals("Ａ：￥＞ＳＡＤ　ＲＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(52);

        Assert.assertEquals("ＭＳ－ＤＯＳで、「ＳＤ」というサブディレクトリから、一つ上のディレクトリに移動するときの記述は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ａ：￥ＪＯ￥ＳＤ＞ＣＤ　．．", q.getAnswerList().get(0));
        Assert.assertEquals("Ａ：￥ＪＯ￥ＳＤ＞ＣＤ　￥", q.getAnswerList().get(1));
        Assert.assertEquals("Ａ：￥ＪＯ￥ＳＤ＞ＣＤ　ＪＯ", q.getAnswerList().get(2));
        Assert.assertEquals("Ａ：￥ＪＯ￥ＳＤ＞．．", q.getAnswerList().get(3));
        Assert.assertEquals("Ａ：￥ＪＯ￥ＳＤ＞．", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(53);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ファイルをコピー・移動する場合などに使用する「＊」や「？」を何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワイルドカード", q.getAnswerList().get(0));
        Assert.assertEquals("フラッシュカード", q.getAnswerList().get(1));
        Assert.assertEquals("ファイリングカード", q.getAnswerList().get(2));
        Assert.assertEquals("リカード", q.getAnswerList().get(3));
        Assert.assertEquals("ドッツカード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(54);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ファイルをコピーしたりするときに使う「全てを対象とする」場合のワイルドカードとは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("＊", q.getAnswerList().get(0));
        Assert.assertEquals("？", q.getAnswerList().get(1));
        Assert.assertEquals("＄", q.getAnswerList().get(2));
        Assert.assertEquals("％", q.getAnswerList().get(3));
        Assert.assertEquals("／", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(55);

        Assert.assertEquals("ＭＳ－ＤＯＳで、ファイルをコピーしたりするときに使う「ある一文字を対象とする」場合のワイルドカードとは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("？", q.getAnswerList().get(0));
        Assert.assertEquals("＊", q.getAnswerList().get(1));
        Assert.assertEquals("＆", q.getAnswerList().get(2));
        Assert.assertEquals("！", q.getAnswerList().get(3));
        Assert.assertEquals("＞", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(56);

        Assert.assertEquals("ＭＳ－ＤＯＳで「ＴＹＰＥ　Ａ．ＢＡＴ　＞　ＰＲＮ」と記述した場合、結果はどうなる？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("「Ａ」の内容が印字される", q.getAnswerList().get(0));
        Assert.assertEquals("「Ａ」の内容が表示される", q.getAnswerList().get(1));
        Assert.assertEquals("「ＰＲＮ」の名前で保存される", q.getAnswerList().get(2));
        Assert.assertEquals("「ＰＲＮ」の内容が表示される", q.getAnswerList().get(3));
        Assert.assertEquals("「プリン」を食べたくなる", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(57);

        Assert.assertEquals("次の中で、ＭＳ－Ｗｉｎｄｏｗｓ３．１の環境と言えないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マルチタスク", q.getAnswerList().get(0));
        Assert.assertEquals("マルチウインドウ", q.getAnswerList().get(1));
        Assert.assertEquals("シングルタスク", q.getAnswerList().get(2));
        Assert.assertEquals("アクティブウィンドウ", q.getAnswerList().get(3));
        Assert.assertEquals("ＧＵＩ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(58);

        Assert.assertEquals("通常、ＭＳ－Ｗｉｎｄｏｗｓ３．１を起動した場合に最初に現れるものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プログラムマネージャ", q.getAnswerList().get(0));
        Assert.assertEquals("ファイルマネージャ", q.getAnswerList().get(1));
        Assert.assertEquals("福女商バレー部のマネージャー", q.getAnswerList().get(2));
        Assert.assertEquals("コントロールパネル", q.getAnswerList().get(3));
        Assert.assertEquals("ソリティア", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(59);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１で、クリックしてウィンドウをアイコンに変えるボタン。ダブルクリックで元のサイズに戻る", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アイコン化ボタン", q.getAnswerList().get(0));
        Assert.assertEquals("制服の第２ボタン", q.getAnswerList().get(1));
        Assert.assertEquals("リセットボタン", q.getAnswerList().get(2));
        Assert.assertEquals("ダイアログボタン", q.getAnswerList().get(3));
        Assert.assertEquals("クリックボタン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(60);

        Assert.assertEquals("平成７年３月中旬に、「一度に複数のソフトウェアを使用していて動かなくなることがある」と指摘されたのは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｗｉｎｄｏｗｓ９５", q.getAnswerList().get(0));
        Assert.assertEquals("Ｗｉｎｄｏｗｓ３．１", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＳ－ＤＯＳ６．０", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＳ－ＤＯＳ５．０Ａ", q.getAnswerList().get(3));
        Assert.assertEquals("一太郎Ｖｅｒ６．０", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(61);

        Assert.assertEquals("ＭＳ－ＤＯＳを必要としない、完全に独立したウィンドウズＯＳを何という？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("Ｗｉｎｄｏｗｓ９５", q.getAnswerList().get(0));
        Assert.assertEquals("シカゴ＆ニューヨーク", q.getAnswerList().get(1));
        Assert.assertEquals("ＷｉｎｄｏｗｓＮＴ", q.getAnswerList().get(2));
        Assert.assertEquals("Ｗｉｎｄｏｗｓ２１", q.getAnswerList().get(3));
        Assert.assertEquals("ＷｉｍｄｏｗｓＮＴ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(62);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１を使用するため、必要最小限のハードとソフトを揃えたい。無くても影響のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＣＤ－ＲＯＭ　４倍速以上", q.getAnswerList().get(0));
        Assert.assertEquals("ＣＰＵ　ｉ３８６ＳＸ以上", q.getAnswerList().get(1));
        Assert.assertEquals("メインメモリ　４ＭＢ以上", q.getAnswerList().get(2));
        Assert.assertEquals("ハードディスク３０Ｍ以上", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳ－ＤＯＳの５．０以上", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(63);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１を使用したい。最低どれくらいのＣＰＵがないと動作しないか？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ｉ８０３８６ＳＸ", q.getAnswerList().get(0));
        Assert.assertEquals("ｉ８０２８６", q.getAnswerList().get(1));
        Assert.assertEquals("ｉ８０４８６ＤＸ", q.getAnswerList().get(2));
        Assert.assertEquals("ｉ８０８６", q.getAnswerList().get(3));
        Assert.assertEquals("Ｍ６８０００", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(64);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１を使用したい。最低どれくらいの空き容量のハードディスクが必要か？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("２５ＭＢ", q.getAnswerList().get(0));
        Assert.assertEquals("１５ＭＢ", q.getAnswerList().get(1));
        Assert.assertEquals("４５ＭＢ", q.getAnswerList().get(2));
        Assert.assertEquals("６５ＭＢ", q.getAnswerList().get(3));
        Assert.assertEquals("５５ＭＢ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(65);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１を使用したい。快適に仕事をしたい場合、最低どれくらいのメインメモリが必要か？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("８ＭＢ", q.getAnswerList().get(0));
        Assert.assertEquals("２ＭＢ", q.getAnswerList().get(1));
        Assert.assertEquals("６４０ＫＢ", q.getAnswerList().get(2));
        Assert.assertEquals("６４ＭＢ", q.getAnswerList().get(3));
        Assert.assertEquals("３２ＭＢ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(66);

        Assert.assertEquals("通常、ソフトウェアのインストールが終わると、何を押してシステムを再起動する？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リセットボタン", q.getAnswerList().get(0));
        Assert.assertEquals("エスケープキー", q.getAnswerList().get(1));
        Assert.assertEquals("マウスのボタン", q.getAnswerList().get(2));
        Assert.assertEquals("アイコン化ボタン", q.getAnswerList().get(3));
        Assert.assertEquals("葉ボタン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(67);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１。さて次の中で、実行可能ファイルの拡張子でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＴＸＴ", q.getAnswerList().get(0));
        Assert.assertEquals("ＢＡＴ", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＯＭ", q.getAnswerList().get(2));
        Assert.assertEquals("ＰＩＦ", q.getAnswerList().get(3));
        Assert.assertEquals("ＥＸＥ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(68);

        Assert.assertEquals("「ダイアログ」。日本語では？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("対話", q.getAnswerList().get(0));
        Assert.assertEquals("画面", q.getAnswerList().get(1));
        Assert.assertEquals("視覚", q.getAnswerList().get(2));
        Assert.assertEquals("輝き", q.getAnswerList().get(3));
        Assert.assertEquals("箱型", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(69);

        Assert.assertEquals("ＭＳ－Ｗｉｎｄｏｗｓ３．１を使用するためには、どのＯＳが必要？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＭＳ－ＤＯＳ５．０", q.getAnswerList().get(0));
        Assert.assertEquals("ＭＳ－ＤＯＳ４．０", q.getAnswerList().get(1));
        Assert.assertEquals("ＭＳ－ＤＯＳ３．０", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＳ－ＤＯＳ３．３Ｄ", q.getAnswerList().get(3));
        Assert.assertEquals("ＭＳ－ＤＯＳ３．３Ａ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(70);

        Assert.assertEquals("システムの運用においては、その構成管理が重要になってくるが、そのために作成すべき一覧表で特に重要でない項目は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("担当者の履歴", q.getAnswerList().get(0));
        Assert.assertEquals("ハードウェア", q.getAnswerList().get(1));
        Assert.assertEquals("ＯＳ", q.getAnswerList().get(2));
        Assert.assertEquals("ソフトウェア", q.getAnswerList().get(3));
        Assert.assertEquals("使用データ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(71);

        Assert.assertEquals("システムの構成管理の対象とならないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オペレータ外注費", q.getAnswerList().get(0));
        Assert.assertEquals("プリンタ", q.getAnswerList().get(1));
        Assert.assertEquals("マニュアル類", q.getAnswerList().get(2));
        Assert.assertEquals("マウス", q.getAnswerList().get(3));
        Assert.assertEquals("在庫管理のパッケージソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(72);

        Assert.assertEquals("パソコンの管理台帳として特に必要のない項目はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("重量", q.getAnswerList().get(0));
        Assert.assertEquals("メーカー名", q.getAnswerList().get(1));
        Assert.assertEquals("型番", q.getAnswerList().get(2));
        Assert.assertEquals("購入年月日と購入先", q.getAnswerList().get(3));
        Assert.assertEquals("リース期間", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(73);

        Assert.assertEquals("ファイル管理の用語として、特に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        // Assert.assertEquals("パソコン管理台帳", q.getAnswerList().get(0)); TODO
        Assert.assertEquals("ディレクトリ", q.getAnswerList().get(1));
        // Assert.assertEquals("ファイル利用権", q.getAnswerList().get(2)); TODO
        Assert.assertEquals("バックアップ", q.getAnswerList().get(3));
        Assert.assertEquals("プログラムファイル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(74);

        Assert.assertEquals("ファイル管理の用語として、特に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マトリックス", q.getAnswerList().get(0));
        Assert.assertEquals("ディレクトリ", q.getAnswerList().get(1));
        Assert.assertEquals("バックアップ", q.getAnswerList().get(2));
        Assert.assertEquals("データファイル", q.getAnswerList().get(3));
        Assert.assertEquals("共有ファイル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(75);

        Assert.assertEquals("ファイル管理の用語として、特に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ダウンサイジング", q.getAnswerList().get(0));
        // Assert.assertEquals("ファイル利用権", q.getAnswerList().get(1)); TODO
        Assert.assertEquals("プログラムファイル", q.getAnswerList().get(2));
        Assert.assertEquals("タイムスタンプ", q.getAnswerList().get(3));
        Assert.assertEquals("エコロジー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(76);

        Assert.assertEquals("ファイルの機密保護に特に関係のない事項はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ディレクトリ構成の変更", q.getAnswerList().get(0));
        Assert.assertEquals("パスワードを設定する", q.getAnswerList().get(1));
        Assert.assertEquals("パスワードをファイルに追加", q.getAnswerList().get(2));
        Assert.assertEquals("ファイルの隠し属性（Ｈ）", q.getAnswerList().get(3));
        Assert.assertEquals("プロテクトをかける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(77);

        Assert.assertEquals("ファイルの機密保護に特に関係のある用語はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プロテクト", q.getAnswerList().get(0));
        Assert.assertEquals("バックアップ", q.getAnswerList().get(1));
        Assert.assertEquals("インストール", q.getAnswerList().get(2));
        Assert.assertEquals("ＫＡＭＡＣ（かまっく）", q.getAnswerList().get(3));
        Assert.assertEquals("サッチャン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(78);

        Assert.assertEquals("万が一にそなえて、定期的に大切なデータなどの控えをとっておくこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("バックアップ", q.getAnswerList().get(0));
        Assert.assertEquals("アップデート", q.getAnswerList().get(1));
        Assert.assertEquals("パーティション", q.getAnswerList().get(2));
        Assert.assertEquals("リダイレクション", q.getAnswerList().get(3));
        Assert.assertEquals("ライト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(79);

        Assert.assertEquals("「ＰＤＣＡ」って何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("計画・実施・チェック・評価", q.getAnswerList().get(0));
        Assert.assertEquals("計画・行動・確認・見直し", q.getAnswerList().get(1));
        Assert.assertEquals("梱包・配送・査収・受領書", q.getAnswerList().get(2));
        Assert.assertEquals("荷造り・積み込み・搬送・倉庫", q.getAnswerList().get(3));
        Assert.assertEquals("パン・ドーナツ・カレー・あ？", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(80);

        Assert.assertEquals("「計画・実施・チェック・分析（評価）」という管理の基本サイクル", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＰＤＣＡ", q.getAnswerList().get(0));
        Assert.assertEquals("ＰＤＰＡ", q.getAnswerList().get(1));
        Assert.assertEquals("ＯＥＣＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＩＥ", q.getAnswerList().get(3));
        Assert.assertEquals("ＫＡＭＡＣ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(81);

        Assert.assertEquals("性能・障害管理における「ＰＤＰＡ」で、特に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("著作保護の管理", q.getAnswerList().get(0));
        Assert.assertEquals("障害原因の設定", q.getAnswerList().get(1));
        Assert.assertEquals("障害対策の実施", q.getAnswerList().get(2));
        Assert.assertEquals("障害対策結果の評価", q.getAnswerList().get(3));
        Assert.assertEquals("障害記録の作成", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(82);

        Assert.assertEquals("性能管理において、「性能の把握と評価」に特に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("違法コピーの防止", q.getAnswerList().get(0));
        Assert.assertEquals("データ処理のスピード", q.getAnswerList().get(1));
        Assert.assertEquals("レスポンスタイム（応答時間）", q.getAnswerList().get(2));
        Assert.assertEquals("データ容量", q.getAnswerList().get(3));
        Assert.assertEquals("基本機能の維持・管理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(83);

        Assert.assertEquals("障害管理においてはその把握と対応が重要であるが、特に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("障害の奨励", q.getAnswerList().get(0));
        Assert.assertEquals("障害の前兆の発見", q.getAnswerList().get(1));
        Assert.assertEquals("障害の分析", q.getAnswerList().get(2));
        Assert.assertEquals("障害原因の究明", q.getAnswerList().get(3));
        Assert.assertEquals("対策の組み立てと実施", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(84);

        Assert.assertEquals("障害管理のために、一般にメーカーやディーラーとあらかじめ結んでおく契約", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("保守契約", q.getAnswerList().get(0));
        Assert.assertEquals("革新契約", q.getAnswerList().get(1));
        Assert.assertEquals("業務契約", q.getAnswerList().get(2));
        Assert.assertEquals("おむすび契約", q.getAnswerList().get(3));
        Assert.assertEquals("復旧契約", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(85);

        Assert.assertEquals("障害管理において、その対象とならないソフトウェアは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("マイクロソフト", q.getAnswerList().get(0));
        Assert.assertEquals("オペレーティングシステム", q.getAnswerList().get(1));
        Assert.assertEquals("ミドルウェア", q.getAnswerList().get(2));
        Assert.assertEquals("アプリケーションソフト", q.getAnswerList().get(3));
        Assert.assertEquals("カスタマイズソフト", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(86);

        Assert.assertEquals("障害管理などにおいて、そこで発生する障害を監視する専用の機器", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アナライザー", q.getAnswerList().get(0));
        Assert.assertEquals("モモレンジャー", q.getAnswerList().get(1));
        Assert.assertEquals("ノートンドクター", q.getAnswerList().get(2));
        Assert.assertEquals("監視カメラ", q.getAnswerList().get(3));
        Assert.assertEquals("ストリーマ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(87);

        Assert.assertEquals("データ障害の原因として、特に関係のないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("チャットに起因するもの", q.getAnswerList().get(0));
        Assert.assertEquals("ハードウェアに起因するもの", q.getAnswerList().get(1));
        Assert.assertEquals("ソフトウェアに起因するもの", q.getAnswerList().get(2));
        Assert.assertEquals("入力ミスに起因するもの", q.getAnswerList().get(3));
        Assert.assertEquals("ウイルスに起因するもの", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(88);

        Assert.assertEquals("通産省が昭和５２年に策定し、昭和５９年に全面改定したコンピュータに関する基準とは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("電算機システム安全対策基準", q.getAnswerList().get(0));
        Assert.assertEquals("システム監査基準", q.getAnswerList().get(1));
        Assert.assertEquals("コンピュータの安全対策基準", q.getAnswerList().get(2));
        Assert.assertEquals("福岡女子商業風紀検査基準", q.getAnswerList().get(3));
        Assert.assertEquals("ネットワーク安全・信頼性基準", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(89);

        Assert.assertEquals("ＣＰＵを２台設置し、一方を優先度の高い業務用に、もう一方を待機用とするシステム。非常事態発生時に切り換えて使う", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デュプレックスシステム", q.getAnswerList().get(0));
        Assert.assertEquals("リアルタイムシステム", q.getAnswerList().get(1));
        Assert.assertEquals("ミラーリングシステム", q.getAnswerList().get(2));
        Assert.assertEquals("リカバリシステム", q.getAnswerList().get(3));
        Assert.assertEquals("ガリバーシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(90);

        Assert.assertEquals("次の中で、実際に存在するコンピュータウィルスの名称は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("１３日の金曜日", q.getAnswerList().get(0));
        Assert.assertEquals("６月２０日の誕生日", q.getAnswerList().get(1));
        Assert.assertEquals("回転木馬", q.getAnswerList().get(2));
        Assert.assertEquals("クリスマスケーキ", q.getAnswerList().get(3));
        Assert.assertEquals("トロイメライ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(91);

        Assert.assertEquals("コンピュータウィルスの発見・除去などに使用されるソフトの総称は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ワクチン", q.getAnswerList().get(0));
        Assert.assertEquals("抗生物質", q.getAnswerList().get(1));
        Assert.assertEquals("アインシュタイン", q.getAnswerList().get(2));
        Assert.assertEquals("アナライザー", q.getAnswerList().get(3));
        Assert.assertEquals("ステロイド", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(92);

        Assert.assertEquals("パソコン通信やオンラインソフトなどを通じて感染し、システムに各種のいたずらや被害をもたらすもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ウイルス", q.getAnswerList().get(0));
        Assert.assertEquals("ワクチン", q.getAnswerList().get(1));
        Assert.assertEquals("エボラ", q.getAnswerList().get(2));
        Assert.assertEquals("ハリケーン", q.getAnswerList().get(3));
        Assert.assertEquals("アレルギー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(93);

        Assert.assertEquals("コンピュータシステムやソフトウェアなどに侵入し、増殖し、データなどを破壊するプログラム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("コンピュータウィルス", q.getAnswerList().get(0));
        Assert.assertEquals("ワクチンソフト", q.getAnswerList().get(1));
        Assert.assertEquals("ＣＡＳＥツール", q.getAnswerList().get(2));
        Assert.assertEquals("ボトムアップ", q.getAnswerList().get(3));
        Assert.assertEquals("ゾンビ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(94);

        Assert.assertEquals("コンピュータシステムのもつ脆弱（ぜいじゃく）性に対する安全保護の総称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("セキュリティ管理", q.getAnswerList().get(0));
        Assert.assertEquals("アクセス管理", q.getAnswerList().get(1));
        Assert.assertEquals("ウィルス管理", q.getAnswerList().get(2));
        Assert.assertEquals("キーワード管理", q.getAnswerList().get(3));
        Assert.assertEquals("ワクチン管理", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(95);

        Assert.assertEquals("ディスク装置などのシステムを２系列持ち、一方に障害が起きた場合には直ちに他に切り替えて処理を続行するシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("システムの二重化", q.getAnswerList().get(0));
        Assert.assertEquals("システムの適性化", q.getAnswerList().get(1));
        Assert.assertEquals("システムの管理化", q.getAnswerList().get(2));
        Assert.assertEquals("システムの複数化", q.getAnswerList().get(3));
        Assert.assertEquals("システムのみっともな化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(96);

        Assert.assertEquals("ディスク装置などのシステムを２系列持ち、一方に障害が起きた場合には直ちに他に切り替えて処理を続行するシステム", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デュプレキシング", q.getAnswerList().get(0));
        Assert.assertEquals("ミラーリング", q.getAnswerList().get(1));
        Assert.assertEquals("バックアップ", q.getAnswerList().get(2));
        Assert.assertEquals("ハッチング", q.getAnswerList().get(3));
        Assert.assertEquals("マルチシステム", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(97);

        Assert.assertEquals("記憶装置にデータを書き込む場合、同じ内容のものを同時に他の記憶装置にも書き込んでおき、万一のトラブル時に備えるもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ミラーリング", q.getAnswerList().get(0));
        Assert.assertEquals("カマキリング", q.getAnswerList().get(1));
        Assert.assertEquals("データリング", q.getAnswerList().get(2));
        Assert.assertEquals("ファイリング", q.getAnswerList().get(3));
        Assert.assertEquals("エンジニアリング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(98);

        Assert.assertEquals("次の中で、異質なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パワーセーブ", q.getAnswerList().get(0));
        Assert.assertEquals("パスワード", q.getAnswerList().get(1));
        // Assert.assertEquals("アクセス権", q.getAnswerList().get(2)); TODO
        Assert.assertEquals("ログインＩＤ", q.getAnswerList().get(3));
        Assert.assertEquals("セキュリティ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(99);

        Assert.assertEquals("特定のサービスを受けるために必要な暗証番号。自分であることの証明になる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パスワード", q.getAnswerList().get(0));
        Assert.assertEquals("キーワード", q.getAnswerList().get(1));
        Assert.assertEquals("ＩＤ番号", q.getAnswerList().get(2));
        Assert.assertEquals("アクセス番号", q.getAnswerList().get(3));
        Assert.assertEquals("プロトコル", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(100);

        Assert.assertEquals("次の中で、コンピュータウイルスに最も関係のある歌のタイトルはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アルプス一万尺", q.getAnswerList().get(0));
        Assert.assertEquals("ほたるのひかり", q.getAnswerList().get(1));
        Assert.assertEquals("大きな栗の木の下で", q.getAnswerList().get(2));
        Assert.assertEquals("サッチャン", q.getAnswerList().get(3));
        Assert.assertEquals("ドナドナ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(101);

        Assert.assertEquals("コンピュータウィルスには、ファイルを破壊するタイプのものがいくつかあるが、次の中で最も関係があるものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ミケランジェロ", q.getAnswerList().get(0));
        Assert.assertEquals("ダ・ビンチ", q.getAnswerList().get(1));
        Assert.assertEquals("カマキリ", q.getAnswerList().get(2));
        Assert.assertEquals("フォスター", q.getAnswerList().get(3));
        Assert.assertEquals("Ｊ・Ｓ・バッハ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(102);

        Assert.assertEquals("違法コピーなどを防ぐために、コピーできないように仕組まれている電子的なカギ", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プロテクト", q.getAnswerList().get(0));
        Assert.assertEquals("パスワード", q.getAnswerList().get(1));
        Assert.assertEquals("合い鍵", q.getAnswerList().get(2));
        Assert.assertEquals("ベビーメーカー", q.getAnswerList().get(3));
        Assert.assertEquals("オーバートラック", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(103);

        Assert.assertEquals("「プログラムは著作物である」と明記された、昭和６０年に改正された法律は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("著作権法", q.getAnswerList().get(0));
        Assert.assertEquals("特許法", q.getAnswerList().get(1));
        Assert.assertEquals("意匠法", q.getAnswerList().get(2));
        Assert.assertEquals("独占禁止法", q.getAnswerList().get(3));
        Assert.assertEquals("ソフトウェア保護法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(104);

        Assert.assertEquals("著作権法に「プログラムは著作物である」と明記されているが、さてそれは第何条？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("第１０条、第１項、第９号", q.getAnswerList().get(0));
        Assert.assertEquals("第１２条、第１項、第９号", q.getAnswerList().get(1));
        Assert.assertEquals("第１２条、第９項、第１号", q.getAnswerList().get(2));
        Assert.assertEquals("第１０条、第９項、第１号", q.getAnswerList().get(3));
        Assert.assertEquals("第１０条、第１項、第１号", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(105);

        Assert.assertEquals("ソフトウェアに関して、違法行為とならないケースはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("バックアップのためコピーする", q.getAnswerList().get(0));
        Assert.assertEquals("コピーを無断で他人に渡す", q.getAnswerList().get(1));
        Assert.assertEquals("無断で他人に譲渡する", q.getAnswerList().get(2));
        Assert.assertEquals("決められた台数以上で利用する", q.getAnswerList().get(3));
        Assert.assertEquals("ソフトをレンタル店から借りる", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(106);

        Assert.assertEquals("ソフトウェアを利用する場合には、通常ソフトメーカー（提供元）とユーザの間で何を結ぶ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("使用許諾契約", q.getAnswerList().get(0));
        Assert.assertEquals("知的財産契約", q.getAnswerList().get(1));
        Assert.assertEquals("サイトライセンス契約", q.getAnswerList().get(2));
        Assert.assertEquals("シリアルＮＯ契約", q.getAnswerList().get(3));
        Assert.assertEquals("終身保険契約", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(107);

        Assert.assertEquals("限られた条件のもとで、利用するために必要な本数分ユーザ側がコピーできる契約形態", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サイトライセンス契約", q.getAnswerList().get(0));
        Assert.assertEquals("サードパーティ契約", q.getAnswerList().get(1));
        Assert.assertEquals("ソフトウェア使用許諾契約", q.getAnswerList().get(2));
        Assert.assertEquals("シークレット契約", q.getAnswerList().get(3));
        Assert.assertEquals("コピーフリー契約", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(108);

        Assert.assertEquals("組織における違法コピー防止策の一例と言えないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("社内では複写したソフトを使う", q.getAnswerList().get(0));
        Assert.assertEquals("ソフトの予算をチェックする", q.getAnswerList().get(1));
        Assert.assertEquals("著作権について啓蒙活動をする", q.getAnswerList().get(2));
        Assert.assertEquals("使用許諾契約を周知徹底する", q.getAnswerList().get(3));
        Assert.assertEquals("上部が知的財産権を理解する", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(109);

        Assert.assertEquals("コンピュータのソフトウェアやノウハウなどの財産、すなわち「目に見えないモノ」の権利の総称", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        // Assert.assertEquals("知的財産権", q.getAnswerList().get(0)); TODO
        // Assert.assertEquals("非物体権", q.getAnswerList().get(1)); TODO
        // Assert.assertEquals("著作者人格権", q.getAnswerList().get(2)); TODO
        // Assert.assertEquals("著作者財産権", q.getAnswerList().get(3)); TODO
        // Assert.assertEquals("工業所有権", q.getAnswerList().get(4)); TODO

        q = genre.getQuestionList().get(110);

        Assert.assertEquals("次の中で、異質なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("有形固定資産", q.getAnswerList().get(0));
        Assert.assertEquals("目に見えないモノ（権利）", q.getAnswerList().get(1));
        Assert.assertEquals("知的財産", q.getAnswerList().get(2));
        Assert.assertEquals("無体財産", q.getAnswerList().get(3));
        Assert.assertEquals("コンピュータソフトやノウハウ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(111);

        Assert.assertEquals("次の中で、工業所有権に属さないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        // Assert.assertEquals("複製権", q.getAnswerList().get(0)); TODO
        // Assert.assertEquals("特許権", q.getAnswerList().get(1)); TODO
        // Assert.assertEquals("実用新案権", q.getAnswerList().get(2)); TODO
        // Assert.assertEquals("意匠権", q.getAnswerList().get(3)); TODO
        // Assert.assertEquals("種苗権", q.getAnswerList().get(4)); TODO

        q = genre.getQuestionList().get(112);

        Assert.assertEquals("次の中で、工業所有権に属さないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        // Assert.assertEquals("所有権", q.getAnswerList().get(0)); TODO
        // Assert.assertEquals("実用新案権", q.getAnswerList().get(1)); TODO
        // Assert.assertEquals("種苗権", q.getAnswerList().get(2)); TODO
        // Assert.assertEquals("商標権", q.getAnswerList().get(3)); TODO
        // Assert.assertEquals("回路配置権", q.getAnswerList().get(4)); TODO

        q = genre.getQuestionList().get(113);

        Assert.assertEquals("著作者人格権と著作者財産権を合わせて何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        // Assert.assertEquals("著作権", q.getAnswerList().get(0)); TODO
        // Assert.assertEquals("知的財産権", q.getAnswerList().get(1)); TODO
        // Assert.assertEquals("著作物権", q.getAnswerList().get(2)); TODO
        // Assert.assertEquals("知的著作権", q.getAnswerList().get(3)); TODO
        // Assert.assertEquals("入会権", q.getAnswerList().get(4)); TODO

        q = genre.getQuestionList().get(114);

        Assert.assertEquals("１９７０年、知的財産権の国際的保護を目的に設立された国際機関は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("世界知的所有権機関", q.getAnswerList().get(0));
        Assert.assertEquals("国際知的所有権機構", q.getAnswerList().get(1));
        Assert.assertEquals("国際知的財産権機関", q.getAnswerList().get(2));
        Assert.assertEquals("世界知的所有権機構", q.getAnswerList().get(3));
        Assert.assertEquals("世界知的財産権機関", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(115);

        Assert.assertEquals("著作者財産権に属するものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        // Assert.assertEquals("複製権", q.getAnswerList().get(0)); TODO
        // Assert.assertEquals("人格権", q.getAnswerList().get(1)); TODO
        // Assert.assertEquals("特許権", q.getAnswerList().get(2)); TODO
        // Assert.assertEquals("商標権", q.getAnswerList().get(3)); TODO
        Assert.assertEquals("来々軒", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(116);

        Assert.assertEquals("著作者人格権は譲り渡すことができない。このことを何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("一身専属性", q.getAnswerList().get(0));
        Assert.assertEquals("立身出世性", q.getAnswerList().get(1));
        Assert.assertEquals("一身同体性", q.getAnswerList().get(2));
        Assert.assertEquals("一心同体性", q.getAnswerList().get(3));
        Assert.assertEquals("全身腐乱性", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(117);

        Assert.assertEquals("技術的思想・アイデアを保護する法律", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("特許法", q.getAnswerList().get(0));
        Assert.assertEquals("商標法", q.getAnswerList().get(1));
        Assert.assertEquals("意匠法", q.getAnswerList().get(2));
        Assert.assertEquals("著作権法", q.getAnswerList().get(3));
        Assert.assertEquals("ラマーズ法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(118);

        Assert.assertEquals("データ保護のための対策として、有効でないと思われるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ファイルを書き込み許可にする", q.getAnswerList().get(0));
        Assert.assertEquals("パスワードを設定・管理する", q.getAnswerList().get(1));
        Assert.assertEquals("アクセス権を設定する", q.getAnswerList().get(2));
        Assert.assertEquals("データ破壊時の復旧法を考える", q.getAnswerList().get(3));
        Assert.assertEquals("重要データを暗号化する", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(119);

        Assert.assertEquals("ファイル破壊の物理的原因とは言えないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ウィルス", q.getAnswerList().get(0));
        Assert.assertEquals("湿度", q.getAnswerList().get(1));
        Assert.assertEquals("温度", q.getAnswerList().get(2));
        Assert.assertEquals("埃（ほこり）", q.getAnswerList().get(3));
        Assert.assertEquals("磁気", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(120);

        Assert.assertEquals("金利計算において、小数点以下の数値を集めて自分の口座に振り込むように仕組んだプログラム。ウィルスの一種と言ってよい", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サラミ・テクニック", q.getAnswerList().get(0));
        Assert.assertEquals("トロイの木馬", q.getAnswerList().get(1));
        Assert.assertEquals("ネットワークワーム", q.getAnswerList().get(2));
        Assert.assertEquals("クリッパー", q.getAnswerList().get(3));
        Assert.assertEquals("フリッパー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(121);

        Assert.assertEquals("ネットワークで増殖し、セキュリティを破るタイプのウィルス。ワークステーション間を移動しスタンドアロンでは感染しない", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ネットワークワーム", q.getAnswerList().get(0));
        Assert.assertEquals("モンスター", q.getAnswerList().get(1));
        Assert.assertEquals("カスケード", q.getAnswerList().get(2));
        Assert.assertEquals("カスタード", q.getAnswerList().get(3));
        Assert.assertEquals("エボラ出血熱", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(122);

        Assert.assertEquals("次の中で、ウィルス対策とは言えないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オンラインソフトを数多く使う", q.getAnswerList().get(0));
        Assert.assertEquals("所有者不明のソフトは使わない", q.getAnswerList().get(1));
        Assert.assertEquals("ウィルスチェックを時々行う", q.getAnswerList().get(2));
        Assert.assertEquals("バックアップをこまめに取る", q.getAnswerList().get(3));
        Assert.assertEquals("ワクチンソフトを使用する", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(123);

        Assert.assertEquals("午後５時になると突然、演奏を始める（音を出す）ウィルス", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ヤンキードゥードゥル", q.getAnswerList().get(0));
        Assert.assertEquals("カスケード", q.getAnswerList().get(1));
        Assert.assertEquals("クリスマスソング", q.getAnswerList().get(2));
        Assert.assertEquals("５時から男", q.getAnswerList().get(3));
        Assert.assertEquals("自由が丘１号", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(124);

        Assert.assertEquals("企業の未公開の技術や顧客情報など、企業の営業上の秘密", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("トレードシークレット", q.getAnswerList().get(0));
        Assert.assertEquals("トレードマーク", q.getAnswerList().get(1));
        Assert.assertEquals("トレードパスワード", q.getAnswerList().get(2));
        Assert.assertEquals("トレードパスツール", q.getAnswerList().get(3));
        Assert.assertEquals("トレードヒドン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(125);

        Assert.assertEquals("例えば、日本航空の「ＪＡＬ」や「鶴」のマークのように、企業のイメージを表す文字や絵", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("サービスマーク", q.getAnswerList().get(0));
        Assert.assertEquals("トレードマーク", q.getAnswerList().get(1));
        Assert.assertEquals("イメージマーク", q.getAnswerList().get(2));
        Assert.assertEquals("デザインマーク", q.getAnswerList().get(3));
        Assert.assertEquals("リバースマーク", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(126);

        Assert.assertEquals("著作権の保護期間は、著作者の死後または公表後何年？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("５０年", q.getAnswerList().get(0));
        Assert.assertEquals("２０年", q.getAnswerList().get(1));
        Assert.assertEquals("１０年", q.getAnswerList().get(2));
        Assert.assertEquals("１００年", q.getAnswerList().get(3));
        Assert.assertEquals("万年", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(127);

        Assert.assertEquals("ソフトウェアをそのままコピーすること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("デッドコピー", q.getAnswerList().get(0));
        Assert.assertEquals("フリーコピー", q.getAnswerList().get(1));
        Assert.assertEquals("ファイルコピー", q.getAnswerList().get(2));
        Assert.assertEquals("システムコピー", q.getAnswerList().get(3));
        Assert.assertEquals("そのまんま東コピー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(128);

        Assert.assertEquals("平成６年度における、全国の裁判所の知的所有権関連の訴訟受理件数は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("４５６件", q.getAnswerList().get(0));
        Assert.assertEquals("１２３件", q.getAnswerList().get(1));
        Assert.assertEquals("７８９件", q.getAnswerList().get(2));
        Assert.assertEquals("　３４件", q.getAnswerList().get(3));
        Assert.assertEquals("　６７件", q.getAnswerList().get(4));
    }

    private void subtest_build_genre8(IGotakuInfo gotaku) {
        IGotakuGenreInfo genre = gotaku.getGenreList().get(7);

        Assert.assertEquals("表現能力", genre.getName());

        Assert.assertEquals(97, genre.getQuestionList().size());

        IGotakuQuestionInfo q = genre.getQuestionList().get(0);

        Assert.assertEquals("ＳＡＤにとって、問題発見や解決のための情報を収集するには（　　）が欠かせない", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インタビュー", q.getAnswerList().get(0));
        Assert.assertEquals("プレゼンテーション", q.getAnswerList().get(1));
        Assert.assertEquals("キャプテンシステム", q.getAnswerList().get(2));
        Assert.assertEquals("ＥＵＣ", q.getAnswerList().get(3));
        Assert.assertEquals("醤油と砂糖", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(1);

        Assert.assertEquals("ＳＡＤにとって、特に「話」が重要な要素でない場合とは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("「似たもの３択」の問題作り", q.getAnswerList().get(0));
        Assert.assertEquals("上司への報告", q.getAnswerList().get(1));
        Assert.assertEquals("レビューミーティング", q.getAnswerList().get(2));
        Assert.assertEquals("業務担当者への提案の説明", q.getAnswerList().get(3));
        Assert.assertEquals("各種仕様書の関係者への説明", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(2);

        Assert.assertEquals("学校の授業・講演会・新製品や新技術の発表会など、各種説明会のこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("プレゼンテーション", q.getAnswerList().get(0));
        Assert.assertEquals("コミュニケーション", q.getAnswerList().get(1));
        Assert.assertEquals("リハーサル", q.getAnswerList().get(2));
        Assert.assertEquals("アロケーション", q.getAnswerList().get(3));
        Assert.assertEquals("レビューミーティング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(3);

        Assert.assertEquals("プレゼンテーションなどでは、聞き手に関する情報を把握することが重要であるが、次の中で特に意識しなくてもよいものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("聞き手の勤怠状況", q.getAnswerList().get(0));
        Assert.assertEquals("聞き手の役職・職位", q.getAnswerList().get(1));
        Assert.assertEquals("聞き手の学歴や専攻分野", q.getAnswerList().get(2));
        Assert.assertEquals("聞き手の経験や職歴", q.getAnswerList().get(3));
        Assert.assertEquals("聞き手の年齢や性別", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(4);

        Assert.assertEquals("プレゼンテーションなどでは、聞き手に関する情報を把握することが重要であるが、次の中で特に意識しなくてもよいものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("聞き手の趣味や特技", q.getAnswerList().get(0));
        Assert.assertEquals("聞き手の地位・職位", q.getAnswerList().get(1));
        Assert.assertEquals("聞き手の専攻分野", q.getAnswerList().get(2));
        Assert.assertEquals("聞き手の所属している部門", q.getAnswerList().get(3));
        Assert.assertEquals("聞き手の年齢や性別", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(5);

        Assert.assertEquals("プレゼンテーションでは、場所・資料・講師など費用がかかるが、費用以上の「効果」を期待する。この効果を（　　）という", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("目標", q.getAnswerList().get(0));
        Assert.assertEquals("教育的指導", q.getAnswerList().get(1));
        Assert.assertEquals("目的", q.getAnswerList().get(2));
        Assert.assertEquals("結果", q.getAnswerList().get(3));
        Assert.assertEquals("相乗", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(6);

        Assert.assertEquals("一般にプレゼンテーションを行う場合、「目標（効果）」を期待するものであるが、目標と言い難いものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("自己を認めてくれる人を探す", q.getAnswerList().get(0));
        Assert.assertEquals("新知識を与える", q.getAnswerList().get(1));
        Assert.assertEquals("提案をし、同意や協力を求める", q.getAnswerList().get(2));
        Assert.assertEquals("強い主張を述べて、賛同を得る", q.getAnswerList().get(3));
        Assert.assertEquals("報告を行う", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(7);

        Assert.assertEquals("プレゼンテーションなどで、効果的な話の骨組みを作成するには、一般に（　　）→（　　）→（　　）という順序で考える", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("序論→本論→結論", q.getAnswerList().get(0));
        Assert.assertEquals("本論→結論→序論", q.getAnswerList().get(1));
        Assert.assertEquals("序論→本論→結輪", q.getAnswerList().get(2));
        Assert.assertEquals("序論→正論→結論", q.getAnswerList().get(3));
        Assert.assertEquals("創造→実践→敬愛", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(8);

        Assert.assertEquals("プレゼンテーションで、目標を実現させるため「興味を与え、最後まで聞こうとする気持ちを起こさせる」時間帯はどこが適当？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("序論", q.getAnswerList().get(0));
        Assert.assertEquals("本論", q.getAnswerList().get(1));
        Assert.assertEquals("結論", q.getAnswerList().get(2));
        Assert.assertEquals("諸論", q.getAnswerList().get(3));
        Assert.assertEquals("丑三つ時", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(9);

        Assert.assertEquals("プレゼンテーションなどで、説明の資料の作成は、話す内容を考えて準備する必要があるが、次の中で特に重要でないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("できる限り資料を多く作成する", q.getAnswerList().get(0));
        Assert.assertEquals("時間配分の検討", q.getAnswerList().get(1));
        Assert.assertEquals("簡潔・正確で明快な内容にする", q.getAnswerList().get(2));
        Assert.assertEquals("例示の列挙", q.getAnswerList().get(3));
        Assert.assertEquals("専門用語や略語の洗い出し", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(10);

        Assert.assertEquals("プレゼンテーションなどの説明用資料を作成する場合の留意点として、特に重要でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("できるだけ専門用語を使用する", q.getAnswerList().get(0));
        Assert.assertEquals("聞き手の知識レベルに合わせる", q.getAnswerList().get(1));
        Assert.assertEquals("具体例を盛り込む", q.getAnswerList().get(2));
        Assert.assertEquals("ビジュアル表現を工夫する", q.getAnswerList().get(3));
        Assert.assertEquals("箇条書きを生かす", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(11);

        Assert.assertEquals("プレゼンテーションなどのために、事前に本番と同じ設定で練習すること", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("リハーサル", q.getAnswerList().get(0));
        Assert.assertEquals("インストラクション", q.getAnswerList().get(1));
        Assert.assertEquals("ミーティング", q.getAnswerList().get(2));
        Assert.assertEquals("ボディランゲージ", q.getAnswerList().get(3));
        Assert.assertEquals("アポイントメント", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(12);

        Assert.assertEquals("プレゼンテーションなどにおいて、効果的な話し方をするために特にさほど重要でないと思われる項目は？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("一定の大きさの声で話す", q.getAnswerList().get(0));
        Assert.assertEquals("話す内容でスピードを変える", q.getAnswerList().get(1));
        Assert.assertEquals("声の高さに気をつける", q.getAnswerList().get(2));
        Assert.assertEquals("間（ま）の使い方を考える", q.getAnswerList().get(3));
        Assert.assertEquals("個人的な癖に注意する", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(13);

        Assert.assertEquals("プレゼンテーションなどでの話し方で、重要点や主張点を言うときにはどういうことに留意すべきか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("通常より大きめの声で話す", q.getAnswerList().get(0));
        Assert.assertEquals("通常より小さめの声で話す", q.getAnswerList().get(1));
        Assert.assertEquals("ごく小さい虫の声位で話す", q.getAnswerList().get(2));
        Assert.assertEquals("通常どおりの大きさの声で話す", q.getAnswerList().get(3));
        Assert.assertEquals("大声で怒鳴り散らす", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(14);

        Assert.assertEquals("プレゼンテーションなどでの話し方で、聞き手の注目や関心を集めるときにはどういうことに留意すべきか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("通常より小さめの声で話す", q.getAnswerList().get(0));
        Assert.assertEquals("通常より大きめの声で話す", q.getAnswerList().get(1));
        Assert.assertEquals("声を荒げて語気を強く話す", q.getAnswerList().get(2));
        Assert.assertEquals("通常どおりの大きさの声で話す", q.getAnswerList().get(3));
        Assert.assertEquals("聞き手の手をじっと握りしめる", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(15);

        Assert.assertEquals("プレゼンテーションなどで、聞き手の関心が話題から逸れて退屈してきたような場合などに効果的な方法の一つに何がある？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("全員に対して発問してみる", q.getAnswerList().get(0));
        Assert.assertEquals("冗談を多用する", q.getAnswerList().get(1));
        Assert.assertEquals("知っている歌を披露する", q.getAnswerList().get(2));
        Assert.assertEquals("清水アキラになりきる", q.getAnswerList().get(3));
        Assert.assertEquals("最初から説明しなおす", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(16);

        Assert.assertEquals("プレゼンテーションなどにおける、ジェスチャ・動き・姿勢・表情・視線などのこと", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ボディランゲージ", q.getAnswerList().get(0));
        Assert.assertEquals("ものまね", q.getAnswerList().get(1));
        Assert.assertEquals("レビューミーティング", q.getAnswerList().get(2));
        Assert.assertEquals("流し目", q.getAnswerList().get(3));
        Assert.assertEquals("抑揚効果", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(17);

        Assert.assertEquals("プレゼンテーションなどで、体の動きで表現の効果を高める方法。これを使えば微妙なニュアンスも伝達できる", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ジェスチャ", q.getAnswerList().get(0));
        Assert.assertEquals("ボディランゲージ", q.getAnswerList().get(1));
        Assert.assertEquals("手話", q.getAnswerList().get(2));
        Assert.assertEquals("ライダーキック", q.getAnswerList().get(3));
        Assert.assertEquals("隠し芸", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(18);

        Assert.assertEquals("プレゼンテーションなどで、聞き手への発問の方法として実際に存在しないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("抽象発問", q.getAnswerList().get(0));
        Assert.assertEquals("ブーメラン発問", q.getAnswerList().get(1));
        Assert.assertEquals("リレー発問", q.getAnswerList().get(2));
        Assert.assertEquals("自問自答型発問", q.getAnswerList().get(3));
        Assert.assertEquals("指名発問", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(19);

        Assert.assertEquals("プレゼンテーションなどで、「私はこう思いますが皆さんはいかがでしょうか」などといった質問を行うこと。またはその方法", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("自問自答型発問", q.getAnswerList().get(0));
        Assert.assertEquals("投げ返し発問", q.getAnswerList().get(1));
        Assert.assertEquals("リレー発問", q.getAnswerList().get(2));
        Assert.assertEquals("全員対象発問", q.getAnswerList().get(3));
        Assert.assertEquals("全体発問", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(20);

        Assert.assertEquals("プレゼンテーションなどのジェスチャは、話の展開に合わせて行うべきであるが、次の中でふさわしくないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("悲しい話＝体を大きく動かす", q.getAnswerList().get(0));
        Assert.assertEquals("希望に満ちた話＝胸を張る", q.getAnswerList().get(1));
        Assert.assertEquals("楽しい話＝笑顔でゆったり", q.getAnswerList().get(2));
        Assert.assertEquals("怒りの話＝こぶしを握りしめる", q.getAnswerList().get(3));
        Assert.assertEquals("ダイナミックな話＝大きな動作", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(21);

        Assert.assertEquals("プレゼンテーションなどにおいて、表情を生かすことは重要な要素であるが、そのポイントとして適切でないものはどれか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("常に無表情で話を進める", q.getAnswerList().get(0));
        Assert.assertEquals("原則として笑顔で話す", q.getAnswerList().get(1));
        Assert.assertEquals("自信に満ちた表情で話す", q.getAnswerList().get(2));
        Assert.assertEquals("冷静な表情で話す", q.getAnswerList().get(3));
        Assert.assertEquals("生き生きした表情で話す", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(22);

        Assert.assertEquals("プレゼンテーションなどにおいて、話すときの姿勢は大切である。そのポイントとして不適切なものはどれか", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("直立不動の姿勢で話す", q.getAnswerList().get(0));
        Assert.assertEquals("背筋をきちんと伸ばす", q.getAnswerList().get(1));
        Assert.assertEquals("机の上や腰に手を置かない", q.getAnswerList().get(2));
        Assert.assertEquals("手を組んで話さない", q.getAnswerList().get(3));
        Assert.assertEquals("前かがみにならない", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(23);

        Assert.assertEquals("Ａ４サイズなどの透明プラスチックシートに絵や文字を書いて、ランプからの強い光でスクリーンに映し出す装置", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＨＰ", q.getAnswerList().get(0));
        Assert.assertEquals("ＯＣＲ", q.getAnswerList().get(1));
        Assert.assertEquals("ＯＭＲ", q.getAnswerList().get(2));
        Assert.assertEquals("ＭＭＲ", q.getAnswerList().get(3));
        Assert.assertEquals("お絵かき先生", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(24);

        Assert.assertEquals("ＯＨＰはプレゼンテーションなどで特に効果があるが、その効果と言えないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("精神の安定", q.getAnswerList().get(0));
        Assert.assertEquals("時間の節約", q.getAnswerList().get(1));
        Assert.assertEquals("理解の促進", q.getAnswerList().get(2));
        Assert.assertEquals("注意の集中", q.getAnswerList().get(3));
        Assert.assertEquals("要点の明確化", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(25);

        Assert.assertEquals("プレゼンテーションなどで使用するＯＨＰシートを作成する場合、そのポイントと言えないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("数値のグラフ化は極力避ける", q.getAnswerList().get(0));
        Assert.assertEquals("聞き手の効果を意識する", q.getAnswerList().get(1));
        Assert.assertEquals("ねらいに基づいた表現を工夫", q.getAnswerList().get(2));
        Assert.assertEquals("図解や絵の表現を工夫", q.getAnswerList().get(3));
        Assert.assertEquals("１枚のシートの情報量を考える", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(26);

        Assert.assertEquals("プレゼンテーションなどで使用するＯＨＰシートを作成する場合、そのポイントと言えないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("シート１枚に内容を詰め込む", q.getAnswerList().get(0));
        Assert.assertEquals("１枚のシート＝１テーマとする", q.getAnswerList().get(1));
        Assert.assertEquals("協調や差別化の工夫をする", q.getAnswerList().get(2));
        Assert.assertEquals("聞き手の状況をイメージする", q.getAnswerList().get(3));
        Assert.assertEquals("色の効果を考えて色付けする", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(27);

        Assert.assertEquals("プレゼンテーションなどにおけるＯＨＰ使用上の留意点で、正しくないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＯＨＰは明るい場所で使用する", q.getAnswerList().get(0));
        Assert.assertEquals("話がメイン・ＯＨＰが補助手段", q.getAnswerList().get(1));
        Assert.assertEquals("常に投影のタイミングを考える", q.getAnswerList().get(2));
        Assert.assertEquals("位置を考えて、死角を作らない", q.getAnswerList().get(3));
        Assert.assertEquals("使用過多を避けるようにする", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(28);

        Assert.assertEquals("プレゼンテーションなどにおけるＯＨＰ使用上の留意点で、正しくないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("スイッチを常にオンにしておく", q.getAnswerList().get(0));
        Assert.assertEquals("明室投影を心がける", q.getAnswerList().get(1));
        Assert.assertEquals("事前に投影順番を確認しておく", q.getAnswerList().get(2));
        Assert.assertEquals("画面指示を考慮する", q.getAnswerList().get(3));
        Assert.assertEquals("話の流れに合った投影を行う", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(29);

        Assert.assertEquals("プレゼンテーションなどにおける話し方の上達の決め手として、適切でないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("オリジナル技術を随所に使う", q.getAnswerList().get(0));
        Assert.assertEquals("他の人に指摘してもらう", q.getAnswerList().get(1));
        Assert.assertEquals("改善努力をする", q.getAnswerList().get(2));
        Assert.assertEquals("創意工夫をする", q.getAnswerList().get(3));
        Assert.assertEquals("基本を身につける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(30);

        Assert.assertEquals("プレゼンテーションなどにおいて事例を紹介する場合、しいて言えば使用すべきでないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("他人が経験した面白い事例", q.getAnswerList().get(0));
        Assert.assertEquals("話の展開に合致している事例", q.getAnswerList().get(1));
        Assert.assertEquals("わかりやすい事例", q.getAnswerList().get(2));
        Assert.assertEquals("聞き手に身近な事例", q.getAnswerList().get(3));
        Assert.assertEquals("聞き手のレベルにあった事例", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(31);

        Assert.assertEquals("プレゼンテーションなどにおいて、簡潔で明快な話をするためのポイントとして適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("話を短く区切らない", q.getAnswerList().get(0));
        Assert.assertEquals("むだを省く", q.getAnswerList().get(1));
        Assert.assertEquals("要点を押さえる", q.getAnswerList().get(2));
        Assert.assertEquals("遠回しの表現をしない", q.getAnswerList().get(3));
        Assert.assertEquals("抽象的な表現を避ける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(32);

        Assert.assertEquals("プレゼンテーションなどにおいて、簡潔で明快な話をするためのポイントとして適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("具体的な表現を避ける", q.getAnswerList().get(0));
        Assert.assertEquals("話を短く区切る", q.getAnswerList().get(1));
        Assert.assertEquals("核心をついた言葉を使う", q.getAnswerList().get(2));
        Assert.assertEquals("主張を首尾一貫させる", q.getAnswerList().get(3));
        Assert.assertEquals("あいまいな表現をしない", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(33);

        Assert.assertEquals("プレゼンテーションなどにおいて、簡潔で明快な話をするためのポイントとして適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("抽象的な表現を心がける", q.getAnswerList().get(0));
        Assert.assertEquals("話を短く区切る", q.getAnswerList().get(1));
        Assert.assertEquals("核心をついた言葉を使う", q.getAnswerList().get(2));
        Assert.assertEquals("主張を首尾一貫させる", q.getAnswerList().get(3));
        Assert.assertEquals("あいまいな表現をしない", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(34);

        Assert.assertEquals("プレゼンテーションなどにおいて、簡潔で明快な話をするためのポイントとして適切なものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("遠回しの表現をしない", q.getAnswerList().get(0));
        Assert.assertEquals("焦点をぼかして話す", q.getAnswerList().get(1));
        Assert.assertEquals("話を短く区切らない", q.getAnswerList().get(2));
        Assert.assertEquals("抽象的な表現をする", q.getAnswerList().get(3));
        Assert.assertEquals("あいまいな表現を心がける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(35);

        Assert.assertEquals("わかりやすい文章の要件として、適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("かしこまった言い方を心がける", q.getAnswerList().get(0));
        Assert.assertEquals("やさしい言葉を使う", q.getAnswerList().get(1));
        Assert.assertEquals("使い慣れた表現をする", q.getAnswerList().get(2));
        Assert.assertEquals("読む人の立場になって書く", q.getAnswerList().get(3));
        Assert.assertEquals("難しい漢字を多用しない", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(36);

        Assert.assertEquals("わかりやすい文章の要件として、適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("漢字の比率は６割程度に抑える", q.getAnswerList().get(0));
        Assert.assertEquals("高尚な言葉はできるだけ避ける", q.getAnswerList().get(1));
        Assert.assertEquals("読み手の関心やニーズを考慮", q.getAnswerList().get(2));
        Assert.assertEquals("文は短く（４０字～６０字位）", q.getAnswerList().get(3));
        Assert.assertEquals("日頃使っている表現を心がける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(37);

        Assert.assertEquals("「一線を画する」、やさしい表現に直すと？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("はっきりと区別する", q.getAnswerList().get(0));
        Assert.assertEquals("１本の直線を引く", q.getAnswerList().get(1));
        Assert.assertEquals("横に一列に並べる", q.getAnswerList().get(2));
        Assert.assertEquals("直線で上下に分ける", q.getAnswerList().get(3));
        Assert.assertEquals("２者択一（いずれかを選択）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(38);

        Assert.assertEquals("簡潔な文章を書くための工夫として、誤っているものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("具体的な表現は避ける", q.getAnswerList().get(0));
        Assert.assertEquals("文は短くする／原則６０字以内", q.getAnswerList().get(1));
        Assert.assertEquals("形容詞を多用しない", q.getAnswerList().get(2));
        Assert.assertEquals("あいまいな表現は避ける", q.getAnswerList().get(3));
        Assert.assertEquals("簡潔明瞭を心がける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(39);

        Assert.assertEquals("簡潔な文章を書くための工夫として、誤っているものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("修飾語を多用して内容を深める", q.getAnswerList().get(0));
        Assert.assertEquals("具体的な数値で程度を示す", q.getAnswerList().get(1));
        Assert.assertEquals("１つの文を短くする", q.getAnswerList().get(2));
        Assert.assertEquals("抽象的な表現は避ける", q.getAnswerList().get(3));
        Assert.assertEquals("美辞麗句を避ける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(40);

        Assert.assertEquals("「５Ｗ１Ｈ」の「Ｈ」って何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ＨＯＷ", q.getAnswerList().get(0));
        Assert.assertEquals("ＨＥＤＥＲ", q.getAnswerList().get(1));
        Assert.assertEquals("ＨＯＬＤ", q.getAnswerList().get(2));
        Assert.assertEquals("ＨＥ", q.getAnswerList().get(3));
        Assert.assertEquals("ＨＡＮＤ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(41);

        Assert.assertEquals("文章を構成する「段落」の文と文字数は、通常どれくらいが適当か？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("３～５文、１５０～２００字", q.getAnswerList().get(0));
        Assert.assertEquals("２～４文、　８０～３５０字", q.getAnswerList().get(1));
        Assert.assertEquals("１～３文、　５０～　９０字", q.getAnswerList().get(2));
        Assert.assertEquals("２～６文、１５０～４００字", q.getAnswerList().get(3));
        Assert.assertEquals("５～７文、４００～６００字", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(42);

        Assert.assertEquals("文章をわかりやすくするための「修飾の４原則」に当てはまらないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("修飾する語とされる語は離す", q.getAnswerList().get(0));
        Assert.assertEquals("句を先に、形容詞を後に", q.getAnswerList().get(1));
        Assert.assertEquals("修飾語は修飾する語に密着", q.getAnswerList().get(2));
        Assert.assertEquals("長い修飾語は前、短いものは後", q.getAnswerList().get(3));
        Assert.assertEquals("修飾語の並びは重要なものから", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(43);

        Assert.assertEquals("文章をわかりやすくするための「修飾の４原則」に当てはまらないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("形容詞は前にもってくる", q.getAnswerList().get(0));
        Assert.assertEquals("句を先に、形容詞を後に", q.getAnswerList().get(1));
        Assert.assertEquals("修飾語は修飾する語に密着", q.getAnswerList().get(2));
        Assert.assertEquals("長い修飾語は前におく", q.getAnswerList().get(3));
        Assert.assertEquals("修飾語の並びは重要なものから", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(44);

        Assert.assertEquals("文章をわかりやすくするための主語と述語の関係で、適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("一つの文ごとに段落を変える", q.getAnswerList().get(0));
        Assert.assertEquals("ねじれた文章を書かない", q.getAnswerList().get(1));
        Assert.assertEquals("後戻りする構想にしない", q.getAnswerList().get(2));
        Assert.assertEquals("舌足らずな文章を書かない", q.getAnswerList().get(3));
        Assert.assertEquals("主語と述語をはっきりさせる", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(45);

        Assert.assertEquals("「部長は作業を中止し会議に参加した」で、一つ読点（、）を打つとすればどこが適切か？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("～中止し、会議に～", q.getAnswerList().get(0));
        Assert.assertEquals("　部長は、作業を～", q.getAnswerList().get(1));
        Assert.assertEquals("～作業を、中止し～", q.getAnswerList().get(2));
        Assert.assertEquals("～会議に、参加した", q.getAnswerList().get(3));
        Assert.assertEquals("～参加、した", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(46);

        Assert.assertEquals("文章を書く場合に、同格の単語を並べるとき（語の並列）や、判読しやすくするときに使用するものは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("・（中点）", q.getAnswerList().get(0));
        Assert.assertEquals("、（読点）", q.getAnswerList().get(1));
        Assert.assertEquals("。（句点）", q.getAnswerList().get(2));
        Assert.assertEquals("，（カンマ）", q.getAnswerList().get(3));
        Assert.assertEquals("孫の手（今、背中がかゆい）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(47);

        Assert.assertEquals("文章を書く場合に、分数・単位記号・慣用句および二者択一の場合に限って使用するものは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("／（斜線）", q.getAnswerList().get(0));
        Assert.assertEquals("－（ハイフン）", q.getAnswerList().get(1));
        Assert.assertEquals("＊（アスタリスク）", q.getAnswerList().get(2));
        Assert.assertEquals("％（パーセント）", q.getAnswerList().get(3));
        Assert.assertEquals("＿（下線）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(48);

        Assert.assertEquals("文章を書く場合、に文中に他の語や文を引用するとき、会話文を示すとき、特定の語句を強調したいときに使用するものは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("カッコ（「」・（））", q.getAnswerList().get(0));
        Assert.assertEquals("斜線（／）", q.getAnswerList().get(1));
        Assert.assertEquals("中点（・）", q.getAnswerList().get(2));
        Assert.assertEquals("３点リーダ（…）", q.getAnswerList().get(3));
        Assert.assertEquals("フェイスマーク（（＾＿＾））", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(49);

        Assert.assertEquals("次の中で、漢字の使い方に誤まりがあるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("相関々係", q.getAnswerList().get(0));
        Assert.assertEquals("国々に", q.getAnswerList().get(1));
        Assert.assertEquals("学校校長", q.getAnswerList().get(2));
        Assert.assertEquals("大々的に", q.getAnswerList().get(3));
        Assert.assertEquals("民主主義", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(50);

        Assert.assertEquals("文章を書く場合、言葉のダブリをなくすための留意点として、適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("道を歩くときに犬の糞は避ける", q.getAnswerList().get(0));
        Assert.assertEquals("同じ名詞や動詞を繰り返さない", q.getAnswerList().get(1));
        Assert.assertEquals("助詞の重複は避ける", q.getAnswerList().get(2));
        Assert.assertEquals("おおよその表現の重複は避ける", q.getAnswerList().get(3));
        Assert.assertEquals("同じ意味の語句の重複は避ける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(51);

        Assert.assertEquals("文章を書く場合に、外来語の表記や擬声語・動植物名など、常用漢字表の範囲では表現できないときに使用する表記法は何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("カタカナ", q.getAnswerList().get(0));
        Assert.assertEquals("漢字", q.getAnswerList().get(1));
        Assert.assertEquals("ひらがな", q.getAnswerList().get(2));
        Assert.assertEquals("ローマ字", q.getAnswerList().get(3));
        Assert.assertEquals("アイコン", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(52);

        Assert.assertEquals("次のカタカナの中で、ＪＩＳの情報処理用語の表記でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パラメータ", q.getAnswerList().get(0));
        Assert.assertEquals("インタフェース", q.getAnswerList().get(1));
        Assert.assertEquals("コンピュータ", q.getAnswerList().get(2));
        Assert.assertEquals("オフィスオートメーション", q.getAnswerList().get(3));
        Assert.assertEquals("プリンタ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(53);

        Assert.assertEquals("次のカタカナの中で、ＪＩＳの情報処理用語の表記はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("インタプリタ", q.getAnswerList().get(0));
        Assert.assertEquals("インターフェース", q.getAnswerList().get(1));
        Assert.assertEquals("コンピュータ・ネットワーク", q.getAnswerList().get(2));
        Assert.assertEquals("情報センター", q.getAnswerList().get(3));
        Assert.assertEquals("アンダーフロー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(54);

        Assert.assertEquals("次の漢字の使い方で、間違っているものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("遣跡", q.getAnswerList().get(0));
        Assert.assertEquals("応対", q.getAnswerList().get(1));
        Assert.assertEquals("花盛り", q.getAnswerList().get(2));
        Assert.assertEquals("未来", q.getAnswerList().get(3));
        Assert.assertEquals("発掘", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(55);

        Assert.assertEquals("次の漢字の使い方で、正しいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("危機一髪", q.getAnswerList().get(0));
        Assert.assertEquals("自我自賛", q.getAnswerList().get(1));
        Assert.assertEquals("喜怒衰楽", q.getAnswerList().get(2));
        Assert.assertEquals("大同小意", q.getAnswerList().get(3));
        Assert.assertEquals("意味伸長", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(56);

        Assert.assertEquals("次の中で、送り仮名のつけ方が正しくないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("恐しい", q.getAnswerList().get(0));
        Assert.assertEquals("必ず", q.getAnswerList().get(1));
        Assert.assertEquals("穏やか", q.getAnswerList().get(2));
        Assert.assertEquals("短い", q.getAnswerList().get(3));
        Assert.assertEquals("少ない", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(57);

        Assert.assertEquals("次の中で、送り仮名のつけ方が正しいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("新しい", q.getAnswerList().get(0));
        Assert.assertEquals("失なう", q.getAnswerList().get(1));
        Assert.assertEquals("美い", q.getAnswerList().get(2));
        Assert.assertEquals("身近か", q.getAnswerList().get(3));
        Assert.assertEquals("催おす", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(58);

        Assert.assertEquals("次の中で、仮名づかいが正しくないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ちかじか（近々）", q.getAnswerList().get(0));
        Assert.assertEquals("はなぢ（鼻血）", q.getAnswerList().get(1));
        Assert.assertEquals("みかづき（三日月）", q.getAnswerList().get(2));
        Assert.assertEquals("まず（先～）", q.getAnswerList().get(3));
        Assert.assertEquals("はじる（恥～）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(59);

        Assert.assertEquals("次の中で、仮名づかいが正しいものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("みそづけ（味噌漬け）", q.getAnswerList().get(0));
        Assert.assertEquals("そこじから（底力）", q.getAnswerList().get(1));
        Assert.assertEquals("ちかじか（近々）", q.getAnswerList().get(2));
        Assert.assertEquals("さかづき（杯）", q.getAnswerList().get(3));
        Assert.assertEquals("づつ（宛）", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(60);

        Assert.assertEquals("次の中で、カタカナ書きが望ましい語句はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("からす", q.getAnswerList().get(0));
        Assert.assertEquals("かるた", q.getAnswerList().get(1));
        Assert.assertEquals("たばこ", q.getAnswerList().get(2));
        Assert.assertEquals("あいさつ", q.getAnswerList().get(3));
        Assert.assertEquals("したがって", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(61);

        Assert.assertEquals("次の中で、カタカナ書きが望ましい語句はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("のこぎり", q.getAnswerList().get(0));
        Assert.assertEquals("ぬるぬる", q.getAnswerList().get(1));
        Assert.assertEquals("ちょっと", q.getAnswerList().get(2));
        Assert.assertEquals("でたらめ", q.getAnswerList().get(3));
        Assert.assertEquals("なお", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(62);

        Assert.assertEquals("次の中で、ひらがな書きが望ましい語句はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("かっぱ", q.getAnswerList().get(0));
        Assert.assertEquals("わんわん", q.getAnswerList().get(1));
        Assert.assertEquals("いちじく", q.getAnswerList().get(2));
        Assert.assertEquals("なべ", q.getAnswerList().get(3));
        Assert.assertEquals("ふぐ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(63);

        Assert.assertEquals("わかりやすい文章の基本とは何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("起承転結", q.getAnswerList().get(0));
        Assert.assertEquals("本末転倒", q.getAnswerList().get(1));
        Assert.assertEquals("支離滅裂", q.getAnswerList().get(2));
        Assert.assertEquals("一心不乱", q.getAnswerList().get(3));
        Assert.assertEquals("自業自得", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(64);

        Assert.assertEquals("「起承転結」というが、展開の部分で、読み手の関心を高め、話を盛り上げたり発展させたりするのはどこ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("承", q.getAnswerList().get(0));
        Assert.assertEquals("起", q.getAnswerList().get(1));
        Assert.assertEquals("転", q.getAnswerList().get(2));
        Assert.assertEquals("結", q.getAnswerList().get(3));
        Assert.assertEquals("起承転結には該当しない", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(65);

        Assert.assertEquals("文章を書く場合、結論が最初にくる組み立て方", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("重点先行主義", q.getAnswerList().get(0));
        Assert.assertEquals("先入先出法", q.getAnswerList().get(1));
        Assert.assertEquals("後入先出法", q.getAnswerList().get(2));
        Assert.assertEquals("ケツ丸出し法", q.getAnswerList().get(3));
        Assert.assertEquals("新聞見出し法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(66);

        Assert.assertEquals("文章の組み立て方の基本的要素は、序論、本論、結論であるが、この考え方を何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("三段構え", q.getAnswerList().get(0));
        Assert.assertEquals("身構え", q.getAnswerList().get(1));
        Assert.assertEquals("三分法", q.getAnswerList().get(2));
        Assert.assertEquals("三社参り", q.getAnswerList().get(3));
        Assert.assertEquals("三権分立", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(67);

        Assert.assertEquals("新聞記事などの詳細な部分（本文）は、通常どういう順序で記述されている？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("結論→経過→原因", q.getAnswerList().get(0));
        Assert.assertEquals("原因→経過→結論", q.getAnswerList().get(1));
        Assert.assertEquals("原因→結果→経過", q.getAnswerList().get(2));
        Assert.assertEquals("経過→原因→結論", q.getAnswerList().get(3));
        Assert.assertEquals("結論→本論→原因", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(68);

        Assert.assertEquals("文章の本論を書く場合に、個々の特殊な事柄から一般的原理や法則、結論を導き出す方法を何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("帰納的順序法", q.getAnswerList().get(0));
        Assert.assertEquals("演繹的順序法", q.getAnswerList().get(1));
        Assert.assertEquals("因果的順序法", q.getAnswerList().get(2));
        Assert.assertEquals("空間的順序法", q.getAnswerList().get(3));
        Assert.assertEquals("原理的順序法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(69);

        Assert.assertEquals("文章の本論を書く場合に、原因から結果または結果から原因を推理していく方法を何と言う？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("因果的順序法", q.getAnswerList().get(0));
        Assert.assertEquals("帰納的順序法", q.getAnswerList().get(1));
        Assert.assertEquals("演繹的順序法", q.getAnswerList().get(2));
        Assert.assertEquals("火曜サスペンス劇場的推理法", q.getAnswerList().get(3));
        Assert.assertEquals("推理的順序法", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(70);

        Assert.assertEquals("感動を与える文章を書く場合に配慮すべき点として、適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("最後の１行に命をかける", q.getAnswerList().get(0));
        Assert.assertEquals("自分の言葉で素直に書く", q.getAnswerList().get(1));
        Assert.assertEquals("他人の書きそうなことは省く", q.getAnswerList().get(2));
        Assert.assertEquals("「事実」に語らせる", q.getAnswerList().get(3));
        Assert.assertEquals("最初の１行に勝負をかける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(71);

        Assert.assertEquals("人を引き付ける文章の要件として「カンカラコモデケア」があるが、「カラ」の意味するものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("カラフル", q.getAnswerList().get(0));
        Assert.assertEquals("カラー", q.getAnswerList().get(1));
        Assert.assertEquals("カラクリ", q.getAnswerList().get(2));
        Assert.assertEquals("カラマワリ", q.getAnswerList().get(3));
        Assert.assertEquals("カラーコピー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(72);

        Assert.assertEquals("人を引き付ける文章の要件として「カンカラコモデケア」があるが、「ア」の意味するものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("明るさ", q.getAnswerList().get(0));
        Assert.assertEquals("愛きょう", q.getAnswerList().get(1));
        Assert.assertEquals("アメニティ（快適性）", q.getAnswerList().get(2));
        Assert.assertEquals("アレンジ", q.getAnswerList().get(3));
        Assert.assertEquals("新しさ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(73);

        Assert.assertEquals("人を引き付ける文章の要件として「カンカラコモデケア」があるが、これに関係のないものは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("感情", q.getAnswerList().get(0));
        Assert.assertEquals("物語性", q.getAnswerList().get(1));
        Assert.assertEquals("今日性", q.getAnswerList().get(2));
        Assert.assertEquals("データ", q.getAnswerList().get(3));
        Assert.assertEquals("決意", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(74);

        Assert.assertEquals("簡潔な文章を書くための留意点として、適切でない思われるものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("単調になるので短い文は避ける", q.getAnswerList().get(0));
        Assert.assertEquals("よけいなことは思い切って削る", q.getAnswerList().get(1));
        Assert.assertEquals("表現を遠回しにしない", q.getAnswerList().get(2));
        Assert.assertEquals("主題にまっすぐ迫る", q.getAnswerList().get(3));
        Assert.assertEquals("抽象的表現は避ける", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(75);

        Assert.assertEquals("視覚に訴えて情報の伝達を助けるための手段", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ビジュアル表現", q.getAnswerList().get(0));
        Assert.assertEquals("カラフル表現", q.getAnswerList().get(1));
        Assert.assertEquals("グラフ表現", q.getAnswerList().get(2));
        Assert.assertEquals("チャート表現", q.getAnswerList().get(3));
        Assert.assertEquals("イメージ表現", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(76);

        Assert.assertEquals("次の中で、ビジュアル表現による効果と言えないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("流れや変化が把握しにくい", q.getAnswerList().get(0));
        Assert.assertEquals("読み手の時間を節約できる", q.getAnswerList().get(1));
        Assert.assertEquals("印象に残りやすい", q.getAnswerList().get(2));
        Assert.assertEquals("要点が明確になる", q.getAnswerList().get(3));
        Assert.assertEquals("明確に伝えることができる", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(77);

        Assert.assertEquals("内訳や構成比を示すのに適したグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("円グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("棒グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("暴グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("株価チャート", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(78);

        Assert.assertEquals("時系列変動や時間的推移を見るのに適したグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("円グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("棒グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("炎グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("絵グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(79);

        Assert.assertEquals("大小関係の比較を行うのに適したグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("棒グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("円グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("俺潜グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("レーダーチャート", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(80);

        Assert.assertEquals("個々に独立した項目の数値を比較する場合に利用されるグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("単純棒グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("帯グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("Ｘ線グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("レーダーチャート", q.getAnswerList().get(3));
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(81);

        Assert.assertEquals("全体的な大小と同時に、それらの要素の変化を見ることもできるグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("積み重ね棒グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("ピラミッドグラフ", q.getAnswerList().get(1));
        Assert.assertEquals("線グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("面積グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("折れ線グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(82);

        Assert.assertEquals("一定期間内の最高値と最低値など、幅のある数値を時系列で表現したいときに適したグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("株価チャート（浮動棒グラフ）", q.getAnswerList().get(0));
        Assert.assertEquals("レーダーチャート", q.getAnswerList().get(1));
        Assert.assertEquals("立体棒グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("絵グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("マトリックス図", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(83);

        Assert.assertEquals("バランスの良否を評価するのに適したグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("レーダーチャート", q.getAnswerList().get(0));
        Assert.assertEquals("浮動票グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("積み上げ棒グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("正方形グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("フローチャート", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(84);

        Assert.assertEquals("比較する数値の差が大きいときや、面積そのものを比較したいときに使用するグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("面積グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("数値比較グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("ガントチャート", q.getAnswerList().get(2));
        Assert.assertEquals("ＳＤチャート", q.getAnswerList().get(3));
        Assert.assertEquals("デシジョンツリー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(85);

        Assert.assertEquals("データを意味する絵の個数や大きさで表現したグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("絵グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("アイコンチャート", q.getAnswerList().get(1));
        Assert.assertEquals("アイソタイプグラフ", q.getAnswerList().get(2));
        Assert.assertEquals("ピクチャグラフ", q.getAnswerList().get(3));
        Assert.assertEquals("ピクセルチャート", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(86);

        Assert.assertEquals("ビジュアル表現の効用として、適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("身体が芯から温まる", q.getAnswerList().get(0));
        Assert.assertEquals("記憶に残る", q.getAnswerList().get(1));
        Assert.assertEquals("相互関係が表現できる", q.getAnswerList().get(2));
        Assert.assertEquals("同じ情報量なら短時間ですむ", q.getAnswerList().get(3));
        Assert.assertEquals("法則性が発見しやすい", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(87);

        Assert.assertEquals("言語データ（文章で書かれた情報）を視覚化（デザイン化）したもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("図解（チャート）", q.getAnswerList().get(0));
        Assert.assertEquals("グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("イラスト", q.getAnswerList().get(2));
        Assert.assertEquals("イメージング", q.getAnswerList().get(3));
        Assert.assertEquals("ハッチング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(88);

        Assert.assertEquals("数値データを視覚化（デザイン化）したもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("図解（チャート）", q.getAnswerList().get(1));
        Assert.assertEquals("相関図", q.getAnswerList().get(2));
        Assert.assertEquals("イメージング", q.getAnswerList().get(3));
        Assert.assertEquals("ハッチング", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(89);

        Assert.assertEquals("次の中で、大小の比較や順位を表すグラフとして適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("ドーナツグラフ", q.getAnswerList().get(0));
        Assert.assertEquals("点グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("絵グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("積み上げ棒グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("面積グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(90);

        Assert.assertEquals("次の中で、物事の因果関係の把握をするのに適切でないものはどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パート図", q.getAnswerList().get(0));
        Assert.assertEquals("マトリックス図", q.getAnswerList().get(1));
        Assert.assertEquals("親和図", q.getAnswerList().get(2));
        Assert.assertEquals("特性要因図", q.getAnswerList().get(3));
        Assert.assertEquals("デシジョンツリー", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(91);

        Assert.assertEquals("同じ値が維持され、突然に次の値へと段階的に変化するデータを見るときに適切なグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("階段グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("層グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("Ｚグラフ", q.getAnswerList().get(2));
        Assert.assertEquals("ファンチャート", q.getAnswerList().get(3));
        Assert.assertEquals("怪談グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(92);

        Assert.assertEquals("次の中で、実際に存在しない棒グラフの名称はどれ？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("散布棒グラフ", q.getAnswerList().get(0));
        Assert.assertEquals("積み上げ棒グラフ", q.getAnswerList().get(1));
        Assert.assertEquals("差異棒グラフ", q.getAnswerList().get(2));
        Assert.assertEquals("水平対象棒グラフ", q.getAnswerList().get(3));
        Assert.assertEquals("浮動棒グラフ", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(93);

        Assert.assertEquals("「甲子園出場校」の、打力・投手力・守備力・機動力という４つの項目のバランスを表しているグラフは？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("クモの巣チャート", q.getAnswerList().get(0));
        Assert.assertEquals("ハチの巣チャート", q.getAnswerList().get(1));
        Assert.assertEquals("アリの巣チャート", q.getAnswerList().get(2));
        Assert.assertEquals("カマキリの巣チャート", q.getAnswerList().get(3));
        Assert.assertEquals("タコの酢チャート", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(94);

        Assert.assertEquals("ビジュアル表現する対象を象徴化（シンボル化）したもの", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("アイソタイプ", q.getAnswerList().get(0));
        Assert.assertEquals("アイソトニック", q.getAnswerList().get(1));
        Assert.assertEquals("アイスクリーム", q.getAnswerList().get(2));
        Assert.assertEquals("アイコン", q.getAnswerList().get(3));
        Assert.assertEquals("アイコード", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(95);

        Assert.assertEquals("あるテーマを出発点にして、その構成要素や主旨を展開していくときに用いる図解", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("拡散図解", q.getAnswerList().get(0));
        Assert.assertEquals("焦点図解", q.getAnswerList().get(1));
        Assert.assertEquals("多重図解", q.getAnswerList().get(2));
        Assert.assertEquals("流れ図解", q.getAnswerList().get(3));
        Assert.assertEquals("系統図解", q.getAnswerList().get(4));

        q = genre.getQuestionList().get(96);

        Assert.assertEquals("おもに、大規模な作業の進行状況を管理・把握するのに適切な図は何？", q.getQuestion());
        Assert.assertEquals(5, q.getAnswerList().size());
        Assert.assertEquals("パート", q.getAnswerList().get(0));
        Assert.assertEquals("アルバイト", q.getAnswerList().get(1));
        Assert.assertEquals("ガントチャート", q.getAnswerList().get(2));
        Assert.assertEquals("ガンチャート", q.getAnswerList().get(3));
        Assert.assertEquals("オモチャート", q.getAnswerList().get(4));
    }

}
