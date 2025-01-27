package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D](a: E) extends T_A[E, D]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Boolean
//      (T_A (CC_A Byte (Tuple Boolean Boolean) Boolean Boolean Boolean)
//           (T_B Int Int)))