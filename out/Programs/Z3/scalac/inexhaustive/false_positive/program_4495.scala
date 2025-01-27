package Program_14 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F](a: Boolean, b: F) extends T_A[F, T_A[F, F]]
case class CC_D[G, H]() extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D Int Boolean (T_B Int))
// This is not matched: (CC_A Char Char (CC_C Char Boolean (T_A Char)) (T_A Char))