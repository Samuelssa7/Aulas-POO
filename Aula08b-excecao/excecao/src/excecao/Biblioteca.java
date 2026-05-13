package excecao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private Livro[] listaDeLivros;

    public Livro[] getListaDeLivros() {
        return listaDeLivros;
    }

    public void carregarCatalogo(String caminhoArquivo) {
        try {
			List<Livro> temp = new ArrayList<>();
			FileReader fr = new FileReader(caminhoArquivo);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				if (line.trim().isEmpty()) continue;
				String[] parts = line.split(",", -1);
				if (parts.length < 5) continue;
				String isbn = parts[0].trim();
				String titulo = parts[1].trim();
				String autor = parts[2].trim();
				int ano = Integer.parseInt(parts[3].trim());
				boolean disponivel = Boolean.parseBoolean(parts[4].trim());
				temp.add(new Livro(isbn, titulo, autor, ano, disponivel));
				listaDeLivros = temp.toArray(new Livro[0]);
			}
		} catch (IOException a) {
			System.out.println("IOException in Biblioteca.carregarCaralogo(): " + a.getMessage() );
		}

	}

	public boolean mudarDisponibilidade(String isbn, boolean disponivel) {
		if (listaDeLivros == null) {
			System.out.println("Catálogo vazio");
			return false;
		}
		for (Livro l : listaDeLivros) {
			if (l.getIsbn().equals(isbn)) {
				l.setDisponivel(disponivel);
				return true;
			}
		}
		System.out.println("Livro com ISBN " + isbn + " não encontrado");
		return false;
	}

	public boolean emprestarLivro(String isbn) {
		if (listaDeLivros == null) {
			System.out.println("Catálogo vazio");
			return false;
		}
		for (Livro l : listaDeLivros) {
			if (l.getIsbn().equals(isbn)) {
				if (!l.isDisponivel()) {
					System.out.println("Livro '" + l.getTitulo() + "' não está disponível");
					return false;
				}
				l.setDisponivel(false);
				return true;
			}
		}
		System.out.println("Livro com ISBN " + isbn + " não encontrado");
		return false;
	}

	public boolean devolverLivro(String isbn) {
		if (listaDeLivros == null) {
			System.out.println("Catálogo vazio");
			return false;
		}
		for (Livro l : listaDeLivros) {
			if (l.getIsbn().equals(isbn)) {
				l.setDisponivel(true);
				return true;
			}
		}
		System.out.println("Livro com ISBN " + isbn + " não encontrado");
		return false;
	}
}
