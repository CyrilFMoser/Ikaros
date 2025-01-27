package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, Int], b: T_A[C, C]) extends T_A[C, Int]
case class CC_B[E](a: T_A[E, Int]) extends T_A[E, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
}
}