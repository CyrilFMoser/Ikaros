package Program_30 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: C, b: T_A[D, C]) extends T_A[D, C]
case class CC_B[F]() extends T_A[F, (Int,Boolean)]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Int Byte Boolean Byte Wildcard (T_A Int Byte))
// This is not matched: (CC_B T_B)