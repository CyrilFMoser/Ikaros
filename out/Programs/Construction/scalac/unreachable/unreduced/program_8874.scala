package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Byte]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Byte]], D]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}