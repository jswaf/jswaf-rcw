/**
 * オムライスのレシピ
 *
 * @author Wataru Fuksuhima
 */
public class OmeletRiceRecipe implements Recipe {
    /** タイトル */
    private static final String TITLE = "オムライス";

    /**
     * コンストラクタ。
     */
    public OmeletRiceRecipe() {
    }
    
    /**
     * タイトルを取得します。
     *
     * @return タイトル
     */
    @Override
    public String getTitle() {
        return TITLE;
    }
}
