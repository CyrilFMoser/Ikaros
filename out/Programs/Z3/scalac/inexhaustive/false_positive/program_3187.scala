package Program_15 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte) extends T_A[T_B[Int]]
case class CC_B(a: T_B[Int], b: Boolean, c: CC_A[Byte]) extends T_B[CC_A[Char]]
case class CC_C[D](a: CC_B, b: (CC_B,CC_B)) extends T_B[CC_A[Char]]
case class CC_D(a: CC_B, b: CC_C[CC_B]) extends T_B[CC_A[Char]]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_B Int)))
// This is not matched: (CC_B Boolean Int Wildcard Wildcard (T_A Boolean Int))