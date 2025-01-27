package Program_14 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: B) extends T_A[B]
case class CC_B[C, D](a: T_A[D]) extends T_A[C]
case class CC_C[E](a: E, b: T_A[E], c: T_A[E]) extends T_A[E]

val v_a: CC_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_B(CC_C(_, _, _)) => 1 
}
}
// This is not matched: (CC_B Int Int (CC_B Int Boolean Wildcard (T_A Int)) (T_A Int))
// This is not matched: Pattern match is empty without constants