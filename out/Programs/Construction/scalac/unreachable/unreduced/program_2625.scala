package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)], b: T_A[(T_B,Char)], c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: Boolean, b: Int) extends T_A[Int]
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F[B](a: B, b: T_B) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D()) => 0 
  case CC_A(_, _, CC_E()) => 1 
  case CC_A(_, _, CC_F(_, CC_D())) => 2 
  case CC_A(_, _, CC_F(_, CC_E())) => 3 
  case CC_A(_, _, CC_F(_, CC_F(_, _))) => 4 
  case CC_B() => 5 
}
}