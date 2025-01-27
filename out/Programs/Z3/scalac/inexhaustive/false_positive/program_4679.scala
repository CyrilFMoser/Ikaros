package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C], b: Int) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A Boolean (Tuple Byte Int)) (T_A Char Boolean)))