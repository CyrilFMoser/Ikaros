package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Char,Char)]) extends T_A[T_B[T_B[Char]]]
case class CC_B(a: Byte, b: T_B[Int], c: T_A[CC_A]) extends T_B[Int]
case class CC_C[C](a: Boolean, b: T_B[C]) extends T_B[C]
case class CC_D(a: CC_A) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_B(_, _, _)) => 1 
  case CC_C(_, CC_C(_, _)) => 2 
  case CC_C(_, CC_D(_)) => 3 
  case CC_D(CC_A(_)) => 4 
}
}