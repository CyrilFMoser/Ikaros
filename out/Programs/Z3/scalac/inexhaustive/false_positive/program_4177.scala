package Program_13 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: Char) extends T_A[D, C]
case class CC_B[F](a: CC_A[F, Char, Boolean], b: Byte) extends T_A[CC_A[Int, Byte, Boolean], F]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A('x') => 1 
}
}
// This is not matched: (CC_A Byte Int Boolean Wildcard (T_A Byte Int))
// This is not matched: (CC_A T_B Wildcard Wildcard Wildcard (T_A T_B T_B))