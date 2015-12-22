/**
 * 2015/12/22 リーダブルコードワークショップ課題
 *
 * @author Wataru Fuksuhima
 */
public class TaskExample {
    /**
     * 復帰値の列挙
     *
     * @author Wataru Fukushima
     */
    enum TaskExitCode {
        /** 正常終了 */
        NO_ERROR(0),
        /** 引数不足 */
        INSUFFICIENT_ARGUMENT(2),
        /** ファイルが見つからない */
        FILE_NOT_FOUND(3);
        
        /** 復帰値 */
        private final int exitCode;
        
        /**
         * コンストラクタ。
         *
         * @param exitCode 復帰値
         */
        private TaskExitCode(int exitCode) {
            this.exitCode = exitCode;
        }
        
        /**
         * 復帰値を取得する。
         *
         * @return 復帰値
         */
        public int getExitCode() {
            return exitCode;
        }
    }
    
    /**
     * エントリポイント。
     */
    public static void main(String[] arguments) {
        TaskExitCode returnCode = doSpec1();
        //TaskExitCode returnCode = doSpec3(arguments);
        System.exit(returnCode.getExitCode());
    }
    
    /**
     * 仕様1：レシピ情報を出力できること
     *
     * レシピのタイトルとして「オムライス」と出力するプログラムを新しく
     * 作ってください。
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
    private static TaskExitCode doSpec1() {
        Recipe omeletRiceRecipe = new OmeletRiceRecipe();
        System.out.println(omeletRiceRecipe.getTitle());
        return TaskExitCode.NO_ERROR;
    }
    
    /**
     * 仕様3：レシピデータが別ファイルに分離されていること
     *
     * 今はプログラム中に「オムライス」のレシピが埋め込まれているはずです。
     * そのレシピ情報をデータとして別のファイルに保存し、プログラムとは
     * 分離してください。
     *
     * データファイルのフォーマットは問いません。
     *
     * どのようにしてデータファイルをプログラムに指定したり読み込ませたり
     * するかの方法も問いません。
     *
     * データファイルをどのようなフォーマットにしたか、どのようにデータ
     * ファイルを指定するかはREADME.txtに記述してください。
     *
     * 入力
     *
     * データファイル
     * ファイル名は任意。例: recipe-data.txt
     * 中身は「オムライス」というレシピ情報1つだけ。
     * データファイルはリポジトリーに入れること
     * データファイルは、例えば次のような内容：
     *
     * % cat recipe-data.txt
     *オムライス
     *
     * 期待する結果
     *
     * プログラムが実行されたら、なんらかの方法でデータファイルを読み込み、
     * データファイル内にある「オムライス」というレシピ情報をロードして、
     * そのレシピ情報を出力すること。
     *
     * 実行例：
     *
     * % ./recipe.sh recipe-data.txt
     * オムライス
     * 他の人でも、README.txtを読めば、同様のデータファイルを作成できること。
     *
     * 他の人でも、README.txtを読めば、自分で作成したデータファイルから
     * レシピ情報をロードできること。
     */
    private static TaskExitCode doSpec3(String[] arguments) {
        if (arguments.length < 1) {
            printSpec3Usage();
            return TaskExitCode.INSUFFICIENT_ARGUMENT;
        }
        //TODO
        //String filePath = arguments[0];
        //RecipeLoader loader = new RecipeLoader();
        //List<Recipe> recipes = loader.load(filePath);
        //for (recipe : recipes) {
        //    System.out.println(recipe.getTitle());
        //}
        return TaskExitCode.NO_ERROR;
    }
    
    /**
     * 課題3の使い方を出力します。
     */
    private static void printSpec3Usage() {
        //TODO
    }
}
