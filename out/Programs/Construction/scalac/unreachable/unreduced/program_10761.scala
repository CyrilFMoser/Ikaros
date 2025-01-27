package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B(a: CC_A[T_B[(Int,Byte)]], b: CC_A[T_B[Byte]]) extends T_B[T_B[T_B[Byte]]]
case class CC_C() extends T_B[T_B[T_B[Byte]]]
case class CC_D(a: CC_B, b: T_A[T_B[CC_B]], c: T_B[CC_C]) extends T_B[CC_C]

val v_a: T_B[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_C() => 1 
}
}