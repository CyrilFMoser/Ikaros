package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Boolean],T_A[Int, Byte]), b: Byte, c: T_A[C, C]) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, (Boolean,Int)]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Byte], T_A[Byte, (Boolean,Int)]], D]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Byte, (Boolean,Int)]], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), 0, _) => 0 
  case CC_A((_,_), _, _) => 1 
  case CC_B() => 2 
}
}