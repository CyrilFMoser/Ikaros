package Program_15 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[C], b: T_B, c: (T_B,T_B)) extends T_A[B]
case class CC_B[D](a: T_A[D], b: D) extends T_A[D]
case class CC_C(a: CC_A[T_B, (Boolean,Byte)]) extends T_B

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(CC_A(_, _, _), 0) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_C Wildcard T_A)