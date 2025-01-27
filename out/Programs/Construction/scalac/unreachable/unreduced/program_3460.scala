package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Boolean]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: CC_A, c: T_A) extends T_B[((Char,CC_A),CC_B), T_B[CC_A, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}