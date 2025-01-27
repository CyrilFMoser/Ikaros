package Program_30 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[Byte, Char], b: T_A[(Boolean,Int), Char]) extends T_A[T_A[T_A[(Boolean,Boolean), Int], T_A[(Boolean,Boolean), Int]], T_A[(Boolean,Boolean), Int]]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A (T_A Boolean Boolean) Boolean))
// This is not matched: Pattern match is empty without constants