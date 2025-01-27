package Program_63 

package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[Byte, Int], T_A[Int, Byte]]

val v_a: T_A[T_A[Byte, Int], T_A[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Byte Int) (T_A Int Byte)))
// This is not matched: (CC_D Wildcard Wildcard (CC_D Byte Char Wildcard T_B) T_B)
// Mutation information: 
// Deleted Pattern CC_E(_, CC_C(), _) at position 6