package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[T_B, C]) extends T_A[C, Byte]
case class CC_B[D]() extends T_A[D, Byte]
case class CC_C[E](a: T_A[E, Byte], b: T_A[E, Byte], c: E) extends T_A[E, Byte]
case class CC_D(a: CC_B[T_B], b: (T_A[T_B, Byte],CC_A[T_B])) extends T_B
case class CC_E(a: T_A[(CC_D,T_B), Byte], b: CC_B[Boolean]) extends T_B

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _), CC_A(_, _), _) => 2 
  case CC_C(CC_B(), CC_A(_, _), _) => 3 
  case CC_C(CC_C(CC_A(_, _), _, _), CC_A(_, _), _) => 4 
  case CC_C(CC_C(CC_B(), _, _), CC_A(_, _), _) => 5 
  case CC_C(CC_C(CC_C(_, _, _), _, _), CC_A(_, _), _) => 6 
  case CC_C(CC_A(_, _), CC_B(), _) => 7 
  case CC_C(CC_B(), CC_B(), _) => 8 
  case CC_C(CC_C(CC_A(_, _), _, _), CC_B(), _) => 9 
  case CC_C(CC_C(CC_B(), _, _), CC_B(), _) => 10 
  case CC_C(CC_C(CC_C(_, _, _), _, _), CC_B(), _) => 11 
  case CC_C(CC_A(_, _), CC_C(CC_A(_, _), _, _), _) => 12 
  case CC_C(CC_B(), CC_C(CC_A(_, _), _, _), _) => 13 
  case CC_C(CC_C(CC_A(_, _), _, _), CC_C(CC_A(_, _), _, _), _) => 14 
  case CC_C(CC_C(CC_B(), _, _), CC_C(CC_A(_, _), _, _), _) => 15 
  case CC_C(CC_C(CC_C(_, _, _), _, _), CC_C(CC_A(_, _), _, _), _) => 16 
  case CC_C(CC_A(_, _), CC_C(CC_B(), _, _), _) => 17 
  case CC_C(CC_B(), CC_C(CC_B(), _, _), _) => 18 
  case CC_C(CC_C(CC_A(_, _), _, _), CC_C(CC_B(), _, _), _) => 19 
  case CC_C(CC_C(CC_C(_, _, _), _, _), CC_C(CC_B(), _, _), _) => 20 
  case CC_C(CC_A(_, _), CC_C(CC_C(_, _, _), _, _), _) => 21 
  case CC_C(CC_B(), CC_C(CC_C(_, _, _), _, _), _) => 22 
  case CC_C(CC_C(CC_A(_, _), _, _), CC_C(CC_C(_, _, _), _, _), _) => 23 
  case CC_C(CC_C(CC_B(), _, _), CC_C(CC_C(_, _, _), _, _), _) => 24 
  case CC_C(CC_C(CC_C(_, _, _), _, _), CC_C(CC_C(_, _, _), _, _), _) => 25 
}
}
// This is not matched: CC_C(CC_C(CC_B(), _, _), CC_C(CC_B(), _, _), _)