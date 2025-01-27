package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, Byte], c: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B[D](a: CC_A[D], b: T_B) extends T_A[T_B, Byte]
case class CC_C[E](a: T_B) extends T_B
case class CC_D(a: CC_C[Byte], b: T_A[T_B, Byte], c: CC_A[T_B]) extends T_B

val v_a: CC_B[T_B] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_C(_)) => 0 
  case CC_B(_, CC_C(_)) => 1 
  case CC_B(_, CC_D(_, _, _)) => 2 
}
}
// This is not matched: (CC_B T_B
//      Wildcard
//      (CC_C (T_A (CC_D T_B T_B T_B T_B) Boolean) (CC_C T_B Wildcard T_B) T_B)
//      (T_A T_B Byte))
// This is not matched: Pattern match is empty without constants