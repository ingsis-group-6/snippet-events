package snippet.events.lint

import snippet.events.lint.rules.LinterRules
import java.util.UUID

data class LintRequestEvent(
    val snippetId: UUID,
    val snippetContent: String,
    val rules: LinterRules
)