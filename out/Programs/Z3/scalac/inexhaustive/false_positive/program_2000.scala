package Program_27 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[Int]) extends T_A[Int]
case class CC_B[D](a: T_B[D], b: T_A[Int], c: CC_A[D]) extends T_B[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Int))
// This is not matched: Pattern match is empty without constants