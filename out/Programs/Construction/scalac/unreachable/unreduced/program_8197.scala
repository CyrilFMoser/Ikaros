package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Char],Char), b: ((Boolean,Char),T_A[Byte, Byte])) extends T_A[T_A[T_A[Int, Boolean], (Boolean,Byte)], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Boolean], (Boolean,Byte)], D]

val v_a: T_A[T_A[T_A[Int, Boolean], (Boolean,Byte)], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), ((_,_),_)) => 0 
  case CC_B() => 1 
}
}