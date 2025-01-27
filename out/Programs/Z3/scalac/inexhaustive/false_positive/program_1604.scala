package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[G, F, H](a: G, b: T_B[G]) extends T_A[G, F]
case class CC_C[I](a: T_A[I, I]) extends T_B[I]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_B(12, _) => 2 
}
}
// This is not matched: (CC_B Int Int Boolean Wildcard (CC_C Int Wildcard (T_B Int)) (T_A Int Int))
// This is not matched: Pattern match is empty without constants