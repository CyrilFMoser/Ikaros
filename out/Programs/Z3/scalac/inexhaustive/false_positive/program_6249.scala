package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Int], b: C, c: (T_B,T_B)) extends T_A[C, Int]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,CC_D())) => 0 
}
}
// This is not matched: (CC_A Char
//      (CC_B Char
//            (CC_A Char
//                  (CC_A Char Wildcard Wildcard Wildcard (T_A Char Int))
//                  Wildcard
//                  Wildcard
//                  (T_A Char Int))
//            Wildcard
//            Wildcard
//            (T_A Char Int))
//      Wildcard
//      Wildcard
//      (T_A Char Int))