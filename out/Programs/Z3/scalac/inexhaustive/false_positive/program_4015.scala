package Program_15 

package Program_11 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Char (CC_A T_A (CC_A T_A (CC_A T_A Wildcard T_A) T_A) T_A) T_A)
// This is not matched: (CC_A (T_A Char Char) Char Wildcard Wildcard (T_A Char (T_A Char Char)))