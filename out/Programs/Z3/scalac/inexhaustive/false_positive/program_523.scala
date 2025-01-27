package Program_30 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E]() extends T_A[D]
case class CC_B[F](a: F) extends T_A[F]
case class CC_C[G]() extends T_B[G, T_A[Int]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char))
// This is not matched: Pattern match is empty without constants