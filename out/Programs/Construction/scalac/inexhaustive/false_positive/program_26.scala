package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A], b: (CC_A,T_A)) extends T_A
case class CC_C() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,CC_B(_, _))) => 1 
}
}
// This is not matched: CC_A()