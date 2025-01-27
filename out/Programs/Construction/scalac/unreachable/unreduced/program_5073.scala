package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Int,T_B[Int]), b: (T_A[Char],Char)) extends T_A[T_B[(Boolean,Char)]]
case class CC_B(a: (T_B[CC_A],CC_A), b: CC_A, c: CC_A) extends T_A[T_B[(Boolean,Char)]]
case class CC_C(a: T_B[Boolean]) extends T_A[T_B[(Boolean,Char)]]
case class CC_D(a: T_A[CC_A]) extends T_B[T_A[CC_A]]
case class CC_E[C](a: CC_C, b: CC_A) extends T_B[C]
case class CC_F(a: CC_E[T_B[CC_C]]) extends T_B[T_A[CC_A]]

val v_a: T_A[T_B[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _, CC_A(_, (_,_))) => 1 
  case CC_C(CC_E(_, CC_A(_, _))) => 2 
}
}