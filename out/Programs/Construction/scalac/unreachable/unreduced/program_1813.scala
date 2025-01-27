package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[T_A[T_A[C, C], C], C]
case class CC_B(a: CC_A[T_A[Int, Boolean]], b: T_A[T_A[Boolean, Byte], T_A[Byte, Char]], c: CC_A[CC_A[Char]]) extends T_A[T_A[T_A[(Int,T_A[Byte, Byte]), (Int,T_A[Byte, Byte])], (Int,T_A[Byte, Byte])], (Int,T_A[Byte, Byte])]
case class CC_C() extends T_A[T_A[T_A[(Int,T_A[Byte, Byte]), (Int,T_A[Byte, Byte])], (Int,T_A[Byte, Byte])], (Int,T_A[Byte, Byte])]

val v_a: T_A[T_A[T_A[(Int,T_A[Byte, Byte]), (Int,T_A[Byte, Byte])], (Int,T_A[Byte, Byte])], (Int,T_A[Byte, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}