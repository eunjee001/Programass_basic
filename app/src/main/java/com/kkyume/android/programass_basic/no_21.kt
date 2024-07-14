class no_21 {
    fun solution(s: String): String {
        var answer = ""
        val split = s.split(" ")
        var capitalizedWords : List<String>


        capitalizedWords = split.map { word ->
            if (word.isNotEmpty() && word[0].isLetter()) {
                word.lowercase().replaceFirstChar { it.uppercase() }
            } else {
                word.lowercase()

            }
        }
        answer = capitalizedWords.joinToString(" ")

        return answer
    }
}