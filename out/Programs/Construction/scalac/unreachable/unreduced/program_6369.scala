package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_A[Char]], b: T_A[Char]) extends T_A[T_B[T_A[Boolean], T_B[Int, Int]]]
case class CC_B(a: ((CC_A,Int),T_B[Char, CC_A]), b: T_B[Int, CC_A]) extends T_A[T_B[T_A[Boolean], T_B[Int, Int]]]
case class CC_C() extends T_A[T_B[T_A[Boolean], T_B[Int, Int]]]

val v_a: T_A[T_B[T_A[Boolean], T_B[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}