package scmtble.sevday;

class OpenException extends Exception {

    public OpenException(){
        super();
    }

    public OpenException(String msg){
        super(msg);
    }
}

public class FileException {
    public static int open(){
        return -1;
    }

    public static void readFile() throws OpenException{
        if (open() == -1){
            throw new OpenException("打开文件错误！");
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (OpenException e) {
            System.out.println(e.getMessage());
        }
    }
}