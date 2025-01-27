package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[T_A[Boolean, Byte]], b: T_A[T_A[Int, (Boolean,Byte)], T_A[Byte, Byte]], c: T_A[T_A[Boolean, Boolean], CC_A[(Byte,Byte)]]) extends T_A[T_A[Char, T_A[Int, Byte]], T_A[T_A[Char, T_A[Int, Byte]], T_A[Char, T_A[Int, Byte]]]]
case class CC_C[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[T_A[Char, T_A[Int, Byte]], T_A[T_A[Char, T_A[Int, Byte]], T_A[Char, T_A[Int, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_A(_, _), _), _, _) => 1 
  case CC_B(CC_A(CC_C(_), _), _, _) => 2 
  case CC_C(CC_A(_, _)) => 3 
  case CC_C(CC_B(_, _, _)) => 4 
  case CC_C(CC_C(CC_A(_, _))) => 5 
  case CC_C(CC_C(CC_B(_, _, _))) => 6 
  case CC_C(CC_C(CC_C(_))) => 7 
}
}