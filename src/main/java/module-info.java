module com.td_pizza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.td_pizza to javafx.fxml;
    exports com.td_pizza;
}