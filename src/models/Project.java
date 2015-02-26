package models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.nio.file.Path;
import java.time.LocalDate;

/**
 * Created by Jeremy Gibson on 2/21/2015.
 */
public class Project {
    private ObjectProperty<Path> transfer_path;
    private ObjectProperty<Path> output_path;
    private ObjectProperty<Path> bag_path;
    private StringProperty project_name;
    private StringProperty transfer_agent;
    private StringProperty transfer_hierarchy;
    private ObjectProperty<LocalDate> transfer_date;
    private ObjectProperty<LocalDate> inclusive_begin;
    private ObjectProperty<LocalDate> inclusive_end;

    public Project(Path transfer_path, Path output_path, Path bag_path, String project_name, String transfer_agent,
                   String transer_hierarchy, LocalDate transfer_date, LocalDate inclusive_begin, LocalDate inclusive_end) {
        this.transfer_path = new SimpleObjectProperty<Path>(transfer_path);
        this.output_path = new SimpleObjectProperty<Path>(output_path);
        this.bag_path = new SimpleObjectProperty<Path>(bag_path);
        this.project_name = new SimpleStringProperty(project_name);
        this.transfer_agent = new SimpleStringProperty(transfer_agent);
        this.transfer_hierarchy = new SimpleStringProperty(transer_hierarchy);
        this.transfer_date = new SimpleObjectProperty<LocalDate>(transfer_date);
        this.inclusive_begin = new SimpleObjectProperty<LocalDate>(inclusive_begin);
        this.inclusive_end = new SimpleObjectProperty<LocalDate>(inclusive_end);
    }

    //<editor-fold desc="Getters">
    public Path getTransfer_path() {
        return transfer_path.get();
    }

    public ObjectProperty<Path> transfer_pathProperty() {
        return transfer_path;
    }

    public Path getOutput_path() {
        return output_path.get();
    }

    public ObjectProperty<Path> output_pathProperty() {
        return output_path;
    }

    public Path getBag_path() {
        return bag_path.get();
    }

    public ObjectProperty<Path> bag_pathProperty() {
        return bag_path;
    }

    public String getProject_name() {
        return project_name.get();
    }

    public StringProperty project_nameProperty() {
        return project_name;
    }

    public String getTransfer_agent() {
        return transfer_agent.get();
    }

    public StringProperty transfer_agentProperty() {
        return transfer_agent;
    }

    public String getTransfer_hierarchy() {
        return transfer_hierarchy.get();
    }

    public StringProperty transfer_hierarchyProperty() {
        return transfer_hierarchy;
    }

    public LocalDate getTransfer_date() {
        return transfer_date.get();
    }

    public ObjectProperty<LocalDate> transfer_dateProperty() {
        return transfer_date;
    }

    public LocalDate getInclusive_begin() {
        return inclusive_begin.get();
    }

    public ObjectProperty<LocalDate> inclusive_beginProperty() {
        return inclusive_begin;
    }

    public LocalDate getInclusive_end() {
        return inclusive_end.get();
    }

    public ObjectProperty<LocalDate> inclusive_endProperty() {
        return inclusive_end;
    }
    //</editor-fold>

    //<editor-fold desc="Setters">
    public void setTransfer_path(Path transfer_path) {
        this.transfer_path.set(transfer_path);
    }

    public void setOutput_path(Path output_path) {
        this.output_path.set(output_path);
    }

    public void setBag_path(Path bag_path) {
        this.bag_path.set(bag_path);
    }

    public void setProject_name(String project_name) {
        this.project_name.set(project_name);
    }

    public void setTransfer_agent(String transfer_agent) {
        this.transfer_agent.set(transfer_agent);
    }

    public void setTransfer_hierarchy(String transfer_hierarchy) {
        this.transfer_hierarchy.set(transfer_hierarchy);
    }

    public void setTransfer_date(LocalDate transfer_date) {
        this.transfer_date.set(transfer_date);
    }

    public void setInclusive_begin(LocalDate inclusive_begin) {
        this.inclusive_begin.set(inclusive_begin);
    }

    public void setInclusive_end(LocalDate inclusive_end) {
        this.inclusive_end.set(inclusive_end);
    }
    //</editor-fold>
}
