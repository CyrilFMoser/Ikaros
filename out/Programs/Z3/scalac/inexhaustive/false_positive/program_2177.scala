package Program_28 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: B, b: T_A[B]) extends T_A[B]
case class CC_B() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A(0, CC_A(_, _)) => 2 
  case CC_A(_, _) => 3 
}
}
// This is not matched: (CC_A Byte T_B Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_B Char (T_B Char (Tuple T_A (CC_A T_A T_A T_A))))