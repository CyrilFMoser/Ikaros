package Program_15 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: D, b: D, c: D) extends T_A[C]
case class CC_B(a: T_A[Int], b: Char, c: T_A[Byte]) extends T_A[CC_A[Char, Byte]]
case class CC_C() extends T_A[CC_A[Char, Byte]]
case class CC_D[E](a: T_A[E]) extends T_B[E]
case class CC_E[F](a: CC_A[F, F], b: CC_A[F, F], c: F) extends T_B[F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Byte Wildcard Wildcard Byte (T_A Boolean))
// This is not matched: Pattern match is empty without constants