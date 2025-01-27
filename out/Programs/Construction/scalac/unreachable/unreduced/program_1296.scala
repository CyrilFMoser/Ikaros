package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C], c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: CC_A[D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _)) => 1 
  case CC_A(_, CC_B(_, _), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 3 
  case CC_B(_, _) => 4 
}
}