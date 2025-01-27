package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Char, Int]]]
case class CC_B(a: T_A[Boolean]) extends T_A[T_A[T_B[Char, Int]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_B[Char, Int]]]
case class CC_D[D](a: Char, b: Byte) extends T_B[D, Boolean]

val v_a: T_A[T_A[T_B[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}