package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B]
case class CC_B[D](a: ((Char,Int),CC_A)) extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(((_,12),_)) => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard T_A)
//      (CC_A (CC_A (CC_B Wildcard T_A) (CC_B Wildcard T_A) T_A)
//            (CC_A (CC_A Wildcard (CC_B Wildcard T_A) T_A)
//                  (CC_B Wildcard T_A)
//                  T_A)
//            T_A)
//      T_A)