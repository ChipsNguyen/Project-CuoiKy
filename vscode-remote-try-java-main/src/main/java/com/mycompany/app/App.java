
package com.mycompany.app;
import com.mycompany.app.Mycompany.*;

public class App {
    public static void main(String[] args) {
        StaffXML staffXML = new StaffXML();
        UserXML userXML = new UserXML();
        Staff  staff = new Staff("Tuan Kiet", 1, null, 1, null);

        staffXML.set_staffxml(staff);
        
        System.out.println(staffXML.get_staffxml(0));

        staff = staffXML.get_staffxml(0);

        staff.show();
    }
}
