package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Int, Int], Int]) extends T_A[T_A[Int, Int], Int]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(CC_A(_, _)), _) => 1 
  case CC_A(CC_B(CC_B(_)), _) => 2 
  case CC_B(CC_A(_, _)) => 3 
  case CC_B(CC_B(CC_A(_, _))) => 4 
  case CC_B(CC_B(CC_B(_))) => 5 
}
}