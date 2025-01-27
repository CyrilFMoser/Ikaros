package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(Byte,Char), (Char,Char)]
case class CC_B[C](a: T_A[C, CC_A]) extends T_A[C, CC_A]
case class CC_C[E, D]() extends T_A[E, D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
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