package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[(Char,Int)]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_A (CC_C Boolean Boolean Boolean)
//      Wildcard
//      (T_A Byte (CC_C Boolean Boolean Boolean)))