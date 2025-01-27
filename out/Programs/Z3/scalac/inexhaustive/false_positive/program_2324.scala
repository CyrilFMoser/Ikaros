package Program_30 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D) extends T_A[D, T_B[D]]
case class CC_B[E, F](a: F, b: (Int,Byte), c: T_A[Char, E]) extends T_A[E, T_B[E]]
case class CC_C[G]() extends T_B[G]
case class CC_D[H]() extends T_B[H]
case class CC_E[I](a: T_B[I], b: T_B[I]) extends T_B[I]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(12, (12,0), _) => 0 
  case CC_B(_, (_,0), _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants