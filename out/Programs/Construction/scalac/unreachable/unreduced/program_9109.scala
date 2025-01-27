package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Byte, c: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[(Byte,Boolean)], b: Char, c: D) extends T_A[D]
case class CC_C(a: CC_A[CC_B[Char]]) extends T_A[T_B[T_A[Char]]]
case class CC_D(a: Byte, b: Byte, c: Byte) extends T_B[CC_B[T_A[(Int,Boolean)]]]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_A(_, 0, CC_A(CC_B(_, _, _), _, CC_A(_, _, _))) => 1 
  case CC_A(_, 0, CC_A(CC_C(_), _, CC_A(_, _, _))) => 2 
  case CC_A(_, 0, CC_A(CC_A(_, _, _), _, CC_B(_, _, _))) => 3 
  case CC_A(_, 0, CC_A(CC_B(_, _, _), _, CC_B(_, _, _))) => 4 
  case CC_A(_, 0, CC_A(CC_C(_), _, CC_B(_, _, _))) => 5 
  case CC_A(_, 0, CC_A(CC_A(_, _, _), _, CC_C(_))) => 6 
  case CC_A(_, 0, CC_A(CC_B(_, _, _), _, CC_C(_))) => 7 
  case CC_A(_, 0, CC_A(CC_C(_), _, CC_C(_))) => 8 
  case CC_A(_, 0, CC_B(_, _, _)) => 9 
  case CC_A(_, 0, CC_C(CC_A(_, _, _))) => 10 
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 11 
  case CC_A(_, _, CC_A(CC_B(_, _, _), _, CC_A(_, _, _))) => 12 
  case CC_A(_, _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 13 
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, CC_B(_, _, _))) => 14 
  case CC_A(_, _, CC_A(CC_B(_, _, _), _, CC_B(_, _, _))) => 15 
  case CC_A(_, _, CC_A(CC_C(_), _, CC_B(_, _, _))) => 16 
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 17 
  case CC_A(_, _, CC_A(CC_B(_, _, _), _, CC_C(_))) => 18 
  case CC_A(_, _, CC_A(CC_C(_), _, CC_C(_))) => 19 
  case CC_A(_, _, CC_B(_, _, _)) => 20 
  case CC_A(_, _, CC_C(CC_A(_, _, _))) => 21 
  case CC_B(_, _, _) => 22 
  case CC_C(CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 23 
  case CC_C(CC_A(CC_A(_, _, _), _, CC_B(_, _, _))) => 24 
  case CC_C(CC_A(CC_B(_, _, _), _, CC_A(_, _, _))) => 25 
  case CC_C(CC_A(CC_B(_, _, _), _, CC_B(_, _, _))) => 26 
}
}