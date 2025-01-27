package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte) extends T_A[C, T_A[T_B, T_B]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A (CC_C (CC_A (CC_B T_A) Wildcard T_A)
//            (CC_A (CC_B T_A) Int T_A)
//            (CC_B T_A)
//            T_A)
//      Wildcard
//      T_A)