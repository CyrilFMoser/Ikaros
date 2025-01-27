package Program_30 

object Test {
sealed trait T_B[C]
case class CC_B[E](a: E) extends T_B[E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Char
//      Char
//      (CC_A Char Char (T_A Char Char))
//      Wildcard
//      (CC_A Char Char (T_A Char Char))
//      (T_A Char Char))