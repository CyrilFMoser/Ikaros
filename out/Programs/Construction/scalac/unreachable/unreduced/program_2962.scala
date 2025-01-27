package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[Int, T_B]]) extends T_A[Int, C]
case class CC_B(a: CC_A[Int], b: T_B) extends T_B
case class CC_C(a: (Byte,T_A[Int, CC_B]), b: T_A[Int, T_B], c: T_A[Int, Byte]) extends T_B
case class CC_D(a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _)), CC_B(_, CC_B(_, _))) => 0 
  case CC_B(CC_A(_, CC_A(_, _)), CC_B(_, CC_C(_, _, _))) => 1 
  case CC_B(CC_A(_, CC_A(_, _)), CC_C(_, _, CC_A(_, _))) => 2 
  case CC_B(CC_A(_, CC_A(_, _)), CC_D(CC_B(_, _))) => 3 
  case CC_C((0,CC_A(_, _)), CC_A(_, _), CC_A(_, _)) => 4 
  case CC_C((_,CC_A(_, _)), CC_A(_, _), CC_A(_, _)) => 5 
  case CC_D(CC_B(CC_A(_, _), CC_B(_, _))) => 6 
  case CC_D(CC_B(CC_A(_, _), CC_C(_, _, _))) => 7 
  case CC_D(CC_B(CC_A(_, _), CC_D(_))) => 8 
}
}
// This is not matched: CC_B(CC_A(_, CC_A(_, _)), CC_B(_, CC_D(_)))