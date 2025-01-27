package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: B, b: T_A, c: Boolean) extends T_A
case class CC_B[C]() extends T_B[T_A]
case class CC_C(a: T_B[T_B[T_A]], b: T_B[T_A], c: CC_A[T_A]) extends T_B[T_A]
case class CC_D[D](a: CC_C, b: Byte, c: T_A) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B(), _) => 1 
  case CC_C(_, CC_C(_, _, _), _) => 2 
  case CC_C(_, CC_D(_, _, _), _) => 3 
  case CC_D(_, _, _) => 4 
}
}