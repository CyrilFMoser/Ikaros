package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, (Boolean,Boolean)]]) extends T_A
case class CC_B(a: T_A, b: Byte) extends T_A
case class CC_C(a: CC_A, b: T_B[T_A, T_B[CC_B, CC_B]], c: CC_A) extends T_A
case class CC_D[C](a: T_A, b: CC_B, c: C) extends T_B[C, CC_B]
case class CC_E[D](a: T_B[D, D], b: T_B[D, Boolean]) extends T_B[D, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}