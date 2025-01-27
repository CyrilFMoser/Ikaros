package Program_14 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[D]) extends T_A[D]
case class CC_B[F](a: Int, b: Byte) extends T_A[F]
case class CC_C(a: CC_B[Boolean], b: Boolean) extends T_B[Int, T_B[Char, Char]]
case class CC_D(a: Int, b: CC_B[CC_C], c: T_A[Boolean]) extends T_B[Int, T_B[Char, Char]]
case class CC_E[G](a: T_A[G], b: (CC_C,(Boolean,Char)), c: CC_B[G]) extends T_B[G, CC_B[CC_C]]

val v_a: T_B[Int, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _, CC_B(_, _)) => 1 
  case CC_D(_, CC_B(_, _), CC_A(_)) => 2 
}
}
// This is not matched: (CC_D Wildcard
//      Wildcard
//      (CC_A Boolean Boolean Wildcard (T_A Boolean))
//      (T_B Int (T_B Char Char)))
// This is not matched: (CC_A (CC_A (CC_A Wildcard T_A) T_A) T_A)