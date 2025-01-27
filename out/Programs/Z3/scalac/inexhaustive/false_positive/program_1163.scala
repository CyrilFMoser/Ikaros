package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: (Int,Boolean), c: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E, F](a: T_B[E]) extends T_A[E, T_B[E]]
case class CC_C(a: T_A[Boolean, Boolean], b: Char) extends T_A[Char, T_B[Char]]
case class CC_D[G](a: Char, b: G, c: G) extends T_B[G]

val v_a: T_A[Byte, T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_, _, _)) => 0 
  case CC_A(_, (12,_), _) => 1 
  case CC_A(_, _, _) => 2 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard (T_A Byte (T_B Byte)))
// This is not matched: (CC_B (T_A Int) (T_A (T_A Int)))