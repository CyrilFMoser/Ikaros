package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[D]) extends T_A[D]
case class CC_B(a: (Boolean,Int), b: CC_A[Boolean, Int], c: Char) extends T_A[T_B[Boolean, Byte]]
case class CC_C[G, F]() extends T_B[G, F]

val v_a: CC_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Byte
//      Boolean
//      (CC_A Byte Boolean (CC_A Byte Boolean Wildcard (T_A Byte)) (T_A Byte))
//      (T_A Byte))
// This is not matched: (CC_A Wildcard Wildcard T_A)