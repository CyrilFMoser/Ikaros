package Program_31 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Char], b: T_B[Byte, (Byte,Byte)]) extends T_A[T_A[Int]]
case class CC_B() extends T_A[T_A[Int]]
case class CC_C(a: CC_B) extends T_A[T_A[Int]]
case class CC_D[D, E, F]() extends T_B[E, D]
case class CC_E(a: CC_D[CC_C, CC_A, CC_B], b: CC_A, c: Char) extends T_B[CC_A, Int]

val v_a: T_B[CC_A, Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), CC_A(_, _), 'x') => 1 
  case CC_E(CC_D(), CC_A(_, _), _) => 2 
  case CC_E(CC_D(), _, 'x') => 3 
}
}
// This is not matched: (CC_D Int
//      (CC_A Boolean Boolean Boolean)
//      Boolean
//      (T_B (CC_A Boolean Boolean Boolean) Int))
// This is not matched: (CC_B (CC_E Byte Int (Tuple Wildcard Byte) (T_B Int Byte))
//      Wildcard
//      Wildcard
//      (T_A (T_A Int Byte) (CC_A Byte Boolean Boolean Boolean)))