import static spark.Spark.*;
public class Control {

	public static void main(String[] args) {
			get("/hello", (req, res) -> "Hello World");
	}

}
