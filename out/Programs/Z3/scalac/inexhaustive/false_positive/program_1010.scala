package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, Int], b: T_A[D, D], c: T_A[D, C]) extends T_A[D, C]

val v_a: CC_A[Int, Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_A Int
//      Int
//      Boolean
//      (CC_A Int Int Boolean Wildcard Wildcard Wildcard (T_A Int Int))
//      Wildcard
//      Wildcard
//      (T_A Int Int))
// This is not matched: (CC_C Wildcard (CC_B Int (CC_B Wildcard Wildcard T_A) T_A) T_A)