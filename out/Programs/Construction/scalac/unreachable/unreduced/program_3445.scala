package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]], b: T_B[T_A[Byte]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: T_B[T_A[CC_A]], b: T_B[T_B[CC_A]], c: CC_A) extends T_A[T_B[T_A[CC_A]]]
case class CC_C[C](a: T_A[C], b: T_B[C]) extends T_B[C]
case class CC_D[D](a: CC_B) extends T_B[D]
case class CC_E[E](a: (T_B[CC_A],T_A[CC_B]), b: CC_B) extends T_B[E]

val v_a: T_B[T_A[T_B[T_A[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
  case CC_C(_, CC_D(CC_B(_, _, _))) => 1 
  case CC_C(_, CC_E(_, CC_B(_, _, _))) => 2 
  case CC_D(CC_B(_, CC_C(_, _), CC_A(_, _))) => 3 
  case CC_D(CC_B(_, CC_D(_), CC_A(_, _))) => 4 
  case CC_D(CC_B(_, CC_E(_, _), CC_A(_, _))) => 5 
  case CC_E((CC_C(_, _),_), _) => 6 
  case CC_E((CC_D(_),_), _) => 7 
  case CC_E((CC_E(_, _),_), _) => 8 
}
}