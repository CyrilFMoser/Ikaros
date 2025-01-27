package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: ((CC_A,CC_A),T_B[T_A])) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[T_B[CC_C]]) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(((_,_),_)) => 1 
  case CC_C() => 2 
}
}