package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C[E](a: E, b: T_A[T_B, E]) extends T_A[T_A[T_B, Int], E]
case class CC_D(a: T_A[T_B, (T_B,Char)], b: T_A[T_A[T_B, T_B], Boolean]) extends T_B
case class CC_E(a: CC_A[T_B], b: T_A[T_B, T_B], c: T_A[T_A[T_B, Int], CC_A[CC_D]]) extends T_B
case class CC_F(a: (CC_C[T_B],Char), b: CC_E) extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _)) => 0 
  case CC_A(CC_E(CC_A(_), CC_A(_), CC_C(_, _))) => 1 
  case CC_A(CC_E(CC_A(_), CC_B(), CC_C(_, _))) => 2 
  case CC_A(CC_F(_, _)) => 3 
  case CC_B() => 4 
}
}