package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Char,Byte), Byte]) extends T_A[T_B[Int, Char]]
case class CC_B[E, D, F]() extends T_B[E, D]
case class CC_C[H, G](a: CC_B[G, G, G], b: H) extends T_B[G, H]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: (CC_B Byte Byte Boolean (T_B Byte Byte))
// This is not matched: (CC_A (CC_B Wildcard Char T_A) Wildcard T_A)