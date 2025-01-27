package Program_30 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, C]) extends T_A[D, C]
case class CC_B[F](a: T_A[F, F], b: T_A[F, F], c: F) extends T_A[CC_A[Int, Int, Byte], F]
case class CC_C[G](a: T_A[G, Int]) extends T_A[CC_A[Int, Int, Byte], G]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Byte Char Boolean Wildcard (T_A Byte Char))
// This is not matched: (CC_B T_A)