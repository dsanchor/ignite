# Documentación de la API de Strings

Esta API proporciona operaciones básicas de manipulación de cadenas de texto.

## Endpoints

### Concatenar dos cadenas

- **URL**: `/api/strings/concat`
- **Método**: `GET`
- **Parámetros de consulta**:
  - `str1`: La primera cadena para concatenar.
  - `str2`: La segunda cadena para concatenar.
- **Ejemplo de uso con curl**:

```bash
curl -G http://localhost:8080/api/strings/concat --data-urlencode "str1=Hello" --data-urlencode "str2=World"
```

### Obtener un substring

- **URL**: `/api/strings/substring`
- **Método**: `GET`
- **Parámetros de consulta**:
  - `str`: La cadena de la que obtener el substring.
  - `beginIndex`: El índice inicial del substring.
  - `endIndex`: El índice final del substring.
- **Ejemplo de uso con curl**:

```bash
curl -G http://localhost:8080/api/strings/substring --data-urlencode "str=HelloWorld" --data-urlencode "beginIndex=0" --data-urlencode "endIndex=5"
```

### Verificar si una cadena contiene un substring

- **URL**: `/api/strings/contains`
