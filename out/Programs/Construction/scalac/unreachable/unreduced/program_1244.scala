package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Byte], b: (T_A[T_B, T_B],T_A[T_B, Boolean])) extends T_A[C, Boolean]
case class CC_B[D](a: (Int,Boolean)) extends T_A[D, Boolean]
case class CC_C(a: (T_A[T_B, Boolean],CC_B[T_B]), b: T_A[CC_A[(Char,Int)], Boolean], c: T_A[T_A[T_B, T_B], Boolean]) extends T_B
case class CC_D(a: T_A[T_A[CC_C, CC_C], CC_A[T_B]], b: CC_C, c: T_B) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _)) => 0 
  case CC_C(_, _, CC_B(_)) => 1 
  case CC_D(_, CC_C(_, _, _), _) => 2 
  case CC_E() => 3 
}
}