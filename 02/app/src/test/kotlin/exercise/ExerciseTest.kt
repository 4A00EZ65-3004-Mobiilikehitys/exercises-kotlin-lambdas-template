package exercise

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.nio.file.Paths

class FetchTabsFromFilesTest {
    private val testFolderPath = "src/main/resources/testFiles"

    @BeforeEach
    fun setup() {
        // Create test files with tabs for testing
        val file1Content = "Line with\ttab"
        val file2Content = "No tabs here"
        Files.createDirectories(Paths.get(testFolderPath))
        Files.write(Paths.get("$testFolderPath/file1.txt"), file1Content.toByteArray(), StandardOpenOption.CREATE)
        Files.write(Paths.get("$testFolderPath/file2.txt"), file2Content.toByteArray(), StandardOpenOption.CREATE)
    }

    @Test
    fun testFetchTabsFromFiles() {
        val paths = arrayOf("$testFolderPath/file1.txt", "$testFolderPath/file2.txt")
        val result = fetchTabsFromFiles(paths)
        assertEquals("Line with____tab", result)
    }

    @Test
    fun testFetchTabsFromFilesNoTabs() {
        val paths = arrayOf("$testFolderPath/file2.txt")
        val result = fetchTabsFromFiles(paths)
        assertEquals("", result)
    }
}
