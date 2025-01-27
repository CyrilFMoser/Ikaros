package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Boolean], b: T_B[T_A, T_B[(Boolean,Boolean), Int]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: Int, c: CC_B) extends T_A
case class CC_D[C](a: CC_B) extends T_B[CC_C, C]
case class CC_E[D](a: D) extends T_B[CC_C, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}