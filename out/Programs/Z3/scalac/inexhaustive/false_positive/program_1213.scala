package Program_30 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_B[D], b: (Int,Int), c: Boolean) extends T_A[E, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Boolean Wildcard Wildcard Wildcard (T_A Char Boolean))
// This is not matched: (CC_E Wildcard (T_B (T_B (CC_B Boolean Boolean Boolean Boolean))))