package ui;

import com.vaadin.ui.Table;
import container.PersonContainer;
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
        setVisibleColumns(PersonContainer.NATURAL_COL_ORDER);
        setColumnHeaders(PersonContainer.COL_HEADERS_ENGLISH);
    }
}
