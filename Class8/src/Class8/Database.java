package Class8;

public interface Database {
    boolean connectToDB(String dataBaseName);

    boolean createTable(String tableName, String columns[]);

    boolean insertRecord(String tableName, String r[]);

    boolean deleteRecord(String tableName, String key);

    boolean updateValue(String tableName, String key, int attributeNum, String value);
}


