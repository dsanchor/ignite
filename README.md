# API de Operaciones de Cadenas

Esta API proporciona operaciones básicas de cadenas de texto como `concat`, `substring` y `contains`.

## Endpoints

### Concatenar dos cadenas

Une dos cadenas de texto.

**URL**: `/api/strings/concat`

**Método**: `GET`

**Parámetros de consulta**:

- `str1`: La primera cadena de texto.
- `str2`: La segunda cadena de texto.

**Ejemplo de curl**:

```bash
curl -G http://localhost:8080/api/strings/concat --data-urlencode "str1=Hello" --data-urlencode "str2=World"
```

### Obtener un substring

Devuelve un substring de la cadena de texto proporcionada.

**URL**: `/api/strings/substring`

**Método**: `GET`

**Parámetros de consulta**:

- `str`: La cadena de texto.
- `beginIndex`: El índice inicial (incluido).
- `endIndex`: El índice final (excluido).

**Ejemplo de curl**:

```bash
curl -G http://localhost:8080/api/strings/substring --data-urlencode "str=HelloWorld" --data-urlencode "beginIndex=0" --data-urlencode "endIndex=5"
```

### Verificar si una cadena contiene un substring

Verifica si la cadena de texto contiene el substring proporcionado.

**URL**: `/api/strings/contains`

**Método**: `GET`

**Parámetros de consulta**:

- `str`: La cadena de texto.
- `substr`: El substring.

**Ejemplo de curl**:

```bash
curl -G http://localhost:8080/api/strings/contains --data-urlencode "str=HelloWorld" --data-urlencode "substr=World"
```

Recuerda reemplazar `localhost:8080` con la dirección y el puerto donde se está ejecutando tu aplicación.
