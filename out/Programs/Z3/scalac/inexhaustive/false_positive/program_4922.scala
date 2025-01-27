package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: Int) extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_C (T_A (Tuple Byte Boolean)) (T_A (T_A (Tuple Byte Boolean))))