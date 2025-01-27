package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]], b: (T_A[Byte],T_B[Boolean])) extends T_A[T_B[T_B[Int]]]
case class CC_B[C](a: CC_A, b: C, c: T_B[C]) extends T_B[C]
case class CC_C() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_C() => 1 
}
}