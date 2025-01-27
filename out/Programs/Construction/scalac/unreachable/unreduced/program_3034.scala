package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B(a: T_A[T_A[Boolean, Int], (Char,Boolean)], b: T_B[T_A[Byte, Byte]], c: CC_A[CC_A[Boolean, Int], Char]) extends T_B[T_A[T_B[Boolean], T_A[Int, Int]]]
case class CC_C() extends T_B[T_A[T_B[Boolean], T_A[Int, Int]]]
case class CC_D(a: CC_B, b: Byte) extends T_B[T_A[T_B[Boolean], T_A[Int, Int]]]

val v_a: T_B[T_A[T_B[Boolean], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, CC_A()) => 0 
  case CC_C() => 1 
  case CC_D(_, _) => 2 
}
}