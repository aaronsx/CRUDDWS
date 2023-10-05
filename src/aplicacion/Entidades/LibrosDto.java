package aplicacion.Entidades;
/**
 * Entidad que contiene el catálogo de libros
 * @author ASMP-28/09/2023
 */
public class LibrosDto {
	
		//Atributos
		private long idLibro;
		private String titulo;
		private String autor;
		private String isbn;
		private int edicion;
		
		//Getters y setters

		public long getIdLibro() {
			return idLibro;
		}

		public void setIdLibro(long idLibro) {
			this.idLibro = idLibro;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public int getEdicion() {
			return edicion;
		}

		public void setEdicion(int edicion) {
			this.edicion = edicion;
		}

		@Override
		public String toString() {
			return "librosDto [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn
					+ ", edicion=" + edicion + "]";
		}
}
