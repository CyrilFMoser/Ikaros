package Program_14 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, Int]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: CC_A[E], c: T_A[E]) extends T_A[T_A[(Byte,Byte)]]
case class CC_C[F](a: F, b: CC_B[F]) extends T_B[T_A[Int], F]
case class CC_D[G](a: G, b: G) extends T_B[T_A[Int], G]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C('x', CC_B(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B T_A)