package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: C) extends T_A[C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A (CC_A Char Boolean Boolean)
//                (CC_A Char Boolean (T_A Boolean Boolean)))
//           (CC_A Char Boolean Boolean)))