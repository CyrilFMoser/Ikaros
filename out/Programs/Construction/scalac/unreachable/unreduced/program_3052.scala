package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C]) extends T_A[C]
case class CC_B(a: (T_A[Boolean],(Int,Char)), b: Byte, c: CC_A[Int, Int]) extends T_A[CC_A[T_A[Boolean], CC_A[Byte, Byte]]]
case class CC_C(a: CC_A[T_A[CC_B], CC_A[Boolean, CC_B]], b: CC_B, c: CC_B) extends T_B[T_A[T_A[CC_B]]]
case class CC_D(a: T_A[CC_C], b: T_A[(Int,CC_B)], c: Byte) extends T_B[T_A[T_A[CC_B]]]

val v_a: T_B[T_A[T_A[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B(_, _, _)) => 0 
  case CC_D(CC_A(_), CC_A(_), _) => 1 
}
}