package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: C) extends T_A[C]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A (CC_C Wildcard
//            (CC_A Wildcard (CC_A Wildcard Wildcard T_A) T_A)
//            Wildcard
//            T_A)
//      (CC_B Wildcard Wildcard T_A)
//      T_A)