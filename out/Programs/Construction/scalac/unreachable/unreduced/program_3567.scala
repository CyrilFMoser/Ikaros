package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_A[Char, (Int,Char)],Char), b: Int) extends T_A[T_B[E, E], E]
case class CC_B() extends T_A[T_B[CC_A[CC_A[Char]], CC_A[CC_A[Char]]], CC_A[CC_A[Char]]]
case class CC_C[F](a: T_B[F, F]) extends T_A[T_B[F, F], F]

val v_a: T_A[T_B[CC_B, CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_C(_) => 1 
}
}