package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Boolean, c: T_B[Char, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_B) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}