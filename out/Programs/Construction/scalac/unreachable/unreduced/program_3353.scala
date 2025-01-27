package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: T_A[T_B[(Int,Boolean)]]) extends T_B[(T_A[(Boolean,Byte)],Char)]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(CC_A(_))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
  case CC_B(CC_B(CC_C())) => 3 
  case CC_B(CC_C()) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_B(CC_A(_))