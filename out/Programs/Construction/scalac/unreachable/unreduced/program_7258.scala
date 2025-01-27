package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Boolean], b: (Int,T_A[Char])) extends T_A[(T_B[Byte],T_A[Boolean])]
case class CC_B(a: CC_A, b: T_A[T_A[Int]]) extends T_A[Int]
case class CC_C(a: CC_B) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _)) => 0 
  case CC_D() => 1 
}
}