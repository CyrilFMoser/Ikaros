package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Boolean], b: Int) extends T_A[Byte]
case class CC_B[C](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_C(a: T_A[CC_A]) extends T_B[Char]
case class CC_D[D](a: T_B[Char], b: (T_B[CC_C],Byte)) extends T_B[Char]
case class CC_E() extends T_B[T_A[Byte]]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _)) => 0 
  case CC_D(_, _) => 1 
}
}