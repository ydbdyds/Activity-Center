package web;


public class JsonResult<T> {
    private boolean success;
    private String message;
    private T data;

    public static JsonResult falseResult() {
        return new JsonResult(false);
    }
    public static JsonResult successResult() {
        return new JsonResult(true, "");
    }

    public JsonResult(boolean flag) {
        this.success = flag;
    }

    public JsonResult(boolean flag, String message) {
        this.success = flag;
        this.message = message;
    }
}

