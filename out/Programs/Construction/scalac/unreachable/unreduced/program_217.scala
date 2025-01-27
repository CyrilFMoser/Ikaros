package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_B[D](a: T_B[D, D]) extends T_B[D, CC_A]
case class CC_C(a: T_B[T_A[Boolean], T_B[Char, Char]], b: CC_B[CC_B[Char]]) extends T_B[T_B[(CC_A,CC_A), CC_A], CC_A]
case class CC_D[E](a: T_B[E, CC_A]) extends T_B[E, CC_A]

val v_a: CC_D[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_)) => 0 
  case CC_D(CC_D(_)) => 1 
}
}