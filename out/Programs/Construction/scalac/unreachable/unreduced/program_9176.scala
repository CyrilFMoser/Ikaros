package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B(a: CC_A[Int], b: Char, c: Int) extends T_A[T_B[T_B[Byte, Boolean], T_B[Boolean, Int]]]
case class CC_C(a: Int, b: T_B[T_A[CC_B], T_B[CC_B, CC_B]]) extends T_A[T_B[T_B[Byte, Boolean], T_B[Boolean, Int]]]
case class CC_D[E](a: CC_A[E]) extends T_B[E, CC_A[T_B[CC_C, (Boolean,Byte)]]]
case class CC_E[F](a: T_B[F, F], b: T_A[F]) extends T_B[F, CC_A[T_B[CC_C, (Boolean,Byte)]]]

val v_a: T_A[T_B[T_B[Byte, Boolean], T_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _))) => 2 
  case CC_A(_, CC_B(CC_A(_, _), _, _)) => 3 
  case CC_A(_, CC_C(_, _)) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(_, _) => 6 
}
}