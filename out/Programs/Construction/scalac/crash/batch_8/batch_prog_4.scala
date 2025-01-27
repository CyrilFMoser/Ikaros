package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Int) extends T_A
case class CC_B[A](a: T_A, b: Int) extends T_A
case class CC_C(a: CC_A, b: Int, c: CC_B[T_B]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(12), 12, _) => 2 
  case CC_C(CC_A(12), _, _) => 3 
  case CC_C(CC_A(_), 12, _) => 4 
  case CC_C(CC_A(_), _, _) => 5 
}
}