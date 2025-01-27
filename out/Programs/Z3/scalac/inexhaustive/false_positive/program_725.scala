package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Char,Char)) extends T_A[C]
case class CC_B(a: Char, b: T_A[Byte]) extends T_A[T_A[Char]]
case class CC_C(a: T_A[CC_B], b: (CC_B,Boolean), c: Int) extends T_A[T_A[Char]]
case class CC_D[D](a: Byte, b: T_B[D]) extends T_B[D]
case class CC_E[E](a: T_B[CC_C], b: Int, c: Byte) extends T_B[CC_C]
case class CC_F[F]() extends T_B[CC_C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(('x','x')) => 0 
  case CC_A((_,'x')) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_C Wildcard Wildcard (T_B Int))