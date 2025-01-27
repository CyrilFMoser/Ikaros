package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[T_A[Int]], c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: Boolean, b: (Char,CC_A), c: T_A[Char]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(_, CC_B(true, (_,_), _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_A(_, CC_B(false, (_,_), _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_B(_, _, _), CC_A(_, _, _))) => 3 
  case CC_A(_, CC_B(true, (_,_), _), CC_A(_, CC_B(_, _, _), CC_A(_, _, _))) => 4 
  case CC_A(_, CC_B(false, (_,_), _), CC_A(_, CC_B(_, _, _), CC_A(_, _, _))) => 5 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_A(_, _, _), CC_B(_, _, _))) => 6 
  case CC_A(_, CC_B(true, (_,_), _), CC_A(_, CC_A(_, _, _), CC_B(_, _, _))) => 7 
  case CC_A(_, CC_B(false, (_,_), _), CC_A(_, CC_A(_, _, _), CC_B(_, _, _))) => 8 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_B(_, _, _), CC_B(_, _, _))) => 9 
  case CC_A(_, CC_B(true, (_,_), _), CC_A(_, CC_B(_, _, _), CC_B(_, _, _))) => 10 
  case CC_A(_, CC_B(false, (_,_), _), CC_A(_, CC_B(_, _, _), CC_B(_, _, _))) => 11 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _, _)) => 12 
  case CC_A(_, CC_B(true, (_,_), _), CC_B(_, _, _)) => 13 
  case CC_A(_, CC_B(false, (_,_), _), CC_B(_, _, _)) => 14 
  case CC_B(_, _, _) => 15 
}
}