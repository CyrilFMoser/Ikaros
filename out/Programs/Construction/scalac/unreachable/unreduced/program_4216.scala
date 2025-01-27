package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: Boolean) extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: ((CC_A,CC_A),T_A[Byte]), c: Byte) extends T_A[Byte]
case class CC_C[C]() extends T_B[C]
case class CC_D(a: CC_C[(CC_A,(Char,Char))], b: CC_B, c: T_B[Int]) extends T_B[Int]
case class CC_E(a: T_B[Int], b: T_A[CC_D]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_B(CC_A(_, _), (_,_), _), CC_C()) => 1 
  case CC_D(CC_C(), CC_B(CC_B(_, _, _), (_,_), _), CC_C()) => 2 
  case CC_D(CC_C(), CC_B(CC_A(_, _), (_,_), _), CC_D(_, _, _)) => 3 
  case CC_D(CC_C(), CC_B(CC_B(_, _, _), (_,_), _), CC_D(_, _, _)) => 4 
  case CC_D(CC_C(), CC_B(CC_A(_, _), (_,_), _), CC_E(CC_C(), _)) => 5 
  case CC_D(CC_C(), CC_B(CC_B(_, _, _), (_,_), _), CC_E(CC_C(), _)) => 6 
  case CC_D(CC_C(), CC_B(CC_A(_, _), (_,_), _), CC_E(CC_D(_, _, _), _)) => 7 
  case CC_D(CC_C(), CC_B(CC_B(_, _, _), (_,_), _), CC_E(CC_D(_, _, _), _)) => 8 
  case CC_D(CC_C(), CC_B(CC_A(_, _), (_,_), _), CC_E(CC_E(_, _), _)) => 9 
  case CC_D(CC_C(), CC_B(CC_B(_, _, _), (_,_), _), CC_E(CC_E(_, _), _)) => 10 
  case CC_E(_, _) => 11 
}
}