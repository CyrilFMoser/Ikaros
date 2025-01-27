package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Byte]], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Byte]], D]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Int, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}