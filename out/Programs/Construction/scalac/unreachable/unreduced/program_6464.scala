package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C(a: Byte, b: T_A[T_B, T_A[T_B, T_B]], c: (Boolean,CC_A[T_B])) extends T_A[T_A[Byte, T_A[Byte, Byte]], T_A[T_A[Byte, T_A[Byte, Byte]], T_A[Byte, T_A[Byte, Byte]]]]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_B, T_A[T_B, T_B]], b: (Boolean,T_A[CC_D, T_B]), c: T_A[CC_D, (CC_C,(Boolean,Byte))]) extends T_B

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, CC_D())) => 0 
  case CC_B(CC_B(CC_A(_, _), _), CC_A(_, CC_D())) => 1 
  case CC_B(CC_B(CC_B(_, _), _), CC_A(_, CC_D())) => 2 
  case CC_B(CC_A(_, _), CC_A(_, CC_E(_, _, _))) => 3 
  case CC_B(CC_B(CC_A(_, _), _), CC_A(_, CC_E(_, _, _))) => 4 
  case CC_B(CC_B(CC_B(_, _), _), CC_A(_, CC_E(_, _, _))) => 5 
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), CC_A(_, _))) => 6 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_A(_, _), CC_A(_, _))) => 7 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_A(_, _), CC_A(_, _))) => 8 
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), CC_B(_, _))) => 9 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_A(_, _), CC_B(_, _))) => 10 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_A(_, _), CC_B(_, _))) => 11 
  case CC_B(CC_A(_, _), CC_B(CC_B(_, _), CC_A(_, _))) => 12 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_B(_, _), CC_A(_, _))) => 13 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_A(_, _))) => 14 
  case CC_B(CC_A(_, _), CC_B(CC_B(_, _), CC_B(_, _))) => 15 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_B(_, _), CC_B(_, _))) => 16 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_B(_, _))) => 17 
}
}