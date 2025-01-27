package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Int, Boolean],T_A[Char]), b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: E, b: Boolean, c: T_A[E]) extends T_B[E, T_A[E]]
case class CC_C() extends T_B[T_A[(Char,Byte)], T_A[T_A[(Char,Byte)]]]

val v_a: T_B[T_A[(Char,Byte)], T_A[T_A[(Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), true, CC_A((_,_), _, CC_A(_, _, _))) => 0 
  case CC_B(CC_A(_, _, _), false, CC_A((_,_), _, CC_A(_, _, _))) => 1 
  case CC_C() => 2 
}
}