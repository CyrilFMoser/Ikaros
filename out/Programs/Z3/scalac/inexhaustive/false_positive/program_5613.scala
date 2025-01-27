package Program_10 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Byte,Char), b: T_A[C], c: C) extends T_A[C]
case class CC_B[D, E]() extends T_B[D]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Int Boolean (T_B Int))
// This is not matched: (CC_B (CC_D (T_A Boolean) Boolean)
//      (CC_A Char (T_A Char))
//      (CC_B (CC_D Boolean Boolean)
//            (CC_A Char (T_A Char))
//            (CC_B (CC_D Boolean Boolean)
//                  (CC_A Char (T_A Char))
//                  Wildcard
//                  (T_A (CC_D Boolean Boolean)))
//            (T_A (CC_D Boolean Boolean)))
//      (T_A (CC_D (T_A Boolean) Boolean)))