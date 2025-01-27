package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[T_B]
case class CC_B[C](a: C, b: T_B) extends T_B

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_B Int Wildcard (CC_B T_B Wildcard Wildcard T_B) T_B)
// This is not matched: (CC_A Char Char Char Wildcard (T_A Char (T_A Boolean (Tuple Byte Int))))