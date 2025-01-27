package Program_13 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[(Boolean,Int)]
case class CC_B[E](a: Byte, b: T_A[E], c: T_B[E, E]) extends T_B[E, CC_A[E]]
case class CC_C[F](a: Char, b: F, c: F) extends T_B[T_A[F], F]

val v_a: T_A[(Boolean,Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (Tuple Boolean Int)))
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (Tuple Boolean Int)))