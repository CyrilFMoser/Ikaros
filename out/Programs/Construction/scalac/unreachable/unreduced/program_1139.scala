package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, C], C], c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, T_A[D, D]]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _)) => 1 
  case CC_A(_, CC_B(_, _), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 3 
  case CC_B(_, _) => 4 
}
}