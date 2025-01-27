package Program_30 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: Char, b: T_A[E, C], c: T_A[D, C]) extends T_A[D, C]
case class CC_B[F](a: Byte, b: T_A[F, F], c: T_A[F, F]) extends T_A[F, Byte]
case class CC_C[G](a: T_A[G, G]) extends T_A[G, Byte]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A('x', CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_A('x', _, CC_A(_, _, _)) => 2 
  case CC_A(_, _, _) => 3 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard Wildcard (T_A Char Int))
// This is not matched: Pattern match is empty without constants