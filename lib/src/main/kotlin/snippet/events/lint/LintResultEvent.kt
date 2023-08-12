package snippet.events.lint

import java.util.UUID

data class LintResultEvent(
    val snippetId: UUID,
    val status: LintResultStatus
)

enum class LintResultStatus {
    COMPLIANT,
    NON_COMPLIANT,
    PENDING
}