package com.example.lab2;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class HelloController {
    public TextField promien;
    public TextField wysokosc;
    public TextField grubosc;
    public TextField kosztNormalnej;
    public TextField wagaNormalnej;
    public TextField kosztNierdzewnej;
    public TextField wagaNierdzewnej;
    double prom;
    double wys;
    double grub;
    double kn;
    double wn;
    double knr;
    double wnr;
    public void onBtnActon(ActionEvent actionEvent) {
        prom = Double.parseDouble(promien.getText());
        wys = Double.parseDouble(wysokosc.getText());
        grub = Double.parseDouble(grubosc.getText());
        kn = (0.69 * 3.14 * prom * (prom * wys)) * grub;
        wn = (4.20 * 3.14 * prom * (prom * wys)) * grub;
        knr = (21.37 * 3.14 * prom * (prom * wys)) * grub;
        wnr = (13.37 * 3.14 * prom * (prom * wys)) * grub;
        kosztNormalnej.setText("" + kn);
        wagaNormalnej.setText("" + kn);
        kosztNierdzewnej.setText("" + kn);
        wagaNierdzewnej.setText("" + kn);
    }
}