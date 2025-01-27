package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: CC_A[T_B[T_A, T_A]], b: Boolean, c: T_B[CC_A[Int], T_B[T_A, T_A]]) extends T_A
case class CC_C() extends T_A
case class CC_D[D](a: T_B[T_A, Int], b: T_B[CC_B, D]) extends T_B[T_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C() => 2 
}
}