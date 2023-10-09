package comut;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Mytry implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation) {
		annotation.setRetryAnalyzer(Trycount.class);
	}

}
