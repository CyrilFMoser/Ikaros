package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (T_A[Int],T_A[Byte]), c: T_A[T_A[Int]]) extends T_A[Byte]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[Byte]
case class CC_C() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(CC_A(_, _, _), (_,_), _), CC_A(CC_A(_, _, _), _, _), _) => 1 
  case CC_B(CC_A(CC_B(_, _, _), (_,_), _), CC_A(CC_A(_, _, _), _, _), _) => 2 
  case CC_B(CC_A(CC_C(), (_,_), _), CC_A(CC_A(_, _, _), _, _), _) => 3 
  case CC_B(CC_A(CC_A(_, _, _), (_,_), _), CC_A(CC_B(_, _, _), _, _), _) => 4 
  case CC_B(CC_A(CC_B(_, _, _), (_,_), _), CC_A(CC_B(_, _, _), _, _), _) => 5 
  case CC_B(CC_A(CC_C(), (_,_), _), CC_A(CC_B(_, _, _), _, _), _) => 6 
  case CC_B(CC_A(CC_A(_, _, _), (_,_), _), CC_A(CC_C(), _, _), _) => 7 
  case CC_B(CC_A(CC_B(_, _, _), (_,_), _), CC_A(CC_C(), _, _), _) => 8 
  case CC_B(CC_A(CC_C(), (_,_), _), CC_A(CC_C(), _, _), _) => 9 
  case CC_C() => 10 
}
}