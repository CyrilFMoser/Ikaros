package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Byte, b: T_B[T_B[CC_A]], c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[T_B[CC_B]]
case class CC_E(a: CC_B, b: CC_A) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_B(_, _, CC_C()) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_A()