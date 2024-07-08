package Program_24 

 object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: T_A[C, Int]) extends T_A[C, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_A(CC_A(_, _), _) => 2 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(_, _)) => 3 
  case CC_A(CC_A(CC_A(_, _), _), _) => 4 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 5 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 6 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 7 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(_, CC_A(_, _))) => 8 
  case CC_A(_, CC_A(_, _)) => 9 
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_A(_, _))) => 10 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), _)) => 11 
  case CC_A(CC_A(_, CC_A(_, _)), _) => 12 
}
}