package models.file_d_type;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by TheApexGibsons on 2/26/2015.
 */
public class MessageDigest {
    private Integer ID;

    private LocalDateTime date_time;
    private String algorithm;
    private String hex_digest;

    public MessageDigest(Integer ID, LocalDateTime date_time, String algorithm, String hex_digest) {
        this.ID = ID;
        this.date_time = date_time;
        this.algorithm = algorithm;
        this.hex_digest = hex_digest;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public LocalDateTime getDate_time() {
        return date_time;
    }

    public void setDate_time(LocalDateTime date_time) {
        this.date_time = date_time;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getHex_digest() {
        return hex_digest;
    }

    public void setHex_digest(String hex_digest) {
        this.hex_digest = hex_digest;
    }
}
