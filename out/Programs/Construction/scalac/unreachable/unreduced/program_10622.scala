package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]], b: Boolean) extends T_A[T_B[T_A[Char]]]
case class CC_B(a: T_B[T_A[Boolean]], b: T_A[Char]) extends T_A[T_B[T_A[Char]]]
case class CC_C() extends T_A[T_B[T_A[Char]]]
case class CC_D() extends T_B[CC_C]
case class CC_E[C, D](a: CC_D) extends T_B[C]
case class CC_F[E](a: T_B[E], b: T_B[E]) extends T_B[E]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(CC_D()), _) => 0 
  case CC_A(CC_F(CC_E(_), CC_E(_)), _) => 1 
  case CC_A(CC_F(CC_E(_), CC_F(_, _)), _) => 2 
  case CC_A(CC_F(CC_F(_, _), CC_F(_, _)), _) => 3 
  case CC_B(_, _) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_A(CC_F(CC_F(_, _), CC_E(_)), _)