package obligatorio.exceptions;

import java.io.Serializable;

public class PersistenciaException  extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;

	public PersistenciaException(String msj)
	{
		super(msj);
	}
}
