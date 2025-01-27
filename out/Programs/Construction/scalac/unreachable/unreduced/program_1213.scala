package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], T_B[Char, Boolean]]) extends T_A[T_B[((Byte,Char),Int), T_A[Byte]]]
case class CC_B() extends T_A[T_B[((Byte,Char),Int), T_A[Byte]]]
case class CC_C[D]() extends T_B[T_B[D, D], D]

val v_a: T_A[T_B[((Byte,Char),Int), T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}