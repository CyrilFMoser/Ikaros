package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E) extends T_A[E, F]
case class CC_B[G, H, I]() extends T_A[G, H]
case class CC_C[J](a: (Boolean,Int), b: Char, c: J) extends T_B[J, T_A[Int, Byte]]
case class CC_D[L, K](a: CC_A[K, K], b: T_B[K, K], c: T_B[K, L]) extends T_B[L, K]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(0) => 1 
  case CC_B() => 2 
}
}
// This is not matched: (CC_B Byte Char Boolean (T_A Byte Char))
// This is not matched: (CC_A Byte
//      Byte
//      Wildcard
//      (CC_A Byte Byte Wildcard Wildcard (T_A Byte Byte))
//      (T_A Byte Byte))