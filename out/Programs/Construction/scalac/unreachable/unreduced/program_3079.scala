package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[G, F](a: G, b: T_A[G, G]) extends T_A[G, F]
case class CC_C[I, H](a: T_A[H, I], b: Boolean, c: T_B[I]) extends T_A[H, I]
case class CC_D(a: Int) extends T_B[T_B[Boolean]]

val v_a: T_A[T_B[T_B[Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_C(_, _, _))) => 4 
  case CC_B(_, CC_C(_, _, _)) => 5 
  case CC_C(_, _, _) => 6 
}
}