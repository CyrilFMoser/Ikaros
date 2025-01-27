package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[C, Int]
case class CC_B[D](a: T_A[D, Int], b: T_A[D, Int]) extends T_A[D, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, true)) => 1 
  case CC_B(_, CC_A(_, false)) => 2 
  case CC_B(_, CC_B(_, _)) => 3 
}
}