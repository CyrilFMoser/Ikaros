package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, Byte]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: Boolean, b: F) extends T_A[F, (Boolean,Boolean)]
case class CC_C[H, G, I](a: T_A[G, H], b: (Boolean,Boolean), c: Byte) extends T_B[H, G]

val v_a: T_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_C(_, (_,_), _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: (CC_C Byte Char Boolean Wildcard Wildcard Wildcard (T_B Byte Char))
// This is not matched: (CC_B Byte Wildcard (CC_D Byte Byte Wildcard (T_B Byte Byte)) (T_A Byte))