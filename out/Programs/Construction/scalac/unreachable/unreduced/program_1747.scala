package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: Boolean, c: CC_A) extends T_A
case class CC_C[C, D](a: Boolean, b: Int, c: C) extends T_B[C, CC_A]
case class CC_D(a: T_B[CC_A, CC_A], b: T_B[CC_C[Int, T_A], T_A]) extends T_B[CC_A, CC_A]
case class CC_E(a: CC_A, b: CC_D) extends T_B[CC_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}