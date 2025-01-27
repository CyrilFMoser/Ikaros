package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte, b: Boolean, c: T_A[D, D]) extends T_A[C, T_A[(Boolean,Char), Int]]

val v_a: T_A[Int, T_A[(Boolean,Char), Int]] = null
val v_b: Int = v_a match{
  case CC_A(0, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_A Int
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int (T_A (Tuple Boolean Char) Int)))
// This is not matched: (CC_D (CC_B T_A T_A) (T_B (CC_B T_A T_A)))