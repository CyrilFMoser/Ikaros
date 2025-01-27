package Program_14 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Boolean], b: T_B[E, E]) extends T_A[E, Byte]
case class CC_B[F](a: F, b: Int, c: Int) extends T_A[T_A[Int, Byte], Byte]
case class CC_C(a: Boolean, b: T_A[Boolean, Byte], c: T_A[Boolean, Byte]) extends T_A[T_A[Int, Byte], Byte]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, 12, 12) => 0 
  case CC_B(_, _, 12) => 1 
  case CC_B(0, _, _) => 2 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants