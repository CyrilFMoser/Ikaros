package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Char], Byte]]
case class CC_B[D]() extends T_A[T_A[(Char,Boolean), (Byte,Byte)], T_A[T_A[Int, Char], Byte]]
case class CC_C(a: CC_A[CC_A[Boolean]]) extends T_A[T_A[(Char,Boolean), (Byte,Byte)], T_A[T_A[Int, Char], Byte]]

val v_a: T_A[T_A[(Char,Boolean), (Byte,Byte)], T_A[T_A[Int, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _)) => 2 
}
}