package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D](a: Byte) extends T_A[E, D]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Boolean
//      (T_A (CC_A Byte (Tuple Boolean Boolean) Boolean Boolean Boolean)
//           (T_B Int Int)))