package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_B, C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A (CC_B Int
//            Wildcard
//            (CC_B Int
//                  Wildcard
//                  (CC_A (CC_A Wildcard Wildcard T_A)
//                        (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)
//                        T_A)
//                  T_A)
//            T_A)
//      Wildcard
//      T_A)