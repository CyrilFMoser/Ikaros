package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_B[T_A]], c: T_A) extends T_A
case class CC_B(a: (((Int,Char),T_A),CC_A), b: Boolean, c: Int) extends T_A
case class CC_C(a: T_B[CC_B]) extends T_B[CC_B]
case class CC_D() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}