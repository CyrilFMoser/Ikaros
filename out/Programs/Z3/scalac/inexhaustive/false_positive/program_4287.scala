package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: ((Boolean,Boolean),T_A), b: (T_A,T_A)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_B())) => 0 
}
}
// This is not matched: (CC_B Boolean
//      Wildcard
//      (CC_A Boolean
//            Wildcard
//            (CC_B Boolean Wildcard Wildcard Wildcard (T_A Boolean Boolean))
//            (T_A Boolean Boolean))
//      Wildcard
//      (T_A Boolean Boolean))