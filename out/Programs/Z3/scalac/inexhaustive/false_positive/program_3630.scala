package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_C() extends T_B
case class CC_D(a: CC_A, b: T_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C()) => 0 
}
}
// This is not matched: (CC_B (CC_E Boolean
//            Boolean
//            Wildcard
//            (CC_A Boolean Wildcard (T_A Boolean Boolean))
//            T_B)
//      Wildcard
//      (T_A Byte Boolean))