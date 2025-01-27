package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(T_B[(Int,Boolean), Int],(Byte,Byte)), E]
case class CC_B[F, G](a: T_B[F, G], b: T_A[F, G], c: T_A[F, F]) extends T_A[F, G]
case class CC_C[H]() extends T_B[T_A[H, H], H]

val v_a: T_A[(T_B[(Int,Boolean), Int],(Byte,Byte)), Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), CC_A()) => 1 
  case CC_B(_, CC_B(_, _, _), CC_A()) => 2 
  case CC_B(_, CC_A(), CC_B(_, CC_A(), CC_A())) => 3 
  case CC_B(_, CC_B(_, _, _), CC_B(_, CC_A(), CC_A())) => 4 
  case CC_B(_, CC_A(), CC_B(_, CC_A(), CC_B(_, _, _))) => 5 
  case CC_B(_, CC_B(_, _, _), CC_B(_, CC_A(), CC_B(_, _, _))) => 6 
  case CC_B(_, CC_B(_, _, _), CC_B(_, CC_B(_, _, _), CC_A())) => 7 
  case CC_B(_, CC_A(), CC_B(_, CC_B(_, _, _), CC_B(_, _, _))) => 8 
  case CC_B(_, CC_B(_, _, _), CC_B(_, CC_B(_, _, _), CC_B(_, _, _))) => 9 
}
}
// This is not matched: CC_B(_, CC_A(), CC_B(_, CC_B(_, _, _), CC_A()))