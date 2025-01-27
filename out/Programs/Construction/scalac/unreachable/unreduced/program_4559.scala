package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Boolean, b: T_B[T_A[D, E]]) extends T_A[E, D]
case class CC_B[F, G](a: F, b: CC_A[CC_A[G, G], F]) extends T_A[F, G]
case class CC_C[I, H](a: T_A[H, I], b: H, c: I) extends T_A[H, I]
case class CC_D(a: CC_B[(Byte,(Byte,Char)), CC_C[Char, Boolean]], b: T_B[T_B[Char]], c: (CC_C[Byte, (Int,Int)],T_B[Char])) extends T_B[T_B[((Char,Boolean),Boolean)]]
case class CC_E(a: T_A[T_A[Char, Char], T_A[CC_D, Byte]]) extends T_B[T_B[((Char,Boolean),Boolean)]]

val v_a: T_A[CC_E, CC_E] = null
val v_b: Int = v_a match{
  case CC_B(CC_E(_), CC_A(_, _)) => 0 
  case CC_C(_, _, CC_E(_)) => 1 
}
}
// This is not matched: CC_A(_, _)