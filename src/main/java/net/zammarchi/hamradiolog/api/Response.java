package net.zammarchi.hamradiolog.api;

public class Response {
    public static final String OK = "OK";
	public static final String OK_MESSAGE = "Operazione eseguita correttamente";
	public static final String KO = "KO";
    public static final String KO_MESSAGE = "Si e' verificato un errore";
    

    
	private String resultCode;
    private String resultMessage;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Response(String resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    
}
