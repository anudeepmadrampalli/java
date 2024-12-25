/*
 * Task:

Create a program that:

Reads a list of integers from a file (e.g., "input.txt").
Calculates and prints:
The sum of all the integers.
The average of the integers.
The median of the integers.
The number of occurrences of each unique integer.
Writes the results to another file (e.g., "output.txt").
Key Considerations:

Use Java 21 features:
Records: Represent the results of the calculations as a record for better readability and maintainability.
Text Blocks: Use text blocks for improved readability of multi-line output.
Pattern Matching for instanceof: Utilize pattern matching for instanceof to simplify type checks.
Sealed Interfaces: (If applicable) If you're defining any custom interfaces, consider using sealed interfaces to restrict which classes can implement them.
Handle potential exceptions:
IOException: Handle potential exceptions during file reading and writing.
NumberFormatException: Handle potential exceptions if the input file contains invalid data.
Consider using streams: Leverage the power of Java streams for efficient data processing.
 * 
 */


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DataAnalyzer {

    public record AnalysisResults(
            int sum,
            double average,
            double median,
            Map<Integer, Long> occurrences
    ) {}

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            List<Integer> numbers = readNumbersFromFile(inputFile);
            AnalysisResults results = analyzeData(numbers);
            writeResultsToFile(results, outputFile);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error processing data: " + e.getMessage());
        }
    }

    // ... implementation of readNumbersFromFile, analyzeData, writeResultsToFile ...

    public static List<Integer> readNumbersFromFile(String inputFile) throws IOException{

        List<Integer> numbers = new ArrayList<>();
        try {
            Files.readAllLines(new File(inputFile).toPath())
            .stream()
            .flatMap(line -> line.lines()) // Splits the line into separate numbers if needed
                 .map(String::strip)           // Trim whitespace
                 .filter(line -> !line.isEmpty()) // Ignore empty lines
                 .mapToInt(Integer::parseInt) // Convert each line to an integer
                 .forEach(numbers::add);

        } catch (IOException e) {
            throw new IOException("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number format: " + e.getMessage());
        }
        numbers.forEach(System.out::println);
        return numbers;
    }

    public static AnalysisResults analyzeData( List<Integer> numbers) throws NumberFormatException{
        // TODO - Implement
        return null;
    }

    public static void writeResultsToFile(AnalysisResults results,  String outputFile){
        // TODO - Implement
    }

}