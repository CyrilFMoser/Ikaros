package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char]) extends T_A[T_B[Int]]
case class CC_B[C, D]() extends T_A[C]
case class CC_C() extends T_A[T_B[Int]]
case class CC_D[E](a: CC_A, b: CC_C, c: Char) extends T_B[E]
case class CC_E(a: Char, b: T_B[CC_C]) extends T_B[CC_C]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B (CC_E (T_A Boolean) Boolean Boolean)
//      Boolean
//      (T_A (CC_E (T_A Boolean) Boolean Boolean)))
// This is not matched: (CC_B Int
//      Byte
//      Int
//      (Tuple Boolean Wildcard)
//      (CC_B Byte Byte Wildcard Wildcard Wildcard (T_A Byte Byte))
//      (T_A Int Byte))