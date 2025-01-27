package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Byte], b: T_B[T_B[Char, Int], T_B[Char, Char]]) extends T_A[T_B[T_A[Int], T_B[Boolean, Int]]]
case class CC_B() extends T_A[T_B[T_A[Int], T_B[Boolean, Int]]]
case class CC_C() extends T_A[T_B[T_A[Int], T_B[Boolean, Int]]]
case class CC_D[D, E](a: CC_C, b: CC_A, c: CC_B) extends T_B[D, E]

val v_a: T_A[T_B[T_A[Int], T_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}