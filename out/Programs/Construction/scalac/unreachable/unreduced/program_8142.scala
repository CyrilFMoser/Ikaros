package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]], b: T_A[T_A[Byte]], c: ((Boolean,Byte),T_B[Int])) extends T_A[Int]
case class CC_B(a: T_A[CC_A], b: Int, c: T_A[T_A[Int]]) extends T_A[Int]
case class CC_C(a: CC_A, b: Boolean) extends T_A[Int]
case class CC_D[C, D](a: CC_A) extends T_B[C]
case class CC_E(a: CC_D[Int, CC_D[Boolean, Byte]], b: Int, c: T_B[CC_B]) extends T_B[((CC_C,CC_B),CC_A)]
case class CC_F(a: Boolean) extends T_B[((CC_C,CC_B),CC_A)]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}