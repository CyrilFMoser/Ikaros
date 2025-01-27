package Program_31 

package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[E, (Int,Byte)]
case class CC_B[F](a: F, b: F) extends T_A[F, (Int,Byte)]
case class CC_C[G](a: T_B[G, G], b: T_A[Boolean, G], c: G) extends T_A[G, (Int,Byte)]
case class CC_D[H, I]() extends T_B[T_B[H, (Byte,Byte)], H]
case class CC_E[J]() extends T_B[Char, J]
case class CC_F[K](a: CC_B[K]) extends T_B[CC_E[Int], K]

val v_a: T_B[T_B[Int, (Byte,Byte)], Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D Int Boolean (T_B (T_B Int (Tuple Byte Byte)) Int))
// This is not matched: (CC_B (CC_A Wildcard T_A) T_A)