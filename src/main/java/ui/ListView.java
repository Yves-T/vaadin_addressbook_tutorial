package ui;

import com.vaadin.ui.VerticalSplitPanel;

/**
 * User: Yves-T
 * Date: 17/11/13
 * Time: 07:30
 */
public class ListView extends VerticalSplitPanel {

    public ListView(PersonList personList, PersonForm personForm) {
        setFirstComponent(personList);
        setSecondComponent(personForm);
        setSplitPosition(40);
    }

}
