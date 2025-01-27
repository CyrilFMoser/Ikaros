package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C], c: T_A[C, Int]) extends T_A[C, T_B]
case class CC_B() extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, Byte]], T_B]
case class CC_C[D]() extends T_A[T_A[(T_B,(Int,Int)), (CC_B,CC_B)], D]
case class CC_D(a: Byte) extends T_B
case class CC_E(a: T_B, b: CC_C[CC_A[Boolean]], c: Boolean) extends T_B
case class CC_F(a: T_B) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], T_A[T_B, Byte]], T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _, _) => 0 
  case CC_A(CC_E(CC_D(_), CC_C(), true), _, _) => 1 
  case CC_A(CC_E(CC_E(_, _, _), CC_C(), true), _, _) => 2 
  case CC_A(CC_E(CC_F(_), CC_C(), true), _, _) => 3 
  case CC_A(CC_E(CC_D(_), CC_C(), false), _, _) => 4 
  case CC_A(CC_E(CC_E(_, _, _), CC_C(), false), _, _) => 5 
  case CC_A(CC_E(CC_F(_), CC_C(), false), _, _) => 6 
  case CC_A(CC_F(CC_D(_)), _, _) => 7 
  case CC_A(CC_F(CC_E(_, _, _)), _, _) => 8 
  case CC_A(CC_F(CC_F(_)), _, _) => 9 
  case CC_B() => 10 
}
}