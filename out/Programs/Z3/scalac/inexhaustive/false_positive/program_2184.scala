package Program_30 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F, G]() extends T_A[F]
case class CC_D() extends T_B[T_A[Char], CC_A[Byte]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}
// This is not matched: (CC_C Boolean Boolean (T_A Boolean))
// This is not matched: (CC_C Boolean Boolean (T_A Boolean))