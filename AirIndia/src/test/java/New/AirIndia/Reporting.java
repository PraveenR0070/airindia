package New.AirIndia;

//import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.commons.math3.ml.neuralnet.twod.util.LocationFinder.Location;
//import org.apache.poi.xdgf.usermodel.section.CharacterSection;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{
	
	/*public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	@Override
	public void onStart(ITestContext testContext) {
		String timeStamp = new SimpleDateFormat("yyy.mm.dd.hh.mm.ss").format(new Date());
		String repName = "Test-Report-"+timeStamp+".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
		try {
			htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		extent= new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Hostname", "localhost");
		extent.setSystemInfo("environment", "qa");
		extent.setSystemInfo("environment", "qa");
		
		
		htmlReporter.config().setDocumentTitle("inetBanking Test Project");
		htmlReporter.config().setReportName("functinal test report");
		//htmlReporter.config().setTestViewChartLocation(CharacterSection.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		
	}
	@Override
	public void onTestSuccess(ITestResult tr) {
		logger=extent.createTest(tr.getName());
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN) );
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		
		logger= extent.createTest(tr.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		
		String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		logger=extent.createTest(tr.getName());
		File f = new File(screenshotPath);
		
		if(f.exists()) {
			logger.fail("screenshot is below :" + logger.addScreenCaptureFromPath(screenshotPath));
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult tr) {
		
		logger=extent.createTest(tr.getName());
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		
		
	}
	@Override
	public void onFinish(ITestContext testContext) {
		extent.flush();
	}*/
	
	
	
	
	


