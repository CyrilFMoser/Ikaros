package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, (Byte,(Int,Int))]
case class CC_B[D](a: D) extends T_A[D, (Byte,(Int,Int))]
case class CC_C[E](a: Int, b: E, c: T_A[E, E]) extends T_A[E, (Byte,(Int,Int))]

val v_a: T_A[Int, (Byte,(Int,Int))] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
  case CC_B(_) => 1 
  case CC_C(_, 12, _) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_A(_, _)