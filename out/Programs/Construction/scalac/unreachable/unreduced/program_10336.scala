package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Byte,Char),T_A[Char, Byte]), b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _) => 0 
  case CC_B() => 1 
}
}