package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Boolean],T_A[Boolean, Char]), b: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Byte], Byte]]
case class CC_B(a: T_A[CC_A[(Char,Byte)], CC_A[(Boolean,Byte)]]) extends T_A[CC_A[T_A[Byte, Int]], T_A[T_A[Boolean, Byte], Byte]]
case class CC_C[D]() extends T_A[D, T_A[T_A[Boolean, Byte], Byte]]

val v_a: T_A[CC_A[T_A[Byte, Int]], T_A[T_A[Boolean, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}