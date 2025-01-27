package Program_31 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: Byte) extends T_A[E, D]
case class CC_B[H, G](a: H, b: T_A[G, H], c: CC_A[H, H, Byte]) extends T_A[G, H]
case class CC_C(a: T_A[Boolean, Int], b: T_A[(Int,Char), (Byte,Byte)]) extends T_B[T_B[Int]]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), _) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
}
}
// This is not matched: (CC_B Boolean
//      Byte
//      Wildcard
//      (CC_A Byte Boolean (T_A Boolean Boolean) Byte (T_A Byte Boolean))
//      (CC_A Boolean Boolean Byte Byte (T_A Boolean Boolean))
//      (T_A Byte Boolean))
// This is not matched: (CC_C Char Wildcard (T_B (CC_A Boolean Boolean Boolean) Char))