package com.example.application.ui.vertical.help;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.ui.MainView;

@Route(value = "help", layout = MainView.class)
@PageTitle("Hilfe")
public class HelpView extends Div {

    public HelpView() {
        setId("help-view");
        add(new Text("Content placeholder"));
    }

}
