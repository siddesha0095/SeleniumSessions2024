package seleniumSessions;

public class BrowserUtilAmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br=new BrowserUtil();
		
		br.launchBrowser("chrome");
		br.launchUrl("hptps://amazon.com");
		//System.out.println(br.getPageTitle());
		String tilte=br.getPageTitle();
		
		if(tilte.contains("amazon"))
		{
			System.out.println("title is coorect");
		}
		else
		{
			System.out.println("Wrong title");
		}
		System.out.println(br.getPageUrl());
		br.closeBrowser();
		br.quitBrowser();

	}

}
