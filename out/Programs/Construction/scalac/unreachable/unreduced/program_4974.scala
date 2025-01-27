package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Char, T_A[Byte, (Int,Byte)]]]
case class CC_B[D]() extends T_A[D, T_A[Char, T_A[Byte, (Int,Byte)]]]
case class CC_C(a: T_A[(Byte,Int), CC_A[Char]], b: T_A[CC_A[Char], Char], c: T_A[T_A[Char, Byte], Int]) extends T_A[CC_B[CC_B[Byte]], T_A[Char, T_A[Byte, (Int,Byte)]]]

val v_a: T_A[CC_B[CC_B[Byte]], T_A[Char, T_A[Byte, (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}