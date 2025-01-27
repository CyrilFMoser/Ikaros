package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: (T_A,(Byte,Char)), c: T_A) extends T_B[(CC_A,CC_A)]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants