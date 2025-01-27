package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: T_B[T_B[Boolean]]) extends T_A[Int]
case class CC_B(a: CC_A, b: T_A[T_A[Boolean]], c: (((Boolean,Boolean),CC_A),Boolean)) extends T_A[Int]
case class CC_C() extends T_A[Int]
case class CC_D[C](a: Int) extends T_B[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)