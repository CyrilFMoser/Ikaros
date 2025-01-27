package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B(a: T_B) extends T_A[Byte, Boolean]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D()) => 0 
}
}
// This is not matched: (CC_B (CC_E Boolean
//            Boolean
//            Wildcard
//            (CC_A Boolean Wildcard (T_A Boolean Boolean))
//            T_B)
//      Wildcard
//      (T_A Byte Boolean))