package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Int, b: Int) extends T_A[Int, D]
case class CC_B[F](a: F, b: Char) extends T_B[F]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard (T_A Int Byte))
// This is not matched: (CC_C Boolean Wildcard (T_A Boolean))