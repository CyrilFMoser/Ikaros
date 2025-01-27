package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Byte, T_A], T_B[T_A, T_A]], b: (T_A,T_B[T_A, Char]), c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[C](a: T_A, b: T_A) extends T_B[C, T_A]
case class CC_D[D]() extends T_B[D, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_B(CC_A(_, _, CC_B(_))) => 1 
}
}
// This is not matched: CC_A(_, _, _)