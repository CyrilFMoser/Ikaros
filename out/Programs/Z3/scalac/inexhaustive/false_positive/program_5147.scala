package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: Int, b: T_A[Byte, Boolean]) extends T_A[T_A[Char, Char], T_A[Int, Char]]

val v_a: T_A[T_A[Char, Char], T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_C Boolean
//      Boolean
//      Wildcard
//      Char
//      (Tuple Boolean Boolean)
//      (T_B Boolean Boolean))