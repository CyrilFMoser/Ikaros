package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: (T_A,(Boolean,Boolean)), c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A (CC_B Byte T_A)
//      (Tuple (CC_A Wildcard Wildcard (CC_B Wildcard T_A) T_A) Wildcard)
//      Wildcard
//      T_A)