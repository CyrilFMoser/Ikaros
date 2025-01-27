package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int], b: T_A[((Boolean,Char),T_B)]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_C() extends T_B
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_A, b: Char, c: (T_A[Boolean],Int)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C()) => 1 
  case CC_E(_, _, (CC_A(_, _),_)) => 2 
}
}
// This is not matched: CC_E(_, _, (CC_B(_),_))