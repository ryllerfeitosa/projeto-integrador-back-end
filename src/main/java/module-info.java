module com.example.projetoestacionamento {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.senai.sp.jandira.projetoEstacionamento to javafx.fxml;
    exports br.senai.sp.jandira.projetoEstacionamento;
}