package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, Char], (T_A,(Boolean,Boolean))]) extends T_A
case class CC_B(a: (T_A,T_A), b: CC_A, c: T_B[T_B[T_A, T_A], (T_A,T_A)]) extends T_A
case class CC_C[C](a: C) extends T_B[T_A, C]
case class CC_D[D](a: Char, b: CC_B) extends T_B[T_A, D]

val v_a: T_B[T_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(true) => 0 
  case CC_C(false) => 1 
  case CC_D(_, CC_B((_,_), _, _)) => 2 
}
}