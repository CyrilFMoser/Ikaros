package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[((T_B,T_B),(T_B,T_B)), C]
case class CC_B[D](a: T_A[D, D], b: T_B) extends T_A[((T_B,T_B),(T_B,T_B)), D]
case class CC_C(a: T_A[Char, CC_B[T_B]], b: T_B) extends T_B
case class CC_D(a: T_A[CC_A[T_B], T_B], b: CC_A[T_A[T_B, CC_C]], c: T_A[CC_C, (CC_C,T_B)]) extends T_B
case class CC_E(a: (CC_A[CC_C],CC_B[CC_C])) extends T_B

val v_a: T_A[((T_B,T_B),(T_B,T_B)), Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}