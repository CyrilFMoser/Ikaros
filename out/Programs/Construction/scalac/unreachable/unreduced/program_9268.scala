package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (CC_A,T_B[CC_A])) extends T_B[T_A]
case class CC_C() extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),_)) => 0 
  case CC_C() => 1 
}
}