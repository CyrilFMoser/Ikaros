package Program_31 

package Program_10 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: A, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(CC_A(_)) => 1 
  case CC_B(_, CC_A(_)) => 2 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard
//      (CC_A (Tuple Int Char) Byte Wildcard (T_A (Tuple Int Char)))
//      Wildcard
//      T_B)