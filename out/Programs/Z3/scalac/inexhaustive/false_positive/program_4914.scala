package Program_14 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: (Int,Byte), c: T_B[Int, Byte]) extends T_A[Int]
case class CC_B[D, E](a: T_A[E]) extends T_A[D]
case class CC_C[F, G](a: T_B[G, G], b: G, c: F) extends T_B[G, F]
case class CC_D[H, I](a: CC_C[I, CC_A], b: H, c: I) extends T_B[H, (CC_A,CC_A)]

val v_a: CC_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B Char
//      Boolean
//      (CC_B Boolean
//            Boolean
//            (CC_B Boolean Boolean Wildcard (T_A Boolean))
//            (T_A Boolean))
//      (T_A Char))
// This is not matched: (CC_E T_A
//      Wildcard
//      (CC_A Wildcard Wildcard Wildcard T_A)
//      (T_B (Tuple (CC_B T_A T_A T_A) T_A) T_A))