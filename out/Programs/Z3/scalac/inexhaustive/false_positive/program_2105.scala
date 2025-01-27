package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(Boolean,(Char,Byte))]
case class CC_B[C](a: T_B[C], b: T_B[C]) extends T_B[(CC_A,CC_A)]

val v_a: T_B[(CC_A,CC_A)] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_B(CC_B(_, _), _) => 1 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 2 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_B (Tuple (CC_A Boolean) (CC_A Boolean))))
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_B (Tuple (CC_A Boolean) (CC_A Boolean))))