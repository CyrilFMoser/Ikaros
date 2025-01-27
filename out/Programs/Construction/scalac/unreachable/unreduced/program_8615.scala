package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Char, b: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_A, c: T_B[CC_A]) extends T_A
case class CC_D(a: T_A) extends T_B[(CC_A,CC_C)]

val v_a: T_B[(CC_A,CC_C)] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_D(CC_B(_, CC_A())) => 1 
  case CC_D(CC_B(_, CC_B(_, _))) => 2 
  case CC_D(CC_B(_, CC_C(_, _, _))) => 3 
  case CC_D(CC_C(CC_A(), CC_A(), _)) => 4 
}
}