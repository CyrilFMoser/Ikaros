package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,CC_A(_, _, _))) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (Tuple (CC_A Wildcard (CC_A Wildcard Wildcard Wildcard T_A) Wildcard T_A)
//             (CC_B Wildcard Char Wildcard T_A))
//      T_A)