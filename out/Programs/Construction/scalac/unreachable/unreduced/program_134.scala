package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Int, Byte], (Boolean,Char)]]
case class CC_B(a: Boolean, b: T_B[T_B[CC_A, CC_A], T_A[CC_A]]) extends T_A[T_B[T_B[Int, Byte], (Boolean,Char)]]
case class CC_C[D]() extends T_B[T_B[D, Boolean], D]
case class CC_D[E](a: E, b: E, c: T_B[E, E]) extends T_B[T_B[E, Boolean], E]

val v_a: T_B[T_B[Char, Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}