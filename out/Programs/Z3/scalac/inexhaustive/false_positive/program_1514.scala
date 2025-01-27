package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F]() extends T_A[E, D]
case class CC_B[G, H](a: H) extends T_A[H, G]
case class CC_C[I, J](a: T_A[J, I], b: T_A[Int, I]) extends T_A[J, I]
case class CC_D[K](a: K, b: Boolean) extends T_B[CC_B[(Char,Byte), (Byte,Byte)]]
case class CC_E() extends T_B[CC_B[(Char,Byte), (Byte,Byte)]]

val v_a: T_B[CC_B[(Char,Byte), (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: (CC_D Boolean
//      Wildcard
//      Wildcard
//      (T_B (CC_B (Tuple Char Byte) (Tuple Byte Byte) Boolean Boolean)))
// This is not matched: (CC_B T_A)