package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A], b: T_B[T_B[CC_A]], c: T_A) extends T_A
case class CC_C() extends T_B[(T_A,CC_A)]
case class CC_D(a: T_B[Byte], b: T_A) extends T_B[(T_A,CC_A)]
case class CC_E(a: CC_C, b: Boolean, c: CC_C) extends T_B[(T_A,CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_B(_, _, CC_B(_, _, _)) => 2 
}
}