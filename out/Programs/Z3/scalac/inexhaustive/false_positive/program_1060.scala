package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, E](a: (Char,Int)) extends T_A[E, F]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_A (CC_B T_A
//            (CC_A Wildcard Wildcard Wildcard T_A)
//            Wildcard
//            (CC_A Wildcard Wildcard (CC_C Wildcard T_A) T_A)
//            T_A)
//      (CC_A Wildcard Wildcard (CC_C Int T_A) T_A)
//      (CC_B T_A Wildcard Wildcard Wildcard T_A)
//      T_A)