package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: T_B[F]) extends T_A[E, D]
case class CC_B[G](a: CC_A[G, G, G], b: T_B[G], c: CC_A[Int, G, G]) extends T_A[T_A[G, G], G]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Char Boolean Wildcard (T_A Char Int))
// This is not matched: (CC_A Int Char Boolean Wildcard (T_A Char Int))