package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Char (CC_B Char (T_A Char)) Wildcard (T_A Char))