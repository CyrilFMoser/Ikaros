package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: CC_A[E]) extends T_A[E]
case class CC_C[F, G](a: CC_B[Int]) extends T_A[F]
case class CC_D[H]() extends T_B[(Int,Char), H]
case class CC_E(a: CC_A[Byte], b: T_B[Byte, Byte], c: T_A[Int]) extends T_B[(Int,Char), T_A[Char]]
case class CC_F[I](a: I, b: I, c: CC_D[CC_E]) extends T_B[(Int,Char), I]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_C Boolean (T_A Boolean) Wildcard (T_A Boolean))
// This is not matched: (CC_E T_B)