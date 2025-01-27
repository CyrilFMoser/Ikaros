package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, Boolean]) extends T_A[(Int,Byte), E]
case class CC_B[G, F](a: T_A[F, F], b: T_B[Char, F]) extends T_A[G, F]
case class CC_C[H, I](a: T_A[I, I], b: T_B[I, H]) extends T_B[(Char,Char), H]

val v_a: T_B[(Char,Char), Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), CC_C(_, _)) => 0 
  case CC_C(CC_B(_, _), _) => 1 
}
}
// This is not matched: (CC_C Int Boolean Wildcard Wildcard (T_B (Tuple Char Char) Int))
// This is not matched: (CC_C Boolean (T_A Boolean))