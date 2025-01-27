package Program_12 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Char,Byte), b: T_A[D, Char]) extends T_A[(Byte,Boolean), Char]
case class CC_B[E](a: T_B[E]) extends T_B[E]
case class CC_C(a: T_B[Byte], b: CC_A[Char], c: T_A[Int, Char]) extends T_B[T_B[Char]]
case class CC_D[F](a: T_A[F, F], b: Boolean, c: Boolean) extends T_B[T_B[Char]]

val v_a: T_A[(Byte,Boolean), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(('x',0), CC_A(_, _)) => 1 
  case CC_A(('x',_), _) => 2 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (Tuple Byte Boolean) Char))
// This is not matched: (CC_A Int Int (T_A Int Int))