package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Int, Int], T_B[Int, Byte]], b: T_B[T_A[Int, Byte], (Boolean,Int)]) extends T_A[T_B[T_A[Boolean, Boolean], ((Boolean,Byte),Byte)], Boolean]
case class CC_B(a: CC_A) extends T_A[T_B[T_A[Boolean, Boolean], ((Boolean,Byte),Byte)], Boolean]
case class CC_C(a: T_B[CC_A, CC_A], b: T_A[CC_A, T_A[(Int,Boolean), CC_A]]) extends T_B[Boolean, T_A[(CC_A,CC_A), CC_B]]
case class CC_D[E, F](a: T_B[E, T_B[E, F]]) extends T_B[E, F]
case class CC_E() extends T_B[Boolean, T_A[(CC_A,CC_A), CC_B]]

val v_a: T_B[Boolean, T_A[(CC_A,CC_A), CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_D(CC_D(_))) => 1 
  case CC_E() => 2 
}
}