package Program_15 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: Char, b: T_A[E]) extends T_A[D]
case class CC_B[F](a: T_A[Byte], b: Boolean) extends T_A[F]
case class CC_C(a: CC_B[Int], b: (Boolean,Boolean), c: CC_B[Char]) extends T_A[T_B[Char, Int]]
case class CC_D[G](a: Char, b: Int) extends T_B[CC_C, G]
case class CC_E[H](a: T_B[CC_C, H], b: T_A[H]) extends T_B[CC_C, H]
case class CC_F[I](a: I) extends T_B[CC_C, I]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_B(CC_B(_, _), _) => 1 
}
}
// This is not matched: (CC_B Boolean
//      (CC_A Byte (T_A Boolean) Char Wildcard (T_A Byte))
//      Wildcard
//      (T_A Boolean))
// This is not matched: (CC_A Byte Wildcard (CC_A Byte Wildcard Wildcard (T_A Byte)) (T_A Byte))