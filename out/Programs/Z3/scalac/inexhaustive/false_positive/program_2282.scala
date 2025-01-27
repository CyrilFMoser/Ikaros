package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[Byte, E]) extends T_A[D, C]
case class CC_B[F](a: CC_A[F, F, F], b: (Byte,Int), c: ((Int,Int),Byte)) extends T_A[F, Char]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(CC_A(_)) => 1 
}
}
// This is not matched: (CC_A Boolean Int Boolean Wildcard (T_A Boolean Int))
// This is not matched: (CC_E Int Wildcard (T_B Int))