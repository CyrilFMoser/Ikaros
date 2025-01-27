package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (Byte,(Int,Char)), b: T_A[T_B[Byte, Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Int]], b: T_A[CC_A]) extends T_A[T_A[Boolean]]
case class CC_C[D](a: D, b: CC_A, c: CC_B) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _)