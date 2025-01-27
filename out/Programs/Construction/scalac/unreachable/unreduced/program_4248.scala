package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: Boolean, c: (T_A[Int, Int],Int)) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[E](a: E, b: CC_A[E, E], c: E) extends T_A[E, T_A[T_A[E, E], E]]
case class CC_C() extends T_A[(CC_B[Byte],CC_B[Int]), T_A[T_A[(CC_B[Byte],CC_B[Int]), (CC_B[Byte],CC_B[Int])], (CC_B[Byte],CC_B[Int])]]

val v_a: T_A[Char, T_A[T_A[Char, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, true, (_,_)) => 0 
  case CC_A(_, false, (_,_)) => 1 
  case CC_B(_, _, _) => 2 
}
}