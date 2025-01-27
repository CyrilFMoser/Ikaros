package Program_15 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D, E](a: (T_B,Byte), b: T_A[E, T_B]) extends T_A[T_B, D]
case class CC_C(a: T_B, b: Char) extends T_A[T_B, (T_B,T_B)]
case class CC_D(a: Int, b: Char) extends T_B
case class CC_E(a: Byte, b: CC_C, c: T_A[T_B, T_B]) extends T_B

val v_a: CC_B[CC_D, Byte] = null
val v_b: Int = v_a match{
  case CC_B((CC_D(_, _),0), _) => 0 
  case CC_B((CC_D(_, _),_), _) => 1 
  case CC_B((CC_D(_, _),0), CC_A(_, _)) => 2 
  case CC_B((CC_E(_, _, _),0), CC_A(_, _)) => 3 
}
}
// This is not matched: (CC_B (CC_D T_B T_B (T_A T_B T_B))
//      Byte
//      (Tuple (CC_E Byte Wildcard Wildcard T_B) Wildcard)
//      Wildcard
//      (T_A T_B (CC_D T_B T_B (T_A T_B T_B))))
// This is not matched: (CC_A (CC_B Wildcard Wildcard Wildcard T_A) T_A)