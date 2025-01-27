package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int) extends T_A[C]
case class CC_B(a: T_A[T_A[Byte]], b: T_A[T_A[(Int,Byte)]]) extends T_A[CC_A[T_B[Byte]]]
case class CC_C(a: T_B[T_A[CC_B]], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_D(a: CC_A[T_B[Byte]], b: T_B[Int]) extends T_B[Byte]
case class CC_E() extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), _) => 0 
  case CC_E() => 1 
}
}