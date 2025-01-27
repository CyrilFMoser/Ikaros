package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[Char],T_B[T_A]), b: T_B[Boolean], c: T_B[T_A]) extends T_A
case class CC_B[B](a: CC_A) extends T_B[T_A]
case class CC_C(a: T_A, b: CC_B[Boolean]) extends T_B[T_A]
case class CC_D(a: T_B[T_B[T_A]], b: T_A) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, _) => 2 
}
}