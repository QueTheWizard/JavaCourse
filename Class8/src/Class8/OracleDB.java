package Class8;

public class OracleDB implements Database {


    public boolean connectToDB(String dataBaseName) {
        System.out.println("   Oracle connectToDB  ");
        return true;
    }

    public boolean createTable(String tableName, String columns[]) {
        System.out.println("   Oracle connectToDB  ");
        return true;
    }

    public boolean insertRecord(String tableName, String r[]) {
        System.out.println("   Oracle insertRecord  ");
        return true;
    }

    public boolean deleteRecord(String tableName, String key) {
        System.out.println("   Oracle deleteRecord  ");
        return true;
    }

    public boolean updateValue(String tableName, String key, int attributeNum, String value) {
        System.out.println("   Oracle updateValue  ");
        return true;
    }


    public static void main(String[] args) {

        Database db = new OracleDB();
        db.connectToDB("Employees");
    }
}

