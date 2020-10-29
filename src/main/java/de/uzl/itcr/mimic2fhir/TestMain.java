package de.uzl.itcr.mimic2fhir;

import de.uzl.itcr.mimic2fhir.work.Config;

public class TestMain {

    public static void main( String[] args ){
        //Add server and config data..
        Config configObj = new Config();

        //Postgres
        configObj.setPassPostgres("MimicMimic4");
        configObj.setPortPostgres("5432");
        configObj.setUserPostgres("behrend");
        configObj.setPostgresServer("141.83.20.95");
        configObj.setDbnamePostgres("mimic");
        configObj.setSchemaPostgres("mimiciii");

        //Fhir
        configObj.setFhirServer("http://yourfhirserver.com/public/base/");
        configObj.setFhirxmlFilePath("C:\\MimicOutput");

        Mimic2Fhir app = new Mimic2Fhir();
        app.setConfig(configObj);
        app.setOutputMode(OutputMode.PRINT_FILE);
        app.setTopPatients(100);
        app.start();

    }

}
