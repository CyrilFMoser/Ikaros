package Program_10 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_C(a: (Boolean,T_A), b: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants