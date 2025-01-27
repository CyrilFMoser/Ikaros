package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E, c: Byte) extends T_A[E]
case class CC_C[F](a: T_A[F], b: (T_A[Byte],T_A[Char])) extends T_A[F]
case class CC_D[G]() extends T_B[CC_C[G], G]
case class CC_E[H](a: CC_D[H], b: T_B[CC_C[Char], Char]) extends T_B[H, T_A[H]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A(_, _), (_,_)) => 1 
  case CC_C(CC_B(_, _, _), (_,_)) => 2 
  case CC_C(CC_C(_, _), (_,_)) => 3 
}
}
// This is not matched: CC_A(_, _)