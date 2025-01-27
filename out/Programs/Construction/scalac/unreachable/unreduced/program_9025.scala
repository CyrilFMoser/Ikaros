package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[(Boolean,Byte), T_A[Byte, Int]], b: T_A[T_A[Boolean, Byte], T_B[Int, Char]], c: T_A[T_A[Char, Boolean], T_A[Byte, Boolean]]) extends T_A[T_A[Byte, Boolean], Int]
case class CC_B(a: T_A[T_A[Byte, Boolean], Int], b: (T_A[CC_A, Byte],T_A[CC_A, CC_A])) extends T_A[T_A[Byte, Boolean], Int]
case class CC_C() extends T_A[T_A[Byte, Boolean], Int]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_B(CC_B(CC_A(_, _, _), (_,_)), _) => 1 
  case CC_B(CC_B(CC_B(_, _), (_,_)), _) => 2 
  case CC_B(CC_B(CC_C(), (_,_)), _) => 3 
  case CC_B(CC_C(), _) => 4 
}
}