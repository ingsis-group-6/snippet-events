package snippet.events

data class LintResultEvent(
    val lintedSnippetId: String,
    val status: String
)
