package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Char, b: T_A[D, E], c: Boolean) extends T_A[D, E]
case class CC_B[F](a: T_A[F, F], b: T_A[F, F], c: T_B[F]) extends T_A[F, CC_A[F, F]]
case class CC_C[G, H](a: T_A[Boolean, G], b: CC_A[H, H], c: G) extends T_A[G, CC_A[G, G]]
case class CC_D(a: Byte, b: T_A[Boolean, Byte]) extends T_B[CC_C[Int, Byte]]
case class CC_E() extends T_B[CC_C[Int, Byte]]

val v_a: T_A[Int, CC_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, _, 12) => 3 
  case CC_C(CC_A(_, _, _), _, 12) => 4 
  case CC_C(_, CC_A(_, _, _), _) => 5 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _), 12) => 6 
  case CC_A(_, CC_B(_, _, _), _) => 7 
  case CC_A(_, _, _) => 8 
}
}
// This is not matched: (CC_C Int
//      (CC_B Boolean (T_A Boolean Boolean) Boolean Boolean Boolean)
//      (CC_A Int Boolean Wildcard Wildcard Wildcard (T_A Boolean Int))
//      Wildcard
//      Wildcard
//      (T_A Int (CC_A Int Int Boolean Boolean Boolean Boolean)))
// This is not matched: (CC_A Byte (T_A Byte))