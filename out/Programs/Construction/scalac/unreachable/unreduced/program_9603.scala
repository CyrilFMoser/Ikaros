package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_B[D, T_B[D, D]]) extends T_A[D]
case class CC_B[E](a: E, b: T_A[E], c: T_B[E, E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D(a: T_A[Int]) extends T_B[T_A[(Boolean,Char)], T_B[(Byte,(Byte,Char)), T_A[(Int,Char)]]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B(12, CC_A(_, _), _)) => 1 
  case CC_D(CC_B(12, CC_B(_, _, _), _)) => 2 
  case CC_D(CC_B(12, CC_C(), _)) => 3 
  case CC_D(CC_B(_, CC_A(_, _), _)) => 4 
  case CC_D(CC_B(_, CC_B(_, _, _), _)) => 5 
  case CC_D(CC_B(_, CC_C(), _)) => 6 
  case CC_D(CC_C()) => 7 
}
}