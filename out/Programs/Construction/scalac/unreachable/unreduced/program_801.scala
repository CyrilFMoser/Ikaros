package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Boolean]) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C(a: CC_A, b: Char, c: Int) extends T_A
case class CC_D[C]() extends T_B[(Byte,T_B[Byte, CC_C]), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}