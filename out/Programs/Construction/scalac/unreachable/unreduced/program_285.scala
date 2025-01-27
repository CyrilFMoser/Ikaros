package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: T_A[E, E], c: T_B[E, E]) extends T_A[T_B[T_A[Byte, Char], (Char,Char)], E]
case class CC_B(a: Boolean, b: CC_A[T_A[Char, Byte]]) extends T_A[T_B[T_A[Byte, Char], (Char,Char)], T_B[T_B[Char, (Boolean,Byte)], T_B[Char, Boolean]]]
case class CC_C() extends T_A[Char, CC_A[T_B[Boolean, Boolean]]]
case class CC_D[F](a: (T_B[CC_B, CC_B],(Boolean,CC_B)), b: T_B[CC_C, F]) extends T_B[CC_C, F]
case class CC_E[G, H]() extends T_B[CC_C, G]
case class CC_F[I](a: CC_E[I, I], b: T_A[I, I], c: T_B[I, I]) extends T_B[CC_C, I]

val v_a: T_B[CC_C, T_A[Char, CC_A[T_B[Boolean, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_D((_,_), CC_D(_, _)) => 0 
  case CC_D((_,_), CC_E()) => 1 
  case CC_D((_,_), CC_F(_, _, _)) => 2 
  case CC_E() => 3 
  case CC_F(CC_E(), _, _) => 4 
}
}