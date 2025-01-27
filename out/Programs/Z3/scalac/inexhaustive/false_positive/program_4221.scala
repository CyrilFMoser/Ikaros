package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: (T_A,T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_A(_, (_,CC_B())) => 2 
}
}
// This is not matched: Pattern match is empty without constants