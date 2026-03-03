package vanh.config;

import java.sql.*;

public class ConnectionDB {
    private final static String DRIVER ="org.postgresql.Driver";
    private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "vietanh2k5";

    public static Connection getConnection(){
        try {
            //Khai bao driver
            Class.forName(DRIVER);
            // Mo ket noi
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeConnection(Connection conn){
        if(conn != null){
            try{
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws SQLException {
//        Connection conn = getConnection();
//        String sql = """
//                create table if not exists students(
//                    id serial primary key,
//                    full_name varchar(255) not null,
//                    birthday date,
//                    sex bit
//                );
//                """;
//        Statement stm = conn.createStatement();
//        try{
//            boolean status = stm.execute(sql);
//            System.out.println("trang thai:  " + status);
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        //dong ket noi
//        closeConnection(conn);


        //Flow chung cho tat ca cac thao tac voi database:
        //1. Mo ket noi
        //2. Tao 1 doi tuong statement de tao sql
        //3. Thuc thi cau lenh sql
        //4. Xu ly ket qua (neu co)
        //5. Dong ket noi


        // xoa bang
//        Connection conn = getConnection();
//        String sql = "drop table if exists students";
//        Statement stm = conn.createStatement();
//        try{
//            boolean status = stm.execute(sql);
//            System.out.println("trang thai:  " + status);
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        closeConnection(conn);

        // sua bang
//        Connection conn = getConnection();
//        String sql = "alter table students add column email varchar(255)";
//        Statement stm = conn.createStatement();
//        try{
//            boolean status = stm.execute(sql);
//            System.out.println("trang thai:  " + status);
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        closeConnection(conn);

        // them du lieu
//        Connection conn = getConnection();
//        String sql = """
//            insert into Students ( full_name, birthday, sex, email) values
//            ('Nguyen Van A', '2000-01-01', 1, 'anhnv@gmail.com'),
//            ('Le Thi B', '2001-02-02', 0, 'bLT@gmail.com');
//            """;
//        Statement stm = conn.createStatement();
//        try{
//            boolean status = stm.execute(sql);
//            System.out.println("trang thai:  " + status);
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        closeConnection(conn);

        // select du lieu
//        Connection conn = getConnection();
//        String sql = """
//            select * from students;
//            """;
//        Statement stm = conn.createStatement();
//        try{
//            ResultSet rs = stm.executeQuery(sql);
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String full_name = rs.getString("full_name");
//                Date birthday = rs.getDate("birthday");
//                boolean sex = rs.getBoolean("sex");
//                String email = rs.getString("email");
//                System.out.println("id: " + id + ", full_name: " + full_name + ", birthday: " + birthday + ", sex: " + sex + ", email: " + email);
//            }
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        closeConnection(conn);

        Connection conn = getConnection();
        String sql = "call proc_get_all_students";
        CallableStatement call = conn.prepareCall(sql);
        try{
            boolean status = call.execute();
            System.out.println("trang thai:  " + status);
        } catch (SQLException e){
            e.printStackTrace();
        }
        closeConnection(conn);
    }
}
