package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: CC_A[Int], b: CC_A[Char], c: T_A[Byte]) extends T_A[T_A[(Int,Boolean)]]
case class CC_C[E, F]() extends T_B[F, E]
case class CC_D[G](a: CC_A[G]) extends T_B[T_B[CC_B, (Byte,Int)], G]
case class CC_E[H, I](a: H, b: CC_A[H], c: T_B[I, CC_B]) extends T_B[CC_D[H], H]

val v_a: T_B[CC_D[Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E(_, _, CC_C()) => 1 
  case CC_E(_, _, _) => 2 
  case CC_E(_, _, CC_D(_)) => 3 
}
}
// This is not matched: (CC_E Boolean
//      Boolean
//      Wildcard
//      (CC_A Boolean (T_A Boolean))
//      Wildcard
//      (T_B (CC_D Boolean Boolean Boolean) Boolean))
// This is not matched: (CC_B Char (CC_B Char Wildcard (T_A Char)) (T_A Char))