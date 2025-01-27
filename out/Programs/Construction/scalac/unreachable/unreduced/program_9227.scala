package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E], b: (T_B[Byte, Char],T_B[Char, Boolean])) extends T_A[D]
case class CC_B[F](a: T_B[F, F]) extends T_A[F]
case class CC_C[G]() extends T_A[G]
case class CC_D[H](a: T_A[H], b: H) extends T_B[H, CC_B[H]]
case class CC_E[I]() extends T_B[I, CC_B[I]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}