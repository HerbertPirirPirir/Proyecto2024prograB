module com.mycompany.bibliotecamain {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bibliotecamain to javafx.fxml;
    exports com.mycompany.bibliotecamain;
}
