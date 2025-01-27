package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[Int]
case class CC_B(a: T_B, b: T_A[Int]) extends T_B
case class CC_C(a: Char, b: T_A[Int], c: CC_A) extends T_B
case class CC_D(a: Char, b: T_A[Int], c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), CC_A(_)) => 0 
  case CC_B(CC_C(_, _, _), CC_A(_)) => 1 
  case CC_B(CC_D(_, _, _), CC_A(_)) => 2 
  case CC_C(_, _, CC_A(_)) => 3 
  case CC_D('x', _, CC_B(_, _)) => 4 
}
}
// This is not matched: CC_D(_, _, CC_B(_, _))