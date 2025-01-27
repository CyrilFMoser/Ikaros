package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[T_A]) extends T_A
case class CC_C(a: Int, b: CC_B, c: T_A) extends T_B[CC_B]
case class CC_D(a: CC_A, b: T_B[Char], c: CC_C) extends T_B[CC_B]
case class CC_E() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(CC_A(), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
}
}