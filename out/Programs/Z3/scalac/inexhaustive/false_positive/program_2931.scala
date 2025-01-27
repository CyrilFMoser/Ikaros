package Program_13 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_A[D], c: D) extends T_A[D]
case class CC_B[E](a: T_A[Int]) extends T_A[E]
case class CC_C[F, G](a: CC_A[G], b: G) extends T_B[F, T_B[Boolean, Byte]]
case class CC_D[I, H]() extends T_B[I, H]
case class CC_E[J](a: CC_D[J, J], b: T_B[J, J], c: J) extends T_B[J, (Int,Byte)]

val v_a: T_B[Char, T_B[Boolean, Byte]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: (CC_C Char
//      Byte
//      (CC_A Byte Char (CC_B Byte Wildcard (T_A Byte)) Byte (T_A Byte))
//      Wildcard
//      (T_B Char (T_B Boolean Byte)))
// This is not matched: (CC_C T_A Wildcard T_A)