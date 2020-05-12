/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookingMusicStudio;

/**
 *
 * @author WINDOWS 10
 */
public class class_admin {
    private String[][] loginadmin = new String[2][2];
    private String usernameadmin, passadmin;
    
    public class_admin(String usernameadmin,String passadmin){
            this.usernameadmin = usernameadmin;
            this.passadmin = passadmin;
            String[][] loginadmin =
            {
                {"sabimantaradh","140701"},
                {"bustaman","12345"}
            };
            this.loginadmin = loginadmin;
    }

    public boolean checkadmin(){
        for (int i=0; i<loginadmin.length; i++){
            if (loginadmin[i][0].equals(usernameadmin)){
                if (loginadmin[i][1].equals(passadmin)){
                    return true;
                }
            }
        }
        return false;
    }
}