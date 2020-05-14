package com.github.mayconmoraesdm.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileIO {

    public static void writer(List<Aluno> alunos, String nota) throws IOException {
        // BufferedWritter (escreve) --> FileWritter (aponta para o arquivo no hd)
        FileWriter fileWriter = new FileWriter(nota);
        // try with resources
        try (BufferedWriter writer = new BufferedWriter(fileWriter)){
            // forma uma lista de string linha a linha para salvar no arquivo
            List<String> dados = alunos.stream().map(aluno -> String.format("%s;%f;%f;%s\n", aluno.getNome(), aluno.getNota1(), aluno.getNota2(), aluno.getSexo())).collect(Collectors.toList());
            // intera linha a linha
            for (String linha : dados) {
                writer.write(linha);
            }
        }
    }

    public static ArrayList<Aluno> reader(String nota) throws IOException {
        ArrayList<Aluno> alunos = new ArrayList<>();
        FileReader fileReader = new FileReader(nota);
        try (BufferedReader reader = new BufferedReader(fileReader)){
            String dado = "";
            while ((dado = reader.readLine()) != null) {
                String[] linha = dado.split(";");
                Aluno a = new Aluno(linha[0],linha[1],linha[2],linha[3]);
                alunos.add(a);
            }
        }
        return alunos;
    }
}
