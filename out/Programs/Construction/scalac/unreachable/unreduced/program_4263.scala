package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B() extends T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[Int, Char], CC_A[Char]]]]]
case class CC_C(a: T_A[CC_B, T_A[CC_B, Char]], b: CC_A[CC_A[CC_B]]) extends T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[Int, Char], CC_A[Char]]]]]

val v_a: T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[T_A[Int, Char], CC_A[Char]], T_A[T_A[Int, Char], CC_A[Char]]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A()) => 2 
}
}