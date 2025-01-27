package Program_13 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Char, b: Boolean) extends T_A[E, D]
case class CC_B[F]() extends T_A[CC_A[F, F], F]
case class CC_C[G, H]() extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C Int Boolean (T_B Int))
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char Int))