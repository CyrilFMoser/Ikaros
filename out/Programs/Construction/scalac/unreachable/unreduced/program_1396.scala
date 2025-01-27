package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Boolean, c: C) extends T_A[C]
case class CC_B(a: Int, b: T_A[T_A[Char]]) extends T_A[CC_A[CC_A[Char]]]
case class CC_C(a: CC_A[Boolean], b: T_A[T_B[Boolean]], c: T_A[(CC_B,CC_B)]) extends T_A[CC_A[CC_A[Char]]]
case class CC_D(a: T_B[(CC_B,CC_B)], b: (CC_C,T_B[Char])) extends T_B[(Int,T_B[CC_B])]
case class CC_E(a: CC_D, b: CC_D, c: T_A[T_B[CC_D]]) extends T_B[T_B[CC_A[CC_D]]]
case class CC_F(a: CC_B, b: Int, c: T_B[CC_D]) extends T_B[CC_D]

val v_a: T_A[CC_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), true, _) => 0 
  case CC_A(CC_B(_, _), true, _) => 1 
  case CC_A(CC_C(_, _, _), true, _) => 2 
  case CC_A(CC_A(_, _, _), false, _) => 3 
  case CC_A(CC_B(_, _), false, _) => 4 
  case CC_A(CC_C(_, _, _), false, _) => 5 
  case CC_B(_, CC_A(_, _, _)) => 6 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 7 
}
}