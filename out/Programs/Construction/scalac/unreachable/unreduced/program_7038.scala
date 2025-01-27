package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: Byte, b: Int, c: CC_A[(Int,Byte)]) extends T_A[CC_A[T_A[Boolean, Boolean]], T_A[CC_A[T_A[Boolean, Boolean]], CC_A[T_A[Boolean, Boolean]]]]
case class CC_C(a: T_A[CC_A[CC_B], T_A[CC_A[CC_B], CC_A[CC_B]]], b: T_A[(CC_B,Boolean), T_A[(CC_B,Boolean), (CC_B,Boolean)]], c: CC_B) extends T_A[CC_A[T_A[Boolean, Boolean]], T_A[CC_A[T_A[Boolean, Boolean]], CC_A[T_A[Boolean, Boolean]]]]

val v_a: T_A[CC_A[T_A[Boolean, Boolean]], T_A[CC_A[T_A[Boolean, Boolean]], CC_A[T_A[Boolean, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_A(CC_A(CC_C(_, _, _), CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 3 
  case CC_A(CC_C(_, _, _), CC_A(_, _)) => 4 
  case CC_B(_, _, CC_A(_, _)) => 5 
  case CC_C(_, _, _) => 6 
}
}