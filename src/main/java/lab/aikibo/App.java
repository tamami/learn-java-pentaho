package lab.aikibo;

import lab.aikibo.simple.AbstractReportGenerator;
import lab.aikibo.simple.Contoh1;
import org.pentaho.reporting.engine.classic.core.ReportProcessingException;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ReportProcessingException
    {
        System.out.println( "Contoh 1 - cetak ke PDF" );

        final File outputFilename = new File(Contoh1.class.getSimpleName() + ".pdf");
        new Contoh1().generateReport(AbstractReportGenerator.OutputType.PDF, outputFilename);
        System.err.println("Generated the report [" + outputFilename.getAbsolutePath() + "]");
    }
}
