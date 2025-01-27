package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[Byte, T_B[Boolean, T_A]]) extends T_A
case class CC_B(a: T_B[T_A, T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_C(a: Boolean) extends T_A
case class CC_D[C](a: Char) extends T_B[T_B[CC_A, (CC_B,T_A)], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}