module com.example.projectfumctionandswitch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectfumctionandswitch to javafx.fxml;
    exports com.example.projectfumctionandswitch;
}