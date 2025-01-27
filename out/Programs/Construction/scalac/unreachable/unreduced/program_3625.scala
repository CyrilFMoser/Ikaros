package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: (Char,Char)) extends T_A[T_A[T_B[Boolean], T_B[Int]], D]
case class CC_B[E](a: Boolean, b: E, c: (CC_A[(Boolean,Byte)],Boolean)) extends T_A[T_A[(Boolean,Char), CC_A[Byte]], E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: T_B[G], b: T_B[T_B[G]], c: T_A[G, G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_C(), _) => 1 
  case CC_D(CC_C(), CC_D(CC_C(), CC_C(), _), _) => 2 
  case CC_D(CC_C(), CC_D(CC_D(_, _, _), CC_C(), _), _) => 3 
  case CC_D(CC_C(), CC_D(CC_C(), CC_D(_, _, _), _), _) => 4 
  case CC_D(CC_C(), CC_D(CC_D(_, _, _), CC_D(_, _, _), _), _) => 5 
  case CC_D(CC_D(_, CC_C(), _), CC_C(), _) => 6 
  case CC_D(CC_D(_, CC_C(), _), CC_D(CC_C(), CC_C(), _), _) => 7 
  case CC_D(CC_D(_, CC_C(), _), CC_D(CC_D(_, _, _), CC_C(), _), _) => 8 
  case CC_D(CC_D(_, CC_C(), _), CC_D(CC_C(), CC_D(_, _, _), _), _) => 9 
  case CC_D(CC_D(_, CC_C(), _), CC_D(CC_D(_, _, _), CC_D(_, _, _), _), _) => 10 
  case CC_D(CC_D(_, CC_D(_, _, _), _), CC_C(), _) => 11 
  case CC_D(CC_D(_, CC_D(_, _, _), _), CC_D(CC_C(), CC_C(), _), _) => 12 
  case CC_D(CC_D(_, CC_D(_, _, _), _), CC_D(CC_D(_, _, _), CC_C(), _), _) => 13 
  case CC_D(CC_D(_, CC_D(_, _, _), _), CC_D(CC_C(), CC_D(_, _, _), _), _) => 14 
  case CC_D(CC_D(_, CC_D(_, _, _), _), CC_D(CC_D(_, _, _), CC_D(_, _, _), _), _) => 15 
}
}