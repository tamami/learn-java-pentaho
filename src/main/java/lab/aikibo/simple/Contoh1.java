package lab.aikibo.simple;


import org.pentaho.reporting.engine.classic.core.DataFactory;
import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.libraries.resourceloader.Resource;
import org.pentaho.reporting.libraries.resourceloader.ResourceException;
import org.pentaho.reporting.libraries.resourceloader.ResourceManager;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tamami on 21/11/16.
 */
public class Contoh1 extends AbstractReportGenerator {

    public Contoh1() {}

    public MasterReport getReportDefinition() {
        try {
            final ClassLoader classLoader = this.getClass().getClassLoader();
            final URL reportDefinitionURL = classLoader.getResource("./refKelurahan.prpt");


            System.out.println("DISINI -> " + classLoader.getResource("./refKelurahan.prpt"));
            final ResourceManager resourceManager = new ResourceManager();
            final Resource directly = resourceManager.createDirectly(reportDefinitionURL, MasterReport.class);
            return (MasterReport) directly.getResource();
        } catch(ResourceException e) {
            e.printStackTrace();
        }
        return null;
    }

    public DataFactory getDataFactory() {
        return null;
    }

    public Map<String, Object> getReportParameters() {
        final Map parameters = new HashMap<String, Object>();
        parameters.put("kdKecamatan", "010");
        return parameters;
    }

}
