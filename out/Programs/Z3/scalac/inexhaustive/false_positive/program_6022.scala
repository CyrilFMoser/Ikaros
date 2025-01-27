package Program_10 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A) extends T_A
case class CC_B[E, D]() extends T_B[D, E]
case class CC_C[F](a: CC_A[F], b: T_A) extends T_B[F, CC_A[T_A]]
case class CC_D(a: CC_B[T_A, T_A], b: ((Int,Byte),T_A)) extends T_B[T_B[T_A, T_A], CC_A[T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_E (Tuple (CC_D Wildcard Wildcard Wildcard Wildcard T_B)
//             (CC_D Boolean Boolean Boolean Boolean T_B))
//      (Tuple (CC_D Boolean Boolean Boolean Wildcard T_B) Wildcard)
//      T_B)