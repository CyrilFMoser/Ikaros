package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: T_A[C, C], c: Byte) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D], b: T_B) extends T_A[T_B, D]
case class CC_C[E](a: (T_A[T_B, T_B],T_A[T_B, T_B]), b: T_A[T_B, E], c: E) extends T_A[T_B, E]
case class CC_D() extends T_B

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_A(CC_C(_, CC_A(_, _, _), _), _, _) => 2 
  case CC_A(CC_C(_, CC_B(_, _), _), _, _) => 3 
  case CC_A(CC_C(_, CC_C(_, _, _), _), _, _) => 4 
  case CC_B(CC_A(CC_A(_, _, _), _, _), CC_D()) => 5 
  case CC_B(CC_A(CC_B(_, _), _, _), CC_D()) => 6 
  case CC_B(CC_A(CC_C(_, _, _), _, _), CC_D()) => 7 
  case CC_B(CC_B(CC_A(_, _, _), _), CC_D()) => 8 
  case CC_B(CC_B(CC_B(_, _), _), CC_D()) => 9 
  case CC_B(CC_B(CC_C(_, _, _), _), CC_D()) => 10 
  case CC_B(CC_C(_, CC_A(_, _, _), _), CC_D()) => 11 
  case CC_B(CC_C(_, CC_B(_, _), _), CC_D()) => 12 
  case CC_B(CC_C(_, CC_C(_, _, _), _), CC_D()) => 13 
  case CC_C(_, CC_A(_, _, _), _) => 14 
  case CC_C(_, CC_B(CC_A(_, _, _), CC_D()), _) => 15 
  case CC_C(_, CC_B(CC_B(_, _), CC_D()), _) => 16 
  case CC_C(_, CC_B(CC_C(_, _, _), CC_D()), _) => 17 
  case CC_C(_, CC_C((_,_), _, _), _) => 18 
}
}