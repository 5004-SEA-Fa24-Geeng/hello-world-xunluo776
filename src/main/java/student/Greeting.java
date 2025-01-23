package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc,
 * this class will generate greetings based on users preference
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */
public class Greeting {
    /** The ID of the locality. */
    private int localityID;
    /** The name of the locality. */
    private String localityName;
    /** The greeting message in ASCII. */
    private String asciiGreeting;
    /** The greeting message in unicode. */
    private String unicodeGreeting;
    /** The format string for the greeting message. */
    private String formatStr;

    /**
     * Constructs a Greeting object with a default greeting.
     *
     * @param localityID the ID of the locality
     * @param localityName the name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }
    /**
     * Constructs a Greeting object with a ASCII greeting.
     *
     * @param localityID the ID of the locality
     * @param localityName the name of the locality
     * @param greeting the ASCII greeting message
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }
    /**
     * Constructs a greeting object with detailed variables.
     *
     * @param localityID the ID of the locality
     * @param localityName the name of the locality
     * @param asciiGreeting the ASCII greeting message
     * @param unicodeGreeting the Unicode greeting message
     * @param formatStr the format string for the greeting message
     */
    public Greeting(int localityID, String localityName,
                    String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * get locality ID.
     * @return locality ID
     */
     public int getLocalityID() {
        return this.localityID;
     }

    /**
     * get locality name.
     * @return locality name
     */
     public String getLocalityName() {
         return this.localityName;
     }

    /**
     * get Ascii Greeting.
     * @return Ascii Greeting
     */
     public String getAsciiGreeting() {
         return this.asciiGreeting;
     }

    /**
     * get unicode greeting.
     * @return unicode greeting
     */
     public String getUnicodeGreeting() {
         return this.unicodeGreeting;
     }

    /**
     *  get unicode format string.
     * @return format string with unicode
     */
     public String getFormatStr() {
         return String.format(formatStr, unicodeGreeting);
     }

    /**
     * get format based on boolean asciiOnly.
     * @param asciiOnly if want to use ascii format
     * @return ascii format if asciiOnly is true, return unicode format if false
     */
     public String getFormatStr(boolean asciiOnly) {
         if (asciiOnly) {
            return String.format(formatStr, asciiGreeting);
         } else {
             return getFormatStr();
         }
     }

    /**
     *Returns the full greeting details as a string. Primarily for debugging purposes.
     * @return full greeting details as a string
     */
    @Override
     public String toString() {
         return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                 this.localityID, this.localityName, this.asciiGreeting, this.unicodeGreeting);
     }
}
