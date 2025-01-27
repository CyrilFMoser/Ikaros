package Program_13 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[T_B]
case class CC_B[C](a: C, b: T_B) extends T_B

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
  case CC_B(12, CC_B(_, _)) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Char Char Char Wildcard (T_A Char (T_A Boolean (Tuple Byte Int))))