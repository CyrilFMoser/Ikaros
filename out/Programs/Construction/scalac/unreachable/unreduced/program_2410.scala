package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Boolean,Byte)], b: T_B[T_B[Byte]], c: Byte) extends T_A[T_B[(Boolean,Int)]]
case class CC_B[C](a: T_B[T_B[C]], b: T_B[C]) extends T_B[C]
case class CC_C[D](a: D, b: T_B[D], c: T_B[D]) extends T_B[D]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_C(_, _, _))) => 1 
  case CC_B(_, CC_C(_, CC_B(_, _), CC_B(_, _))) => 2 
  case CC_B(_, CC_C(_, CC_C(_, _, _), CC_B(_, _))) => 3 
  case CC_B(_, CC_C(_, CC_B(_, _), CC_C(_, _, _))) => 4 
  case CC_B(_, CC_C(_, CC_C(_, _, _), CC_C(_, _, _))) => 5 
  case CC_C(CC_A(_, _, _), CC_B(_, CC_B(_, _)), _) => 6 
  case CC_C(CC_A(_, _, _), CC_B(_, CC_C(_, _, _)), _) => 7 
  case CC_C(CC_A(_, _, _), CC_C(CC_A(_, _, _), _, CC_B(_, _)), _) => 8 
  case CC_C(CC_A(_, _, _), CC_C(CC_A(_, _, _), _, CC_C(_, _, _)), _) => 9 
}
}