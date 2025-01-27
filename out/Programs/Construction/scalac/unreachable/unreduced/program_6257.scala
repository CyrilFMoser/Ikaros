package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_A[D], D], b: Byte, c: Int) extends T_A[D]
case class CC_B(a: Int, b: T_B[Int, Byte]) extends T_B[CC_A[T_A[Byte]], CC_A[T_A[Byte]]]
case class CC_C(a: CC_B) extends T_B[CC_A[T_A[Byte]], CC_A[T_A[Byte]]]

val v_a: T_B[CC_A[T_A[Byte]], CC_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}