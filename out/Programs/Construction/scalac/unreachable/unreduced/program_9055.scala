package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Boolean],T_B[Int, Char]), b: T_A[T_B[Boolean, Byte]], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: Char, b: Boolean, c: T_A[(CC_B,CC_A)]) extends T_A[Boolean]
case class CC_D[E, D](a: D, b: D) extends T_B[E, D]
case class CC_E(a: (Int,T_B[CC_A, CC_C]), b: (T_A[CC_A],T_B[CC_B, CC_B])) extends T_B[CC_C, T_B[T_A[Boolean], Char]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A((_,_), _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A((_,_), _, CC_B())) => 1 
  case CC_A(_, _, CC_A((_,_), _, CC_C(_, _, _))) => 2 
  case CC_A(_, _, CC_B()) => 3 
  case CC_A(_, _, CC_C(_, _, _)) => 4 
  case CC_B() => 5 
  case CC_C(_, _, _) => 6 
}
}