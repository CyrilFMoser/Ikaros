package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Int]]]
case class CC_B(a: T_B[Byte], b: T_B[T_A[Char]]) extends T_A[T_B[T_B[Int]]]
case class CC_C[C](a: T_B[C], b: T_A[C]) extends T_B[C]
case class CC_D[D](a: Int, b: Char) extends T_B[D]
case class CC_E() extends T_B[T_A[T_A[CC_A]]]

val v_a: T_B[T_A[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _) => 1 
  case CC_E() => 2 
}
}