package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[T_A[(Byte,Boolean)]]) extends T_A[T_B[T_B[Int]]]
case class CC_B() extends T_A[T_B[T_B[Int]]]
case class CC_C(a: CC_A) extends T_A[T_B[T_B[Int]]]
case class CC_D[C](a: CC_C, b: C, c: T_B[C]) extends T_B[C]
case class CC_E(a: T_B[CC_C], b: T_B[CC_A], c: (T_B[Boolean],T_B[CC_C])) extends T_B[CC_B]
case class CC_F[D](a: Boolean) extends T_B[D]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _)) => 0 
  case CC_A(_, CC_F(true)) => 1 
  case CC_A(_, CC_F(false)) => 2 
  case CC_B() => 3 
  case CC_C(CC_A(_, _)) => 4 
}
}