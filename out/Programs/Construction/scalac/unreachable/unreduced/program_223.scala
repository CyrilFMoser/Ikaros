package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, T_B], b: T_B) extends T_A[(T_A[(Char,Char), T_B],T_B), D]
case class CC_C[E](a: T_A[E, T_A[Int, T_B]], b: T_A[E, Char], c: CC_A[E]) extends T_A[(T_A[(Char,Char), T_B],T_B), E]
case class CC_D[F]() extends T_B
case class CC_E(a: CC_C[Byte], b: T_A[T_A[T_B, T_B], CC_A[(Byte,Char)]]) extends T_B
case class CC_F(a: T_A[CC_C[CC_E], T_B], b: T_A[T_B, T_B], c: CC_D[CC_B[T_B]]) extends T_B

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), CC_D()) => 0 
  case CC_A(CC_E(_, _), CC_D()) => 1 
  case CC_A(CC_F(_, _, _), CC_D()) => 2 
  case CC_A(CC_D(), CC_E(_, _)) => 3 
  case CC_A(CC_E(_, _), CC_E(_, _)) => 4 
  case CC_A(CC_F(_, _, _), CC_E(_, _)) => 5 
  case CC_A(CC_D(), CC_F(_, _, _)) => 6 
  case CC_A(CC_E(_, _), CC_F(_, _, _)) => 7 
  case CC_A(CC_F(_, _, _), CC_F(_, _, _)) => 8 
}
}