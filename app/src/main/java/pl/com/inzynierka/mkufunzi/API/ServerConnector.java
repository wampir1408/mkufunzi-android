package pl.com.inzynierka.mkufunzi.API;

/**
 * Created by impresyjna on 16.12.15.
 */
public class ServerConnector {

    private static ServerConnector instance;
    private JSONParser jsonParser = new JSONParser();
    private String HOST_IP = "https://trener-mkufunzi.herokuapp.com";
    private String LOGIN = HOST_IP + "/login_mobile";
    private String REGISTER = HOST_IP + "/register_mobile";
    private String MEASURE_TYPES_INDEX = HOST_IP + "/measure_types_index";
    private String GET_MEASUREMENTS = HOST_IP + "/get_measurements_mobile";
    private String POST_MEASUREMENT = HOST_IP + "/post_measurement_mobile";
    private String USER_EXISTS = HOST_IP + "/user_exists_mobile";
    private String GET_MAIN_DATA = HOST_IP + "/get_main_data";
    private String GET_BLOOD_TYPES = HOST_IP + "/get_blood_types_mobile";
    private String GET_EYE_COLORS = HOST_IP + "/get_eye_colors_mobile";
    private String POST_UPDATE_PROTEGE = HOST_IP + "/update_from_mobile";

    public ServerConnector() {

    }

    public static ServerConnector getInstance() {
        if (instance == null) {
            instance = new ServerConnector();
        }
        return instance;
    }

    public JSONParser getJsonParser() {
        return jsonParser;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public String getREGISTER() {
        return REGISTER;
    }

    public String getMEASURE_TYPES_INDEX() {
        return MEASURE_TYPES_INDEX;
    }

    public String getGET_MEASUREMENTS() {
        return GET_MEASUREMENTS;
    }

    public String getPOST_MEASUREMENT() {
        return POST_MEASUREMENT;
    }

    public String getUSER_EXISTS() {
        return USER_EXISTS;
    }

    public String getGET_MAIN_DATA() {
        return GET_MAIN_DATA;
    }

    public String getGET_EYE_COLORS() {
        return GET_EYE_COLORS;
    }

    public String getGET_BLOOD_TYPES() {
        return GET_BLOOD_TYPES;
    }

    public String getPOST_UPDATE_PROTEGE() {
        return POST_UPDATE_PROTEGE;
    }
}
