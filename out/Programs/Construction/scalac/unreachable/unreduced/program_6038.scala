package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, (T_B[Byte],Boolean)]
case class CC_B[E](a: E, b: T_B[E], c: T_A[E, E]) extends T_A[E, (T_B[Byte],Boolean)]
case class CC_C() extends T_A[Int, (T_B[Byte],Boolean)]

val v_a: T_A[Int, (T_B[Byte],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(12, _, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}