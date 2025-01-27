package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: T_B[T_A, (T_A,T_A)]) extends T_A
case class CC_B[C](a: T_B[C, C], b: T_B[C, C], c: T_B[C, C]) extends T_B[T_A, C]
case class CC_C[D](a: Byte) extends T_B[T_A, D]
case class CC_D[E](a: T_B[T_A, E], b: T_B[T_A, E]) extends T_B[T_A, E]

val v_a: T_B[T_A, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(_, CC_B(_, _, _)) => 1 
  case CC_D(_, CC_C(_)) => 2 
  case CC_D(_, CC_D(_, _)) => 3 
}
}
// This is not matched: CC_C(_)