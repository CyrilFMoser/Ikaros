package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Int], c: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_A[CC_A], b: T_A[Byte], c: Byte) extends T_A[Byte]
case class CC_C(a: CC_A, b: T_A[Byte], c: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _, _))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C(_, _, _))) => 2 
  case CC_A(_, _, CC_B(_, CC_A(_, _, _), _)) => 3 
  case CC_A(_, _, CC_B(_, CC_B(_, _, _), _)) => 4 
  case CC_A(_, _, CC_B(_, CC_C(_, _, _), _)) => 5 
  case CC_A(_, _, CC_C(_, _, _)) => 6 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), _) => 7 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), _) => 8 
  case CC_B(_, CC_A(_, _, CC_C(_, _, _)), _) => 9 
  case CC_B(_, CC_B(_, CC_A(_, _, _), _), _) => 10 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 11 
  case CC_B(_, CC_B(_, CC_C(_, _, _), _), _) => 12 
  case CC_B(_, CC_C(_, CC_A(_, _, _), _), _) => 13 
  case CC_B(_, CC_C(_, CC_B(_, _, _), _), _) => 14 
  case CC_B(_, CC_C(_, CC_C(_, _, _), _), _) => 15 
  case CC_C(_, _, _) => 16 
}
}