package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: D) extends T_A[T_B[Int, Boolean]]
case class CC_B(a: CC_A[(Boolean,Boolean)], b: T_B[Char, (Int,Char)], c: T_A[Char]) extends T_A[T_B[Int, Boolean]]

val v_a: T_A[T_B[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, _) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_B Int Boolean)))
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)