package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: (T_A,(Byte,Char)), b: T_A) extends T_B[(CC_A,CC_A)]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((CC_B(),_), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants