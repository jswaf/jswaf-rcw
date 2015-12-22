/**
 * 2015/12/22 リーダブルコードワークショップ課題
 *
 * @author Wataru Fuksuhima
 */
public class TaskExample {
    /**
     * エントリポイント。
     */
    public static void main(String[] arguments) {
        doSpec1();
    }
    
    /**
     * 仕様1：レシピ情報を出力できること
     *
     * レシピのタイトルとして「オムライス」と出力するプログラムを新しく作ってください。
     *
     * レシピのタイトルの出力先は問いません。コンソールに出力しても構いませんし、
     * ファイルに出力しても、ウィンドウを作ってそこに出力しても、Webブラウザーに
     * 表示させても構いません。
     *
     * 入力
     *
     * なし
     *
     * 期待する結果
     *
     * プログラムが実行されたら、なんらかの形で「オムライス」と出力すること。
     */
    private static void doSpec1() {
        Recipe omeletRiceRecipe = new OmeletRiceRecipe();
        System.out.println(omeletRiceRecipe.getTitle());
    }
}
