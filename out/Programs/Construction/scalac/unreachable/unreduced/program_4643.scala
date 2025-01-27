package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_B[Byte], b: (Byte,T_B[CC_A]), c: (T_B[T_A],Boolean)) extends T_A
case class CC_C(a: Byte) extends T_A
case class CC_D() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}