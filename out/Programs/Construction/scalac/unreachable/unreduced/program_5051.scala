package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Boolean,Int), Byte], b: ((Boolean,Char),T_A[Byte])) extends T_A[T_B[Byte, T_B[(Char,Int), Boolean]]]
case class CC_B() extends T_A[CC_A]
case class CC_C() extends T_A[T_B[Byte, T_B[(Char,Int), Boolean]]]

val v_a: T_A[T_B[Byte, T_B[(Char,Int), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),_)) => 0 
  case CC_C() => 1 
}
}