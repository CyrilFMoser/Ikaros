package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: Int) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F], b: Boolean, c: F) extends T_B[F, CC_A[F]]
case class CC_D(a: T_A[T_A[Int]], b: Boolean, c: (T_A[Byte],Int)) extends T_B[T_A[T_A[Boolean]], CC_A[T_A[T_A[Boolean]]]]

val v_a: T_B[T_A[T_A[Boolean]], CC_A[T_A[T_A[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_C(_, _, CC_A(_, CC_B(), _)) => 1 
  case CC_C(_, _, CC_B()) => 2 
  case CC_D(CC_A(_, CC_A(_, _, _), _), _, _) => 3 
  case CC_D(CC_A(_, CC_B(), _), _, _) => 4 
}
}
// This is not matched: CC_D(CC_B(), _, _)