package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Char]
case class CC_B(a: ((CC_A,CC_A),CC_A)) extends T_A[T_A[T_B[CC_A]]]
case class CC_C(a: Char, b: CC_A) extends T_B[T_A[Char]]
case class CC_D(a: Int, b: T_A[T_A[CC_A]]) extends T_B[T_A[Char]]

val v_a: T_B[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_C('x', CC_A()) => 0 
  case CC_C(_, CC_A()) => 1 
  case CC_D(_, _) => 2 
}
}