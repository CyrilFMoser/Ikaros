package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, Byte], C], b: T_A[T_A[C, Byte], C]) extends T_A[T_A[C, Byte], C]
case class CC_B() extends T_A[T_A[CC_A[CC_A[(Char,Boolean)]], Byte], CC_A[CC_A[(Char,Boolean)]]]
case class CC_C[D](a: CC_A[D], b: T_A[D, D]) extends T_A[T_A[D, Byte], D]

val v_a: T_A[T_A[Char, Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_C(CC_A(_, _), _)) => 1 
  case CC_A(CC_A(CC_C(_, _), CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_A(CC_A(CC_C(_, _), CC_A(_, _)), CC_C(CC_A(_, _), _)) => 3 
  case CC_A(CC_A(CC_A(_, _), CC_C(_, _)), CC_A(_, _)) => 4 
  case CC_A(CC_A(CC_A(_, _), CC_C(_, _)), CC_C(CC_A(_, _), _)) => 5 
  case CC_A(CC_A(CC_C(_, _), CC_C(_, _)), CC_A(_, _)) => 6 
  case CC_A(CC_A(CC_C(_, _), CC_C(_, _)), CC_C(CC_A(_, _), _)) => 7 
  case CC_A(CC_C(CC_A(_, _), _), CC_A(_, _)) => 8 
  case CC_A(CC_C(CC_A(_, _), _), CC_C(CC_A(_, _), _)) => 9 
  case CC_C(CC_A(CC_A(_, _), CC_A(_, _)), _) => 10 
  case CC_C(CC_A(CC_C(_, _), CC_A(_, _)), _) => 11 
  case CC_C(CC_A(CC_A(_, _), CC_C(_, _)), _) => 12 
  case CC_C(CC_A(CC_C(_, _), CC_C(_, _)), _) => 13 
}
}