package models;

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
    private ObjectProperty<Enum> byte_order;
    private ObjectProperty<Enum> color;
    private StringProperty other_color;
    private StringProperty message_digest;
    private ObjectProperty<Compression> compression;
    private ObjectProperty<Track> track;
    private StringProperty data_rate_unit;
    private ObjectProperty<Enum> data_rate_mode;
    private ObjectProperty<Frame> frame;





}
