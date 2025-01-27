package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Int,Byte)) extends T_A[T_B[Byte, Char]]
case class CC_B(a: T_A[Byte], b: Boolean) extends T_A[Byte]
case class CC_C[E, F, G](a: G, b: CC_B, c: CC_A[F]) extends T_B[F, E]
case class CC_D[H](a: CC_B, b: CC_B, c: T_B[Char, CC_B]) extends T_B[H, CC_B]
case class CC_E[I](a: CC_A[I]) extends T_B[I, CC_B]

val v_a: T_B[T_A[Byte], CC_B] = null
val v_b: Int = v_a match{
  case CC_E(_) => 0 
  case CC_C(_, CC_B(_, _), _) => 1 
  case CC_C(_, _, CC_A(_)) => 2 
  case CC_D(CC_B(_, _), CC_B(_, _), _) => 3 
  case CC_D(CC_B(_, _), _, CC_E(_)) => 4 
  case CC_D(CC_B(_, _), CC_B(_, _), CC_E(_)) => 5 
  case CC_D(CC_B(_, _), _, CC_D(_, _, _)) => 6 
  case CC_D(_, CC_B(_, _), CC_C(_, _, _)) => 7 
}
}
// This is not matched: (CC_C (CC_B (T_A Boolean) (T_A (T_A Boolean)) (T_A Boolean))
//      (T_A Byte)
//      (Tuple Boolean Boolean)
//      (Tuple Wildcard Wildcard)
//      (CC_B Wildcard Boolean (T_A Byte))
//      Wildcard
//      (T_B (T_A Byte) (CC_B (T_A Boolean) (T_A (T_A Boolean)) (T_A Boolean))))
// This is not matched: (CC_E (T_A Byte) Wildcard (T_B (T_A Byte) (CC_B Boolean Boolean Boolean)))