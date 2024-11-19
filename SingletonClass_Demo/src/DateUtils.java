//=====================lazy initialization==============

public class DateUtils {
	private static DateUtils dateUtilsObj = null;

	private DateUtils() {

	}
	
	public static DateUtils getObject() {
		if(dateUtilsObj ==null) {
			dateUtilsObj= new DateUtils();
		}
		return dateUtilsObj;
	}

}
