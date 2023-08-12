package snippet.events.lint.rules

data class LinterRules(
    val caseConvention: CaseConvention,
    val printExpressionsEnabled: Boolean
)

enum class CaseConvention {
    CAMEL_CASE,
    SNAKE_CASE

}
