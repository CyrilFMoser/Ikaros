package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_A, c: (T_B[T_A],T_A)) extends T_A
case class CC_B(a: T_B[CC_A], b: CC_A, c: T_A) extends T_A
case class CC_C(a: Char, b: Byte, c: Byte) extends T_B[CC_B]
case class CC_D(a: (CC_B,CC_A), b: T_B[CC_C], c: T_B[CC_C]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _, 0) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, _, _) => 2 
}
}