package models.file_d_type;

import javafx.beans.InvalidationListener;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.math.BigDecimal;

/**
 * Created by TheApexGibsons on 2/23/2015.
 */
public class FileData {
    public static final int LM_ENDIAN = 0;
    public static final int ML_ENDIAN = 1;
    public static final int M_ENDIAN = 2;

    public static final String BW = "B&W";
    public static final String COLOR = "Color";
    public static final String GRAYSCALE = "Grayscale";
    public static final String BW_W_GRAYS_SEQ = "B&W with grayscale sequences";
    public static final String BW_W_COLOR_SEQ = "B&W with color sequences";
    public static final String GS_W_BW_SEQ = "Grayscale with B&W sequences";
    public static final String FS_W_CLR_SEQ = "Grayscale with color sequences";
    public static final String CLR_W_BW_SEQ = "Color with B&W sequences";
    public static final String CLR_W_GS_SEQ = "Color with grayscale sequences";
    public static final String OTHER = "Other";

    private ObjectProperty<Tracking> tracking;
    private ObjectProperty<BigDecimal> duration;
    private StringProperty language;
    private StringProperty security;
    private LongProperty size;
    private IntegerProperty data_rate;
    private StringProperty timecode;
    private StringProperty use;
    private StringProperty other_use;
    private IntegerProperty bits_per_sample;
    private IntegerProperty byte_order;
    private StringProperty color;
    private StringProperty other_color;
    private ObjectProperty<MessageDigest> message_digest;
    private ObjectProperty<Compression> compression;
    private ObjectProperty<Track> track;
    private StringProperty data_rate_unit;
    private ObjectProperty<Enum> data_rate_mode;
    private ObjectProperty<Frame> frame;
    private ObjectProperty<FrameRate> frame_rate;
    private ObjectProperty<SampleRate> sample_rate;
    private StringProperty location;
    private ObjectProperty<FormatType> format;
    private StringProperty sampling;
    private StringProperty signalFormat;
    private StringProperty sound;







}
