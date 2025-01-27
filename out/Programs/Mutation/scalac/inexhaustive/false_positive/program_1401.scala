package Program_60 

package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[T_B[(Byte,Byte), (Byte,Int)]]
case class CC_B[E, F](a: CC_A[F], b: T_A[E], c: T_A[E]) extends T_B[F, E]

val v_a: T_A[T_B[(Byte,Byte), (Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_B (Tuple Byte Byte) (Tuple Byte Int))))
// This is not matched: (CC_B Byte Wildcard Wildcard (CC_A Byte (T_A Byte)) (T_A Byte))
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 4 to a constant expression:
// {
//  'x'
// }
//