package Program_14 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Int, C], c: C) extends T_A[C, T_A[Int, Byte]]
case class CC_B[D, E](a: CC_A[D], b: CC_A[D]) extends T_A[D, (Int,Int)]
case class CC_C[F, G](a: F, b: T_A[G, F]) extends T_A[F, (Int,Int)]

val v_a: CC_C[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(12, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Boolean Wildcard (T_A Boolean))