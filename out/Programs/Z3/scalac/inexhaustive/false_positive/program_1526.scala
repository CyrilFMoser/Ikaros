package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[T_B[Byte], T_B[Char]]
case class CC_B(a: Int) extends T_B[Char]

val v_a: T_A[T_B[Byte], T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_B Byte) (T_B Char)))
// This is not matched: Pattern match is empty without constants