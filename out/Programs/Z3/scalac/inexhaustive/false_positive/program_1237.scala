package Program_28 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Char, b: T_A[E, E]) extends T_A[E, D]
case class CC_B[F, G](a: T_B[F], b: T_A[Boolean, F], c: F) extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), 12) => 0 
  case CC_B(_, _, 12) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_B(_, _, _), CC_A(_, _), _) => 3 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard Wildcard (T_B Int))
// This is not matched: (CC_A Wildcard Wildcard T_A)