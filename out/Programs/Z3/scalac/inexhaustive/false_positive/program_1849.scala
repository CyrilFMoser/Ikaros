package Program_29 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Int], b: T_A[Byte, Byte]) extends T_A[T_A[Boolean, Byte], T_A[Int, Int]]
case class CC_B(a: Int, b: Boolean, c: (CC_A,(Boolean,Int))) extends T_A[T_A[Boolean, Byte], T_A[Int, Int]]
case class CC_C[D, C, E](a: T_A[E, C], b: T_A[C, E]) extends T_A[C, D]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Int, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_C Char
//      (T_A (T_A Boolean Byte) (T_A Int Int))
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_A (T_A Boolean Byte) (T_A Int Int)) Char))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)