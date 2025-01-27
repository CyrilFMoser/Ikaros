package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: E) extends T_A[E, T_B[Char, Char]]
case class CC_B[F]() extends T_A[F, T_B[Char, Char]]
case class CC_C[G](a: Boolean, b: T_B[G, G], c: G) extends T_A[G, T_B[Char, Char]]
case class CC_D[H, I, J](a: Int, b: I) extends T_B[H, I]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_D(12, _) => 1 
  case CC_D(_, 12) => 2 
}
}
// This is not matched: (CC_D Char Int Boolean Wildcard Wildcard (T_B Char Int))
// This is not matched: (CC_C Wildcard (T_A (Tuple Char Boolean)))