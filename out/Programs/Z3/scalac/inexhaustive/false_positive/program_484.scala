package Program_30 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E]) extends T_A[D]
case class CC_B(a: T_A[Char], b: (Boolean,(Boolean,Char))) extends T_A[T_A[(Byte,Char)]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants