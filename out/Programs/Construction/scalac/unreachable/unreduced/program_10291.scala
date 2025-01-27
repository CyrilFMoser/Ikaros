package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_B[T_A, T_B[T_A, T_A]], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_B, CC_B]) extends T_B[CC_B, CC_B]
case class CC_D() extends T_B[Boolean, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}