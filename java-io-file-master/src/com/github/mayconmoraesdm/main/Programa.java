package com.github.mayconmoraesdm.main;

import com.github.mayconmoraesdm.classes.Aluno;
import com.github.mayconmoraesdm.classes.FileIO;


import java.io.IOException;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
       Aluno p1 = new Aluno("maycon", "m","50", "10");
        Aluno p2 = new Aluno("joao", "m","50", "14");
        Aluno p3 = new Aluno("maria", "f","50", "10");

        ArrayList<Aluno> listAlunos = new ArrayList<>();
        listAlunos.add(p1);
        listAlunos.add(p2);
        listAlunos.add(p3);

        try {
            FileIO.writer(listAlunos, "nota.txt");
            System.out.println("Arquivo gerado com sucesso!");
       } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ArrayList<Aluno> alunos = FileIO.reader("nota.txt");
            alunos.forEach(aluno -> {
                System.out.println(String.format("Nome: %s / Sexo: %s / nota1: %f / nota2: %f \n", aluno.getNome(), aluno.getSexo(),aluno.getNota1(),aluno.getNota2()));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
