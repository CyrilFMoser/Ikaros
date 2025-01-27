package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: C, c: C) extends T_A[T_A[Byte, Byte], T_A[Int, Char]]

val v_a: T_A[T_A[Byte, Byte], T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Byte Byte) (T_A Int Char)))
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Byte Byte) (T_A Int Char)))