package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_A[(Int,Boolean), (Char,Int)]), b: T_B, c: C) extends T_A[T_A[T_B, (T_B,T_B)], C]
case class CC_B(a: T_A[T_B, T_A[T_B, T_B]], b: T_A[T_A[T_B, T_B], T_B]) extends T_B
case class CC_C[D](a: Byte) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(0) => 1 
  case CC_C(_) => 2 
  case CC_D() => 3 
}
}