Feature: This test case is for test the use of the wikipedia
  I like user
  Want test the wikipedia
  For access to the better consults in the world

  Scenario Outline: Search a word in to the Wikipedia
    Given the user open the wikipedia
    When it is enter a word in the finder
      | word   |
      | <word> |
    Then can see the word in the heading
      | resultWord   |
      | <resultWord> |

    Examples:
      | word     | resultWord |
      | Colombia | Colombia   |