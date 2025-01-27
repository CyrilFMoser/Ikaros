package Program_13 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Byte, Boolean], b: T_B[Byte, Boolean]) extends T_A[T_B[Int, (Int,Char)]]
case class CC_B() extends T_A[Byte]
case class CC_C[D, E, F](a: CC_A, b: T_B[E, F]) extends T_B[E, D]

val v_a: T_B[T_A[Byte], T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_C (T_A Byte)
//      (T_A Byte)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_B (T_A Byte) (T_A Byte)))
// This is not matched: (CC_A (T_A (T_A Char)))