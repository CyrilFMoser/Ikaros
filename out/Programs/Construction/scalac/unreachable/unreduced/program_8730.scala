package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[(Boolean,Byte), T_A]]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_C, b: CC_B) extends T_B[C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
  case CC_A(CC_C(), _) => 2 
  case CC_B(_, _) => 3 
  case CC_C() => 4 
}
}