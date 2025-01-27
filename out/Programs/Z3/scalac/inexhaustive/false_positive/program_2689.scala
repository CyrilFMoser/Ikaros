package Program_31 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[Byte, Boolean], E]
case class CC_B[F](a: Byte) extends T_A[T_A[Byte, Boolean], F]
case class CC_C[G, H, I]() extends T_A[G, H]

val v_a: T_A[T_A[Byte, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(0) => 1 
  case CC_B(_) => 2 
  case CC_C() => 3 
}
}
// This is not matched: (CC_C (T_A Byte Boolean) Int Boolean (T_A (T_A Byte Boolean) Int))
// This is not matched: (CC_C (CC_A T_B T_B T_B T_B T_B) (T_A (CC_A T_B T_B T_B T_B T_B)))