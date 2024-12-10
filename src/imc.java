public class imc {
    public static double calcularimc (double peso, double altura) {
        double Imc = 0.0;
        Imc = peso / (altura * altura);

        return Imc;
    }
    public static String classificarimc (double imc) {
        String classificacao = " ";
        if ((imc > 0) && (imc < 18.5)) {
            return "Baixo peso";
        } else if ((imc >= 18.5) && (imc < 25.0)) {
            return "Peso normal";
        } else if ((imc >= 25.0) && (imc < 30.0)) {
            return "Sobrepeso";
        } else if ((imc >= 30.0) && (imc < 35.0)) {
            return "Obesidade grau 1";
        } else if ((imc >= 35.0) && (imc < 40.0)) {
            return "Obesidade grau 2";
        } else if (imc >= 40.0) {
            return "Obesidade grau 3";
        } else {
            return "Não foi possivel classificar";
        }
    }
}
