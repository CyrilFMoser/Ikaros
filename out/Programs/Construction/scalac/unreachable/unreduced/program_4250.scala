package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C) extends T_A[C]
case class CC_B[D](a: T_A[D], b: Byte) extends T_A[D]
case class CC_C(a: Int, b: T_A[T_A[Char]]) extends T_B[Char]
case class CC_D(a: T_A[((Byte,Boolean),(Boolean,Char))], b: T_A[Int], c: T_B[T_A[CC_C]]) extends T_B[Char]
case class CC_E(a: T_A[T_B[CC_C]], b: T_A[Char], c: Int) extends T_B[Char]

val v_a: CC_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_E(_, _, _)), CC_E(CC_A(_, _), CC_A(_, _), _)) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_E(_, _, _)), CC_E(CC_A(_, _), CC_B(_, _), _)) => 1 
  case CC_A(CC_A(CC_A(_, _), CC_E(_, _, _)), CC_E(CC_B(_, _), CC_A(_, _), _)) => 2 
  case CC_A(CC_A(CC_A(_, _), CC_E(_, _, _)), CC_E(CC_B(_, _), CC_B(_, _), _)) => 3 
  case CC_A(CC_A(CC_B(_, _), CC_E(_, _, _)), CC_E(CC_A(_, _), CC_A(_, _), _)) => 4 
  case CC_A(CC_A(CC_B(_, _), CC_E(_, _, _)), CC_E(CC_A(_, _), CC_B(_, _), _)) => 5 
  case CC_A(CC_A(CC_B(_, _), CC_E(_, _, _)), CC_E(CC_B(_, _), CC_A(_, _), _)) => 6 
  case CC_A(CC_A(CC_B(_, _), CC_E(_, _, _)), CC_E(CC_B(_, _), CC_B(_, _), _)) => 7 
  case CC_A(CC_B(CC_A(_, _), _), CC_E(CC_A(_, _), CC_A(_, _), _)) => 8 
  case CC_A(CC_B(CC_A(_, _), _), CC_E(CC_A(_, _), CC_B(_, _), _)) => 9 
  case CC_A(CC_B(CC_A(_, _), _), CC_E(CC_B(_, _), CC_A(_, _), _)) => 10 
  case CC_A(CC_B(CC_A(_, _), _), CC_E(CC_B(_, _), CC_B(_, _), _)) => 11 
  case CC_A(CC_B(CC_B(_, _), _), CC_E(CC_A(_, _), CC_A(_, _), _)) => 12 
  case CC_A(CC_B(CC_B(_, _), _), CC_E(CC_A(_, _), CC_B(_, _), _)) => 13 
  case CC_A(CC_B(CC_B(_, _), _), CC_E(CC_B(_, _), CC_A(_, _), _)) => 14 
  case CC_A(CC_B(CC_B(_, _), _), CC_E(CC_B(_, _), CC_B(_, _), _)) => 15 
}
}