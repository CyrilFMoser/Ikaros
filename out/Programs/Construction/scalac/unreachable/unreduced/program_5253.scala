package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[T_A[(Int,Boolean), Byte], T_A[Int, Int]]]
case class CC_B[D](a: (T_A[Byte, Int],Byte)) extends T_A[D, T_A[T_A[(Int,Boolean), Byte], T_A[Int, Int]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[(Int,Boolean), Byte], T_A[Int, Int]]]

val v_a: T_A[Byte, T_A[T_A[(Int,Boolean), Byte], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,0)) => 1 
  case CC_B((_,_)) => 2 
  case CC_C() => 3 
}
}