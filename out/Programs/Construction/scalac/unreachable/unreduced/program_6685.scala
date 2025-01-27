package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[C, T_A[T_A[Int, Boolean], T_A[Int, Boolean]]]
case class CC_B() extends T_A[T_A[CC_A[Byte], CC_A[Char]], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]]
case class CC_C[D](a: CC_B) extends T_A[D, T_A[T_A[Int, Boolean], T_A[Int, Boolean]]]

val v_a: T_A[T_A[T_A[CC_A[Byte], CC_A[Char]], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_C(_)) => 1 
  case CC_C(CC_B()) => 2 
}
}
// This is not matched: CC_A(_, _, CC_B())