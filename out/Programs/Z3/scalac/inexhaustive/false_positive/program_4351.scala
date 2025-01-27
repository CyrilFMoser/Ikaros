package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[C]() extends T_A[C]
case class CC_C[E](a: (Boolean,Byte), b: T_A[E]) extends T_A[E]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B (CC_C Wildcard
//            Wildcard
//            (CC_B (CC_C Wildcard Wildcard Wildcard T_B) Wildcard T_B)
//            T_B)
//      Wildcard
//      T_B)