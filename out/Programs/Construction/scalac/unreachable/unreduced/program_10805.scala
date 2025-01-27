package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: (Boolean,CC_A[Int]), b: CC_A[T_B[Int]], c: T_B[T_A[Boolean]]) extends T_B[Char]
case class CC_C(a: T_A[T_B[CC_B]], b: CC_B) extends T_B[Char]
case class CC_D(a: CC_C, b: T_B[T_B[Char]], c: CC_B) extends T_B[T_B[Char]]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), _) => 0 
  case CC_C(_, _) => 1 
}
}