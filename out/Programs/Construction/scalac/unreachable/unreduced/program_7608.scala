package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A, c: Char) extends T_A
case class CC_B[C]() extends T_A
case class CC_C(a: T_B[T_B[CC_A, T_A], T_A], b: CC_B[T_A]) extends T_A
case class CC_D() extends T_B[Boolean, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
  case CC_C(_, _) => 3 
}
}