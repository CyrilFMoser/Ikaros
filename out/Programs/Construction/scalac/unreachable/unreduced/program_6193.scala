package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C) extends T_A[C, Int]
case class CC_B(a: CC_A[Boolean]) extends T_B
case class CC_C(a: CC_A[T_A[CC_B, CC_B]], b: CC_A[CC_A[(Int,Int)]], c: T_A[T_A[T_B, Int], Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, true)) => 0 
  case CC_B(CC_A(_, false)) => 1 
  case CC_C(CC_A(_, _), CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
}
}