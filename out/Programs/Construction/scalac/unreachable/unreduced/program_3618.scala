package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B[D](a: Boolean, b: T_B[D], c: T_A[D]) extends T_A[D]
case class CC_C(a: Byte, b: T_A[T_B[Char]]) extends T_B[CC_A[Char]]
case class CC_D() extends T_B[CC_A[Char]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B(_, _, CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 2 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), CC_B(_, _, CC_A(_, _, _))) => 4 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 5 
  case CC_A(_, CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 6 
  case CC_A(_, CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), CC_B(_, _, CC_A(_, _, _))) => 7 
  case CC_A(_, CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 8 
  case CC_A(_, CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, _, _)) => 9 
  case CC_A(_, CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, CC_A(_, _, _))) => 10 
  case CC_A(_, CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 11 
  case CC_A(_, CC_B(_, _, _), CC_A(_, _, _)) => 12 
  case CC_A(_, CC_B(_, _, _), CC_B(_, _, CC_A(_, _, _))) => 13 
  case CC_A(_, CC_B(_, _, _), CC_B(_, _, CC_B(_, _, _))) => 14 
  case CC_B(true, _, CC_A(_, CC_A(_, _, _), _)) => 15 
  case CC_B(true, _, CC_A(_, CC_B(_, _, _), _)) => 16 
  case CC_B(true, _, CC_B(_, _, _)) => 17 
  case CC_B(false, _, CC_A(_, CC_A(_, _, _), _)) => 18 
  case CC_B(false, _, CC_A(_, CC_B(_, _, _), _)) => 19 
  case CC_B(false, _, CC_B(_, _, _)) => 20 
}
}