package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: (T_A[Boolean],T_A[Boolean]), b: T_A[E], c: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[(Byte,Int)], b: CC_B[CC_A[Boolean]]) extends T_B[T_A[T_A[Int]], Int]
case class CC_D() extends T_B[T_A[T_A[Int]], Int]
case class CC_E(a: Boolean) extends T_B[T_A[T_A[Int]], Int]

val v_a: T_B[T_A[T_A[Int]], Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), CC_B(_, CC_A(_), CC_A(_))) => 0 
  case CC_C(CC_B(_, _, CC_A(_)), CC_B(_, CC_A(_), CC_A(_))) => 1 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_B(_, CC_A(_), CC_A(_))) => 2 
  case CC_C(CC_A(_), CC_B(_, CC_B(_, _, _), CC_A(_))) => 3 
  case CC_C(CC_B(_, _, CC_A(_)), CC_B(_, CC_B(_, _, _), CC_A(_))) => 4 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_B(_, CC_B(_, _, _), CC_A(_))) => 5 
  case CC_C(CC_A(_), CC_B(_, CC_A(_), CC_B(_, _, _))) => 6 
  case CC_C(CC_B(_, _, CC_A(_)), CC_B(_, CC_A(_), CC_B(_, _, _))) => 7 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_B(_, CC_A(_), CC_B(_, _, _))) => 8 
  case CC_C(CC_A(_), CC_B(_, CC_B(_, _, _), CC_B(_, _, _))) => 9 
  case CC_C(CC_B(_, _, CC_A(_)), CC_B(_, CC_B(_, _, _), CC_B(_, _, _))) => 10 
  case CC_D() => 11 
  case CC_E(_) => 12 
}
}
// This is not matched: CC_C(CC_B(_, _, CC_B(_, _, _)), CC_B(_, CC_B(_, _, _), CC_B(_, _, _)))