package techServ;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import domain.BlockSection;

public class BlockSectionDA {
    public BlockSectionDA() throws FileNotFoundException{
        Scanner blockSectionInfo = new Scanner(
                new FileReader("C:\\Users\\Sakina Abad\\IdeaProjects\\oop_aggregationAbad\\src\\blockSection.csv"));

        String rowBlockSection = new String();
        while(blockSectionInfo.hasNext()) {
            rowBlockSection = blockSectionInfo.nextLine();

            String[] rowBlockSectionSpecific = new String[3];

            rowBlockSectionSpecific = rowBlockSection.split(",");
            BlockSection blockSection = new BlockSection();

            blockSection.setBlockCode(rowBlockSectionSpecific[0].trim());
            blockSection.setDescription(rowBlockSectionSpecific[1].trim());
            blockSection.setAdviser(rowBlockSectionSpecific[2].trim());

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            blockSection.setStudentList(studentDA.getStudentList());
            System.out.println(blockSection);
        }
        blockSectionInfo.close();

    }
}
