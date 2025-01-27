package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: C) extends T_A[D, C]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_E (CC_E (CC_D Wildcard (CC_B (CC_A T_A) Wildcard T_A) Wildcard T_B)
//            Wildcard
//            (CC_D Char Wildcard (CC_A T_A) T_B)
//            T_B)
//      Wildcard
//      Wildcard
//      T_B)