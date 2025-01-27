package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[Byte, C]) extends T_A[Byte, C]
case class CC_B(a: Int, b: T_A[T_A[Boolean, (Int,Int)], Char], c: Byte) extends T_A[Byte, (T_A[Boolean, Boolean],T_A[Char, Boolean])]
case class CC_C[D]() extends T_A[Byte, D]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_C())) => 1 
  case CC_A(_, _, CC_C()) => 2 
  case CC_C() => 3 
}
}