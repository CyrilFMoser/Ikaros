package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[(T_A,(Char,Int))]) extends T_A
case class CC_B[B](a: T_A, b: Byte, c: T_A) extends T_B[Boolean]
case class CC_C(a: CC_B[CC_A], b: T_B[CC_B[CC_A]]) extends T_B[Boolean]
case class CC_D(a: T_B[CC_C], b: Boolean, c: CC_A) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
}
}
// This is not matched: CC_D(_, _, _)