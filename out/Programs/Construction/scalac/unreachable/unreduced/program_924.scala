package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B, b: T_A, c: T_B[Int]) extends T_A
case class CC_D(a: CC_B, b: T_B[CC_C]) extends T_B[CC_C]
case class CC_E(a: CC_C) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(_, _, _)) => 3 
}
}
// This is not matched: CC_C(_, _, _)