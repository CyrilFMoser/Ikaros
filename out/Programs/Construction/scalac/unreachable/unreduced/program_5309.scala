package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: (T_B[Boolean, T_A],T_B[T_A, CC_A])) extends T_A
case class CC_C(a: T_B[T_A, CC_A], b: Char, c: T_B[CC_A, T_A]) extends T_B[CC_A, T_A]
case class CC_D(a: CC_C) extends T_B[CC_A, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_) => 1 
}
}