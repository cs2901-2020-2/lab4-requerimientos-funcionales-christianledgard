package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part){
        StringBuilder result = new StringBuilder();
        result.append(part.get(0));

        for (int i = 1; i < part.size(); i++) {
            String elementoDeLista = part.get(i);
            StringBuilder sumOfChars = new StringBuilder();

            for (int j = 0; j < elementoDeLista.length(); j++){
                char c = elementoDeLista.charAt(j);
                String cStr = Character.toString(c);
                sumOfChars.append(cStr);

                if(!(result.toString()).contains(sumOfChars)){
                    result.append(cStr);
                }
            }
        }
        return result.toString();
    }
}
