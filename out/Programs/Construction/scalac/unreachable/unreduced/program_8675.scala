package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[C, T_B], c: C) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, Int]) extends T_A[D, T_B]
case class CC_C(a: T_A[T_A[T_B, T_B], T_B], b: CC_B[CC_B[Boolean]], c: (Int,Char)) extends T_B
case class CC_D(a: T_B, b: CC_C) extends T_B

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}