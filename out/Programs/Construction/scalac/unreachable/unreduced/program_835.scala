package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: T_A[T_B, C]) extends T_A[Int, C]
case class CC_B[D](a: Char) extends T_A[Int, D]
case class CC_C[E](a: T_A[Int, E], b: T_A[Int, T_B]) extends T_A[Int, E]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_C(CC_A(_, _, _), CC_B(_)) => 3 
  case CC_C(CC_A(_, _, _), CC_C(_, _)) => 4 
  case CC_C(CC_B(_), CC_A(_, _, _)) => 5 
  case CC_C(CC_B(_), CC_B(_)) => 6 
  case CC_C(CC_B(_), CC_C(_, _)) => 7 
  case CC_C(CC_C(_, _), CC_A(_, _, _)) => 8 
  case CC_C(CC_C(_, _), CC_B(_)) => 9 
  case CC_C(CC_C(_, _), CC_C(_, _)) => 10 
}
}