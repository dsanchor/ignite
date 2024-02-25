package com.microsoft.ignite.demogh;

import org.springframework.http.ResponseEntity; // Import the ResponseEntity class
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringOperationsController {

    @GetMapping("/concat")
    public ResponseEntity<String> concat(@RequestParam String str1, @RequestParam String str2) {
        System.out.println("Received request to concatenate strings: str1=" + str1 + ", str2=" + str2);

        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()) {
            System.out.println("Invalid input parameters: str1=" + str1 + ", str2=" + str2);
            return ResponseEntity.badRequest().body("Los parámetros no pueden ser nulos o vacíos");
        }

        String result = str1.concat(str2);
        System.out.println("Concatenation result: " + result);

        return ResponseEntity.ok(result);
    }

    @GetMapping("/substring")
    public ResponseEntity<String> substring(@RequestParam String str, @RequestParam int beginIndex,
            @RequestParam int endIndex) {
        System.out.println("Received request to extract substring: str=" + str + ", beginIndex=" + beginIndex
                + ", endIndex=" + endIndex);

        if (str == null || str.isEmpty()) {
            System.out.println("Invalid input parameter: str=" + str);
            return ResponseEntity.badRequest().body("El parámetro 'str' no puede ser nulo o vacío");
        }

        if (beginIndex < 0 || endIndex > str.length() || beginIndex > endIndex) {
            System.out.println("Invalid substring indices: beginIndex=" + beginIndex + ", endIndex=" + endIndex);
            return ResponseEntity.badRequest().body("Los índices de subcadena son inválidos");
        }

        String result = str.substring(beginIndex, endIndex);
        System.out.println("Substring result: " + result);

        return ResponseEntity.ok(result);
    }

    @GetMapping("/contains")
    public ResponseEntity<Boolean> contains(@RequestParam String str, @RequestParam String substr) {
        System.out.println("Received request to check if string contains substring: str=" + str + ", substr=" + substr);

        if (str == null || str.isEmpty() || substr == null || substr.isEmpty()) {
            System.out.println("Invalid input parameters: str=" + str + ", substr=" + substr);
            return ResponseEntity.badRequest().body(false);
        }

        boolean result = str.contains(substr);
        System.out.println("Contains result: " + result);

        return ResponseEntity.ok(result);
    }

    // reemplazar cadenas
    @GetMapping("/replace")
    public ResponseEntity<String> replace(@RequestParam String str, @RequestParam String oldStr,
            @RequestParam String newStr) {
        System.out.println(
                "Received request to replace substring: str=" + str + ", oldStr=" + oldStr + ", newStr=" + newStr);

        if (str == null || str.isEmpty() || oldStr == null || oldStr.isEmpty() || newStr == null) {
            System.out.println("Invalid input parameters: str=" + str + ", oldStr=" + oldStr + ", newStr=" + newStr);
            return ResponseEntity.badRequest().body("Los parámetros no pueden ser nulos o vacíos");
        }

        String result = str.replace(oldStr, newStr);
        System.out.println("Replace result: " + result);

        return ResponseEntity.ok(result);
    }

}
