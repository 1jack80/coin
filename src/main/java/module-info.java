module com.j.coin {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.kordamp.ikonli.javafx;

    opens com.j.coin to javafx.fxml;
    exports com.j.coin;
    exports com.j.coin.Controllers;
    exports com.j.coin.Controllers.Admin;
    exports com.j.coin.Controllers.Client;
    exports com.j.coin.Models;
    exports com.j.coin.Views;

}