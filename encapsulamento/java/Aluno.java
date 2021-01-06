Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@maikolmr 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


gilsonpcf
/
poo
0
0
1
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
poo/encapsulamento/java/Aluno.java /
@gilsonpcf
gilsonpcf Add files via upload
Latest commit 8f5ba4c on 28 Mar 2019
 History
 1 contributor
57 lines (47 sloc)  1.19 KB
  
// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Encapsulamento em Java
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Aluno {
	private String nome;
	private int idade;
	private String turma;
	private String dataMatricula;

	public Aluno() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		dataMatricula = dateFormat.format(date);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
		defineTurma();
	}

	public int getIdade() {
		return this.idade;
	}

	public String getTurma() {
		return this.turma;
	}

	public String getDataMatricula() {
		return this.dataMatricula;
	}

	private void defineTurma() {
		if (this.idade < 18)
			this.turma = "adolescente";
		else if (this.idade < 40)
			this.turma = "jovem";
		else if (this.idade < 60)
			this.turma = "adulto";
		else
			this.turma = "idoso";
	}
}
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
