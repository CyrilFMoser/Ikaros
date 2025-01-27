package Program_29 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, E], b: T_B[Int, F], c: T_B[F, E]) extends T_A[Byte, E]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard Wildcard (T_A Byte Int))
// This is not matched: (CC_C T_A Wildcard (T_B (T_B (CC_A T_A))))