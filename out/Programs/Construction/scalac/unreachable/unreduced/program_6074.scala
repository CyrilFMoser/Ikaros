package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Byte]], b: C, c: T_A[(Int,Char), Byte]) extends T_A[C, Byte]
case class CC_B[D](a: T_A[D, Byte]) extends T_A[D, Byte]
case class CC_C() extends T_A[T_A[T_A[(Int,Boolean), Byte], (Byte,Byte)], Byte]

val v_a: T_A[T_A[T_A[(Int,Boolean), Byte], (Byte,Byte)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(CC_A(_, _, _))) => 1 
  case CC_A(_, _, CC_B(CC_B(_))) => 2 
  case CC_B(CC_A(_, _, _)) => 3 
  case CC_B(CC_B(_)) => 4 
  case CC_B(CC_C()) => 5 
  case CC_C() => 6 
}
}