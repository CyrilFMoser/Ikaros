package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Byte, b: (T_A[Int, Int],Byte)) extends T_A[T_A[D, D], D]
case class CC_C[E](a: Char, b: CC_B[E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_B(_, (_,_))) => 1 
}
}
// This is not matched: CC_A(_, _)