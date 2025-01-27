package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: C, b: T_A[D, C]) extends T_A[D, C]
case class CC_B[F]() extends T_A[F, (Int,Boolean)]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Int Byte Boolean Wildcard Wildcard (T_A Int Byte))
// This is not matched: (CC_B T_B)