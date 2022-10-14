package trabalho01;
public @interface Informacao {
    String autor();
    String dataUltimaAtt() default "N/A";
}


