package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B](a: T_A, b: T_B[B]) extends T_A
case class CC_C(a: T_A, b: T_B[CC_A]) extends T_A
case class CC_D(a: T_A, b: T_A, c: T_A) extends T_B[T_A]
case class CC_E() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(CC_A(), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
  case CC_B(CC_B(CC_C(_, _), _), _) => 4 
  case CC_B(CC_C(CC_A(), _), _) => 5 
  case CC_B(CC_C(CC_B(_, _), _), _) => 6 
  case CC_B(CC_C(CC_C(_, _), _), _) => 7 
  case CC_C(_, _) => 8 
}
}