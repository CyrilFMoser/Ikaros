package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[Int, T_B],T_A[T_B, (Int,Boolean)])) extends T_A[T_A[T_B, Byte], C]
case class CC_B[D](a: CC_A[D], b: T_A[T_A[T_B, Byte], D]) extends T_A[T_A[T_B, Byte], D]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[T_B, Byte], T_A[T_B, T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A((_,_))) => 1 
  case CC_D(CC_B(_, CC_A(_))) => 2 
}
}
// This is not matched: CC_D(CC_B(_, CC_B(_, _)))