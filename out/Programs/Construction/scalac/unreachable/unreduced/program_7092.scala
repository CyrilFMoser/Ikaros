package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: D) extends T_A[T_B, D]
case class CC_C[E](a: T_A[T_B, E], b: (T_A[Char, T_B],T_A[T_B, T_B])) extends T_A[T_B, E]
case class CC_D() extends T_B
case class CC_E(a: CC_A[Byte], b: CC_B[CC_C[CC_D]], c: T_A[T_B, T_A[CC_D, T_B]]) extends T_B

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, (_,CC_A())) => 2 
  case CC_C(_, (_,CC_B(_))) => 3 
  case CC_C(_, (_,CC_C(_, _))) => 4 
}
}