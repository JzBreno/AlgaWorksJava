package Arrays.miniprojetoarrays.controller;

import Arrays.miniprojetoarrays.model.Professor;
import Arrays.miniprojetoarrays.model.Turma;

import java.util.ArrayList;
import java.util.logging.Logger;

public class TurmaService {

    static Logger logger = Logger.getLogger(TurmaService.class.getName());
    private TurmaService(){}

    public static ArrayList<Professor> validaQuantidadeProfessores(ArrayList<Professor> professores, Professor novoProfessor){
        if(professores.size() <= Turma.MAX_PROFESSORES){
            professores.add(novoProfessor);
        }else{
            logger.info("Ja existem"+Turma.MAX_PROFESSORES+" professores cadastrados na turma");
        }
        return professores;
    }

}
