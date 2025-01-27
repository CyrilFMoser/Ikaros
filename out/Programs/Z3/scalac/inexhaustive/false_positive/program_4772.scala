package Program_11 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_C(a: CC_A, b: T_A, c: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_C (CC_A Wildcard (CC_A Wildcard Wildcard Wildcard T_A) Wildcard T_A)
//      (T_B Byte))