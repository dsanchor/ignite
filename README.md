# API de operaciones de cadena de texto

Esta API proporciona tres operaciones básicas en cadenas de texto: `concat`, `substring` y `contains`.

## Endpoints

### Concat

Este endpoint concatena dos cadenas de texto.

**URL**: `/api/strings/concat`

**Método**: `GET`

**Parámetros de consulta**:

- `str1`: La primera cadena de texto.
- `str2`: La segunda cadena de texto.

**Ejemplo de curl**:

```bash
curl -G http://localhost:8080/api/strings/concat --data-urlencode "str1=Hello" --data-urlencode "str2=World"
```

### Substring

Este endpoint devuelve un substring de la cadena de texto proporcionada.

**URL**: `/api/strings/substring`

**Método**: `GET`

**Parámetros de consulta**:

- `str`: La cadena de texto.
- `beginIndex`: El índice inicial (incluido).
- `endIndex`: El índice final (excluido).

**Ejemplo de curl**:

```bash
curl -G http://localhost:8080/api/strings/substring --data-urlencode "str=Hello World" --data-urlencode "beginIndex=6" --data-urlencode "endIndex=11"
```
