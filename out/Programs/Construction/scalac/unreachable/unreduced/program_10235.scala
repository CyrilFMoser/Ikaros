package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: T_A[C, T_A[C, C]]) extends T_A[C, Byte]
case class CC_B[D](a: T_A[T_A[Int, Int], Byte], b: T_A[D, Byte]) extends T_A[D, Byte]
case class CC_C[F](a: F, b: F) extends T_A[F, Byte]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_B(CC_A(_, _, _), CC_B(_, _)) => 1 
  case CC_B(CC_A(_, _, _), CC_C(_, _)) => 2 
  case CC_B(CC_B(_, CC_A(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_B(CC_B(_, CC_A(_, _, _)), CC_B(_, _)) => 4 
  case CC_B(CC_B(_, CC_A(_, _, _)), CC_C(_, _)) => 5 
  case CC_B(CC_B(_, CC_B(_, _)), CC_A(_, _, _)) => 6 
  case CC_B(CC_B(_, CC_B(_, _)), CC_B(_, _)) => 7 
  case CC_B(CC_B(_, CC_B(_, _)), CC_C(_, _)) => 8 
  case CC_B(CC_B(_, CC_C(_, _)), CC_A(_, _, _)) => 9 
  case CC_B(CC_B(_, CC_C(_, _)), CC_B(_, _)) => 10 
  case CC_B(CC_B(_, CC_C(_, _)), CC_C(_, _)) => 11 
  case CC_B(CC_C(_, _), CC_A(_, _, _)) => 12 
  case CC_B(CC_C(_, _), CC_B(_, _)) => 13 
  case CC_B(CC_C(_, _), CC_C(_, _)) => 14 
}
}