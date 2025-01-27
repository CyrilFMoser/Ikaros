package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(Byte,(Int,Byte)), Byte], b: T_A) extends T_A
case class CC_B[C](a: T_B[C, C]) extends T_B[C, T_B[C, C]]
case class CC_C(a: Char, b: Byte) extends T_B[CC_A, T_B[CC_A, CC_A]]

val v_a: T_B[CC_A, T_B[CC_A, CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}