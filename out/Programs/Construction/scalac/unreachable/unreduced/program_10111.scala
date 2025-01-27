package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Char,Char), T_A], Byte]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C() => 2 
}
}