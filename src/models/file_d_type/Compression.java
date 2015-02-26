package models.file_d_type;

/**
 * Created by TheApexGibsons on 2/26/2015.
 */
public class Compression {
    private Integer ID;
    public static final String LOSSLESS = "lossless";
    public static final String LOSSY = "lossy";

    private String codec_creator_app;
    private String codec_create_app_version;
    private String codec_name;
    private String codec_quality;

    public Compression(Integer ID, String codec_creator_app, String codec_create_app_version, String codec_name, String codec_quality) {
        this.ID = ID;
        this.codec_creator_app = codec_creator_app;
        this.codec_create_app_version = codec_create_app_version;
        this.codec_name = codec_name;
        this.codec_quality = codec_quality;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCodec_creator_app() {
        return codec_creator_app;
    }

    public void setCodec_creator_app(String codec_creator_app) {
        this.codec_creator_app = codec_creator_app;
    }

    public String getCodec_create_app_version() {
        return codec_create_app_version;
    }

    public void setCodec_create_app_version(String codec_create_app_version) {
        this.codec_create_app_version = codec_create_app_version;
    }

    public String getCodec_name() {
        return codec_name;
    }

    public void setCodec_name(String codec_name) {
        this.codec_name = codec_name;
    }

    public String getCodec_quality() {
        return codec_quality;
    }

    public void setCodec_quality(String codec_quality) {
        this.codec_quality = codec_quality;
    }
}
