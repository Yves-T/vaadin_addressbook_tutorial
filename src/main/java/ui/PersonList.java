package ui;

import com.vaadin.ui.Table;
import vaadinapp.MyVaadinUI;

/**
 * User: Yves-T
 * Date: 17/11/13
 * Time: 07:40
 */
public class PersonList extends Table {
    public PersonList(MyVaadinUI app) {
        setSizeFull();
        // set datasource
        setContainerDataSource(app.getDataSource());
    }
}
