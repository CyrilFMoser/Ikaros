package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Byte], c: Byte) extends T_A[Byte]
case class CC_B(a: Byte) extends T_A[Byte]
case class CC_C(a: CC_B, b: CC_A, c: T_A[CC_A]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_A(_, _, 0), _) => 0 
  case CC_A(CC_A(_, CC_B(_), _), CC_A(_, _, 0), _) => 1 
  case CC_A(CC_A(_, CC_C(_, _, _), _), CC_A(_, _, 0), _) => 2 
  case CC_A(CC_B(_), CC_A(_, _, 0), _) => 3 
  case CC_A(CC_C(_, _, _), CC_A(_, _, 0), _) => 4 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_A(_, _, _), _) => 5 
  case CC_A(CC_A(_, CC_B(_), _), CC_A(_, _, _), _) => 6 
  case CC_A(CC_A(_, CC_C(_, _, _), _), CC_A(_, _, _), _) => 7 
  case CC_A(CC_B(_), CC_A(_, _, _), _) => 8 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), _) => 9 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_B(_), _) => 10 
  case CC_A(CC_A(_, CC_B(_), _), CC_B(_), _) => 11 
  case CC_A(CC_A(_, CC_C(_, _, _), _), CC_B(_), _) => 12 
  case CC_A(CC_B(_), CC_B(_), _) => 13 
  case CC_A(CC_C(_, _, _), CC_B(_), _) => 14 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_C(CC_B(_), CC_A(_, _, _), _), _) => 15 
  case CC_A(CC_A(_, CC_B(_), _), CC_C(CC_B(_), CC_A(_, _, _), _), _) => 16 
  case CC_A(CC_A(_, CC_C(_, _, _), _), CC_C(CC_B(_), CC_A(_, _, _), _), _) => 17 
  case CC_A(CC_B(_), CC_C(CC_B(_), CC_A(_, _, _), _), _) => 18 
  case CC_A(CC_C(_, _, _), CC_C(CC_B(_), CC_A(_, _, _), _), _) => 19 
  case CC_B(_) => 20 
  case CC_C(CC_B(_), CC_A(CC_A(_, _, _), _, _), _) => 21 
  case CC_C(CC_B(_), CC_A(CC_B(_), _, _), _) => 22 
  case CC_C(CC_B(_), CC_A(CC_C(_, _, _), _, _), _) => 23 
}
}