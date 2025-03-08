package ui;
import techServ.BlockSectionDA;

import java.io.FileNotFoundException;

public class COMReportVersion2 {
    public COMReportVersion2() throws FileNotFoundException {
        BlockSectionDA blockSectionDA = new BlockSectionDA();
    }
    public static void main(String[] args) throws FileNotFoundException {
        new COMReportVersion2();
    }
}
