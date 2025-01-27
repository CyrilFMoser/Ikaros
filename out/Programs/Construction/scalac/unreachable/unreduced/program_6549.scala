package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: (T_A[T_B, Char],Byte), c: C) extends T_A[T_A[T_A[C, C], C], C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C[E](a: T_A[E, E], b: T_B, c: T_A[E, E]) extends T_A[T_B, E]
case class CC_D() extends T_B
case class CC_E(a: CC_B[CC_D], b: T_B, c: CC_C[CC_B[CC_D]]) extends T_B
case class CC_F(a: T_B, b: T_A[T_A[CC_D, CC_E], Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_B(), _, CC_C(_, CC_D(), _)) => 1 
  case CC_E(CC_B(), _, CC_C(_, CC_E(_, _, _), _)) => 2 
  case CC_E(CC_B(), _, CC_C(_, CC_F(_, _), _)) => 3 
  case CC_F(CC_D(), _) => 4 
  case CC_F(CC_E(_, _, _), _) => 5 
  case CC_F(CC_F(_, _), _) => 6 
}
}