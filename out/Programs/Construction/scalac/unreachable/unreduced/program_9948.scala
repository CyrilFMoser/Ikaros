package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[Char]]
case class CC_B(a: CC_A, b: Boolean, c: (T_A[CC_A],T_A[CC_A])) extends T_A[T_A[Char]]
case class CC_C(a: T_A[T_A[Char]], b: Char) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, true, (_,_)) => 1 
  case CC_B(_, false, (_,_)) => 2 
  case CC_C(CC_A(_), _) => 3 
  case CC_C(CC_B(_, _, _), _) => 4 
}
}
// This is not matched: CC_C(CC_C(_, _), _)