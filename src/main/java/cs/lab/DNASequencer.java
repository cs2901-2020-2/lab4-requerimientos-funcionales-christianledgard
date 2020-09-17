package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> parts) throws SubSequenceLenEx, SubSequenceSizeEx{

        for (String item : parts) {
            if(item.length() > 200){
                throw new SubSequenceLenEx("The lenght of a subsequence is too large.");
            }
        }

        if(parts.size()>160000) throw new SubSequenceSizeEx("Too many subsequences.");

        StringBuilder result = new StringBuilder();
        result.append(parts.get(0));

        for (int i = 1; i < parts.size(); i++) {
            String elementoDeLista = parts.get(i);
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
