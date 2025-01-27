package Program_13 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[Char, D]
case class CC_B[E, F](a: T_A[F, E]) extends T_A[F, E]
case class CC_C[G, H](a: Byte, b: T_A[Char, H], c: (Boolean,Byte)) extends T_A[Char, G]
case class CC_D[I](a: T_A[Char, I]) extends T_B[I]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _, _)) => 0 
  case CC_D(CC_B(_)) => 1 
}
}
// This is not matched: (CC_D Int (CC_A Int (T_A Char Int)) (T_B Int))
// This is not matched: (CC_B Byte (Tuple Wildcard Wildcard) (T_A Byte))