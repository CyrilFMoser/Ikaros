package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A) extends T_A[T_A[Byte]]
case class CC_C[D, E](a: CC_A) extends T_B[D, (CC_A,T_B[CC_B, Boolean])]
case class CC_D(a: Int, b: T_A[T_A[Byte]], c: T_B[T_A[(Char,Int)], CC_B]) extends T_B[CC_A, (CC_A,T_B[CC_B, Boolean])]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, CC_B(_, _))) => 1 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(_, CC_A(_, _))) => 2 
  case CC_A(CC_A(_, CC_B(_, _)), CC_A(_, CC_A(_, _))) => 3 
  case CC_A(CC_A(_, CC_B(_, _)), CC_A(_, CC_B(_, _))) => 4 
  case CC_A(CC_A(_, CC_B(_, _)), CC_B(_, CC_A(_, _))) => 5 
  case CC_A(CC_B(_, _), CC_A(_, CC_A(_, _))) => 6 
  case CC_A(CC_B(_, _), CC_B(_, CC_A(_, _))) => 7 
  case CC_B(_, CC_A(CC_A(_, _), CC_A(_, _))) => 8 
  case CC_B(_, CC_A(CC_B(_, _), CC_A(_, _))) => 9 
  case CC_B(_, CC_A(CC_A(_, _), CC_B(_, _))) => 10 
  case CC_B(_, CC_A(CC_B(_, _), CC_B(_, _))) => 11 
}
}
// This is not matched: CC_A(CC_B(_, _), CC_A(_, CC_B(_, _)))