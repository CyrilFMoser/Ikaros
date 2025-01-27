package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, Char]], C]
case class CC_B[D](a: T_B, b: CC_A[D], c: (T_A[T_B, Char],Int)) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, Char]], D]
case class CC_C(a: T_B, b: T_B, c: CC_A[Byte]) extends T_B
case class CC_D(a: (T_A[T_B, T_B],T_A[Char, (Char,Byte)])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, CC_A(_)), CC_C(_, _, CC_A(_)), CC_A(true)) => 0 
  case CC_C(CC_C(_, _, CC_A(_)), CC_C(_, _, CC_A(_)), CC_A(false)) => 1 
  case CC_C(CC_D((_,_)), CC_C(_, _, CC_A(_)), CC_A(true)) => 2 
  case CC_C(CC_D((_,_)), CC_C(_, _, CC_A(_)), CC_A(false)) => 3 
  case CC_C(CC_C(_, _, CC_A(_)), CC_D((_,_)), CC_A(true)) => 4 
  case CC_C(CC_C(_, _, CC_A(_)), CC_D((_,_)), CC_A(false)) => 5 
  case CC_C(CC_D((_,_)), CC_D((_,_)), CC_A(true)) => 6 
  case CC_C(CC_D((_,_)), CC_D((_,_)), CC_A(false)) => 7 
  case CC_D((_,_)) => 8 
}
}