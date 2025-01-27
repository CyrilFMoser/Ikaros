package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[T_A[Int, Int], C]) extends T_A[T_A[Int, Int], C]
case class CC_B[D](a: T_A[T_A[Int, Int], D]) extends T_A[T_A[Int, Int], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_)) => 1 
  case CC_B(_) => 2 
}
}