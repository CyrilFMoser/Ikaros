package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B, T_A[Char, T_B]], c: (T_A[Int, Boolean],T_B)) extends T_A[T_B, T_A[Char, T_B]]
case class CC_B(a: T_A[T_B, T_A[Char, T_B]]) extends T_A[T_B, T_A[Char, T_B]]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_B, T_A[Char, T_B]], b: Int, c: Char) extends T_B

val v_a: T_A[T_B, T_A[Char, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), (_,CC_C())) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), (_,CC_D(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_B(_), _), (_,CC_C())) => 2 
  case CC_A(_, CC_A(_, CC_B(_), _), (_,CC_D(_, _, _))) => 3 
  case CC_A(_, CC_B(CC_A(_, _, _)), (_,CC_D(_, _, _))) => 4 
  case CC_A(_, CC_B(CC_B(_)), (_,CC_C())) => 5 
  case CC_A(_, CC_B(CC_B(_)), (_,CC_D(_, _, _))) => 6 
  case CC_B(_) => 7 
}
}
// This is not matched: CC_A(_, CC_B(CC_A(_, _, _)), (_,CC_C()))