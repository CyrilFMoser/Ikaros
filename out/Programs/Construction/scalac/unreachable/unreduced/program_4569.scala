package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: ((T_B,T_B),T_A[Int]), c: T_A[T_A[T_B]]) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: (T_B,T_B), b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: CC_B, b: T_B, c: CC_B) extends T_B
case class CC_D(a: CC_A, b: Byte, c: (T_A[(Int,Byte)],(T_B,T_B))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_C(_, _, _)), CC_C(_, _, _), CC_B(_, CC_C(_, _, _))) => 0 
  case CC_C(CC_B(_, CC_C(_, _, _)), CC_D(CC_A(_, _, _), _, (_,_)), CC_B(_, CC_C(_, _, _))) => 1 
  case CC_C(CC_B(_, CC_D(_, _, _)), CC_C(_, _, _), CC_B(_, CC_C(_, _, _))) => 2 
  case CC_C(CC_B(_, CC_D(_, _, _)), CC_D(CC_A(_, _, _), _, (_,_)), CC_B(_, CC_C(_, _, _))) => 3 
  case CC_C(CC_B(_, CC_C(_, _, _)), CC_C(_, _, _), CC_B(_, CC_D(_, _, _))) => 4 
  case CC_C(CC_B(_, CC_C(_, _, _)), CC_D(CC_A(_, _, _), _, (_,_)), CC_B(_, CC_D(_, _, _))) => 5 
  case CC_C(CC_B(_, CC_D(_, _, _)), CC_C(_, _, _), CC_B(_, CC_D(_, _, _))) => 6 
  case CC_C(CC_B(_, CC_D(_, _, _)), CC_D(CC_A(_, _, _), _, (_,_)), CC_B(_, CC_D(_, _, _))) => 7 
  case CC_D(_, _, _) => 8 
}
}