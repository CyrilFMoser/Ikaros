package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Byte, Boolean],T_A[Char, Boolean])) extends T_A[C, Boolean]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: T_A[D, Boolean]) extends T_A[D, Boolean]
case class CC_C[E](a: T_A[E, Boolean], b: Byte, c: Byte) extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_A(_, (CC_A(_, _),CC_B(_, _, _))) => 1 
  case CC_A(_, (CC_A(_, _),CC_C(_, _, _))) => 2 
  case CC_A(_, (CC_B(_, _, _),CC_A(_, _))) => 3 
  case CC_A(_, (CC_B(_, _, _),CC_B(_, _, _))) => 4 
  case CC_A(_, (CC_B(_, _, _),CC_C(_, _, _))) => 5 
  case CC_A(_, (CC_C(_, _, _),CC_A(_, _))) => 6 
  case CC_A(_, (CC_C(_, _, _),CC_B(_, _, _))) => 7 
  case CC_A(_, (CC_C(_, _, _),CC_C(_, _, _))) => 8 
  case CC_B(_, _, _) => 9 
  case CC_C(_, _, _) => 10 
}
}