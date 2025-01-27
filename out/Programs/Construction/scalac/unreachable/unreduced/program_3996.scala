package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D, E](a: Byte, b: T_A[T_A[E, E], E], c: (T_A[Byte, Byte],T_A[Int, Boolean])) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_B(_, _, (_,_))) => 1 
  case CC_B(_, _, (_,_)) => 2 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _, _)))