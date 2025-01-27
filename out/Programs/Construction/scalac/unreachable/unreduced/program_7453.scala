package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Byte], c: T_A[T_A[Int]]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), _, _), _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_A(CC_A(_, _, _), _, _), _) => 1 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), _, _), _) => 2 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_A(CC_A(_, _, _), _, _), _) => 3 
  case CC_A(CC_B(), CC_A(CC_A(_, _, _), _, _), _) => 4 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_B(), _, _), _) => 5 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_A(CC_B(), _, _), _) => 6 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_A(CC_B(), _, _), _) => 7 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_A(CC_B(), _, _), _) => 8 
  case CC_A(CC_B(), CC_A(CC_B(), _, _), _) => 9 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(), _) => 10 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_B(), _) => 11 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_B(), _) => 12 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_B(), _) => 13 
  case CC_A(CC_B(), CC_B(), _) => 14 
  case CC_B() => 15 
}
}