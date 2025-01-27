package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: B, b: (Byte,T_B), c: (T_B,T_B)) extends T_A[B]
case class CC_B[D](a: T_A[T_B], b: (T_B,T_B)) extends T_A[D]
case class CC_C(a: CC_B[T_B]) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, (_,CC_C(_)), _) => 0 
  case CC_A(_, (0,CC_C(_)), (CC_C(_),CC_C(_))) => 1 
  case CC_A(_, (_,CC_C(_)), (CC_C(_),CC_C(_))) => 2 
  case CC_B(CC_B(_, _), (CC_C(_),CC_C(_))) => 3 
  case CC_B(_, (CC_C(_),CC_C(_))) => 4 
}
}
// This is not matched: (CC_A Byte T_B Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_B Wildcard Wildcard T_B)