package com.oliveryasuna.vaadin.example.vni;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MyView extends VerticalLayout {

  public MyView() {
    super();

    final FormLayout formLayout = new FormLayout();

    formLayout.addFormItem(new Span(System.getProperty("java.vm.name")), "Java VM Name");
    formLayout.addFormItem(new Span(System.getProperty("java.vm.vendor")), "Java VM Vendor");
    formLayout.addFormItem(new Span(System.getProperty("java.vm.version")), "Java VM Version");

    formLayout.setResponsiveSteps(new FormLayout.ResponsiveStep("0px", 1, FormLayout.ResponsiveStep.LabelsPosition.TOP));

    add(formLayout);
  }

}
