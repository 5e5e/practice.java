import interfacePractice.Chicks.MethodReferenceDemo;
import interfacePractice.Chicks.MyFunctionalInterface;
import interfacePractice.Chicks.MyFunctionalInterfaceForNew;
import interfacePractice.Chicks.MyFunctionalInterfaceWithParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface = null;
		MyFunctionalInterfaceWithParam myFunctionalInterfaceWithParam = null;
		MyFunctionalInterfaceForNew myFunctionalInterfaceForNew = null;

		myFunctionalInterface = MethodReferenceDemo::staticMethod;
		myFunctionalInterface.call();

		MethodReferenceDemo myObject = new MethodReferenceDemo();
		myFunctionalInterface = myObject::instanceMethod;
		myFunctionalInterface.call();

		myFunctionalInterfaceWithParam = myObject::instanceMethod;
		myFunctionalInterfaceWithParam.call("parameter");

		myFunctionalInterfaceForNew = MethodReferenceDemo::new;
		MethodReferenceDemo myObject2 = myFunctionalInterfaceForNew.call();
		logger.debug(myObject2.getClass().getName());
	}
}
