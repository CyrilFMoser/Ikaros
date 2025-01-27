package Program_14 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Byte], b: T_A[(Boolean,Byte)]) extends T_A[T_B[Int, Int]]
case class CC_B() extends T_A[T_B[Int, Int]]
case class CC_C[D](a: CC_A, b: D) extends T_A[T_B[Int, Int]]
case class CC_D[E, F, G](a: CC_A) extends T_B[F, E]
case class CC_E[H](a: T_A[H], b: CC_C[H], c: CC_B) extends T_B[T_A[(Char,Char)], H]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_D (CC_B (T_A Boolean))
//      (CC_B Boolean)
//      Boolean
//      Wildcard
//      (T_B (CC_B Boolean) (CC_B (T_A Boolean))))
// This is not matched: (CC_D Boolean
//      (T_B (CC_A Byte Char (T_A Boolean Boolean) Boolean) (T_A Byte Char)))