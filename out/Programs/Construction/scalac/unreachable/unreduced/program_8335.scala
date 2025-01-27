package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Boolean,T_B[Int]), b: T_B[T_B[Byte]], c: Byte) extends T_A[T_A[Char]]
case class CC_B(a: Char) extends T_A[T_A[Char]]
case class CC_C(a: T_B[Int]) extends T_B[Int]
case class CC_D(a: T_B[Int], b: T_B[Char]) extends T_B[Char]
case class CC_E(a: CC_D) extends T_B[Byte]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
}
}