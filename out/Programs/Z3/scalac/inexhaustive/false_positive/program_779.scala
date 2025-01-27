package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: E) extends T_A[C, D]
case class CC_B[F](a: CC_A[Char, F, F]) extends T_A[((Char,Boolean),Int), F]

val v_a: T_A[((Char,Boolean),Int), Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_A Int
//      (Tuple (Tuple Char Boolean) Int)
//      Boolean
//      Wildcard
//      (T_A (Tuple (Tuple Char Boolean) Int) Int))
// This is not matched: Pattern match is empty without constants