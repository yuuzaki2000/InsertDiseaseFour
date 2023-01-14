package example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	private static final String DRIVER = "com.jdbc.mysql.Driver";
	
	private static final String URL = "jdbc:mysql://localhost:3306/disease?useSSL=false";

    private static String str1;
    private static String str2;
    private static String str3;
    private static String str4;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PartWindow partWindow = new PartWindow();
		
		partWindow.button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO 自動生成されたメソッド・スタブ
				str1 = partWindow.textarea1.getText();
				str2 = partWindow.textarea2.getText();
				str3 = partWindow.textarea3.getText();
				str4 = partWindow.textarea4.getText();
				
				System.out.println("ボタンが押されました。");
				System.out.println("疾患名：" + str1);
				System.out.println("症状：" + str2);
				System.out.println("診断：" + str3);
				System.out.println("治療：" + str4);
				
				try {
					Connection connection = DriverManager.getConnection(URL,"root","masanori4680");
					PreparedStatement statement = connection.prepareStatement("insert into diseasefour (disease,symptom,diagnosis,therapy) values (?,?,?,?)");

					// プレースホルダにパラメータをセット

					statement.setString(1,str1);
					statement.setString(2,str2);
					statement.setString(3,str3);
					statement.setString(4,str4);


					    int count = statement.executeUpdate();
					    System.out.println(count+"件のデータが挿入");



				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

				
			}
			
		});
		
		
		
	}

}
