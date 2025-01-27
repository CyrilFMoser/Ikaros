package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[Int, (Boolean,Boolean)]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B (T_B (T_A Byte Boolean))
//      (T_B (T_A Byte Boolean))
//      Boolean
//      (T_A (T_B (T_A Byte Boolean)) (T_B (T_A Byte Boolean))))