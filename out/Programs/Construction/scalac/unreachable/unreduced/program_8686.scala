package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: (T_A[T_B, T_B],T_A[T_B, T_B])) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_B[CC_A[T_B]], b: T_A[(T_B,(Int,Boolean)), T_A[(T_B,(Int,Boolean)), (T_B,(Int,Boolean))]]) extends T_B
case class CC_D(a: T_B, b: T_B, c: CC_B[Boolean]) extends T_B
case class CC_E(a: CC_A[CC_A[CC_C]], b: T_A[T_A[CC_C, CC_C], T_A[T_A[CC_C, CC_C], T_A[CC_C, CC_C]]], c: T_A[CC_D, T_A[CC_D, CC_D]]) extends T_B

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, 0, (_,_))) => 1 
  case CC_B(CC_B(_)) => 2 
}
}
// This is not matched: CC_B(CC_A(_, _, (_,_)))