package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[(Boolean,(Char,Int))]]
case class CC_B(a: T_B[T_B[CC_A]]) extends T_A[T_A[(Boolean,(Char,Int))]]
case class CC_C() extends T_A[T_A[(Boolean,(Char,Int))]]
case class CC_D[C](a: T_A[C]) extends T_B[C]
case class CC_E(a: T_B[Boolean]) extends T_B[Boolean]
case class CC_F[D](a: T_B[D], b: CC_B) extends T_B[D]

val v_a: CC_F[Char] = null
val v_b: Int = v_a match{
  case CC_F(CC_D(_), CC_B(CC_D(_))) => 0 
  case CC_F(CC_F(_, CC_B(_)), CC_B(CC_D(_))) => 1 
  case CC_F(CC_D(_), CC_B(CC_F(_, _))) => 2 
  case CC_F(CC_F(_, CC_B(_)), CC_B(CC_F(_, _))) => 3 
}
}