package Comportamentales.Template_Method;

public class TestTemplate {
    public static void main(String[] args) {
        CheckDatabase sql = new SQL();
        CheckDatabase noSql = new NoSql();

        sql.template();
        noSql.template();
    }
}
