package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Boolean, Byte], C]
case class CC_B(a: Char, b: T_A[Byte, Boolean]) extends T_A[T_A[Boolean, Byte], CC_A[Char]]

val v_a: T_A[T_A[Boolean, Byte], CC_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
  case CC_A() => 1 
}
}
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (T_A (T_A Boolean Byte) (CC_A Char Boolean Boolean Boolean)))