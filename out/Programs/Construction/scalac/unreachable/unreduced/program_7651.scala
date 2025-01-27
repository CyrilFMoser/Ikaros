package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: T_A[D, D], b: Int, c: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, T_B], b: CC_B[T_A[T_B, T_B]], c: CC_B[(T_B,T_B)]) extends T_B
case class CC_D(a: Byte, b: T_A[T_B, Int], c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_B(_, _, _), CC_B(_, _, _)) => 0 
  case CC_C(CC_B(CC_A(), _, CC_A()), CC_B(_, _, _), CC_B(_, _, _)) => 1 
  case CC_C(CC_B(CC_A(), _, CC_B(_, _, _)), CC_B(_, _, _), CC_B(_, _, _)) => 2 
  case CC_C(CC_B(CC_B(_, _, _), _, CC_A()), CC_B(_, _, _), CC_B(_, _, _)) => 3 
  case CC_C(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), CC_B(_, _, _), CC_B(_, _, _)) => 4 
  case CC_D(_, CC_A(), _) => 5 
  case CC_D(_, CC_B(_, _, _), _) => 6 
}
}