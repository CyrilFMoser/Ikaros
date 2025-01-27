package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: (T_B[T_A, Int],T_A), c: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[T_A, C], b: C) extends T_B[T_A, C]
case class CC_D(a: T_B[T_A, CC_B], b: (Int,CC_C[CC_A])) extends T_B[T_A, CC_B]
case class CC_E(a: T_B[CC_B, CC_B]) extends T_B[T_A, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}