package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_A[Int]]
case class CC_B[E, F](a: F, b: CC_A[E], c: T_A[F]) extends T_B[E, F]
case class CC_C[G]() extends T_B[((Boolean,Boolean),Int), G]
case class CC_D[I, H](a: CC_A[I], b: Char) extends T_B[H, I]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Int)))
// This is not matched: (CC_C Wildcard T_A)