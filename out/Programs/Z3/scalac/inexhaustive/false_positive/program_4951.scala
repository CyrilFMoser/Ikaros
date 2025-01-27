package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, D]) extends T_A[C, D]
case class CC_B[F, G]() extends T_A[F, G]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Byte Int Boolean Wildcard (T_A Int Byte))
// This is not matched: (CC_B Wildcard (T_A T_B))