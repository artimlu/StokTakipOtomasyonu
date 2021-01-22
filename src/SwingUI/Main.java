package stoktakip;

import SwingUI.GirisForm;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        
        YüklemeEkran yüklemeEkran = new YüklemeEkran();
        yüklemeEkran.setVisible(true);
        GirisForm giris = new GirisForm();
         
        try {
            for (int i=0;i<=100;i++){

                Thread.sleep(40);
                yüklemeEkran.yüklemeLabel.setText(Integer.toString(i)+"%");
                yüklemeEkran.yüklemeBar.setValue(i);
                if(i==100){
                    yüklemeEkran.setVisible(false);
                    giris.setVisible(true);
                }
                        
                        }
        } catch (Exception e) {
        }
    }
    
    }
    

