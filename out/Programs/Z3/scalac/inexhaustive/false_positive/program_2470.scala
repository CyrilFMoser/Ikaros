package Program_30 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: T_A[F, Boolean]) extends T_A[E, D]
case class CC_B[G](a: T_B[G], b: G, c: T_A[G, Int]) extends T_B[G]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard (T_A Int Char))
// This is not matched: (CC_A Char Int Boolean Wildcard (T_A Int Char))