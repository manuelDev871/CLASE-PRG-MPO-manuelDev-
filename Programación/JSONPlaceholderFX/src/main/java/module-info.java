module org.example.jsonplaceholderfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.jsonplaceholderfx to javafx.fxml;
    exports org.example.jsonplaceholderfx;
}