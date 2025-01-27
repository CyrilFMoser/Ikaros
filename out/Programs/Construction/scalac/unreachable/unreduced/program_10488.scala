package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, CC_A], c: CC_A) extends T_A
case class CC_C(a: T_B[T_A, T_A], b: T_B[CC_A, Boolean], c: T_A) extends T_A
case class CC_D(a: CC_B, b: CC_C, c: T_B[CC_A, CC_B]) extends T_B[Int, CC_C]
case class CC_E(a: T_A) extends T_B[Int, CC_C]
case class CC_F() extends T_B[Int, CC_C]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_A()) => 0 
  case CC_E(CC_B(_, _, _)) => 1 
  case CC_E(CC_C(_, _, CC_A())) => 2 
  case CC_E(CC_C(_, _, CC_B(_, _, _))) => 3 
}
}
// This is not matched: CC_E(CC_C(_, _, CC_C(_, _, _)))