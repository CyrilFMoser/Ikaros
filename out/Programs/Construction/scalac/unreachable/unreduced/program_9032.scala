package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Boolean, b: T_B[T_A[Byte, Int]]) extends T_A[T_A[T_B[Char], Byte], Int]
case class CC_B(a: CC_A, b: (T_A[CC_A, (Int,Boolean)],T_B[CC_A])) extends T_A[T_A[T_B[Char], Byte], Int]
case class CC_C[D]() extends T_A[T_A[T_B[Char], Byte], Int]
case class CC_D[E, F]() extends T_B[E]

val v_a: T_A[T_A[T_B[Char], Byte], Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), (_,CC_D())) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, CC_D())